/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.sort.cdc.mongodb.table;

import org.apache.flink.configuration.ConfigOption;
import org.apache.flink.configuration.ConfigOptions;
import org.apache.flink.configuration.ReadableConfig;
import org.apache.flink.table.api.config.TableConfigOptions;
import org.apache.flink.table.catalog.ResolvedSchema;
import org.apache.flink.table.catalog.UniqueConstraint;
import org.apache.flink.table.connector.source.DynamicTableSource;
import org.apache.flink.table.factories.DynamicTableSourceFactory;
import org.apache.flink.table.factories.FactoryUtil;

import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;

import static com.ververica.cdc.connectors.base.options.SourceOptions.CHUNK_META_GROUP_SIZE;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.BATCH_SIZE;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.COLLECTION;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.CONNECTION_OPTIONS;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.COPY_EXISTING;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.COPY_EXISTING_QUEUE_SIZE;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.DATABASE;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.HEARTBEAT_INTERVAL_MILLIS;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.HOSTS;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.PASSWORD;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.POLL_AWAIT_TIME_MILLIS;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.POLL_MAX_BATCH_SIZE;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.SCAN_INCREMENTAL_SNAPSHOT_CHUNK_SIZE_MB;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.SCAN_INCREMENTAL_SNAPSHOT_ENABLED;
import static com.ververica.cdc.connectors.mongodb.source.config.MongoDBSourceOptions.USERNAME;
import static org.apache.flink.util.Preconditions.checkArgument;
import static org.apache.inlong.sort.base.Constants.INLONG_AUDIT;
import static org.apache.inlong.sort.base.Constants.INLONG_METRIC;
import static org.apache.inlong.sort.base.Constants.SOURCE_MULTIPLE_ENABLE;
import static org.apache.inlong.sort.cdc.mongodb.MongoDBSource.ERROR_TOLERANCE_NONE;

/**
 * Factory for creating configured instance of {@link MongoDBTableSource}.
 */
public class MongoDBTableSourceFactory implements DynamicTableSourceFactory {

    private static final String IDENTIFIER = "mongodb-cdc-inlong";

    private static final String DOCUMENT_ID_FIELD = "_id";

    private static final ConfigOption<String> ERRORS_TOLERANCE =
            ConfigOptions.key("errors.tolerance")
                    .stringType()
                    .defaultValue(ERROR_TOLERANCE_NONE)
                    .withDescription(
                            "Whether to continue processing messages if an error is encountered. "
                                    + "When set to none, the connector reports an error and blocks further processing "
                                    + "of the rest of the records when it encounters an error. "
                                    + "When set to all, the connector silently ignores any bad messages."
                                    + "Accepted Values: 'none' or 'all'. Default 'none'.");

    private static final ConfigOption<Boolean> ERRORS_LOG_ENABLE =
            ConfigOptions.key("errors.log.enable")
                    .booleanType()
                    .defaultValue(Boolean.TRUE)
                    .withDescription(
                            "Whether details of failed operations should be written to the log file. "
                                    + "When set to true, both errors that are tolerated (determined by the errors"
                                    + ".tolerance setting) "
                                    + "and not tolerated are written. When set to false, errors that are tolerated "
                                    + "are omitted.");

    private static final ConfigOption<String> COPY_EXISTING_PIPELINE =
            ConfigOptions.key("copy.existing.pipeline")
                    .stringType()
                    .noDefaultValue()
                    .withDescription(
                            "An array of JSON objects describing the pipeline operations "
                                    + "to run when copying existing data. "
                                    + "This can improve the use of indexes by the copying manager and make copying "
                                    + "more efficient.");

    private static final ConfigOption<Integer> COPY_EXISTING_MAX_THREADS =
            ConfigOptions.key("copy.existing.max.threads")
                    .intType()
                    .noDefaultValue()
                    .withDescription(
                            "The number of threads to use when performing the data copy."
                                    + " Defaults to the number of processors.");

    public static final ConfigOption<String> ROW_KINDS_FILTERED =
            ConfigOptions.key("row-kinds-filtered")
                    .stringType()
                    .defaultValue("+I&-U&+U&-D&-T&-K&+R&+B")
                    .withDescription("row kinds to be filtered,"
                            + " here filtered means keep the data of certain row kind"
                            + "the format follows rowKind1&rowKind2, supported row kinds are "
                            + "\"+I\" represents INSERT.\n"
                            + "\"-U\" represents UPDATE_BEFORE.\n"
                            + "\"+U\" represents UPDATE_AFTER.\n"
                            + "\"-D\" represents DELETE.");

    @Override
    public DynamicTableSource createDynamicTableSource(Context context) {
        final FactoryUtil.TableFactoryHelper helper =
                FactoryUtil.createTableFactoryHelper(this, context);
        helper.validate();

        final ReadableConfig config = helper.getOptions();

        final String hosts = config.get(HOSTS);
        final String connectionOptions = config.getOptional(CONNECTION_OPTIONS).orElse(null);

        final String username = config.getOptional(USERNAME).orElse(null);
        final String password = config.getOptional(PASSWORD).orElse(null);

        final String database = config.getOptional(DATABASE).orElse(null);
        final String collection = config.getOptional(COLLECTION).orElse(null);

        Integer batchSize = config.get(BATCH_SIZE);
        final String errorsTolerance = config.get(ERRORS_TOLERANCE);
        final Boolean errorsLogEnable = config.get(ERRORS_LOG_ENABLE);

        final Integer pollMaxBatchSize = config.get(POLL_MAX_BATCH_SIZE);
        final Integer pollAwaitTimeMillis = config.get(POLL_AWAIT_TIME_MILLIS);

        final Integer heartbeatIntervalMillis = config.get(HEARTBEAT_INTERVAL_MILLIS);

        final Boolean copyExisting = config.get(COPY_EXISTING);
        final String copyExistingPipeline = config.getOptional(COPY_EXISTING_PIPELINE).orElse(null);
        final Integer copyExistingMaxThreads = config.getOptional(COPY_EXISTING_MAX_THREADS).orElse(null);
        final Integer copyExistingQueueSize = config.getOptional(COPY_EXISTING_QUEUE_SIZE).orElse(null);

        final String zoneId = context.getConfiguration().get(TableConfigOptions.LOCAL_TIME_ZONE);
        final ZoneId localTimeZone =
                TableConfigOptions.LOCAL_TIME_ZONE.defaultValue().equals(zoneId)
                        ? ZoneId.systemDefault()
                        : ZoneId.of(zoneId);

        boolean enableParallelRead = config.get(SCAN_INCREMENTAL_SNAPSHOT_ENABLED);

        int splitSizeMB = config.get(SCAN_INCREMENTAL_SNAPSHOT_CHUNK_SIZE_MB);
        int splitMetaGroupSize = config.get(CHUNK_META_GROUP_SIZE);

        final String inlongMetric = config.getOptional(INLONG_METRIC).orElse(null);
        final String inlongAudit = config.get(INLONG_AUDIT);
        final Boolean sourceMultipleEnable = config.get(SOURCE_MULTIPLE_ENABLE);
        ResolvedSchema physicalSchema = context.getCatalogTable().getResolvedSchema();
        if (!sourceMultipleEnable) {
            checkArgument(physicalSchema.getPrimaryKey().isPresent(), "Primary key must be present");
            checkPrimaryKey(physicalSchema.getPrimaryKey().get(), "Primary key must be _id field");
        }
        final String rowKindFiltered = config.get(ROW_KINDS_FILTERED).isEmpty()
                ? ROW_KINDS_FILTERED.defaultValue()
                : config.get(ROW_KINDS_FILTERED);

        return new MongoDBTableSource(
                physicalSchema,
                hosts,
                username,
                password,
                database,
                collection,
                connectionOptions,
                errorsTolerance,
                errorsLogEnable,
                copyExisting,
                copyExistingPipeline,
                copyExistingMaxThreads,
                copyExistingQueueSize,
                batchSize,
                pollMaxBatchSize,
                pollAwaitTimeMillis,
                heartbeatIntervalMillis,
                localTimeZone,
                enableParallelRead,
                splitMetaGroupSize,
                splitSizeMB,
                inlongMetric,
                inlongAudit,
                rowKindFiltered,
                sourceMultipleEnable);
    }

    private void checkPrimaryKey(UniqueConstraint pk, String message) {
        checkArgument(
                pk.getColumns().size() == 1 && pk.getColumns().contains(DOCUMENT_ID_FIELD),
                message);
    }

    @Override
    public String factoryIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public Set<ConfigOption<?>> requiredOptions() {
        Set<ConfigOption<?>> options = new HashSet<>();
        options.add(HOSTS);
        return options;
    }

    @Override
    public Set<ConfigOption<?>> optionalOptions() {
        Set<ConfigOption<?>> options = new HashSet<>();
        options.add(USERNAME);
        options.add(PASSWORD);
        options.add(CONNECTION_OPTIONS);
        options.add(DATABASE);
        options.add(COLLECTION);
        options.add(ERRORS_TOLERANCE);
        options.add(ERRORS_LOG_ENABLE);
        options.add(COPY_EXISTING);
        options.add(COPY_EXISTING_PIPELINE);
        options.add(COPY_EXISTING_MAX_THREADS);
        options.add(COPY_EXISTING_QUEUE_SIZE);
        options.add(BATCH_SIZE);
        options.add(POLL_MAX_BATCH_SIZE);
        options.add(POLL_AWAIT_TIME_MILLIS);
        options.add(HEARTBEAT_INTERVAL_MILLIS);
        options.add(ROW_KINDS_FILTERED);
        options.add(SOURCE_MULTIPLE_ENABLE);
        options.add(INLONG_METRIC);
        options.add(INLONG_AUDIT);
        options.add(SCAN_INCREMENTAL_SNAPSHOT_ENABLED);
        options.add(SCAN_INCREMENTAL_SNAPSHOT_CHUNK_SIZE_MB);
        options.add(CHUNK_META_GROUP_SIZE);
        return options;
    }
}

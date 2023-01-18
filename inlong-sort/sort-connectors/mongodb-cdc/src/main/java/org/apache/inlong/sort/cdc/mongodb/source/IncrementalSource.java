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

package org.apache.inlong.sort.cdc.mongodb.source;

import com.ververica.cdc.connectors.base.options.StartupMode;
import com.ververica.cdc.connectors.base.source.meta.offset.OffsetFactory;
import com.ververica.cdc.connectors.base.source.meta.split.SourceRecords;
import io.debezium.relational.TableId;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Supplier;
import org.apache.flink.annotation.Experimental;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.connector.source.Boundedness;
import org.apache.flink.api.connector.source.Source;
import org.apache.flink.api.connector.source.SourceReaderContext;
import org.apache.flink.api.connector.source.SplitEnumerator;
import org.apache.flink.api.connector.source.SplitEnumeratorContext;
import org.apache.flink.api.java.typeutils.ResultTypeQueryable;
import org.apache.flink.connector.base.source.reader.RecordEmitter;
import org.apache.flink.connector.base.source.reader.RecordsWithSplitIds;
import org.apache.flink.connector.base.source.reader.synchronization.FutureCompletingBlockingQueue;
import org.apache.flink.core.io.SimpleVersionedSerializer;
import org.apache.flink.metrics.MetricGroup;
import org.apache.flink.util.FlinkRuntimeException;
import org.apache.inlong.sort.base.metric.MetricOption;
import org.apache.inlong.sort.base.metric.MetricOption.RegisteredMetric;
import org.apache.inlong.sort.cdc.mongodb.debezium.DebeziumDeserializationSchema;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.HybridSplitAssigner;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.SplitAssigner;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.StreamSplitAssigner;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.state.HybridPendingSplitsState;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.state.PendingSplitsState;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.state.PendingSplitsStateSerializer;
import org.apache.inlong.sort.cdc.mongodb.source.assigner.state.StreamPendingSplitsState;
import org.apache.inlong.sort.cdc.mongodb.source.config.MongoDBSourceConfig;
import org.apache.inlong.sort.cdc.mongodb.source.config.SourceConfig;
import org.apache.inlong.sort.cdc.mongodb.source.dialect.DataSourceDialect;
import org.apache.inlong.sort.cdc.mongodb.source.enumerator.IncrementalSourceEnumerator;
import org.apache.inlong.sort.cdc.mongodb.source.meta.split.SourceSplitBase;
import org.apache.inlong.sort.cdc.mongodb.source.meta.split.SourceSplitSerializer;
import org.apache.inlong.sort.cdc.mongodb.source.meta.split.SourceSplitState;
import org.apache.inlong.sort.cdc.mongodb.source.metrics.InlongSourceReaderMetrics;
import org.apache.inlong.sort.cdc.mongodb.source.reader.IncrementalSourceReader;
import org.apache.inlong.sort.cdc.mongodb.source.reader.IncrementalSourceRecordEmitter;
import org.apache.inlong.sort.cdc.mongodb.source.reader.IncrementalSourceSplitReader;

/**
 * The basic source of Incremental Snapshot framework for datasource, it is based on FLIP-27 and
 * Watermark Signal Algorithm which supports parallel reading snapshot of table and then continue to
 * capture data change by streaming reading.
 */
@Experimental
public class IncrementalSource<T, C extends SourceConfig>
        implements
            Source<T, SourceSplitBase, PendingSplitsState>,
            ResultTypeQueryable<T> {

    private static final long serialVersionUID = 1L;

    protected final SourceConfig.Factory<C> configFactory;
    protected final DataSourceDialect<C> dataSourceDialect;
    protected final OffsetFactory offsetFactory;
    protected final DebeziumDeserializationSchema<T> deserializationSchema;
    protected final SourceSplitSerializer sourceSplitSerializer;

    public IncrementalSource(
            SourceConfig.Factory<C> configFactory,
            DebeziumDeserializationSchema<T> deserializationSchema,
            OffsetFactory offsetFactory,
            DataSourceDialect<C> dataSourceDialect) {
        this.configFactory = configFactory;
        this.deserializationSchema = deserializationSchema;
        this.offsetFactory = offsetFactory;
        this.dataSourceDialect = dataSourceDialect;
        this.sourceSplitSerializer =
                new SourceSplitSerializer() {

                    @Override
                    public OffsetFactory getOffsetFactory() {
                        return offsetFactory;
                    }
                };
    }

    @Override
    public Boundedness getBoundedness() {
        return Boundedness.CONTINUOUS_UNBOUNDED;
    }

    @Override
    public IncrementalSourceReader<T, C> createReader(SourceReaderContext readerContext)
            throws Exception {
        // create source config for the given subtask (e.g. unique server id)
        C sourceConfig = configFactory.create(readerContext.getIndexOfSubtask());
        MongoDBSourceConfig mongoDBSourceConfig = (MongoDBSourceConfig) sourceConfig;
        FutureCompletingBlockingQueue<RecordsWithSplitIds<SourceRecords>> elementsQueue =
                new FutureCompletingBlockingQueue<>();

        // Forward compatible with flink 1.13
        final Method metricGroupMethod = readerContext.getClass().getMethod("metricGroup");
        metricGroupMethod.setAccessible(true);
        final MetricGroup metricGroup = (MetricGroup) metricGroupMethod.invoke(readerContext);
        final InlongSourceReaderMetrics sourceReaderMetrics = new InlongSourceReaderMetrics(metricGroup);

        // create source config for the given subtask (e.g. unique server id)
        MetricOption metricOption = MetricOption.builder()
                .withInlongLabels(mongoDBSourceConfig.getInlongMetric())
                .withInlongAudit(mongoDBSourceConfig.getInlongAudit())
                .withRegisterMetric(RegisteredMetric.ALL)
                .build();

        sourceReaderMetrics.registerMetrics(metricOption);
        Supplier<IncrementalSourceSplitReader<C>> splitReaderSupplier =
                () -> new IncrementalSourceSplitReader<>(
                        readerContext.getIndexOfSubtask(), dataSourceDialect, sourceConfig);
        return new IncrementalSourceReader<>(
                elementsQueue,
                splitReaderSupplier,
                createRecordEmitter(sourceConfig, sourceReaderMetrics),
                readerContext.getConfiguration(),
                readerContext,
                sourceConfig,
                sourceSplitSerializer,
                dataSourceDialect,
                sourceReaderMetrics);
    }

    @Override
    public SplitEnumerator<SourceSplitBase, PendingSplitsState> createEnumerator(
            SplitEnumeratorContext<SourceSplitBase> enumContext) {
        C sourceConfig = configFactory.create(0);
        final SplitAssigner splitAssigner;
        if (sourceConfig.getStartupOptions().startupMode == StartupMode.INITIAL) {
            try {
                final List<TableId> remainingTables =
                        dataSourceDialect.discoverDataCollections(sourceConfig);
                boolean isTableIdCaseSensitive =
                        dataSourceDialect.isDataCollectionIdCaseSensitive(sourceConfig);
                splitAssigner =
                        new HybridSplitAssigner<>(
                                sourceConfig,
                                enumContext.currentParallelism(),
                                remainingTables,
                                isTableIdCaseSensitive,
                                dataSourceDialect,
                                offsetFactory);
            } catch (Exception e) {
                throw new FlinkRuntimeException(
                        "Failed to discover captured tables for enumerator", e);
            }
        } else {
            splitAssigner = new StreamSplitAssigner(sourceConfig, dataSourceDialect, offsetFactory);
        }

        return new IncrementalSourceEnumerator(enumContext, sourceConfig, splitAssigner);
    }

    @Override
    public SplitEnumerator<SourceSplitBase, PendingSplitsState> restoreEnumerator(
            SplitEnumeratorContext<SourceSplitBase> enumContext, PendingSplitsState checkpoint) {
        C sourceConfig = configFactory.create(0);

        final SplitAssigner splitAssigner;
        if (checkpoint instanceof HybridPendingSplitsState) {
            splitAssigner =
                    new HybridSplitAssigner<>(
                            sourceConfig,
                            enumContext.currentParallelism(),
                            (HybridPendingSplitsState) checkpoint,
                            dataSourceDialect,
                            offsetFactory);
        } else if (checkpoint instanceof StreamPendingSplitsState) {
            splitAssigner =
                    new StreamSplitAssigner(
                            sourceConfig,
                            (StreamPendingSplitsState) checkpoint,
                            dataSourceDialect,
                            offsetFactory);
        } else {
            throw new UnsupportedOperationException(
                    "Unsupported restored PendingSplitsState: " + checkpoint);
        }
        return new IncrementalSourceEnumerator(enumContext, sourceConfig, splitAssigner);
    }

    @Override
    public SimpleVersionedSerializer<SourceSplitBase> getSplitSerializer() {
        return sourceSplitSerializer;
    }

    @Override
    public SimpleVersionedSerializer<PendingSplitsState> getEnumeratorCheckpointSerializer() {
        SourceSplitSerializer sourceSplitSerializer = (SourceSplitSerializer) getSplitSerializer();
        return new PendingSplitsStateSerializer(sourceSplitSerializer);
    }

    @Override
    public TypeInformation<T> getProducedType() {
        return deserializationSchema.getProducedType();
    }

    protected RecordEmitter<SourceRecords, T, SourceSplitState> createRecordEmitter(
            SourceConfig sourceConfig, InlongSourceReaderMetrics sourceReaderMetrics) {
        return new IncrementalSourceRecordEmitter<>(
                deserializationSchema,
                sourceReaderMetrics,
                sourceConfig.isIncludeSchemaChanges(),
                offsetFactory);
    }
}

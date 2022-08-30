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

package org.apache.inlong.sort.protocol.node.extract;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonCreator;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.inlong.common.enums.MetaField;
import org.apache.inlong.sort.protocol.FieldInfo;
import org.apache.inlong.sort.protocol.Metadata;
import org.apache.inlong.sort.protocol.constant.TdsqlKafkaConstant;
import org.apache.inlong.sort.protocol.enums.TdsqlKafkaScanStartupMode;
import org.apache.inlong.sort.protocol.node.ExtractNode;
import org.apache.inlong.sort.protocol.node.format.Format;
import org.apache.inlong.sort.protocol.node.format.ProtobufFormat;
import org.apache.inlong.sort.protocol.transformation.WatermarkField;

/**
 * Kafka extract node for extract data from kafka
 */
@EqualsAndHashCode(callSuper = true)
@JsonTypeName("tdsqlKafkaExtract")
@Data
public class TdsqlKafkaExtractNode extends ExtractNode implements Metadata, Serializable {

    private static final long serialVersionUID = 1L;

    @Nonnull
    @JsonProperty("topic")
    private String topic;
    @Nonnull
    @JsonProperty("bootstrapServers")
    private String bootstrapServers;

    @Nonnull
    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    @Nonnull
    @JsonProperty("format")
    private Format format;

    @JsonProperty("scanStartupMode")
    private TdsqlKafkaScanStartupMode tdsqlKafkaScanStartupMode;

    @JsonProperty("primaryKey")
    private String primaryKey;

    @JsonProperty("groupId")
    private String groupId;

    @JsonProperty("scanSpecificOffsets")
    private String scanSpecificOffsets;

    public TdsqlKafkaExtractNode(@JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("fields") List<FieldInfo> fields,
            @Nullable @JsonProperty("watermarkField") WatermarkField watermarkField,
            @JsonProperty("properties") Map<String, String> properties,
            @Nonnull @JsonProperty("topic") String topic,
            @Nonnull @JsonProperty("bootstrapServers") String bootstrapServers,
            @Nonnull @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @Nonnull @JsonProperty("format") Format format,
            @JsonProperty("scanStartupMode") TdsqlKafkaScanStartupMode tdsqlKafkaScanStartupMode,
            @JsonProperty("primaryKey") String primaryKey,
            @JsonProperty("groupId") String groupId) {
        super(id, name, fields, watermarkField, properties);
        this.topic = Preconditions.checkNotNull(topic, "kafka topic is empty");
        this.bootstrapServers = Preconditions.checkNotNull(bootstrapServers, "kafka bootstrapServers is empty");
        this.username = Preconditions.checkNotNull(username, "kafka sasl username is empty");
        this.password = password;
        this.format = Preconditions.checkNotNull(format, "kafka format is empty");
        this.tdsqlKafkaScanStartupMode = Preconditions.checkNotNull(tdsqlKafkaScanStartupMode,
                "kafka scanStartupMode is empty");
        this.primaryKey = primaryKey;
        this.groupId = groupId;
    }

    @JsonCreator
    public TdsqlKafkaExtractNode(@JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("fields") List<FieldInfo> fields,
            @Nullable @JsonProperty("watermarkField") WatermarkField watermarkField,
            @JsonProperty("properties") Map<String, String> properties,
            @Nonnull @JsonProperty("topic") String topic,
            @Nonnull @JsonProperty("bootstrapServers") String bootstrapServers,
            @Nonnull @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @Nonnull @JsonProperty("format") Format format,
            @JsonProperty("scanStartupMode") TdsqlKafkaScanStartupMode tdsqlKafkaScanStartupMode,
            @JsonProperty("primaryKey") String primaryKey,
            @JsonProperty("groupId") String groupId,
            @JsonProperty("scanSpecificOffsets") String scanSpecificOffsets) {
        super(id, name, fields, watermarkField, properties);
        this.topic = Preconditions.checkNotNull(topic, "kafka topic is empty");
        this.bootstrapServers = Preconditions.checkNotNull(bootstrapServers, "kafka bootstrapServers is empty");
        this.username = Preconditions.checkNotNull(username, "kafka sasl username is empty");
        this.password = password;
        this.format = Preconditions.checkNotNull(format, "kafka format is empty");
        this.tdsqlKafkaScanStartupMode = Preconditions.checkNotNull(tdsqlKafkaScanStartupMode,
                "kafka scanStartupMode is empty");
        this.primaryKey = primaryKey;
        this.groupId = groupId;
        if (tdsqlKafkaScanStartupMode == TdsqlKafkaScanStartupMode.SPECIFIC_OFFSETS) {
            Preconditions.checkArgument(StringUtils.isNotEmpty(scanSpecificOffsets), "scanSpecificOffsets is empty");
            this.scanSpecificOffsets = scanSpecificOffsets;
        }
    }

    /**
     * generate table options
     *
     * @return options
     */
    @Override
    public Map<String, String> tableOptions() {
        Map<String, String> options = super.tableOptions();
        options.put(TdsqlKafkaConstant.TOPIC, topic);
        options.put(TdsqlKafkaConstant.PROPERTIES_BOOTSTRAP_SERVERS, bootstrapServers);
        if (format instanceof ProtobufFormat) {
            options.put(TdsqlKafkaConstant.CONNECTOR, TdsqlKafkaConstant.TDSQL_SUBSCRIBE);
            options.put(TdsqlKafkaConstant.SCAN_STARTUP_MODE, tdsqlKafkaScanStartupMode.getValue());
            if (StringUtils.isNotEmpty(scanSpecificOffsets)) {
                options.put(TdsqlKafkaConstant.SCAN_STARTUP_SPECIFIC_OFFSETS, scanSpecificOffsets);
            }
            options.putAll(format.generateOptions(false));
            options.put(TdsqlKafkaConstant.PROPERTIES_SECURITY_PROTOCOL, TdsqlKafkaConstant.SASL_PLAINTEXT);
            options.put(TdsqlKafkaConstant.PROPERTIES_SASL_MECHANISM, TdsqlKafkaConstant.SCRAM_SHA_512);
            options.put(TdsqlKafkaConstant.PROPERTIES_SASL_JAAS_CONFIG,
                    String.format(TdsqlKafkaConstant.SCRAM_LONGIN_MODULE, username, password));
        } else {
            throw new IllegalArgumentException("kafka extract node format is IllegalArgument");
        }
        if (StringUtils.isNotEmpty(groupId)) {
            options.put(TdsqlKafkaConstant.PROPERTIES_GROUP_ID, groupId);
        }
        return options;
    }

    @Override
    public String genTableName() {
        return String.format("table_%s", super.getId());
    }

    @Override
    public String getPrimaryKey() {
        return primaryKey;
    }

    @Override
    public List<FieldInfo> getPartitionFields() {
        return super.getPartitionFields();
    }

    @Override
    public String getMetadataKey(MetaField metaField) {
        String metadataKey;
        switch (metaField) {
            case TABLE_NAME:
                metadataKey = "value.table";
                break;
            case DATABASE_NAME:
                metadataKey = "value.database";
                break;
            case SQL_TYPE:
                metadataKey = "value.sql-type";
                break;
            case PK_NAMES:
                metadataKey = "value.pk-names";
                break;
            case TS:
                metadataKey = "value.ingestion-timestamp";
                break;
            case OP_TS:
                metadataKey = "value.event-timestamp";
                break;
            case OP_TYPE:
                metadataKey = "value.op-type";
                break;
            case IS_DDL:
                metadataKey = "value.is-ddl";
                break;
            case MYSQL_TYPE:
                metadataKey = "value.mysql-type";
                break;
            case BATCH_ID:
                metadataKey = "value.batch-id";
                break;
            case UPDATE_BEFORE:
                metadataKey = "value.update-before";
                break;
            default:
                throw new UnsupportedOperationException(String.format("Unsupport meta field for %s: %s",
                        this.getClass().getSimpleName(), metaField));
        }
        return metadataKey;
    }

    @Override
    public boolean isVirtual(MetaField metaField) {
        return false;
    }

    @Override
    public Set<MetaField> supportedMetaFields() {
        return EnumSet.of(MetaField.PROCESS_TIME, MetaField.TABLE_NAME, MetaField.OP_TYPE, MetaField.DATABASE_NAME,
                MetaField.SQL_TYPE, MetaField.PK_NAMES, MetaField.TS, MetaField.OP_TS, MetaField.IS_DDL,
                MetaField.MYSQL_TYPE, MetaField.BATCH_ID, MetaField.UPDATE_BEFORE);
    }
}

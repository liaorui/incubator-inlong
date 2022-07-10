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

package org.apache.inlong.manager.common.pojo.source;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.apache.inlong.manager.common.enums.SourceType;
import org.apache.inlong.manager.common.pojo.source.autopush.AutoPushSource;
import org.apache.inlong.manager.common.pojo.source.file.FileSource;
import org.apache.inlong.manager.common.pojo.source.kafka.KafkaSource;
import org.apache.inlong.manager.common.pojo.source.mongodb.MongoDBSource;
import org.apache.inlong.manager.common.pojo.source.mysql.MySQLBinlogSource;
import org.apache.inlong.manager.common.pojo.source.oracle.OracleSource;
import org.apache.inlong.manager.common.pojo.source.postgres.PostgresSource;
import org.apache.inlong.manager.common.pojo.source.pulsar.PulsarSource;
import org.apache.inlong.manager.common.pojo.source.sqlserver.SqlServerSource;
import org.apache.inlong.manager.common.pojo.stream.StreamNode;

import java.util.Date;

/**
 * Stream source info, including source name, agent ip, etc.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(use = Id.NAME, visible = true, property = "sourceType")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AutoPushSource.class, name = SourceType.SOURCE_AUTO_PUSH),
        @JsonSubTypes.Type(value = FileSource.class, name = SourceType.SOURCE_FILE),
        @JsonSubTypes.Type(value = KafkaSource.class, name = SourceType.SOURCE_KAFKA),
        @JsonSubTypes.Type(value = MongoDBSource.class, name = SourceType.SOURCE_MONGODB),
        @JsonSubTypes.Type(value = MySQLBinlogSource.class, name = SourceType.SOURCE_BINLOG),
        @JsonSubTypes.Type(value = OracleSource.class, name = SourceType.SOURCE_ORACLE),
        @JsonSubTypes.Type(value = PostgresSource.class, name = SourceType.SOURCE_POSTGRES),
        @JsonSubTypes.Type(value = PulsarSource.class, name = SourceType.SOURCE_PULSAR),
        @JsonSubTypes.Type(value = SqlServerSource.class, name = SourceType.SOURCE_SQL),
})
@ApiModel("Stream source info")
public abstract class StreamSource extends StreamNode {

    @ApiModelProperty("Source id")
    private Integer id;

    @ApiModelProperty("Inlong group id")
    private String inlongGroupId;

    @ApiModelProperty("Inlong stream id")
    private String inlongStreamId;

    @ApiModelProperty("Source type, including: FILE, KAFKA, etc.")
    private String sourceType;

    @ApiModelProperty("Source name, unique in one stream")
    private String sourceName;

    @ApiModelProperty("Ip of the agent running the task")
    private String agentIp;

    @ApiModelProperty("Mac uuid of the agent running the task")
    private String uuid;

    @Deprecated
    @ApiModelProperty("Id of the cluster that collected this source")
    private Integer clusterId;

    @ApiModelProperty("Inlong cluster name")
    private String inlongClusterName;

    @ApiModelProperty("Data node name")
    private String dataNodeName;

    @ApiModelProperty("Data Serialization, support: csv, json, canal, avro, etc")
    private String serializationType;

    @ApiModelProperty("Snapshot of this source task")
    private String snapshot;

    @ApiModelProperty("Version")
    private Integer version;

    @ApiModelProperty("Status")
    private Integer status;

    @ApiModelProperty("Previous SimpleSourceStatus")
    private Integer previousStatus;

    @ApiModelProperty("Creator")
    private String creator;

    @ApiModelProperty("Modifier")
    private String modifier;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;

    public SourceRequest genSourceRequest() {
        return null;
    }

}

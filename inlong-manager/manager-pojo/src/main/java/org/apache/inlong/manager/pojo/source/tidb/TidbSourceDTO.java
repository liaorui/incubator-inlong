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

package org.apache.inlong.manager.pojo.source.tidb;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.inlong.manager.common.enums.ErrorCodeEnum;
import org.apache.inlong.manager.common.exceptions.BusinessException;

/**
 * Tidb source info
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TidbSourceDTO {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper(); // thread safe

    @ApiModelProperty("TiKV cluster's PD address")
    private String pdAddresses;

    @ApiModelProperty("Database name")
    private String database;

    @ApiModelProperty("Table name")
    private String tableName;

    @ApiModelProperty("Primary key")
    private String primaryKey;

    @ApiModelProperty("Properties for Tidb")
    private Map<String, Object> properties;

    /**
     * Get the dto instance from the request
     */
    public static TidbSourceDTO getFromRequest(TidbSourceRequest request) {
        return TidbSourceDTO.builder()
                .pdAddresses(request.getPdAddresses())
                .database(request.getDatabase())
                .tableName(request.getTableName())
                .primaryKey(request.getPrimaryKey())
                .properties(request.getProperties())
                .build();
    }

    public static TidbSourceDTO getFromJson(@NotNull String extParams) {
        try {
            OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return OBJECT_MAPPER.readValue(extParams, TidbSourceDTO.class);
        } catch (Exception e) {
            throw new BusinessException(ErrorCodeEnum.SOURCE_INFO_INCORRECT.getMessage() + ": " + e.getMessage());
        }
    }

}

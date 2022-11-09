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

package org.apache.inlong.manager.service.source.mysql;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.inlong.manager.common.consts.SourceType;
import org.apache.inlong.manager.common.enums.ErrorCodeEnum;
import org.apache.inlong.manager.common.exceptions.BusinessException;
import org.apache.inlong.manager.common.util.CommonBeanUtils;
import org.apache.inlong.manager.dao.entity.StreamSourceEntity;
import org.apache.inlong.manager.pojo.source.SourceRequest;
import org.apache.inlong.manager.pojo.source.StreamSource;
import org.apache.inlong.manager.pojo.source.mysql.MySQLSource;
import org.apache.inlong.manager.pojo.source.mysql.MySQLSourceDTO;
import org.apache.inlong.manager.pojo.source.mysql.MySQLSourceRequest;
import org.apache.inlong.manager.pojo.stream.StreamField;
import org.apache.inlong.manager.service.source.AbstractSourceOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MySQL source operation
 */
@Service
public class MySQLSourceOperation extends AbstractSourceOperator {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Boolean accept(String sourceType) {
        return SourceType.MYSQL.equals(sourceType);
    }

    @Override
    protected String getSourceType() {
        return SourceType.MYSQL;
    }

    @Override
    protected void setTargetEntity(SourceRequest request, StreamSourceEntity targetEntity) {
        MySQLSourceRequest sourceRequest = (MySQLSourceRequest) request;
        CommonBeanUtils.copyProperties(sourceRequest, targetEntity, true);
        try {
            MySQLSourceDTO dto = MySQLSourceDTO.getFromRequest(sourceRequest);
            targetEntity.setExtParams(objectMapper.writeValueAsString(dto));
        } catch (Exception e) {
            throw new BusinessException(ErrorCodeEnum.SOURCE_INFO_INCORRECT.getMessage());
        }
    }

    @Override
    public StreamSource getFromEntity(StreamSourceEntity entity) {
        MySQLSource source = new MySQLSource();
        if (entity == null) {
            return source;
        }

        MySQLSourceDTO dto = MySQLSourceDTO.getFromJson(entity.getExtParams());
        CommonBeanUtils.copyProperties(entity, source, true);
        CommonBeanUtils.copyProperties(dto, source, true);
        List<StreamField> sourceFields = super.getSourceFields(entity.getId());
        source.setFieldList(sourceFields);
        return source;
    }

}

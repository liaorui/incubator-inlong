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

package org.apache.inlong.manager.common.pojo.source.tdsqlkafka;

import java.util.Locale;
import lombok.Getter;

/**
 * Enum of auto offset reset strategy of TDSQL-Kafka.
 */
public enum TdsqlKafkaOffset {

    EARLIEST("earliest"),
    LATEST("latest"),
    NONE("none");

    @Getter
    private final String name;

    TdsqlKafkaOffset(String name) {
        this.name = name;
    }

    public static TdsqlKafkaOffset forName(String name) {
        for (TdsqlKafkaOffset dataFormat : values()) {
            if (dataFormat.getName().equals(name.toLowerCase(Locale.ROOT))) {
                return dataFormat;
            }
        }
        throw new IllegalArgumentException(String.format("Unsupported KafkaOffset=%s", name));
    }

}

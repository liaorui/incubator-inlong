/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.apache.inlong.sort.protocol.constant;

/**
 * tdsql kafka option constant
 *
 * @see <a href="https://cloud.tencent.com/document/product/849/71448"></a>
 */
public class TdsqlKafkaConstant {

    public static final String CONNECTOR = "connector";

    public static final String TDSQL_SUBSCRIBE = "tdsql-subscribe";

    public static final String TDSQL_DATABASE_NAME = "tdsql.database.name";

    public static final String TDSQL_TABLE_NAME = "tdsql.table.name";

    public static final String TOPIC = "topic";

    public static final String SCAN_STARTUP_MODE = "scan.startup.mode";

    public static final String PROPERTIES_BOOTSTRAP_SERVERS = "properties.bootstrap.servers";

    public static final String PROPERTIES_GROUP_ID = "properties.group.id";

    public static final String FORMAT = "format";

    public static final String PROPERTIES_SECURITY_PROTOCOL = "properties.security.protocol";

    public static final String SASL_PLAINTEXT = "SASL_PLAINTEXT";

    public static final String PROPERTIES_SASL_MECHANISM = "properties.sasl.mechanism";

    public static final String SCRAM_SHA_512 = "SCRAM-SHA-512";

    public static final String PROPERTIES_SASL_JAAS_CONFIG = "properties.sasl.jaas.config";

    public static final String SCRAM_LONGIN_MODULE = "org.apache.kafka.common.security.scram.ScramLoginModule required "
            + "username=\"%s\" password=\"%s\";";

    public static final String SCAN_STARTUP_SPECIFIC_OFFSETS = "scan.startup.specific-offsets";
}

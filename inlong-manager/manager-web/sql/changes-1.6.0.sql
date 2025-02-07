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

-- This is the SQL change file from version 1.4.0 to the current version 1.5.0.
-- When upgrading to version 1.5.0, please execute those SQLs in the DB (such as MySQL) used by the Manager module.

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

USE `apache_inlong_manager`;


ALTER TABLE `inlong_stream_field`
    MODIFY COLUMN `meta_field_name` varchar(120) DEFAULT NULL COMMENT 'Meta field name';

ALTER TABLE `inlong_stream_field`
    MODIFY COLUMN `field_format` text DEFAULT NULL COMMENT 'Field format, including: MICROSECONDS, MILLISECONDS, SECONDS, custom such as yyyy-MM-dd HH:mm:ss, and serialize format of complex type or decimal precision, etc.';

ALTER TABLE `stream_source_field`
    MODIFY COLUMN `meta_field_name` varchar(120) DEFAULT NULL COMMENT 'Meta field name';

ALTER TABLE `stream_source_field`
    MODIFY COLUMN `field_format` text DEFAULT NULL COMMENT 'Field format, including: MICROSECONDS, MILLISECONDS, SECONDS, custom such as yyyy-MM-dd HH:mm:ss, and serialize format of complex type or decimal precision, etc.';

ALTER TABLE `stream_transform_field`
    MODIFY COLUMN `meta_field_name` varchar(120) DEFAULT NULL COMMENT 'Meta field name';

ALTER TABLE `stream_transform_field`
    MODIFY COLUMN `field_format` text DEFAULT NULL COMMENT 'Field format, including: MICROSECONDS, MILLISECONDS, SECONDS, custom such as yyyy-MM-dd HH:mm:ss, and serialize format of complex type or decimal precision, etc.';

ALTER TABLE `stream_sink_field`
    MODIFY COLUMN `meta_field_name` varchar(120) DEFAULT NULL COMMENT 'Meta field name';

ALTER TABLE `stream_sink_field`
    MODIFY COLUMN `field_format` text DEFAULT NULL COMMENT 'Field format, including: MICROSECONDS, MILLISECONDS, SECONDS, custom such as yyyy-MM-dd HH:mm:ss, and serialize format of complex type or decimal precision, etc.';

ALTER TABLE `stream_sink_field`
    MODIFY COLUMN `source_field_name` varchar(120) DEFAULT NULL COMMENT 'Source field name';


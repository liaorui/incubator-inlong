/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.tdsql.streaming.connectors.kafka.internals.metrics;

import org.apache.flink.metrics.Counter;
import org.apache.flink.metrics.Meter;
import org.apache.flink.metrics.MeterView;
import org.apache.flink.metrics.MetricGroup;

public class KafkaRecordInMetricsRegistry {
    private Meter recordInMeter;
    private Meter bytesInMeter;
    private Counter recordIn;
    private Counter bytesIn;

    public KafkaRecordInMetricsRegistry(MetricGroup metricGroup) {
        this.recordIn = metricGroup.counter(KafkaConsumerMetricConstants.SOURCE_NUM_RECORDS_IN);
        this.bytesIn = metricGroup.counter(KafkaConsumerMetricConstants.SOURCE_NUM_BYTES_IN);
        this.bytesInMeter =
                metricGroup.meter(
                        KafkaConsumerMetricConstants.SOURCE_NUM_BYTES_IN_RATE,
                        new MeterView(bytesIn, 1));
        this.recordInMeter =
                metricGroup.meter(
                        KafkaConsumerMetricConstants.SOURCE_NUM_RECORDS_IN_RATE,
                        new MeterView(recordIn, 1));
    }

    public Meter getRecordInMeter() {
        return this.recordInMeter;
    }

    public Meter getBytesInMeter() {
        return this.bytesInMeter;
    }
}

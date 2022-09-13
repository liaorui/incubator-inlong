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

public class KafkaRecordOutMetricsRegistry {
    private Meter recordOutMeter;
    private Meter bytesOutMeter;
    private Counter recordOut;
    private Counter bytesOut;

    public KafkaRecordOutMetricsRegistry(MetricGroup metricGroup) {
        this.recordOut = metricGroup.counter(KafkaConsumerMetricConstants.SINK_NUM_RECORDS_OUT);
        this.bytesOut = metricGroup.counter(KafkaConsumerMetricConstants.SINK_NUM_BYTES_OUT);
        this.bytesOutMeter =
                metricGroup.meter(
                        KafkaConsumerMetricConstants.SINK_NUM_BYTES_OUT_RATE,
                        new MeterView(bytesOut, 1));
        this.recordOutMeter =
                metricGroup.meter(
                        KafkaConsumerMetricConstants.SINK_NUM_RECORDS_OUT_RATE,
                        new MeterView(recordOut, 1));
    }

    public Meter getRecordOutMeter() {
        return recordOutMeter;
    }

    public Meter getBytesOutMeter() {
        return bytesOutMeter;
    }
}

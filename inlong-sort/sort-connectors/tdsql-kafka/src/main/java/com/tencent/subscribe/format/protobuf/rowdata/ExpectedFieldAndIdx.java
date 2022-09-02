package com.tencent.subscribe.format.protobuf.rowdata;

import org.apache.flink.table.types.logical.LogicalType;

import java.io.Serializable;

public class ExpectedFieldAndIdx implements Serializable {
    private LogicalType logicalType;
    private int index;
    private int originIndex;

    public LogicalType getLogicalType() {
        return logicalType;
    }

    public void setLogicalType(LogicalType logicalType) {
        this.logicalType = logicalType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getOriginIndex() {
        return originIndex;
    }

    public void setOriginIndex(int originIndex) {
        this.originIndex = originIndex;
    }

    @Override
    public String toString() {
        return "ExpectedFieldAndIdx{" +
                "logicalType=" + logicalType.toString() +
                ", index=" + index +
                ", originIndex=" + originIndex +
                '}';
    }
}

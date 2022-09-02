package com.tencent.subscribe.format.protobuf.rowdata;

import com.tencent.subscribe.SubscribeDataProto;
import org.apache.flink.api.common.serialization.AbstractDeserializationSchema;
import org.apache.flink.formats.common.TimestampFormat;
import org.apache.flink.table.data.RowData;
import org.apache.flink.table.types.logical.RowType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static java.lang.String.format;


public class ProtobufRowDataDeserializationSchema extends AbstractDeserializationSchema<RowData> {

    private static final Logger LOG = LoggerFactory.getLogger(ProtobufRowDataDeserializationSchema.class);

    /**
     * Flag indicating whether to ignore invalid fields/rows (default: throw an exception).
     */
    private final boolean ignoreParseErrors;

    /**
     * TypeInformation of the produced {@link RowData}.
     */
    private RowType expectedResultType;

    private ProtobufToRowDataConverters.ProtobufToRowDataConverter runtimeConverter;

    /**
     * Timestamp format specification which is used to parse timestamp.
     */
    private TimestampFormat timestampFormat;

    /**
     * Creates a Protobuf deserialization descriptor for the given message class. Having the
     * concrete Protobuf message class might improve performance.
     *
     * @param ignoreParseErrors
     */
    public ProtobufRowDataDeserializationSchema(boolean ignoreParseErrors, RowType expectedResultType, TimestampFormat timestampFormat) {
        this.ignoreParseErrors = ignoreParseErrors;
        this.timestampFormat = timestampFormat;
        // protobuf 本身的 schema
        this.expectedResultType = expectedResultType;
        this.runtimeConverter = new ProtobufToRowDataConverters(false, timestampFormat).createRowDataConverterByLogicalType(this.expectedResultType);
    }

    @Override
    public RowData deserialize(byte[] bytes) throws IOException {
        if (bytes == null) {
            return null;
        }
        SubscribeDataProto.Entry entry = SubscribeDataProto.Entry.parseFrom(bytes);
        if (entry.hasEvent() && entry.hasHeader()) {
            SubscribeDataProto.Header header = entry.getHeader();
            if (header.getMessageType() == SubscribeDataProto.MessageType.DML) {
                return (RowData) runtimeConverter.convert(entry);
            } else {
                LOG.warn("entry is not DML event , cannot deserialize to RowData.");
            }
        } else {
            LOG.warn("entry cannot find header, deserialize to RowData failed.");
        }
        return null;
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        LOG.info(String.format("expectedResultType [%s]", expectedResultType));
        outputStream.writeObject(this.expectedResultType);
        outputStream.writeObject(this.timestampFormat);
        outputStream.writeObject(this.runtimeConverter);
//        }
    }

    @SuppressWarnings("unchecked")
    private void readObject(ObjectInputStream inputStream) throws ClassNotFoundException, IOException {
        this.expectedResultType = (RowType) inputStream.readObject();
        this.timestampFormat = (TimestampFormat) inputStream.readObject();
        this.runtimeConverter = new ProtobufToRowDataConverters(false, timestampFormat).createRowDataConverterByLogicalType(this.expectedResultType);
    }
}

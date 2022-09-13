package com.tencent.subscribe.format.protobuf.rowdata;

import com.google.protobuf.*;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.tencent.subscribe.SubscribeDataProto;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.calcite.shaded.com.google.common.collect.Maps;
import org.apache.flink.formats.common.TimestampFormat;
import org.apache.flink.table.api.TableException;
import org.apache.flink.table.data.*;
import org.apache.flink.table.shaded.org.joda.time.DateTimeFieldType;
import org.apache.flink.table.shaded.org.joda.time.LocalDate;
import org.apache.flink.table.shaded.org.joda.time.LocalTime;
import org.apache.flink.table.types.logical.*;
import org.apache.flink.types.RowKind;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static org.apache.flink.formats.common.TimeFormats.*;


public class ProtobufToRowDataConverters implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(ProtobufToRowDataConverters.class);

    /**
     * Used for time conversions into SQL types.
     */
    private static final TimeZone LOCAL_TZ = TimeZone.getDefault();

    private final boolean isDynamicMessage;

    private final TimestampFormat timestampFormat;

    public ProtobufToRowDataConverters(boolean isDynamicMessage, TimestampFormat timestampFormat) {
        this.isDynamicMessage = isDynamicMessage;
        this.timestampFormat = timestampFormat;
    }


    @FunctionalInterface
    public interface ProtobufToRowDataConverter extends Serializable {
        Object convert(Object object);
    }

    public ProtobufToRowDataConverter createRowDataConverterByLogicalType(RowType expectedResultType) {
        List<RowType.RowField> fields = expectedResultType.getFields();
        Map<String, LogicalType> expectedFieldTypeMap = Maps.newHashMap();
        Map<String, ExpectedFieldAndIdx> expectedFieldAndIdxMap = Maps.newHashMap();
        for (RowType.RowField field : fields) {
            expectedFieldTypeMap.put(field.getName(), field.getType());
        }
        for (int i = 0; i < fields.size(); i++) {
            ExpectedFieldAndIdx expectedFieldAndIdx = new ExpectedFieldAndIdx();
            expectedFieldAndIdx.setLogicalType(fields.get(i).getType());
            expectedFieldAndIdx.setIndex(i);
            expectedFieldAndIdxMap.put(fields.get(i).getName(), expectedFieldAndIdx);
        }
        return (Object o) -> {
            SubscribeDataProto.Entry entry = (SubscribeDataProto.Entry) o;
            SubscribeDataProto.Event event = entry.getEvent();
            SubscribeDataProto.DMLEvent dmlEvent = event.getDmlEvent();
            GenericRowData genericRowData = new GenericRowData(expectedFieldTypeMap.size());
            LOG.debug(String.format("expectedFieldAndIdxMap [%s]", expectedFieldAndIdxMap));
            switch (dmlEvent.getDmlEventType().getNumber()) {
                case SubscribeDataProto.DMLType.UPDATE_VALUE: {
                    handleUpdate(dmlEvent, expectedFieldAndIdxMap, genericRowData);
                    return genericRowData;
                }
                case SubscribeDataProto.DMLType.INSERT_VALUE: {
                    handleInsert(dmlEvent, expectedFieldAndIdxMap, genericRowData);
                    return genericRowData;
                }
                case SubscribeDataProto.DMLType.DELETE_VALUE: {
                    handleDelete(dmlEvent, expectedFieldAndIdxMap, genericRowData);
                    return genericRowData;
                }
                default: {
                    throw new IllegalArgumentException(String.format("dmlEvent.getDmlEventType().getNumber() [%d] not matched", dmlEvent.getDmlEventType().getNumber()));
                }
            }
        };
    }

    private void handleInsert(SubscribeDataProto.DMLEvent dmlEvent, Map<String, ExpectedFieldAndIdx> expectedFieldAndIdxMap, GenericRowData genericRowData) {
        List<SubscribeDataProto.RowChange> rowsList = dmlEvent.getRowsList();
        List<SubscribeDataProto.Column> columnsList = dmlEvent.getColumnsList();
        for (SubscribeDataProto.RowChange rowChange : rowsList) {
            List<SubscribeDataProto.Data> newColumnsList = rowChange.getNewColumnsList();
            for (int newColIdx = 0; newColIdx < newColumnsList.size(); newColIdx++) {
                ExpectedFieldAndIdx expectedFieldAndIdx = expectedFieldAndIdxMap.get(columnsList.get(newColIdx).getName());
                if (expectedFieldAndIdx != null) {
                    expectedFieldAndIdx.setOriginIndex(newColIdx);
                    setRowDataFields(genericRowData, newColumnsList, expectedFieldAndIdx);
                }
            }
            genericRowData.setRowKind(RowKind.INSERT);
        }
    }

    private void handleUpdate(SubscribeDataProto.DMLEvent dmlEvent, Map<String, ExpectedFieldAndIdx> expectedFieldAndIdxMap, GenericRowData genericRowData) {
        List<SubscribeDataProto.RowChange> rowsList = dmlEvent.getRowsList();
        List<SubscribeDataProto.Column> columnsList = dmlEvent.getColumnsList();
        for (SubscribeDataProto.RowChange rowChange : rowsList) {
            List<SubscribeDataProto.Data> newColumnsList = rowChange.getNewColumnsList();
            for (int newColIdx = 0; newColIdx < newColumnsList.size(); newColIdx++) {
                ExpectedFieldAndIdx expectedFieldAndIdx = expectedFieldAndIdxMap.get(columnsList.get(newColIdx).getName());
                if (expectedFieldAndIdx != null) {
                    expectedFieldAndIdx.setOriginIndex(newColIdx);
                    setRowDataFields(genericRowData, newColumnsList, expectedFieldAndIdx);
                }
            }
            genericRowData.setRowKind(RowKind.UPDATE_AFTER);
        }
    }

    private void handleDelete(SubscribeDataProto.DMLEvent dmlEvent, Map<String, ExpectedFieldAndIdx> expectedFieldTypeMap, GenericRowData genericRowData) {
        List<SubscribeDataProto.RowChange> rowsList = dmlEvent.getRowsList();
        List<SubscribeDataProto.Column> columnsList = dmlEvent.getColumnsList();
        for (SubscribeDataProto.RowChange rowChange : rowsList) {
            List<SubscribeDataProto.Data> oldColumnsList = rowChange.getOldColumnsList();
            for (int newColIdx = 0; newColIdx < oldColumnsList.size(); newColIdx++) {
                ExpectedFieldAndIdx expectedFieldAndIdx = expectedFieldTypeMap.get(columnsList.get(newColIdx).getName());
                if (expectedFieldAndIdx != null) {
                    expectedFieldAndIdx.setOriginIndex(newColIdx);
                    setRowDataFields(genericRowData, oldColumnsList, expectedFieldAndIdx);
                }
            }
            genericRowData.setRowKind(RowKind.DELETE);
        }
    }

    private void setRowDataFields(GenericRowData genericRowData, List<SubscribeDataProto.Data> newColumnsList, ExpectedFieldAndIdx expectedFieldAndIdx) {
        LogicalType logicalType = expectedFieldAndIdx.getLogicalType();
        int newColIdx = expectedFieldAndIdx.getIndex();
        int originColIdx = expectedFieldAndIdx.getOriginIndex();
        switch (logicalType.getTypeRoot()) {
            case BOOLEAN: {
                if (logicalType instanceof BooleanType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if ("1".equals(sv)) {
                        genericRowData.setField(newColIdx, Boolean.TRUE);
                        return;
                    }
                    genericRowData.setField(newColIdx, Boolean.parseBoolean(sv));
                    return;
                }
            }
            case TINYINT: {
                if (logicalType instanceof TinyIntType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    genericRowData.setField(newColIdx, Byte.parseByte(newColumnsList.get(originColIdx).getSv()));
                    return;
                }
            }
            case SMALLINT: {
                if (logicalType instanceof SmallIntType) {
                    String sv = newColumnsList.get(newColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    genericRowData.setField(newColIdx, Short.parseShort(newColumnsList.get(originColIdx).getSv()));
                    return;
                }
            }
            case INTEGER:
            case INTERVAL_YEAR_MONTH: {
                if (logicalType instanceof IntType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    genericRowData.setField(newColIdx, Integer.parseInt(newColumnsList.get(originColIdx).getSv()));
                    return;
                }
            }
            case BIGINT:
            case INTERVAL_DAY_TIME: {
                if (logicalType instanceof BigIntType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    genericRowData.setField(newColIdx, Long.parseLong(newColumnsList.get(originColIdx).getSv()));
                    return;
                }
            }
            case FLOAT: {
                if (logicalType instanceof FloatType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    genericRowData.setField(newColIdx, Float.parseFloat(newColumnsList.get(originColIdx).getSv()));
                    return;
                }
            }
            case DOUBLE: {
                if (logicalType instanceof DoubleType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    genericRowData.setField(newColIdx, Double.parseDouble(sv));
                    return;
                }
            }
            case CHAR:
            case VARCHAR: {
                // value is BinaryString
                if (logicalType instanceof VarCharType || logicalType instanceof CharType) {
                    genericRowData.setField(newColIdx, StringData.fromString(getEncodedFieldFromBv(newColumnsList, originColIdx)));
                    return;
                }
            }
            case DATE: {
                if (logicalType instanceof DateType) {
                    String encodedFieldFromBv = getEncodedFieldFromBv(newColumnsList, originColIdx);
                    if (encodedFieldFromBv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    java.time.LocalDate date = ISO_LOCAL_DATE.parse(encodedFieldFromBv).query(TemporalQueries.localDate());
                    genericRowData.setField(newColIdx, (int) date.toEpochDay());
                    return;
                }
            }
            case TIME_WITHOUT_TIME_ZONE: {
                if (logicalType instanceof TimeType) {
                    String encodedFieldFromBv = getEncodedFieldFromBv(newColumnsList, originColIdx);
                    if (encodedFieldFromBv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    TemporalAccessor parsedTime = SQL_TIME_FORMAT.parse(encodedFieldFromBv);
                    java.time.LocalTime localTime = parsedTime.query(TemporalQueries.localTime());
                    // get number of milliseconds of the day
                    genericRowData.setField(newColIdx, localTime.toSecondOfDay() * 1000);
                    return;
                }
            }
            case TIMESTAMP_WITHOUT_TIME_ZONE: {
                TemporalAccessor parsedTimestamp;
                String encodedFieldFromBv = getEncodedFieldFromBv(newColumnsList, originColIdx);
                if (encodedFieldFromBv.trim().isEmpty()) {
                    genericRowData.setField(newColIdx, null);
                    return;
                }
                switch (timestampFormat) {
                    case SQL:
                        parsedTimestamp = SQL_TIMESTAMP_FORMAT.parse(getEncodedFieldFromBv(newColumnsList, originColIdx));
                        break;
                    case ISO_8601:
                        parsedTimestamp = ISO8601_TIMESTAMP_FORMAT.parse(getEncodedFieldFromBv(newColumnsList, originColIdx));
                        break;
                    default:
                        throw new TableException(
                                String.format(
                                        "Unsupported timestamp format '%s'. Validator should have checked that.",
                                        timestampFormat));
                }
                java.time.LocalTime localTime = parsedTimestamp.query(TemporalQueries.localTime());
                java.time.LocalDate localDate = parsedTimestamp.query(TemporalQueries.localDate());

                genericRowData.setField(newColIdx, TimestampData.fromLocalDateTime(LocalDateTime.of(localDate, localTime)));
                return;
            }
            case TIMESTAMP_WITH_LOCAL_TIME_ZONE: {
                String encodedFieldFromBv = getEncodedFieldFromBv(newColumnsList, originColIdx);
                if (encodedFieldFromBv.trim().isEmpty()) {
                    genericRowData.setField(newColIdx, null);
                    return;
                }
                TemporalAccessor parsedTimestampWithLocalZone;
                switch (timestampFormat) {
                    case SQL:
                        parsedTimestampWithLocalZone =
                                SQL_TIMESTAMP_WITH_LOCAL_TIMEZONE_FORMAT.parse(getEncodedFieldFromBv(newColumnsList, originColIdx));
                        break;
                    case ISO_8601:
                        parsedTimestampWithLocalZone =
                                ISO8601_TIMESTAMP_WITH_LOCAL_TIMEZONE_FORMAT.parse(getEncodedFieldFromBv(newColumnsList, originColIdx));
                        break;
                    default:
                        throw new TableException(
                                String.format("Unsupported timestamp format '%s'. Validator should have checked that.", timestampFormat));
                }
                java.time.LocalTime localTime = parsedTimestampWithLocalZone.query(TemporalQueries.localTime());
                java.time.LocalDate localDate = parsedTimestampWithLocalZone.query(TemporalQueries.localDate());

                genericRowData.setField(newColIdx, TimestampData.fromInstant(LocalDateTime.of(localDate, localTime).toInstant(ZoneOffset.UTC)));
                return;
            }
            case DECIMAL: {
                if (logicalType instanceof DecimalType) {
                    String sv = newColumnsList.get(originColIdx).getSv();
                    if (sv.trim().isEmpty()) {
                        genericRowData.setField(newColIdx, null);
                        return;
                    }
                    final int decimalPrecision = ((DecimalType) logicalType).getPrecision();
                    final int decimalScale = ((DecimalType) logicalType).getScale();
                    genericRowData.setField(newColIdx, DecimalData.fromBigDecimal(new BigDecimal(newColumnsList.get(originColIdx).getSv()), decimalPrecision, decimalScale));
                    return;
                }
            }
            case BINARY:
            case VARBINARY: {
                genericRowData.setField(newColIdx, newColumnsList.get(originColIdx).getBv().toByteArray());
                return;
            }
            case ARRAY:
            case MAP:
            case MULTISET:
            case ROW:
            case RAW:
            default:
                throw new UnsupportedOperationException("Unsupported type:" + logicalType);
        }
    }

    /**
     * encoding field from bv
     *
     * @param newColumnsList
     * @param colIdx
     * @return
     */
    private String getEncodedFieldFromBv(List<SubscribeDataProto.Data> newColumnsList, int colIdx) {
        String charset = newColumnsList.get(colIdx).getCharset();
        LOG.debug("charset " + charset);
        if (StringUtils.isNoneEmpty(charset) && charset.startsWith("gbk")) {
            return new String(newColumnsList.get(colIdx).getBv().toByteArray(), Charset.forName("GBK"));
        } else {
            // default charset utf8
            return new String(newColumnsList.get(colIdx).getBv().toByteArray());
        }
    }


    public ProtobufToRowDataConverter createRowDataConverterByDescriptor(Descriptors.Descriptor descriptor, RowType rowType) {
        final FieldDescriptor[] fieldDescriptors = descriptor.getFields().toArray(new FieldDescriptor[0]);
//        final TypeInformation<?>[] fieldTypeInfos = rowTypeInfo.getFieldTypes();
        List<LogicalType> fieldLogicalTypes = rowType.getChildren();
        final int length = fieldDescriptors.length;
        final ProtobufToRowDataConverter[] runtimeConverters = new ProtobufToRowDataConverter[length];

        for (int i = 0; i < length; i++) {
            final FieldDescriptor fieldDescriptor = fieldDescriptors[i];
            final LogicalType fieldLogicalType = fieldLogicalTypes.get(i);
            runtimeConverters[i] = createConverterByDescriptor(fieldDescriptor, fieldLogicalType);
        }

        return (Object o) -> {
            Message message = (Message) o;
            final GenericRowData genericRowData = new GenericRowData(length);
            for (int i = 0; i < length; i++) {
                Object fieldO = message.getField(fieldDescriptors[i]);
                genericRowData.setField(i, runtimeConverters[i].convert(fieldO));
            }
            return genericRowData;
        };
    }

    @SuppressWarnings("unchecked")
    private ProtobufToRowDataConverter createConverterByDescriptor(Descriptors.GenericDescriptor genericDescriptor, LogicalType info) {
        // we perform the conversion based on descriptor information but enriched with pre-computed
        // type information where useful (i.e., for list)

        if (genericDescriptor instanceof Descriptors.Descriptor) {

            return createRowDataConverterByDescriptor((Descriptors.Descriptor) genericDescriptor, (RowType) info);

        } else if (genericDescriptor instanceof FieldDescriptor) {

            FieldDescriptor fieldDescriptor = ((FieldDescriptor) genericDescriptor);

            // field
            switch (fieldDescriptor.getType()) {
                case INT32:
                case FIXED32:
                case UINT32:
                case SFIXED32:
                case SINT32:
                case INT64:
                case UINT64:
                case FIXED64:
                case SFIXED64:
                case SINT64:
                case DOUBLE:
                case FLOAT:
                case BOOL:
                case STRING:
                    if (info instanceof ArrayType) {
                        // list
                        LogicalType elementLogicalType = ((ArrayType) info).getElementType();

                        return createArrayConverter(elementLogicalType);
                    } else {
                        return createObjectConverter(info);
                    }
                case ENUM:
                    if (info instanceof ArrayType) {

                        // list
                        return (Object o) -> new GenericArrayData(((List) o)
                                .stream()
                                .map(Object::toString)
                                .toArray());
                    } else {
                        return Object::toString;
                    }
                case GROUP:
                case MESSAGE:
                    if (info instanceof ArrayType) {
                        // list
                        LogicalType elementLogicalType = ((ArrayType) info).getElementType();
                        Descriptors.Descriptor elementDescriptor = fieldDescriptor.getMessageType();

                        ProtobufToRowDataConverter elementConverter = this.createConverterByDescriptor(elementDescriptor, elementLogicalType);

                        return (Object o) -> new GenericArrayData(((List) o)
                                .stream()
                                .map(elementConverter::convert)
                                .toArray());

                    } else if (info instanceof MapType) {
                        // map
                        final MapType mapTypeInfo = (MapType) info;

                        // todo map's key only support string
                        final ProtobufToRowDataConverter keyConverter = Object::toString;

                        final FieldDescriptor keyFieldDescriptor =
                                fieldDescriptor.getMessageType().getFields().get(0);

                        final FieldDescriptor valueFieldDescriptor =
                                fieldDescriptor.getMessageType().getFields().get(1);

                        final LogicalType valueTypeInfo =
                                mapTypeInfo.getValueType();

                        final ProtobufToRowDataConverter valueConverter =
                                createConverterByDescriptor(valueFieldDescriptor, valueTypeInfo);

                        if (this.isDynamicMessage) {

                            return (Object o) -> {
                                final List<DynamicMessage> dynamicMessages = (List<DynamicMessage>) o;

                                final Map<StringData, Object> convertedMap = new HashMap<>(dynamicMessages.size());

                                dynamicMessages.forEach((DynamicMessage dynamicMessage) -> {
                                    convertedMap.put(
                                            StringData.fromString((String) keyConverter.convert(dynamicMessage.getField(keyFieldDescriptor)))
                                            , valueConverter.convert(dynamicMessage.getField(valueFieldDescriptor)));
                                });

                                return new GenericMapData(convertedMap);
                            };

                        } else {

                            return (Object o) -> {
                                final List<MapEntry> mapEntryList = (List<MapEntry>) o;
                                final Map<StringData, Object> convertedMap = new HashMap<>(mapEntryList.size());
                                mapEntryList.forEach((MapEntry message) -> {
                                    convertedMap.put(
                                            StringData.fromString((String) keyConverter.convert(message.getKey()))
                                            , valueConverter.convert(message.getValue()));
                                });

                                return new GenericMapData(convertedMap);
                            };
                        }
                    } else if (info instanceof RowType) {
                        // row
                        return createRowDataConverterByDescriptor(((FieldDescriptor) genericDescriptor).getMessageType(), (RowType) info);
                    } else if (info instanceof VarCharType) {
                        return createObjectConverter(info);
                    }
                    LOG.error("cannot match info type " + info.asSummaryString());
                    LOG.error(String.format("info type [%s]", info.toString()));
                    throw new IllegalStateException("Message expected but was: ");
                case BYTES:

                    return (Object o) -> {
                        final byte[] bytes = ((ByteString) o).toByteArray();
                        if (info instanceof DecimalType) {
                            return convertToDecimal(bytes);
                        }
                        return bytes;
                    };
            }
        }

        throw new IllegalArgumentException("Unsupported Protobuf type '" + genericDescriptor.getName() + "'.");

    }

    @SuppressWarnings("unchecked")
    private ProtobufToRowDataConverter createArrayConverter(LogicalType info) {

        ProtobufToRowDataConverter elementConverter;

        if (info instanceof DateType) {

            elementConverter = this::convertToDate;

        } else if (info instanceof TimeType) {

            elementConverter = this::convertToTime;
        } else if (info instanceof VarCharType) {
            elementConverter = this::convertToString;
        } else {

            elementConverter = (Object fieldO) -> (fieldO);
        }

        return (Object o) -> new GenericArrayData(((List) o)
                .stream()
                .map(elementConverter::convert)
                .toArray());
    }

    private StringData convertToString(Object filedO) {

        return StringData.fromString((String) filedO);
    }

    private ProtobufToRowDataConverter createObjectConverter(LogicalType info) {
        if (info instanceof DateType) {
            return this::convertToDate;
        } else if (info instanceof TimeType) {
            return this::convertToTime;
        } else if (info instanceof VarCharType) {
            return this::convertToString;
        } else {
            return (Object o) -> o;
        }
    }

    // --------------------------------------------------------------------------------------------

    private BigDecimal convertToDecimal(byte[] bytes) {
        return new BigDecimal(new BigInteger(bytes));
    }

    private Date convertToDate(Object object) {
        final long millis;
        if (object instanceof Integer) {
            final Integer value = (Integer) object;
            // adopted from Apache Calcite
            final long t = (long) value * 86400000L;
            millis = t - (long) LOCAL_TZ.getOffset(t);
        } else {
            // use 'provided' Joda time
            final LocalDate value = (LocalDate) object;
            millis = value.toDate().getTime();
        }
        return new Date(millis);
    }

    private Time convertToTime(Object object) {
        final long millis;
        if (object instanceof Integer) {
            millis = (Integer) object;
        } else {
            // use 'provided' Joda time
            final LocalTime value = (LocalTime) object;
            millis = value.get(DateTimeFieldType.millisOfDay());
        }
        return new Time(millis - LOCAL_TZ.getOffset(millis));
    }

}

package com.tencent.subscribe;

public final class SubscribeDataProto {

    private SubscribeDataProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    /**
     * Protobuf enum {@code subscribe.DMLType}
     */
    public enum DMLType
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>INSERT = 0;</code>
         */
        INSERT(0),
        /**
         * <code>UPDATE = 1;</code>
         */
        UPDATE(1),
        /**
         * <code>DELETE = 2;</code>
         */
        DELETE(2),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>INSERT = 0;</code>
         */
        public static final int INSERT_VALUE = 0;
        /**
         * <code>UPDATE = 1;</code>
         */
        public static final int UPDATE_VALUE = 1;
        /**
         * <code>DELETE = 2;</code>
         */
        public static final int DELETE_VALUE = 2;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static DMLType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static DMLType forNumber(int value) {
            switch (value) {
                case 0:
                    return INSERT;
                case 1:
                    return UPDATE;
                case 2:
                    return DELETE;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<DMLType>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                DMLType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<DMLType>() {
                    public DMLType findValueByNumber(int number) {
                        return DMLType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.getDescriptor().getEnumTypes().get(0);
        }

        private static final DMLType[] VALUES = values();

        public static DMLType valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private DMLType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:subscribe.DMLType)
    }

    /**
     * Protobuf enum {@code subscribe.MessageType}
     */
    public enum MessageType
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>BEGIN = 0;</code>
         */
        BEGIN(0),
        /**
         * <code>COMMIT = 1;</code>
         */
        COMMIT(1),
        /**
         * <code>DML = 2;</code>
         */
        DML(2),
        /**
         * <code>DDL = 3;</code>
         */
        DDL(3),
        /**
         * <code>ROLLBACK = 4;</code>
         */
        ROLLBACK(4),
        /**
         * <code>HEARTBEAT = 5;</code>
         */
        HEARTBEAT(5),
        /**
         * <code>CHECKPOINT = 6;</code>
         */
        CHECKPOINT(6),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>BEGIN = 0;</code>
         */
        public static final int BEGIN_VALUE = 0;
        /**
         * <code>COMMIT = 1;</code>
         */
        public static final int COMMIT_VALUE = 1;
        /**
         * <code>DML = 2;</code>
         */
        public static final int DML_VALUE = 2;
        /**
         * <code>DDL = 3;</code>
         */
        public static final int DDL_VALUE = 3;
        /**
         * <code>ROLLBACK = 4;</code>
         */
        public static final int ROLLBACK_VALUE = 4;
        /**
         * <code>HEARTBEAT = 5;</code>
         */
        public static final int HEARTBEAT_VALUE = 5;
        /**
         * <code>CHECKPOINT = 6;</code>
         */
        public static final int CHECKPOINT_VALUE = 6;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static MessageType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static MessageType forNumber(int value) {
            switch (value) {
                case 0:
                    return BEGIN;
                case 1:
                    return COMMIT;
                case 2:
                    return DML;
                case 3:
                    return DDL;
                case 4:
                    return ROLLBACK;
                case 5:
                    return HEARTBEAT;
                case 6:
                    return CHECKPOINT;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<MessageType>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                MessageType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<MessageType>() {
                    public MessageType findValueByNumber(int number) {
                        return MessageType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.getDescriptor().getEnumTypes().get(1);
        }

        private static final MessageType[] VALUES = values();

        public static MessageType valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private MessageType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:subscribe.MessageType)
    }

    /**
     * Protobuf enum {@code subscribe.SourceType}
     */
    public enum SourceType
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>ORACLE = 0;</code>
         */
        ORACLE(0),
        /**
         * <code>MYSQL = 1;</code>
         */
        MYSQL(1),
        /**
         * <code>PGSQL = 2;</code>
         */
        PGSQL(2),
        /**
         * <code>MARIADB = 3;</code>
         */
        MARIADB(3),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>ORACLE = 0;</code>
         */
        public static final int ORACLE_VALUE = 0;
        /**
         * <code>MYSQL = 1;</code>
         */
        public static final int MYSQL_VALUE = 1;
        /**
         * <code>PGSQL = 2;</code>
         */
        public static final int PGSQL_VALUE = 2;
        /**
         * <code>MARIADB = 3;</code>
         */
        public static final int MARIADB_VALUE = 3;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static SourceType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static SourceType forNumber(int value) {
            switch (value) {
                case 0:
                    return ORACLE;
                case 1:
                    return MYSQL;
                case 2:
                    return PGSQL;
                case 3:
                    return MARIADB;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<SourceType>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                SourceType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<SourceType>() {
                    public SourceType findValueByNumber(int number) {
                        return SourceType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.getDescriptor().getEnumTypes().get(2);
        }

        private static final SourceType[] VALUES = values();

        public static SourceType valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private SourceType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:subscribe.SourceType)
    }

    /**
     * Protobuf enum {@code subscribe.DataType}
     */
    public enum DataType
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * 值为NULL
         * </pre>
         *
         * <code>NIL = 0;</code>
         */
        NIL(0),
        /**
         * <code>INT8 = 1;</code>
         */
        INT8(1),
        /**
         * <code>INT16 = 2;</code>
         */
        INT16(2),
        /**
         * <code>INT32 = 3;</code>
         */
        INT32(3),
        /**
         * <code>INT64 = 4;</code>
         */
        INT64(4),
        /**
         * <code>UINT8 = 5;</code>
         */
        UINT8(5),
        /**
         * <code>UINT16 = 6;</code>
         */
        UINT16(6),
        /**
         * <code>UINT32 = 7;</code>
         */
        UINT32(7),
        /**
         * <code>UINT64 = 8;</code>
         */
        UINT64(8),
        /**
         * <code>FLOAT32 = 9;</code>
         */
        FLOAT32(9),
        /**
         * <code>FLOAT64 = 10;</code>
         */
        FLOAT64(10),
        /**
         * <code>BYTES = 11;</code>
         */
        BYTES(11),
        /**
         * <code>DECIMAL = 12;</code>
         */
        DECIMAL(12),
        /**
         * <code>STRING = 13;</code>
         */
        STRING(13),
        /**
         * <pre>
         * 值不存在(N/A)
         * </pre>
         *
         * <code>NA = 14;</code>
         */
        NA(14),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * 值为NULL
         * </pre>
         *
         * <code>NIL = 0;</code>
         */
        public static final int NIL_VALUE = 0;
        /**
         * <code>INT8 = 1;</code>
         */
        public static final int INT8_VALUE = 1;
        /**
         * <code>INT16 = 2;</code>
         */
        public static final int INT16_VALUE = 2;
        /**
         * <code>INT32 = 3;</code>
         */
        public static final int INT32_VALUE = 3;
        /**
         * <code>INT64 = 4;</code>
         */
        public static final int INT64_VALUE = 4;
        /**
         * <code>UINT8 = 5;</code>
         */
        public static final int UINT8_VALUE = 5;
        /**
         * <code>UINT16 = 6;</code>
         */
        public static final int UINT16_VALUE = 6;
        /**
         * <code>UINT32 = 7;</code>
         */
        public static final int UINT32_VALUE = 7;
        /**
         * <code>UINT64 = 8;</code>
         */
        public static final int UINT64_VALUE = 8;
        /**
         * <code>FLOAT32 = 9;</code>
         */
        public static final int FLOAT32_VALUE = 9;
        /**
         * <code>FLOAT64 = 10;</code>
         */
        public static final int FLOAT64_VALUE = 10;
        /**
         * <code>BYTES = 11;</code>
         */
        public static final int BYTES_VALUE = 11;
        /**
         * <code>DECIMAL = 12;</code>
         */
        public static final int DECIMAL_VALUE = 12;
        /**
         * <code>STRING = 13;</code>
         */
        public static final int STRING_VALUE = 13;
        /**
         * <pre>
         * 值不存在(N/A)
         * </pre>
         *
         * <code>NA = 14;</code>
         */
        public static final int NA_VALUE = 14;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static DataType valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static DataType forNumber(int value) {
            switch (value) {
                case 0:
                    return NIL;
                case 1:
                    return INT8;
                case 2:
                    return INT16;
                case 3:
                    return INT32;
                case 4:
                    return INT64;
                case 5:
                    return UINT8;
                case 6:
                    return UINT16;
                case 7:
                    return UINT32;
                case 8:
                    return UINT64;
                case 9:
                    return FLOAT32;
                case 10:
                    return FLOAT64;
                case 11:
                    return BYTES;
                case 12:
                    return DECIMAL;
                case 13:
                    return STRING;
                case 14:
                    return NA;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<DataType>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                DataType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
                    public DataType findValueByNumber(int number) {
                        return DataType.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.getDescriptor().getEnumTypes().get(3);
        }

        private static final DataType[] VALUES = values();

        public static DataType valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private DataType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:subscribe.DataType)
    }

    public interface DMLEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.DMLEvent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * DML的类型，包括insert，update，delete
         * </pre>
         *
         * <code>.subscribe.DMLType dmlEventType = 1;</code>
         *
         * @return The enum numeric value on the wire for dmlEventType.
         */
        int getDmlEventTypeValue();

        /**
         * <pre>
         * DML的类型，包括insert，update，delete
         * </pre>
         *
         * <code>.subscribe.DMLType dmlEventType = 1;</code>
         *
         * @return The dmlEventType.
         */
        com.tencent.subscribe.SubscribeDataProto.DMLType getDmlEventType();

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.Column>
        getColumnsList();

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.Column getColumns(int index);

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        int getColumnsCount();

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder>
        getColumnsOrBuilderList();

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder getColumnsOrBuilder(
                int index);

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.RowChange>
        getRowsList();

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.RowChange getRows(int index);

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        int getRowsCount();

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder>
        getRowsOrBuilderList();

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder getRowsOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code subscribe.DMLEvent}
     */
    public static final class DMLEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.DMLEvent)
            DMLEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use DMLEvent.newBuilder() to construct.
        private DMLEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DMLEvent() {
            dmlEventType_ = 0;
            columns_ = java.util.Collections.emptyList();
            rows_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new DMLEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private DMLEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {
                            int rawValue = input.readEnum();

                            dmlEventType_ = rawValue;
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                columns_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Column>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            columns_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.Column.parser(),
                                            extensionRegistry));
                            break;
                        }
                        case 26: {
                            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                                rows_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.RowChange>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            rows_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.RowChange.parser(),
                                            extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    columns_ = java.util.Collections.unmodifiableList(columns_);
                }
                if (((mutable_bitField0_ & 0x00000002) != 0)) {
                    rows_ = java.util.Collections.unmodifiableList(rows_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DMLEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DMLEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.DMLEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder.class);
        }

        public static final int DMLEVENTTYPE_FIELD_NUMBER = 1;
        private int dmlEventType_;

        /**
         * <pre>
         * DML的类型，包括insert，update，delete
         * </pre>
         *
         * <code>.subscribe.DMLType dmlEventType = 1;</code>
         *
         * @return The enum numeric value on the wire for dmlEventType.
         */
        public int getDmlEventTypeValue() {
            return dmlEventType_;
        }

        /**
         * <pre>
         * DML的类型，包括insert，update，delete
         * </pre>
         *
         * <code>.subscribe.DMLType dmlEventType = 1;</code>
         *
         * @return The dmlEventType.
         */
        public com.tencent.subscribe.SubscribeDataProto.DMLType getDmlEventType() {
            @SuppressWarnings("deprecation")
            com.tencent.subscribe.SubscribeDataProto.DMLType result = com.tencent.subscribe.SubscribeDataProto.DMLType.valueOf(
                    dmlEventType_);
            return result == null ? com.tencent.subscribe.SubscribeDataProto.DMLType.UNRECOGNIZED : result;
        }

        public static final int COLUMNS_FIELD_NUMBER = 2;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.Column> columns_;

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.Column> getColumnsList() {
            return columns_;
        }

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder>
        getColumnsOrBuilderList() {
            return columns_;
        }

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        public int getColumnsCount() {
            return columns_.size();
        }

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.Column getColumns(int index) {
            return columns_.get(index);
        }

        /**
         * <code>repeated .subscribe.Column columns = 2;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder getColumnsOrBuilder(
                int index) {
            return columns_.get(index);
        }

        public static final int ROWS_FIELD_NUMBER = 3;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.RowChange> rows_;

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.RowChange> getRowsList() {
            return rows_;
        }

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder>
        getRowsOrBuilderList() {
            return rows_;
        }

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        public int getRowsCount() {
            return rows_.size();
        }

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.RowChange getRows(int index) {
            return rows_.get(index);
        }

        /**
         * <pre>
         * 行数据变更
         * </pre>
         *
         * <code>repeated .subscribe.RowChange rows = 3;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder getRowsOrBuilder(
                int index) {
            return rows_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (dmlEventType_ != com.tencent.subscribe.SubscribeDataProto.DMLType.INSERT.getNumber()) {
                output.writeEnum(1, dmlEventType_);
            }
            for (int i = 0; i < columns_.size(); i++) {
                output.writeMessage(2, columns_.get(i));
            }
            for (int i = 0; i < rows_.size(); i++) {
                output.writeMessage(3, rows_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (dmlEventType_ != com.tencent.subscribe.SubscribeDataProto.DMLType.INSERT.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, dmlEventType_);
            }
            for (int i = 0; i < columns_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, columns_.get(i));
            }
            for (int i = 0; i < rows_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, rows_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.DMLEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.DMLEvent other = (com.tencent.subscribe.SubscribeDataProto.DMLEvent) obj;

            if (dmlEventType_ != other.dmlEventType_) {
                return false;
            }
            if (!getColumnsList()
                    .equals(other.getColumnsList())) {
                return false;
            }
            if (!getRowsList()
                    .equals(other.getRowsList())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + DMLEVENTTYPE_FIELD_NUMBER;
            hash = (53 * hash) + dmlEventType_;
            if (getColumnsCount() > 0) {
                hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
                hash = (53 * hash) + getColumnsList().hashCode();
            }
            if (getRowsCount() > 0) {
                hash = (37 * hash) + ROWS_FIELD_NUMBER;
                hash = (53 * hash) + getRowsList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.DMLEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.DMLEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.DMLEvent)
                com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DMLEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DMLEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.DMLEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.DMLEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getColumnsFieldBuilder();
                    getRowsFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                dmlEventType_ = 0;

                if (columnsBuilder_ == null) {
                    columns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    columnsBuilder_.clear();
                }
                if (rowsBuilder_ == null) {
                    rows_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    rowsBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DMLEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.DMLEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.DMLEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.DMLEvent build() {
                com.tencent.subscribe.SubscribeDataProto.DMLEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.DMLEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.DMLEvent result = new com.tencent.subscribe.SubscribeDataProto.DMLEvent(
                        this);
                int from_bitField0_ = bitField0_;
                result.dmlEventType_ = dmlEventType_;
                if (columnsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        columns_ = java.util.Collections.unmodifiableList(columns_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.columns_ = columns_;
                } else {
                    result.columns_ = columnsBuilder_.build();
                }
                if (rowsBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0)) {
                        rows_ = java.util.Collections.unmodifiableList(rows_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.rows_ = rows_;
                } else {
                    result.rows_ = rowsBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.DMLEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.DMLEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.DMLEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.DMLEvent.getDefaultInstance()) {
                    return this;
                }
                if (other.dmlEventType_ != 0) {
                    setDmlEventTypeValue(other.getDmlEventTypeValue());
                }
                if (columnsBuilder_ == null) {
                    if (!other.columns_.isEmpty()) {
                        if (columns_.isEmpty()) {
                            columns_ = other.columns_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureColumnsIsMutable();
                            columns_.addAll(other.columns_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.columns_.isEmpty()) {
                        if (columnsBuilder_.isEmpty()) {
                            columnsBuilder_.dispose();
                            columnsBuilder_ = null;
                            columns_ = other.columns_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            columnsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getColumnsFieldBuilder() : null;
                        } else {
                            columnsBuilder_.addAllMessages(other.columns_);
                        }
                    }
                }
                if (rowsBuilder_ == null) {
                    if (!other.rows_.isEmpty()) {
                        if (rows_.isEmpty()) {
                            rows_ = other.rows_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureRowsIsMutable();
                            rows_.addAll(other.rows_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.rows_.isEmpty()) {
                        if (rowsBuilder_.isEmpty()) {
                            rowsBuilder_.dispose();
                            rowsBuilder_ = null;
                            rows_ = other.rows_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            rowsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getRowsFieldBuilder() : null;
                        } else {
                            rowsBuilder_.addAllMessages(other.rows_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.DMLEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.DMLEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int dmlEventType_ = 0;

            /**
             * <pre>
             * DML的类型，包括insert，update，delete
             * </pre>
             *
             * <code>.subscribe.DMLType dmlEventType = 1;</code>
             *
             * @return The enum numeric value on the wire for dmlEventType.
             */
            public int getDmlEventTypeValue() {
                return dmlEventType_;
            }

            /**
             * <pre>
             * DML的类型，包括insert，update，delete
             * </pre>
             *
             * <code>.subscribe.DMLType dmlEventType = 1;</code>
             *
             * @param value The enum numeric value on the wire for dmlEventType to set.
             * @return This builder for chaining.
             */
            public Builder setDmlEventTypeValue(int value) {
                dmlEventType_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DML的类型，包括insert，update，delete
             * </pre>
             *
             * <code>.subscribe.DMLType dmlEventType = 1;</code>
             *
             * @return The dmlEventType.
             */
            public com.tencent.subscribe.SubscribeDataProto.DMLType getDmlEventType() {
                @SuppressWarnings("deprecation")
                com.tencent.subscribe.SubscribeDataProto.DMLType result = com.tencent.subscribe.SubscribeDataProto.DMLType.valueOf(
                        dmlEventType_);
                return result == null ? com.tencent.subscribe.SubscribeDataProto.DMLType.UNRECOGNIZED : result;
            }

            /**
             * <pre>
             * DML的类型，包括insert，update，delete
             * </pre>
             *
             * <code>.subscribe.DMLType dmlEventType = 1;</code>
             *
             * @param value The dmlEventType to set.
             * @return This builder for chaining.
             */
            public Builder setDmlEventType(com.tencent.subscribe.SubscribeDataProto.DMLType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                dmlEventType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DML的类型，包括insert，update，delete
             * </pre>
             *
             * <code>.subscribe.DMLType dmlEventType = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDmlEventType() {

                dmlEventType_ = 0;
                onChanged();
                return this;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.Column> columns_ =
                    java.util.Collections.emptyList();

            private void ensureColumnsIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    columns_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Column>(columns_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Column, com.tencent.subscribe.SubscribeDataProto.Column.Builder, com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder> columnsBuilder_;

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Column> getColumnsList() {
                if (columnsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(columns_);
                } else {
                    return columnsBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public int getColumnsCount() {
                if (columnsBuilder_ == null) {
                    return columns_.size();
                } else {
                    return columnsBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Column getColumns(int index) {
                if (columnsBuilder_ == null) {
                    return columns_.get(index);
                } else {
                    return columnsBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder setColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Column value) {
                if (columnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureColumnsIsMutable();
                    columns_.set(index, value);
                    onChanged();
                } else {
                    columnsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder setColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Column.Builder builderForValue) {
                if (columnsBuilder_ == null) {
                    ensureColumnsIsMutable();
                    columns_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    columnsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder addColumns(com.tencent.subscribe.SubscribeDataProto.Column value) {
                if (columnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureColumnsIsMutable();
                    columns_.add(value);
                    onChanged();
                } else {
                    columnsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder addColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Column value) {
                if (columnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureColumnsIsMutable();
                    columns_.add(index, value);
                    onChanged();
                } else {
                    columnsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder addColumns(
                    com.tencent.subscribe.SubscribeDataProto.Column.Builder builderForValue) {
                if (columnsBuilder_ == null) {
                    ensureColumnsIsMutable();
                    columns_.add(builderForValue.build());
                    onChanged();
                } else {
                    columnsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder addColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Column.Builder builderForValue) {
                if (columnsBuilder_ == null) {
                    ensureColumnsIsMutable();
                    columns_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    columnsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder addAllColumns(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.Column> values) {
                if (columnsBuilder_ == null) {
                    ensureColumnsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, columns_);
                    onChanged();
                } else {
                    columnsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder clearColumns() {
                if (columnsBuilder_ == null) {
                    columns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    columnsBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public Builder removeColumns(int index) {
                if (columnsBuilder_ == null) {
                    ensureColumnsIsMutable();
                    columns_.remove(index);
                    onChanged();
                } else {
                    columnsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Column.Builder getColumnsBuilder(
                    int index) {
                return getColumnsFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder getColumnsOrBuilder(
                    int index) {
                if (columnsBuilder_ == null) {
                    return columns_.get(index);
                } else {
                    return columnsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder>
            getColumnsOrBuilderList() {
                if (columnsBuilder_ != null) {
                    return columnsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(columns_);
                }
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Column.Builder addColumnsBuilder() {
                return getColumnsFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.Column.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Column.Builder addColumnsBuilder(
                    int index) {
                return getColumnsFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.Column.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.Column columns = 2;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Column.Builder>
            getColumnsBuilderList() {
                return getColumnsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Column, com.tencent.subscribe.SubscribeDataProto.Column.Builder, com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder>
            getColumnsFieldBuilder() {
                if (columnsBuilder_ == null) {
                    columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.Column, com.tencent.subscribe.SubscribeDataProto.Column.Builder, com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder>(
                            columns_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    columns_ = null;
                }
                return columnsBuilder_;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.RowChange> rows_ =
                    java.util.Collections.emptyList();

            private void ensureRowsIsMutable() {
                if (!((bitField0_ & 0x00000002) != 0)) {
                    rows_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.RowChange>(rows_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.RowChange, com.tencent.subscribe.SubscribeDataProto.RowChange.Builder, com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder> rowsBuilder_;

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.RowChange> getRowsList() {
                if (rowsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(rows_);
                } else {
                    return rowsBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public int getRowsCount() {
                if (rowsBuilder_ == null) {
                    return rows_.size();
                } else {
                    return rowsBuilder_.getCount();
                }
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RowChange getRows(int index) {
                if (rowsBuilder_ == null) {
                    return rows_.get(index);
                } else {
                    return rowsBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder setRows(
                    int index, com.tencent.subscribe.SubscribeDataProto.RowChange value) {
                if (rowsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRowsIsMutable();
                    rows_.set(index, value);
                    onChanged();
                } else {
                    rowsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder setRows(
                    int index, com.tencent.subscribe.SubscribeDataProto.RowChange.Builder builderForValue) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    rowsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder addRows(com.tencent.subscribe.SubscribeDataProto.RowChange value) {
                if (rowsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRowsIsMutable();
                    rows_.add(value);
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder addRows(
                    int index, com.tencent.subscribe.SubscribeDataProto.RowChange value) {
                if (rowsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureRowsIsMutable();
                    rows_.add(index, value);
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder addRows(
                    com.tencent.subscribe.SubscribeDataProto.RowChange.Builder builderForValue) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.add(builderForValue.build());
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder addRows(
                    int index, com.tencent.subscribe.SubscribeDataProto.RowChange.Builder builderForValue) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    rowsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder addAllRows(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.RowChange> values) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, rows_);
                    onChanged();
                } else {
                    rowsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder clearRows() {
                if (rowsBuilder_ == null) {
                    rows_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    rowsBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public Builder removeRows(int index) {
                if (rowsBuilder_ == null) {
                    ensureRowsIsMutable();
                    rows_.remove(index);
                    onChanged();
                } else {
                    rowsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RowChange.Builder getRowsBuilder(
                    int index) {
                return getRowsFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder getRowsOrBuilder(
                    int index) {
                if (rowsBuilder_ == null) {
                    return rows_.get(index);
                } else {
                    return rowsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder>
            getRowsOrBuilderList() {
                if (rowsBuilder_ != null) {
                    return rowsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(rows_);
                }
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RowChange.Builder addRowsBuilder() {
                return getRowsFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.RowChange.getDefaultInstance());
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RowChange.Builder addRowsBuilder(
                    int index) {
                return getRowsFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.RowChange.getDefaultInstance());
            }

            /**
             * <pre>
             * 行数据变更
             * </pre>
             *
             * <code>repeated .subscribe.RowChange rows = 3;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.RowChange.Builder>
            getRowsBuilderList() {
                return getRowsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.RowChange, com.tencent.subscribe.SubscribeDataProto.RowChange.Builder, com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder>
            getRowsFieldBuilder() {
                if (rowsBuilder_ == null) {
                    rowsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.RowChange, com.tencent.subscribe.SubscribeDataProto.RowChange.Builder, com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder>(
                            rows_,
                            ((bitField0_ & 0x00000002) != 0),
                            getParentForChildren(),
                            isClean());
                    rows_ = null;
                }
                return rowsBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.DMLEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.DMLEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.DMLEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.DMLEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.DMLEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DMLEvent>
                PARSER = new com.google.protobuf.AbstractParser<DMLEvent>() {
            @java.lang.Override
            public DMLEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DMLEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DMLEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DMLEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.DMLEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ColumnOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Column)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 字段（列）名称
         * </pre>
         *
         * <code>string name = 1;</code>
         *
         * @return The name.
         */
        java.lang.String getName();

        /**
         * <pre>
         * 字段（列）名称
         * </pre>
         *
         * <code>string name = 1;</code>
         *
         * @return The bytes for name.
         */
        com.google.protobuf.ByteString
        getNameBytes();

        /**
         * <pre>
         * 源字段类型
         * </pre>
         *
         * <code>string originalType = 2;</code>
         *
         * @return The originalType.
         */
        java.lang.String getOriginalType();

        /**
         * <pre>
         * 源字段类型
         * </pre>
         *
         * <code>string originalType = 2;</code>
         *
         * @return The bytes for originalType.
         */
        com.google.protobuf.ByteString
        getOriginalTypeBytes();

        /**
         * <pre>
         * 是否为主键
         * </pre>
         *
         * <code>bool isKey = 3;</code>
         *
         * @return The isKey.
         */
        boolean getIsKey();

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair>
        getPropertiesList();

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index);

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        int getPropertiesCount();

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList();

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code subscribe.Column}
     */
    public static final class Column extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Column)
            ColumnOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Column.newBuilder() to construct.
        private Column(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Column() {
            name_ = "";
            originalType_ = "";
            properties_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Column();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Column(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            name_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            originalType_ = s;
                            break;
                        }
                        case 24: {

                            isKey_ = input.readBool();
                            break;
                        }
                        case 122: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            properties_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.KVPair.parser(),
                                            extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    properties_ = java.util.Collections.unmodifiableList(properties_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Column_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Column_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Column.class,
                            com.tencent.subscribe.SubscribeDataProto.Column.Builder.class);
        }

        public static final int NAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object name_;

        /**
         * <pre>
         * 字段（列）名称
         * </pre>
         *
         * <code>string name = 1;</code>
         *
         * @return The name.
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 字段（列）名称
         * </pre>
         *
         * <code>string name = 1;</code>
         *
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ORIGINALTYPE_FIELD_NUMBER = 2;
        private volatile java.lang.Object originalType_;

        /**
         * <pre>
         * 源字段类型
         * </pre>
         *
         * <code>string originalType = 2;</code>
         *
         * @return The originalType.
         */
        public java.lang.String getOriginalType() {
            java.lang.Object ref = originalType_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                originalType_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 源字段类型
         * </pre>
         *
         * <code>string originalType = 2;</code>
         *
         * @return The bytes for originalType.
         */
        public com.google.protobuf.ByteString
        getOriginalTypeBytes() {
            java.lang.Object ref = originalType_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                originalType_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ISKEY_FIELD_NUMBER = 3;
        private boolean isKey_;

        /**
         * <pre>
         * 是否为主键
         * </pre>
         *
         * <code>bool isKey = 3;</code>
         *
         * @return The isKey.
         */
        public boolean getIsKey() {
            return isKey_;
        }

        public static final int PROPERTIES_FIELD_NUMBER = 15;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_;

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
            return properties_;
        }

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList() {
            return properties_;
        }

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public int getPropertiesCount() {
            return properties_.size();
        }

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
            return properties_.get(index);
        }

        /**
         * <pre>
         * extra infos
         * </pre>
         *
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index) {
            return properties_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
            }
            if (!getOriginalTypeBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, originalType_);
            }
            if (isKey_ != false) {
                output.writeBool(3, isKey_);
            }
            for (int i = 0; i < properties_.size(); i++) {
                output.writeMessage(15, properties_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
            }
            if (!getOriginalTypeBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, originalType_);
            }
            if (isKey_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, isKey_);
            }
            for (int i = 0; i < properties_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, properties_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Column)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Column other = (com.tencent.subscribe.SubscribeDataProto.Column) obj;

            if (!getName()
                    .equals(other.getName())) {
                return false;
            }
            if (!getOriginalType()
                    .equals(other.getOriginalType())) {
                return false;
            }
            if (getIsKey()
                    != other.getIsKey()) {
                return false;
            }
            if (!getPropertiesList()
                    .equals(other.getPropertiesList())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
            hash = (37 * hash) + ORIGINALTYPE_FIELD_NUMBER;
            hash = (53 * hash) + getOriginalType().hashCode();
            hash = (37 * hash) + ISKEY_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getIsKey());
            if (getPropertiesCount() > 0) {
                hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
                hash = (53 * hash) + getPropertiesList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Column prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Column}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Column)
                com.tencent.subscribe.SubscribeDataProto.ColumnOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Column_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Column_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Column.class,
                                com.tencent.subscribe.SubscribeDataProto.Column.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Column.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getPropertiesFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                name_ = "";

                originalType_ = "";

                isKey_ = false;

                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Column_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Column getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Column.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Column build() {
                com.tencent.subscribe.SubscribeDataProto.Column result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Column buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Column result = new com.tencent.subscribe.SubscribeDataProto.Column(
                        this);
                int from_bitField0_ = bitField0_;
                result.name_ = name_;
                result.originalType_ = originalType_;
                result.isKey_ = isKey_;
                if (propertiesBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        properties_ = java.util.Collections.unmodifiableList(properties_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.properties_ = properties_;
                } else {
                    result.properties_ = propertiesBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Column) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Column) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Column other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Column.getDefaultInstance()) {
                    return this;
                }
                if (!other.getName().isEmpty()) {
                    name_ = other.name_;
                    onChanged();
                }
                if (!other.getOriginalType().isEmpty()) {
                    originalType_ = other.originalType_;
                    onChanged();
                }
                if (other.getIsKey() != false) {
                    setIsKey(other.getIsKey());
                }
                if (propertiesBuilder_ == null) {
                    if (!other.properties_.isEmpty()) {
                        if (properties_.isEmpty()) {
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensurePropertiesIsMutable();
                            properties_.addAll(other.properties_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.properties_.isEmpty()) {
                        if (propertiesBuilder_.isEmpty()) {
                            propertiesBuilder_.dispose();
                            propertiesBuilder_ = null;
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            propertiesBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getPropertiesFieldBuilder() : null;
                        } else {
                            propertiesBuilder_.addAllMessages(other.properties_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Column parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Column) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private java.lang.Object name_ = "";

            /**
             * <pre>
             * 字段（列）名称
             * </pre>
             *
             * <code>string name = 1;</code>
             *
             * @return The name.
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 字段（列）名称
             * </pre>
             *
             * <code>string name = 1;</code>
             *
             * @return The bytes for name.
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 字段（列）名称
             * </pre>
             *
             * <code>string name = 1;</code>
             *
             * @param value The name to set.
             * @return This builder for chaining.
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                name_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 字段（列）名称
             * </pre>
             *
             * <code>string name = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearName() {

                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 字段（列）名称
             * </pre>
             *
             * <code>string name = 1;</code>
             *
             * @param value The bytes for name to set.
             * @return This builder for chaining.
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                name_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object originalType_ = "";

            /**
             * <pre>
             * 源字段类型
             * </pre>
             *
             * <code>string originalType = 2;</code>
             *
             * @return The originalType.
             */
            public java.lang.String getOriginalType() {
                java.lang.Object ref = originalType_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    originalType_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 源字段类型
             * </pre>
             *
             * <code>string originalType = 2;</code>
             *
             * @return The bytes for originalType.
             */
            public com.google.protobuf.ByteString
            getOriginalTypeBytes() {
                java.lang.Object ref = originalType_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    originalType_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 源字段类型
             * </pre>
             *
             * <code>string originalType = 2;</code>
             *
             * @param value The originalType to set.
             * @return This builder for chaining.
             */
            public Builder setOriginalType(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                originalType_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源字段类型
             * </pre>
             *
             * <code>string originalType = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOriginalType() {

                originalType_ = getDefaultInstance().getOriginalType();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源字段类型
             * </pre>
             *
             * <code>string originalType = 2;</code>
             *
             * @param value The bytes for originalType to set.
             * @return This builder for chaining.
             */
            public Builder setOriginalTypeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                originalType_ = value;
                onChanged();
                return this;
            }

            private boolean isKey_;

            /**
             * <pre>
             * 是否为主键
             * </pre>
             *
             * <code>bool isKey = 3;</code>
             *
             * @return The isKey.
             */
            public boolean getIsKey() {
                return isKey_;
            }

            /**
             * <pre>
             * 是否为主键
             * </pre>
             *
             * <code>bool isKey = 3;</code>
             *
             * @param value The isKey to set.
             * @return This builder for chaining.
             */
            public Builder setIsKey(boolean value) {

                isKey_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 是否为主键
             * </pre>
             *
             * <code>bool isKey = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsKey() {

                isKey_ = false;
                onChanged();
                return this;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_ =
                    java.util.Collections.emptyList();

            private void ensurePropertiesIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>(properties_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder> propertiesBuilder_;

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
                if (propertiesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(properties_);
                } else {
                    return propertiesBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public int getPropertiesCount() {
                if (propertiesBuilder_ == null) {
                    return properties_.size();
                } else {
                    return propertiesBuilder_.getCount();
                }
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.set(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addAllProperties(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.KVPair> values) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, properties_);
                    onChanged();
                } else {
                    propertiesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder clearProperties() {
                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder removeProperties(int index) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.remove(index);
                    onChanged();
                } else {
                    propertiesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder getPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                    int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesOrBuilderList() {
                if (propertiesBuilder_ != null) {
                    return propertiesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(properties_);
                }
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder() {
                return getPropertiesFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <pre>
             * extra infos
             * </pre>
             *
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair.Builder>
            getPropertiesBuilderList() {
                return getPropertiesFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesFieldBuilder() {
                if (propertiesBuilder_ == null) {
                    propertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>(
                            properties_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    properties_ = null;
                }
                return propertiesBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Column)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Column)
        private static final com.tencent.subscribe.SubscribeDataProto.Column DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Column();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Column getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Column>
                PARSER = new com.google.protobuf.AbstractParser<Column>() {
            @java.lang.Override
            public Column parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Column(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Column> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Column> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Column getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface RowChangeOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.RowChange)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.Data>
        getOldColumnsList();

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.Data getOldColumns(int index);

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        int getOldColumnsCount();

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
        getOldColumnsOrBuilderList();

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.DataOrBuilder getOldColumnsOrBuilder(
                int index);

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.Data>
        getNewColumnsList();

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.Data getNewColumns(int index);

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        int getNewColumnsCount();

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
        getNewColumnsOrBuilderList();

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.DataOrBuilder getNewColumnsOrBuilder(
                int index);

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair>
        getPropertiesList();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index);

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        int getPropertiesCount();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code subscribe.RowChange}
     */
    public static final class RowChange extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.RowChange)
            RowChangeOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use RowChange.newBuilder() to construct.
        private RowChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private RowChange() {
            oldColumns_ = java.util.Collections.emptyList();
            newColumns_ = java.util.Collections.emptyList();
            properties_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new RowChange();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private RowChange(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                oldColumns_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Data>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            oldColumns_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.Data.parser(),
                                            extensionRegistry));
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                                newColumns_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Data>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            newColumns_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.Data.parser(),
                                            extensionRegistry));
                            break;
                        }
                        case 122: {
                            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                                properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>();
                                mutable_bitField0_ |= 0x00000004;
                            }
                            properties_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.KVPair.parser(),
                                            extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    oldColumns_ = java.util.Collections.unmodifiableList(oldColumns_);
                }
                if (((mutable_bitField0_ & 0x00000002) != 0)) {
                    newColumns_ = java.util.Collections.unmodifiableList(newColumns_);
                }
                if (((mutable_bitField0_ & 0x00000004) != 0)) {
                    properties_ = java.util.Collections.unmodifiableList(properties_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RowChange_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RowChange_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.RowChange.class,
                            com.tencent.subscribe.SubscribeDataProto.RowChange.Builder.class);
        }

        public static final int OLDCOLUMNS_FIELD_NUMBER = 1;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> oldColumns_;

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> getOldColumnsList() {
            return oldColumns_;
        }

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
        getOldColumnsOrBuilderList() {
            return oldColumns_;
        }

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        public int getOldColumnsCount() {
            return oldColumns_.size();
        }

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.Data getOldColumns(int index) {
            return oldColumns_.get(index);
        }

        /**
         * <pre>
         * 变更前镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data oldColumns = 1;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.DataOrBuilder getOldColumnsOrBuilder(
                int index) {
            return oldColumns_.get(index);
        }

        public static final int NEWCOLUMNS_FIELD_NUMBER = 2;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> newColumns_;

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> getNewColumnsList() {
            return newColumns_;
        }

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
        getNewColumnsOrBuilderList() {
            return newColumns_;
        }

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        public int getNewColumnsCount() {
            return newColumns_.size();
        }

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.Data getNewColumns(int index) {
            return newColumns_.get(index);
        }

        /**
         * <pre>
         * 变更后镜像
         * </pre>
         *
         * <code>repeated .subscribe.Data newColumns = 2;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.DataOrBuilder getNewColumnsOrBuilder(
                int index) {
            return newColumns_.get(index);
        }

        public static final int PROPERTIES_FIELD_NUMBER = 15;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_;

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
            return properties_;
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList() {
            return properties_;
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public int getPropertiesCount() {
            return properties_.size();
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
            return properties_.get(index);
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index) {
            return properties_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < oldColumns_.size(); i++) {
                output.writeMessage(1, oldColumns_.get(i));
            }
            for (int i = 0; i < newColumns_.size(); i++) {
                output.writeMessage(2, newColumns_.get(i));
            }
            for (int i = 0; i < properties_.size(); i++) {
                output.writeMessage(15, properties_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            for (int i = 0; i < oldColumns_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, oldColumns_.get(i));
            }
            for (int i = 0; i < newColumns_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, newColumns_.get(i));
            }
            for (int i = 0; i < properties_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, properties_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.RowChange)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.RowChange other = (com.tencent.subscribe.SubscribeDataProto.RowChange) obj;

            if (!getOldColumnsList()
                    .equals(other.getOldColumnsList())) {
                return false;
            }
            if (!getNewColumnsList()
                    .equals(other.getNewColumnsList())) {
                return false;
            }
            if (!getPropertiesList()
                    .equals(other.getPropertiesList())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getOldColumnsCount() > 0) {
                hash = (37 * hash) + OLDCOLUMNS_FIELD_NUMBER;
                hash = (53 * hash) + getOldColumnsList().hashCode();
            }
            if (getNewColumnsCount() > 0) {
                hash = (37 * hash) + NEWCOLUMNS_FIELD_NUMBER;
                hash = (53 * hash) + getNewColumnsList().hashCode();
            }
            if (getPropertiesCount() > 0) {
                hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
                hash = (53 * hash) + getPropertiesList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.RowChange prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.RowChange}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.RowChange)
                com.tencent.subscribe.SubscribeDataProto.RowChangeOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RowChange_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RowChange_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.RowChange.class,
                                com.tencent.subscribe.SubscribeDataProto.RowChange.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.RowChange.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getOldColumnsFieldBuilder();
                    getNewColumnsFieldBuilder();
                    getPropertiesFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (oldColumnsBuilder_ == null) {
                    oldColumns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    oldColumnsBuilder_.clear();
                }
                if (newColumnsBuilder_ == null) {
                    newColumns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    newColumnsBuilder_.clear();
                }
                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RowChange_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.RowChange getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.RowChange.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.RowChange build() {
                com.tencent.subscribe.SubscribeDataProto.RowChange result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.RowChange buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.RowChange result = new com.tencent.subscribe.SubscribeDataProto.RowChange(
                        this);
                int from_bitField0_ = bitField0_;
                if (oldColumnsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        oldColumns_ = java.util.Collections.unmodifiableList(oldColumns_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.oldColumns_ = oldColumns_;
                } else {
                    result.oldColumns_ = oldColumnsBuilder_.build();
                }
                if (newColumnsBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0)) {
                        newColumns_ = java.util.Collections.unmodifiableList(newColumns_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.newColumns_ = newColumns_;
                } else {
                    result.newColumns_ = newColumnsBuilder_.build();
                }
                if (propertiesBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) != 0)) {
                        properties_ = java.util.Collections.unmodifiableList(properties_);
                        bitField0_ = (bitField0_ & ~0x00000004);
                    }
                    result.properties_ = properties_;
                } else {
                    result.properties_ = propertiesBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.RowChange) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.RowChange) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.RowChange other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.RowChange.getDefaultInstance()) {
                    return this;
                }
                if (oldColumnsBuilder_ == null) {
                    if (!other.oldColumns_.isEmpty()) {
                        if (oldColumns_.isEmpty()) {
                            oldColumns_ = other.oldColumns_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureOldColumnsIsMutable();
                            oldColumns_.addAll(other.oldColumns_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.oldColumns_.isEmpty()) {
                        if (oldColumnsBuilder_.isEmpty()) {
                            oldColumnsBuilder_.dispose();
                            oldColumnsBuilder_ = null;
                            oldColumns_ = other.oldColumns_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            oldColumnsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getOldColumnsFieldBuilder() : null;
                        } else {
                            oldColumnsBuilder_.addAllMessages(other.oldColumns_);
                        }
                    }
                }
                if (newColumnsBuilder_ == null) {
                    if (!other.newColumns_.isEmpty()) {
                        if (newColumns_.isEmpty()) {
                            newColumns_ = other.newColumns_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureNewColumnsIsMutable();
                            newColumns_.addAll(other.newColumns_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.newColumns_.isEmpty()) {
                        if (newColumnsBuilder_.isEmpty()) {
                            newColumnsBuilder_.dispose();
                            newColumnsBuilder_ = null;
                            newColumns_ = other.newColumns_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            newColumnsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getNewColumnsFieldBuilder() : null;
                        } else {
                            newColumnsBuilder_.addAllMessages(other.newColumns_);
                        }
                    }
                }
                if (propertiesBuilder_ == null) {
                    if (!other.properties_.isEmpty()) {
                        if (properties_.isEmpty()) {
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                        } else {
                            ensurePropertiesIsMutable();
                            properties_.addAll(other.properties_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.properties_.isEmpty()) {
                        if (propertiesBuilder_.isEmpty()) {
                            propertiesBuilder_.dispose();
                            propertiesBuilder_ = null;
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                            propertiesBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getPropertiesFieldBuilder() : null;
                        } else {
                            propertiesBuilder_.addAllMessages(other.properties_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.RowChange parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.RowChange) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> oldColumns_ =
                    java.util.Collections.emptyList();

            private void ensureOldColumnsIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    oldColumns_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Data>(oldColumns_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Data, com.tencent.subscribe.SubscribeDataProto.Data.Builder, com.tencent.subscribe.SubscribeDataProto.DataOrBuilder> oldColumnsBuilder_;

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> getOldColumnsList() {
                if (oldColumnsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(oldColumns_);
                } else {
                    return oldColumnsBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public int getOldColumnsCount() {
                if (oldColumnsBuilder_ == null) {
                    return oldColumns_.size();
                } else {
                    return oldColumnsBuilder_.getCount();
                }
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data getOldColumns(int index) {
                if (oldColumnsBuilder_ == null) {
                    return oldColumns_.get(index);
                } else {
                    return oldColumnsBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder setOldColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data value) {
                if (oldColumnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureOldColumnsIsMutable();
                    oldColumns_.set(index, value);
                    onChanged();
                } else {
                    oldColumnsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder setOldColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data.Builder builderForValue) {
                if (oldColumnsBuilder_ == null) {
                    ensureOldColumnsIsMutable();
                    oldColumns_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    oldColumnsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder addOldColumns(com.tencent.subscribe.SubscribeDataProto.Data value) {
                if (oldColumnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureOldColumnsIsMutable();
                    oldColumns_.add(value);
                    onChanged();
                } else {
                    oldColumnsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder addOldColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data value) {
                if (oldColumnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureOldColumnsIsMutable();
                    oldColumns_.add(index, value);
                    onChanged();
                } else {
                    oldColumnsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder addOldColumns(
                    com.tencent.subscribe.SubscribeDataProto.Data.Builder builderForValue) {
                if (oldColumnsBuilder_ == null) {
                    ensureOldColumnsIsMutable();
                    oldColumns_.add(builderForValue.build());
                    onChanged();
                } else {
                    oldColumnsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder addOldColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data.Builder builderForValue) {
                if (oldColumnsBuilder_ == null) {
                    ensureOldColumnsIsMutable();
                    oldColumns_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    oldColumnsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder addAllOldColumns(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.Data> values) {
                if (oldColumnsBuilder_ == null) {
                    ensureOldColumnsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, oldColumns_);
                    onChanged();
                } else {
                    oldColumnsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder clearOldColumns() {
                if (oldColumnsBuilder_ == null) {
                    oldColumns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    oldColumnsBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public Builder removeOldColumns(int index) {
                if (oldColumnsBuilder_ == null) {
                    ensureOldColumnsIsMutable();
                    oldColumns_.remove(index);
                    onChanged();
                } else {
                    oldColumnsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data.Builder getOldColumnsBuilder(
                    int index) {
                return getOldColumnsFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.DataOrBuilder getOldColumnsOrBuilder(
                    int index) {
                if (oldColumnsBuilder_ == null) {
                    return oldColumns_.get(index);
                } else {
                    return oldColumnsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
            getOldColumnsOrBuilderList() {
                if (oldColumnsBuilder_ != null) {
                    return oldColumnsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(oldColumns_);
                }
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data.Builder addOldColumnsBuilder() {
                return getOldColumnsFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.Data.getDefaultInstance());
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data.Builder addOldColumnsBuilder(
                    int index) {
                return getOldColumnsFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.Data.getDefaultInstance());
            }

            /**
             * <pre>
             * 变更前镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data oldColumns = 1;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Data.Builder>
            getOldColumnsBuilderList() {
                return getOldColumnsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Data, com.tencent.subscribe.SubscribeDataProto.Data.Builder, com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
            getOldColumnsFieldBuilder() {
                if (oldColumnsBuilder_ == null) {
                    oldColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.Data, com.tencent.subscribe.SubscribeDataProto.Data.Builder, com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>(
                            oldColumns_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    oldColumns_ = null;
                }
                return oldColumnsBuilder_;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> newColumns_ =
                    java.util.Collections.emptyList();

            private void ensureNewColumnsIsMutable() {
                if (!((bitField0_ & 0x00000002) != 0)) {
                    newColumns_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Data>(newColumns_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Data, com.tencent.subscribe.SubscribeDataProto.Data.Builder, com.tencent.subscribe.SubscribeDataProto.DataOrBuilder> newColumnsBuilder_;

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Data> getNewColumnsList() {
                if (newColumnsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(newColumns_);
                } else {
                    return newColumnsBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public int getNewColumnsCount() {
                if (newColumnsBuilder_ == null) {
                    return newColumns_.size();
                } else {
                    return newColumnsBuilder_.getCount();
                }
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data getNewColumns(int index) {
                if (newColumnsBuilder_ == null) {
                    return newColumns_.get(index);
                } else {
                    return newColumnsBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder setNewColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data value) {
                if (newColumnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureNewColumnsIsMutable();
                    newColumns_.set(index, value);
                    onChanged();
                } else {
                    newColumnsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder setNewColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data.Builder builderForValue) {
                if (newColumnsBuilder_ == null) {
                    ensureNewColumnsIsMutable();
                    newColumns_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    newColumnsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder addNewColumns(com.tencent.subscribe.SubscribeDataProto.Data value) {
                if (newColumnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureNewColumnsIsMutable();
                    newColumns_.add(value);
                    onChanged();
                } else {
                    newColumnsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder addNewColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data value) {
                if (newColumnsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureNewColumnsIsMutable();
                    newColumns_.add(index, value);
                    onChanged();
                } else {
                    newColumnsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder addNewColumns(
                    com.tencent.subscribe.SubscribeDataProto.Data.Builder builderForValue) {
                if (newColumnsBuilder_ == null) {
                    ensureNewColumnsIsMutable();
                    newColumns_.add(builderForValue.build());
                    onChanged();
                } else {
                    newColumnsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder addNewColumns(
                    int index, com.tencent.subscribe.SubscribeDataProto.Data.Builder builderForValue) {
                if (newColumnsBuilder_ == null) {
                    ensureNewColumnsIsMutable();
                    newColumns_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    newColumnsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder addAllNewColumns(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.Data> values) {
                if (newColumnsBuilder_ == null) {
                    ensureNewColumnsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, newColumns_);
                    onChanged();
                } else {
                    newColumnsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder clearNewColumns() {
                if (newColumnsBuilder_ == null) {
                    newColumns_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    newColumnsBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public Builder removeNewColumns(int index) {
                if (newColumnsBuilder_ == null) {
                    ensureNewColumnsIsMutable();
                    newColumns_.remove(index);
                    onChanged();
                } else {
                    newColumnsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data.Builder getNewColumnsBuilder(
                    int index) {
                return getNewColumnsFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.DataOrBuilder getNewColumnsOrBuilder(
                    int index) {
                if (newColumnsBuilder_ == null) {
                    return newColumns_.get(index);
                } else {
                    return newColumnsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
            getNewColumnsOrBuilderList() {
                if (newColumnsBuilder_ != null) {
                    return newColumnsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(newColumns_);
                }
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data.Builder addNewColumnsBuilder() {
                return getNewColumnsFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.Data.getDefaultInstance());
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Data.Builder addNewColumnsBuilder(
                    int index) {
                return getNewColumnsFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.Data.getDefaultInstance());
            }

            /**
             * <pre>
             * 变更后镜像
             * </pre>
             *
             * <code>repeated .subscribe.Data newColumns = 2;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Data.Builder>
            getNewColumnsBuilderList() {
                return getNewColumnsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Data, com.tencent.subscribe.SubscribeDataProto.Data.Builder, com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>
            getNewColumnsFieldBuilder() {
                if (newColumnsBuilder_ == null) {
                    newColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.Data, com.tencent.subscribe.SubscribeDataProto.Data.Builder, com.tencent.subscribe.SubscribeDataProto.DataOrBuilder>(
                            newColumns_,
                            ((bitField0_ & 0x00000002) != 0),
                            getParentForChildren(),
                            isClean());
                    newColumns_ = null;
                }
                return newColumnsBuilder_;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_ =
                    java.util.Collections.emptyList();

            private void ensurePropertiesIsMutable() {
                if (!((bitField0_ & 0x00000004) != 0)) {
                    properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>(properties_);
                    bitField0_ |= 0x00000004;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder> propertiesBuilder_;

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
                if (propertiesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(properties_);
                } else {
                    return propertiesBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public int getPropertiesCount() {
                if (propertiesBuilder_ == null) {
                    return properties_.size();
                } else {
                    return propertiesBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.set(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addAllProperties(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.KVPair> values) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, properties_);
                    onChanged();
                } else {
                    propertiesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder clearProperties() {
                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                    onChanged();
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder removeProperties(int index) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.remove(index);
                    onChanged();
                } else {
                    propertiesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder getPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                    int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesOrBuilderList() {
                if (propertiesBuilder_ != null) {
                    return propertiesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(properties_);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder() {
                return getPropertiesFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair.Builder>
            getPropertiesBuilderList() {
                return getPropertiesFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesFieldBuilder() {
                if (propertiesBuilder_ == null) {
                    propertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>(
                            properties_,
                            ((bitField0_ & 0x00000004) != 0),
                            getParentForChildren(),
                            isClean());
                    properties_ = null;
                }
                return propertiesBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.RowChange)
        }

        // @@protoc_insertion_point(class_scope:subscribe.RowChange)
        private static final com.tencent.subscribe.SubscribeDataProto.RowChange DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.RowChange();
        }

        public static com.tencent.subscribe.SubscribeDataProto.RowChange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RowChange>
                PARSER = new com.google.protobuf.AbstractParser<RowChange>() {
            @java.lang.Override
            public RowChange parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new RowChange(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RowChange> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RowChange> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.RowChange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DataOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Data)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.subscribe.DataType dataType = 1;</code>
         *
         * @return The enum numeric value on the wire for dataType.
         */
        int getDataTypeValue();

        /**
         * <code>.subscribe.DataType dataType = 1;</code>
         *
         * @return The dataType.
         */
        com.tencent.subscribe.SubscribeDataProto.DataType getDataType();

        /**
         * <pre>
         * DataType_STRING的编码类型, 值存储在bv里面
         * </pre>
         *
         * <code>string charset = 2;</code>
         *
         * @return The charset.
         */
        java.lang.String getCharset();

        /**
         * <pre>
         * DataType_STRING的编码类型, 值存储在bv里面
         * </pre>
         *
         * <code>string charset = 2;</code>
         *
         * @return The bytes for charset.
         */
        com.google.protobuf.ByteString
        getCharsetBytes();

        /**
         * <pre>
         * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
         * </pre>
         *
         * <code>string sv = 3;</code>
         *
         * @return The sv.
         */
        java.lang.String getSv();

        /**
         * <pre>
         * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
         * </pre>
         *
         * <code>string sv = 3;</code>
         *
         * @return The bytes for sv.
         */
        com.google.protobuf.ByteString
        getSvBytes();

        /**
         * <pre>
         * DataType_STRING/DataType_BYTES的值
         * </pre>
         *
         * <code>bytes bv = 4;</code>
         *
         * @return The bv.
         */
        com.google.protobuf.ByteString getBv();
    }

    /**
     * Protobuf type {@code subscribe.Data}
     */
    public static final class Data extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Data)
            DataOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Data.newBuilder() to construct.
        private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Data() {
            dataType_ = 0;
            charset_ = "";
            sv_ = "";
            bv_ = com.google.protobuf.ByteString.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Data();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Data(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {
                            int rawValue = input.readEnum();

                            dataType_ = rawValue;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            charset_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            sv_ = s;
                            break;
                        }
                        case 34: {

                            bv_ = input.readBytes();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Data_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Data_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Data.class,
                            com.tencent.subscribe.SubscribeDataProto.Data.Builder.class);
        }

        public static final int DATATYPE_FIELD_NUMBER = 1;
        private int dataType_;

        /**
         * <code>.subscribe.DataType dataType = 1;</code>
         *
         * @return The enum numeric value on the wire for dataType.
         */
        public int getDataTypeValue() {
            return dataType_;
        }

        /**
         * <code>.subscribe.DataType dataType = 1;</code>
         *
         * @return The dataType.
         */
        public com.tencent.subscribe.SubscribeDataProto.DataType getDataType() {
            @SuppressWarnings("deprecation")
            com.tencent.subscribe.SubscribeDataProto.DataType result = com.tencent.subscribe.SubscribeDataProto.DataType.valueOf(
                    dataType_);
            return result == null ? com.tencent.subscribe.SubscribeDataProto.DataType.UNRECOGNIZED : result;
        }

        public static final int CHARSET_FIELD_NUMBER = 2;
        private volatile java.lang.Object charset_;

        /**
         * <pre>
         * DataType_STRING的编码类型, 值存储在bv里面
         * </pre>
         *
         * <code>string charset = 2;</code>
         *
         * @return The charset.
         */
        public java.lang.String getCharset() {
            java.lang.Object ref = charset_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                charset_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * DataType_STRING的编码类型, 值存储在bv里面
         * </pre>
         *
         * <code>string charset = 2;</code>
         *
         * @return The bytes for charset.
         */
        public com.google.protobuf.ByteString
        getCharsetBytes() {
            java.lang.Object ref = charset_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                charset_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SV_FIELD_NUMBER = 3;
        private volatile java.lang.Object sv_;

        /**
         * <pre>
         * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
         * </pre>
         *
         * <code>string sv = 3;</code>
         *
         * @return The sv.
         */
        public java.lang.String getSv() {
            java.lang.Object ref = sv_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                sv_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
         * </pre>
         *
         * <code>string sv = 3;</code>
         *
         * @return The bytes for sv.
         */
        public com.google.protobuf.ByteString
        getSvBytes() {
            java.lang.Object ref = sv_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                sv_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int BV_FIELD_NUMBER = 4;
        private com.google.protobuf.ByteString bv_;

        /**
         * <pre>
         * DataType_STRING/DataType_BYTES的值
         * </pre>
         *
         * <code>bytes bv = 4;</code>
         *
         * @return The bv.
         */
        public com.google.protobuf.ByteString getBv() {
            return bv_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (dataType_ != com.tencent.subscribe.SubscribeDataProto.DataType.NIL.getNumber()) {
                output.writeEnum(1, dataType_);
            }
            if (!getCharsetBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, charset_);
            }
            if (!getSvBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sv_);
            }
            if (!bv_.isEmpty()) {
                output.writeBytes(4, bv_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (dataType_ != com.tencent.subscribe.SubscribeDataProto.DataType.NIL.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, dataType_);
            }
            if (!getCharsetBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, charset_);
            }
            if (!getSvBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sv_);
            }
            if (!bv_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, bv_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Data)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Data other = (com.tencent.subscribe.SubscribeDataProto.Data) obj;

            if (dataType_ != other.dataType_) {
                return false;
            }
            if (!getCharset()
                    .equals(other.getCharset())) {
                return false;
            }
            if (!getSv()
                    .equals(other.getSv())) {
                return false;
            }
            if (!getBv()
                    .equals(other.getBv())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + DATATYPE_FIELD_NUMBER;
            hash = (53 * hash) + dataType_;
            hash = (37 * hash) + CHARSET_FIELD_NUMBER;
            hash = (53 * hash) + getCharset().hashCode();
            hash = (37 * hash) + SV_FIELD_NUMBER;
            hash = (53 * hash) + getSv().hashCode();
            hash = (37 * hash) + BV_FIELD_NUMBER;
            hash = (53 * hash) + getBv().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Data prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Data}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Data)
                com.tencent.subscribe.SubscribeDataProto.DataOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Data_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Data_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Data.class,
                                com.tencent.subscribe.SubscribeDataProto.Data.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Data.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                dataType_ = 0;

                charset_ = "";

                sv_ = "";

                bv_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Data_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Data getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Data.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Data build() {
                com.tencent.subscribe.SubscribeDataProto.Data result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Data buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Data result = new com.tencent.subscribe.SubscribeDataProto.Data(
                        this);
                result.dataType_ = dataType_;
                result.charset_ = charset_;
                result.sv_ = sv_;
                result.bv_ = bv_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Data) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Data) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Data other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Data.getDefaultInstance()) {
                    return this;
                }
                if (other.dataType_ != 0) {
                    setDataTypeValue(other.getDataTypeValue());
                }
                if (!other.getCharset().isEmpty()) {
                    charset_ = other.charset_;
                    onChanged();
                }
                if (!other.getSv().isEmpty()) {
                    sv_ = other.sv_;
                    onChanged();
                }
                if (other.getBv() != com.google.protobuf.ByteString.EMPTY) {
                    setBv(other.getBv());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Data parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Data) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int dataType_ = 0;

            /**
             * <code>.subscribe.DataType dataType = 1;</code>
             *
             * @return The enum numeric value on the wire for dataType.
             */
            public int getDataTypeValue() {
                return dataType_;
            }

            /**
             * <code>.subscribe.DataType dataType = 1;</code>
             *
             * @param value The enum numeric value on the wire for dataType to set.
             * @return This builder for chaining.
             */
            public Builder setDataTypeValue(int value) {
                dataType_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>.subscribe.DataType dataType = 1;</code>
             *
             * @return The dataType.
             */
            public com.tencent.subscribe.SubscribeDataProto.DataType getDataType() {
                @SuppressWarnings("deprecation")
                com.tencent.subscribe.SubscribeDataProto.DataType result = com.tencent.subscribe.SubscribeDataProto.DataType.valueOf(
                        dataType_);
                return result == null ? com.tencent.subscribe.SubscribeDataProto.DataType.UNRECOGNIZED : result;
            }

            /**
             * <code>.subscribe.DataType dataType = 1;</code>
             *
             * @param value The dataType to set.
             * @return This builder for chaining.
             */
            public Builder setDataType(com.tencent.subscribe.SubscribeDataProto.DataType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                dataType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <code>.subscribe.DataType dataType = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDataType() {

                dataType_ = 0;
                onChanged();
                return this;
            }

            private java.lang.Object charset_ = "";

            /**
             * <pre>
             * DataType_STRING的编码类型, 值存储在bv里面
             * </pre>
             *
             * <code>string charset = 2;</code>
             *
             * @return The charset.
             */
            public java.lang.String getCharset() {
                java.lang.Object ref = charset_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    charset_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * DataType_STRING的编码类型, 值存储在bv里面
             * </pre>
             *
             * <code>string charset = 2;</code>
             *
             * @return The bytes for charset.
             */
            public com.google.protobuf.ByteString
            getCharsetBytes() {
                java.lang.Object ref = charset_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    charset_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * DataType_STRING的编码类型, 值存储在bv里面
             * </pre>
             *
             * <code>string charset = 2;</code>
             *
             * @param value The charset to set.
             * @return This builder for chaining.
             */
            public Builder setCharset(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                charset_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DataType_STRING的编码类型, 值存储在bv里面
             * </pre>
             *
             * <code>string charset = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCharset() {

                charset_ = getDefaultInstance().getCharset();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DataType_STRING的编码类型, 值存储在bv里面
             * </pre>
             *
             * <code>string charset = 2;</code>
             *
             * @param value The bytes for charset to set.
             * @return This builder for chaining.
             */
            public Builder setCharsetBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                charset_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object sv_ = "";

            /**
             * <pre>
             * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
             * </pre>
             *
             * <code>string sv = 3;</code>
             *
             * @return The sv.
             */
            public java.lang.String getSv() {
                java.lang.Object ref = sv_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    sv_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
             * </pre>
             *
             * <code>string sv = 3;</code>
             *
             * @return The bytes for sv.
             */
            public com.google.protobuf.ByteString
            getSvBytes() {
                java.lang.Object ref = sv_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    sv_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
             * </pre>
             *
             * <code>string sv = 3;</code>
             *
             * @param value The sv to set.
             * @return This builder for chaining.
             */
            public Builder setSv(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sv_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
             * </pre>
             *
             * <code>string sv = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSv() {

                sv_ = getDefaultInstance().getSv();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DataType_INT8/16/32/64/UINT8/16/32/64/Float32/64/DataType_DECIMAL的字符串值
             * </pre>
             *
             * <code>string sv = 3;</code>
             *
             * @param value The bytes for sv to set.
             * @return This builder for chaining.
             */
            public Builder setSvBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sv_ = value;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString bv_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <pre>
             * DataType_STRING/DataType_BYTES的值
             * </pre>
             *
             * <code>bytes bv = 4;</code>
             *
             * @return The bv.
             */
            public com.google.protobuf.ByteString getBv() {
                return bv_;
            }

            /**
             * <pre>
             * DataType_STRING/DataType_BYTES的值
             * </pre>
             *
             * <code>bytes bv = 4;</code>
             *
             * @param value The bv to set.
             * @return This builder for chaining.
             */
            public Builder setBv(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                bv_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * DataType_STRING/DataType_BYTES的值
             * </pre>
             *
             * <code>bytes bv = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBv() {

                bv_ = getDefaultInstance().getBv();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Data)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Data)
        private static final com.tencent.subscribe.SubscribeDataProto.Data DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Data();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Data>
                PARSER = new com.google.protobuf.AbstractParser<Data>() {
            @java.lang.Override
            public Data parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Data(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Data> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Data> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DDLEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.DDLEvent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 执行ddl时的schemaName
         * </pre>
         *
         * <code>string schemaName = 1;</code>
         *
         * @return The schemaName.
         */
        java.lang.String getSchemaName();

        /**
         * <pre>
         * 执行ddl时的schemaName
         * </pre>
         *
         * <code>string schemaName = 1;</code>
         *
         * @return The bytes for schemaName.
         */
        com.google.protobuf.ByteString
        getSchemaNameBytes();

        /**
         * <pre>
         * 变更的语句
         * </pre>
         *
         * <code>string sql = 2;</code>
         *
         * @return The sql.
         */
        java.lang.String getSql();

        /**
         * <pre>
         * 变更的语句
         * </pre>
         *
         * <code>string sql = 2;</code>
         *
         * @return The bytes for sql.
         */
        com.google.protobuf.ByteString
        getSqlBytes();

        /**
         * <pre>
         * ddl执行时长
         * </pre>
         *
         * <code>uint32 executionTime = 3;</code>
         *
         * @return The executionTime.
         */
        int getExecutionTime();
    }

    /**
     * Protobuf type {@code subscribe.DDLEvent}
     */
    public static final class DDLEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.DDLEvent)
            DDLEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use DDLEvent.newBuilder() to construct.
        private DDLEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DDLEvent() {
            schemaName_ = "";
            sql_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new DDLEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private DDLEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            schemaName_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            sql_ = s;
                            break;
                        }
                        case 24: {

                            executionTime_ = input.readUInt32();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DDLEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DDLEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.DDLEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder.class);
        }

        public static final int SCHEMANAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object schemaName_;

        /**
         * <pre>
         * 执行ddl时的schemaName
         * </pre>
         *
         * <code>string schemaName = 1;</code>
         *
         * @return The schemaName.
         */
        public java.lang.String getSchemaName() {
            java.lang.Object ref = schemaName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                schemaName_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 执行ddl时的schemaName
         * </pre>
         *
         * <code>string schemaName = 1;</code>
         *
         * @return The bytes for schemaName.
         */
        public com.google.protobuf.ByteString
        getSchemaNameBytes() {
            java.lang.Object ref = schemaName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                schemaName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SQL_FIELD_NUMBER = 2;
        private volatile java.lang.Object sql_;

        /**
         * <pre>
         * 变更的语句
         * </pre>
         *
         * <code>string sql = 2;</code>
         *
         * @return The sql.
         */
        public java.lang.String getSql() {
            java.lang.Object ref = sql_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                sql_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 变更的语句
         * </pre>
         *
         * <code>string sql = 2;</code>
         *
         * @return The bytes for sql.
         */
        public com.google.protobuf.ByteString
        getSqlBytes() {
            java.lang.Object ref = sql_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                sql_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int EXECUTIONTIME_FIELD_NUMBER = 3;
        private int executionTime_;

        /**
         * <pre>
         * ddl执行时长
         * </pre>
         *
         * <code>uint32 executionTime = 3;</code>
         *
         * @return The executionTime.
         */
        public int getExecutionTime() {
            return executionTime_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getSchemaNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, schemaName_);
            }
            if (!getSqlBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sql_);
            }
            if (executionTime_ != 0) {
                output.writeUInt32(3, executionTime_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getSchemaNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, schemaName_);
            }
            if (!getSqlBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sql_);
            }
            if (executionTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, executionTime_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.DDLEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.DDLEvent other = (com.tencent.subscribe.SubscribeDataProto.DDLEvent) obj;

            if (!getSchemaName()
                    .equals(other.getSchemaName())) {
                return false;
            }
            if (!getSql()
                    .equals(other.getSql())) {
                return false;
            }
            if (getExecutionTime()
                    != other.getExecutionTime()) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + SCHEMANAME_FIELD_NUMBER;
            hash = (53 * hash) + getSchemaName().hashCode();
            hash = (37 * hash) + SQL_FIELD_NUMBER;
            hash = (53 * hash) + getSql().hashCode();
            hash = (37 * hash) + EXECUTIONTIME_FIELD_NUMBER;
            hash = (53 * hash) + getExecutionTime();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.DDLEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.DDLEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.DDLEvent)
                com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DDLEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DDLEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.DDLEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.DDLEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                schemaName_ = "";

                sql_ = "";

                executionTime_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_DDLEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.DDLEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.DDLEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.DDLEvent build() {
                com.tencent.subscribe.SubscribeDataProto.DDLEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.DDLEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.DDLEvent result = new com.tencent.subscribe.SubscribeDataProto.DDLEvent(
                        this);
                result.schemaName_ = schemaName_;
                result.sql_ = sql_;
                result.executionTime_ = executionTime_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.DDLEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.DDLEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.DDLEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.DDLEvent.getDefaultInstance()) {
                    return this;
                }
                if (!other.getSchemaName().isEmpty()) {
                    schemaName_ = other.schemaName_;
                    onChanged();
                }
                if (!other.getSql().isEmpty()) {
                    sql_ = other.sql_;
                    onChanged();
                }
                if (other.getExecutionTime() != 0) {
                    setExecutionTime(other.getExecutionTime());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.DDLEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.DDLEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object schemaName_ = "";

            /**
             * <pre>
             * 执行ddl时的schemaName
             * </pre>
             *
             * <code>string schemaName = 1;</code>
             *
             * @return The schemaName.
             */
            public java.lang.String getSchemaName() {
                java.lang.Object ref = schemaName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    schemaName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 执行ddl时的schemaName
             * </pre>
             *
             * <code>string schemaName = 1;</code>
             *
             * @return The bytes for schemaName.
             */
            public com.google.protobuf.ByteString
            getSchemaNameBytes() {
                java.lang.Object ref = schemaName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    schemaName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 执行ddl时的schemaName
             * </pre>
             *
             * <code>string schemaName = 1;</code>
             *
             * @param value The schemaName to set.
             * @return This builder for chaining.
             */
            public Builder setSchemaName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                schemaName_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 执行ddl时的schemaName
             * </pre>
             *
             * <code>string schemaName = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSchemaName() {

                schemaName_ = getDefaultInstance().getSchemaName();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 执行ddl时的schemaName
             * </pre>
             *
             * <code>string schemaName = 1;</code>
             *
             * @param value The bytes for schemaName to set.
             * @return This builder for chaining.
             */
            public Builder setSchemaNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                schemaName_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object sql_ = "";

            /**
             * <pre>
             * 变更的语句
             * </pre>
             *
             * <code>string sql = 2;</code>
             *
             * @return The sql.
             */
            public java.lang.String getSql() {
                java.lang.Object ref = sql_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    sql_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 变更的语句
             * </pre>
             *
             * <code>string sql = 2;</code>
             *
             * @return The bytes for sql.
             */
            public com.google.protobuf.ByteString
            getSqlBytes() {
                java.lang.Object ref = sql_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    sql_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 变更的语句
             * </pre>
             *
             * <code>string sql = 2;</code>
             *
             * @param value The sql to set.
             * @return This builder for chaining.
             */
            public Builder setSql(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sql_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 变更的语句
             * </pre>
             *
             * <code>string sql = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSql() {

                sql_ = getDefaultInstance().getSql();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 变更的语句
             * </pre>
             *
             * <code>string sql = 2;</code>
             *
             * @param value The bytes for sql to set.
             * @return This builder for chaining.
             */
            public Builder setSqlBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                sql_ = value;
                onChanged();
                return this;
            }

            private int executionTime_;

            /**
             * <pre>
             * ddl执行时长
             * </pre>
             *
             * <code>uint32 executionTime = 3;</code>
             *
             * @return The executionTime.
             */
            public int getExecutionTime() {
                return executionTime_;
            }

            /**
             * <pre>
             * ddl执行时长
             * </pre>
             *
             * <code>uint32 executionTime = 3;</code>
             *
             * @param value The executionTime to set.
             * @return This builder for chaining.
             */
            public Builder setExecutionTime(int value) {

                executionTime_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * ddl执行时长
             * </pre>
             *
             * <code>uint32 executionTime = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearExecutionTime() {

                executionTime_ = 0;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.DDLEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.DDLEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.DDLEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.DDLEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.DDLEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DDLEvent>
                PARSER = new com.google.protobuf.AbstractParser<DDLEvent>() {
            @java.lang.Override
            public DDLEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DDLEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DDLEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DDLEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.DDLEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface BeginEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.BeginEvent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The transactionId.
         */
        java.lang.String getTransactionId();

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The bytes for transactionId.
         */
        com.google.protobuf.ByteString
        getTransactionIdBytes();

        /**
         * <pre>
         * 执行事务的线程ID
         * </pre>
         *
         * <code>int64 threadId = 2;</code>
         *
         * @return The threadId.
         */
        long getThreadId();
    }

    /**
     * Protobuf type {@code subscribe.BeginEvent}
     */
    public static final class BeginEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.BeginEvent)
            BeginEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use BeginEvent.newBuilder() to construct.
        private BeginEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private BeginEvent() {
            transactionId_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new BeginEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private BeginEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            transactionId_ = s;
                            break;
                        }
                        case 16: {

                            threadId_ = input.readInt64();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_BeginEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_BeginEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.BeginEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder.class);
        }

        public static final int TRANSACTIONID_FIELD_NUMBER = 1;
        private volatile java.lang.Object transactionId_;

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The transactionId.
         */
        public java.lang.String getTransactionId() {
            java.lang.Object ref = transactionId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                transactionId_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The bytes for transactionId.
         */
        public com.google.protobuf.ByteString
        getTransactionIdBytes() {
            java.lang.Object ref = transactionId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                transactionId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int THREADID_FIELD_NUMBER = 2;
        private long threadId_;

        /**
         * <pre>
         * 执行事务的线程ID
         * </pre>
         *
         * <code>int64 threadId = 2;</code>
         *
         * @return The threadId.
         */
        public long getThreadId() {
            return threadId_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getTransactionIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transactionId_);
            }
            if (threadId_ != 0L) {
                output.writeInt64(2, threadId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getTransactionIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transactionId_);
            }
            if (threadId_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(2, threadId_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.BeginEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.BeginEvent other = (com.tencent.subscribe.SubscribeDataProto.BeginEvent) obj;

            if (!getTransactionId()
                    .equals(other.getTransactionId())) {
                return false;
            }
            if (getThreadId()
                    != other.getThreadId()) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
            hash = (53 * hash) + getTransactionId().hashCode();
            hash = (37 * hash) + THREADID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getThreadId());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.BeginEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.BeginEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.BeginEvent)
                com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_BeginEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_BeginEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.BeginEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.BeginEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                transactionId_ = "";

                threadId_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_BeginEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.BeginEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.BeginEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.BeginEvent build() {
                com.tencent.subscribe.SubscribeDataProto.BeginEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.BeginEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.BeginEvent result = new com.tencent.subscribe.SubscribeDataProto.BeginEvent(
                        this);
                result.transactionId_ = transactionId_;
                result.threadId_ = threadId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.BeginEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.BeginEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.BeginEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.BeginEvent.getDefaultInstance()) {
                    return this;
                }
                if (!other.getTransactionId().isEmpty()) {
                    transactionId_ = other.transactionId_;
                    onChanged();
                }
                if (other.getThreadId() != 0L) {
                    setThreadId(other.getThreadId());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.BeginEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.BeginEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object transactionId_ = "";

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @return The transactionId.
             */
            public java.lang.String getTransactionId() {
                java.lang.Object ref = transactionId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    transactionId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @return The bytes for transactionId.
             */
            public com.google.protobuf.ByteString
            getTransactionIdBytes() {
                java.lang.Object ref = transactionId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    transactionId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @param value The transactionId to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                transactionId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTransactionId() {

                transactionId_ = getDefaultInstance().getTransactionId();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @param value The bytes for transactionId to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                transactionId_ = value;
                onChanged();
                return this;
            }

            private long threadId_;

            /**
             * <pre>
             * 执行事务的线程ID
             * </pre>
             *
             * <code>int64 threadId = 2;</code>
             *
             * @return The threadId.
             */
            public long getThreadId() {
                return threadId_;
            }

            /**
             * <pre>
             * 执行事务的线程ID
             * </pre>
             *
             * <code>int64 threadId = 2;</code>
             *
             * @param value The threadId to set.
             * @return This builder for chaining.
             */
            public Builder setThreadId(long value) {

                threadId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 执行事务的线程ID
             * </pre>
             *
             * <code>int64 threadId = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearThreadId() {

                threadId_ = 0L;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.BeginEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.BeginEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.BeginEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.BeginEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.BeginEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BeginEvent>
                PARSER = new com.google.protobuf.AbstractParser<BeginEvent>() {
            @java.lang.Override
            public BeginEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new BeginEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<BeginEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BeginEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.BeginEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CommitEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.CommitEvent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The transactionId.
         */
        java.lang.String getTransactionId();

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The bytes for transactionId.
         */
        com.google.protobuf.ByteString
        getTransactionIdBytes();
    }

    /**
     * Protobuf type {@code subscribe.CommitEvent}
     */
    public static final class CommitEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.CommitEvent)
            CommitEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use CommitEvent.newBuilder() to construct.
        private CommitEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CommitEvent() {
            transactionId_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CommitEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private CommitEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            transactionId_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CommitEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CommitEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.CommitEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder.class);
        }

        public static final int TRANSACTIONID_FIELD_NUMBER = 1;
        private volatile java.lang.Object transactionId_;

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The transactionId.
         */
        public java.lang.String getTransactionId() {
            java.lang.Object ref = transactionId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                transactionId_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 事务号
         * </pre>
         *
         * <code>string transactionId = 1;</code>
         *
         * @return The bytes for transactionId.
         */
        public com.google.protobuf.ByteString
        getTransactionIdBytes() {
            java.lang.Object ref = transactionId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                transactionId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getTransactionIdBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, transactionId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getTransactionIdBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, transactionId_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.CommitEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.CommitEvent other = (com.tencent.subscribe.SubscribeDataProto.CommitEvent) obj;

            if (!getTransactionId()
                    .equals(other.getTransactionId())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TRANSACTIONID_FIELD_NUMBER;
            hash = (53 * hash) + getTransactionId().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.CommitEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.CommitEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.CommitEvent)
                com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CommitEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CommitEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.CommitEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.CommitEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                transactionId_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CommitEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.CommitEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.CommitEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.CommitEvent build() {
                com.tencent.subscribe.SubscribeDataProto.CommitEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.CommitEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.CommitEvent result = new com.tencent.subscribe.SubscribeDataProto.CommitEvent(
                        this);
                result.transactionId_ = transactionId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.CommitEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.CommitEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.CommitEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.CommitEvent.getDefaultInstance()) {
                    return this;
                }
                if (!other.getTransactionId().isEmpty()) {
                    transactionId_ = other.transactionId_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.CommitEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.CommitEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object transactionId_ = "";

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @return The transactionId.
             */
            public java.lang.String getTransactionId() {
                java.lang.Object ref = transactionId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    transactionId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @return The bytes for transactionId.
             */
            public com.google.protobuf.ByteString
            getTransactionIdBytes() {
                java.lang.Object ref = transactionId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    transactionId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @param value The transactionId to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                transactionId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTransactionId() {

                transactionId_ = getDefaultInstance().getTransactionId();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 事务号
             * </pre>
             *
             * <code>string transactionId = 1;</code>
             *
             * @param value The bytes for transactionId to set.
             * @return This builder for chaining.
             */
            public Builder setTransactionIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                transactionId_ = value;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.CommitEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.CommitEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.CommitEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.CommitEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.CommitEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CommitEvent>
                PARSER = new com.google.protobuf.AbstractParser<CommitEvent>() {
            @java.lang.Override
            public CommitEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CommitEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CommitEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CommitEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.CommitEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface RollbackEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.RollbackEvent)
            com.google.protobuf.MessageOrBuilder {

    }

    /**
     * Protobuf type {@code subscribe.RollbackEvent}
     */
    public static final class RollbackEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.RollbackEvent)
            RollbackEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use RollbackEvent.newBuilder() to construct.
        private RollbackEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private RollbackEvent() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new RollbackEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private RollbackEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RollbackEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RollbackEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.RollbackEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder.class);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.RollbackEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.RollbackEvent other = (com.tencent.subscribe.SubscribeDataProto.RollbackEvent) obj;

            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.RollbackEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.RollbackEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.RollbackEvent)
                com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RollbackEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RollbackEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.RollbackEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.RollbackEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_RollbackEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.RollbackEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.RollbackEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.RollbackEvent build() {
                com.tencent.subscribe.SubscribeDataProto.RollbackEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.RollbackEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.RollbackEvent result = new com.tencent.subscribe.SubscribeDataProto.RollbackEvent(
                        this);
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.RollbackEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.RollbackEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.RollbackEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.RollbackEvent.getDefaultInstance()) {
                    return this;
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.RollbackEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.RollbackEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.RollbackEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.RollbackEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.RollbackEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.RollbackEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.RollbackEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RollbackEvent>
                PARSER = new com.google.protobuf.AbstractParser<RollbackEvent>() {
            @java.lang.Override
            public RollbackEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new RollbackEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RollbackEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RollbackEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.RollbackEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface HeartbeatEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.HeartbeatEvent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 epoch = 1;</code>
         *
         * @return The epoch.
         */
        long getEpoch();
    }

    /**
     * Protobuf type {@code subscribe.HeartbeatEvent}
     */
    public static final class HeartbeatEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.HeartbeatEvent)
            HeartbeatEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use HeartbeatEvent.newBuilder() to construct.
        private HeartbeatEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HeartbeatEvent() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new HeartbeatEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private HeartbeatEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            epoch_ = input.readInt64();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_HeartbeatEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_HeartbeatEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder.class);
        }

        public static final int EPOCH_FIELD_NUMBER = 1;
        private long epoch_;

        /**
         * <code>int64 epoch = 1;</code>
         *
         * @return The epoch.
         */
        public long getEpoch() {
            return epoch_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (epoch_ != 0L) {
                output.writeInt64(1, epoch_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (epoch_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, epoch_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent other = (com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent) obj;

            if (getEpoch()
                    != other.getEpoch()) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + EPOCH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getEpoch());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.HeartbeatEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.HeartbeatEvent)
                com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_HeartbeatEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_HeartbeatEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                epoch_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_HeartbeatEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent build() {
                com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent result = new com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent(
                        this);
                result.epoch_ = epoch_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.getDefaultInstance()) {
                    return this;
                }
                if (other.getEpoch() != 0L) {
                    setEpoch(other.getEpoch());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long epoch_;

            /**
             * <code>int64 epoch = 1;</code>
             *
             * @return The epoch.
             */
            public long getEpoch() {
                return epoch_;
            }

            /**
             * <code>int64 epoch = 1;</code>
             *
             * @param value The epoch to set.
             * @return This builder for chaining.
             */
            public Builder setEpoch(long value) {

                epoch_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int64 epoch = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEpoch() {

                epoch_ = 0L;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.HeartbeatEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.HeartbeatEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HeartbeatEvent>
                PARSER = new com.google.protobuf.AbstractParser<HeartbeatEvent>() {
            @java.lang.Override
            public HeartbeatEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new HeartbeatEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<HeartbeatEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HeartbeatEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CheckpointEventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.CheckpointEvent)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string syncedGtid = 1;</code>
         *
         * @return The syncedGtid.
         */
        java.lang.String getSyncedGtid();

        /**
         * <code>string syncedGtid = 1;</code>
         *
         * @return The bytes for syncedGtid.
         */
        com.google.protobuf.ByteString
        getSyncedGtidBytes();

        /**
         * <code>bool fakeGtid = 2;</code>
         *
         * @return The fakeGtid.
         */
        boolean getFakeGtid();

        /**
         * <code>string fileName = 3;</code>
         *
         * @return The fileName.
         */
        java.lang.String getFileName();

        /**
         * <code>string fileName = 3;</code>
         *
         * @return The bytes for fileName.
         */
        com.google.protobuf.ByteString
        getFileNameBytes();

        /**
         * <code>uint64 position = 4;</code>
         *
         * @return The position.
         */
        long getPosition();
    }

    /**
     * Protobuf type {@code subscribe.CheckpointEvent}
     */
    public static final class CheckpointEvent extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.CheckpointEvent)
            CheckpointEventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use CheckpointEvent.newBuilder() to construct.
        private CheckpointEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CheckpointEvent() {
            syncedGtid_ = "";
            fileName_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CheckpointEvent();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private CheckpointEvent(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            syncedGtid_ = s;
                            break;
                        }
                        case 16: {

                            fakeGtid_ = input.readBool();
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            fileName_ = s;
                            break;
                        }
                        case 32: {

                            position_ = input.readUInt64();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CheckpointEvent_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CheckpointEvent_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.class,
                            com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder.class);
        }

        public static final int SYNCEDGTID_FIELD_NUMBER = 1;
        private volatile java.lang.Object syncedGtid_;

        /**
         * <code>string syncedGtid = 1;</code>
         *
         * @return The syncedGtid.
         */
        public java.lang.String getSyncedGtid() {
            java.lang.Object ref = syncedGtid_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                syncedGtid_ = s;
                return s;
            }
        }

        /**
         * <code>string syncedGtid = 1;</code>
         *
         * @return The bytes for syncedGtid.
         */
        public com.google.protobuf.ByteString
        getSyncedGtidBytes() {
            java.lang.Object ref = syncedGtid_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                syncedGtid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FAKEGTID_FIELD_NUMBER = 2;
        private boolean fakeGtid_;

        /**
         * <code>bool fakeGtid = 2;</code>
         *
         * @return The fakeGtid.
         */
        public boolean getFakeGtid() {
            return fakeGtid_;
        }

        public static final int FILENAME_FIELD_NUMBER = 3;
        private volatile java.lang.Object fileName_;

        /**
         * <code>string fileName = 3;</code>
         *
         * @return The fileName.
         */
        public java.lang.String getFileName() {
            java.lang.Object ref = fileName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                fileName_ = s;
                return s;
            }
        }

        /**
         * <code>string fileName = 3;</code>
         *
         * @return The bytes for fileName.
         */
        public com.google.protobuf.ByteString
        getFileNameBytes() {
            java.lang.Object ref = fileName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                fileName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int POSITION_FIELD_NUMBER = 4;
        private long position_;

        /**
         * <code>uint64 position = 4;</code>
         *
         * @return The position.
         */
        public long getPosition() {
            return position_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getSyncedGtidBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, syncedGtid_);
            }
            if (fakeGtid_ != false) {
                output.writeBool(2, fakeGtid_);
            }
            if (!getFileNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
            }
            if (position_ != 0L) {
                output.writeUInt64(4, position_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getSyncedGtidBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, syncedGtid_);
            }
            if (fakeGtid_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, fakeGtid_);
            }
            if (!getFileNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
            }
            if (position_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(4, position_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.CheckpointEvent)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.CheckpointEvent other = (com.tencent.subscribe.SubscribeDataProto.CheckpointEvent) obj;

            if (!getSyncedGtid()
                    .equals(other.getSyncedGtid())) {
                return false;
            }
            if (getFakeGtid()
                    != other.getFakeGtid()) {
                return false;
            }
            if (!getFileName()
                    .equals(other.getFileName())) {
                return false;
            }
            if (getPosition()
                    != other.getPosition()) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + SYNCEDGTID_FIELD_NUMBER;
            hash = (53 * hash) + getSyncedGtid().hashCode();
            hash = (37 * hash) + FAKEGTID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getFakeGtid());
            hash = (37 * hash) + FILENAME_FIELD_NUMBER;
            hash = (53 * hash) + getFileName().hashCode();
            hash = (37 * hash) + POSITION_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getPosition());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.CheckpointEvent prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.CheckpointEvent}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.CheckpointEvent)
                com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CheckpointEvent_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CheckpointEvent_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.class,
                                com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                syncedGtid_ = "";

                fakeGtid_ = false;

                fileName_ = "";

                position_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_CheckpointEvent_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent build() {
                com.tencent.subscribe.SubscribeDataProto.CheckpointEvent result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.CheckpointEvent result = new com.tencent.subscribe.SubscribeDataProto.CheckpointEvent(
                        this);
                result.syncedGtid_ = syncedGtid_;
                result.fakeGtid_ = fakeGtid_;
                result.fileName_ = fileName_;
                result.position_ = position_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.CheckpointEvent) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.CheckpointEvent) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.CheckpointEvent other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.getDefaultInstance()) {
                    return this;
                }
                if (!other.getSyncedGtid().isEmpty()) {
                    syncedGtid_ = other.syncedGtid_;
                    onChanged();
                }
                if (other.getFakeGtid() != false) {
                    setFakeGtid(other.getFakeGtid());
                }
                if (!other.getFileName().isEmpty()) {
                    fileName_ = other.fileName_;
                    onChanged();
                }
                if (other.getPosition() != 0L) {
                    setPosition(other.getPosition());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.CheckpointEvent parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.CheckpointEvent) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object syncedGtid_ = "";

            /**
             * <code>string syncedGtid = 1;</code>
             *
             * @return The syncedGtid.
             */
            public java.lang.String getSyncedGtid() {
                java.lang.Object ref = syncedGtid_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    syncedGtid_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string syncedGtid = 1;</code>
             *
             * @return The bytes for syncedGtid.
             */
            public com.google.protobuf.ByteString
            getSyncedGtidBytes() {
                java.lang.Object ref = syncedGtid_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    syncedGtid_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string syncedGtid = 1;</code>
             *
             * @param value The syncedGtid to set.
             * @return This builder for chaining.
             */
            public Builder setSyncedGtid(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                syncedGtid_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string syncedGtid = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSyncedGtid() {

                syncedGtid_ = getDefaultInstance().getSyncedGtid();
                onChanged();
                return this;
            }

            /**
             * <code>string syncedGtid = 1;</code>
             *
             * @param value The bytes for syncedGtid to set.
             * @return This builder for chaining.
             */
            public Builder setSyncedGtidBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                syncedGtid_ = value;
                onChanged();
                return this;
            }

            private boolean fakeGtid_;

            /**
             * <code>bool fakeGtid = 2;</code>
             *
             * @return The fakeGtid.
             */
            public boolean getFakeGtid() {
                return fakeGtid_;
            }

            /**
             * <code>bool fakeGtid = 2;</code>
             *
             * @param value The fakeGtid to set.
             * @return This builder for chaining.
             */
            public Builder setFakeGtid(boolean value) {

                fakeGtid_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>bool fakeGtid = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFakeGtid() {

                fakeGtid_ = false;
                onChanged();
                return this;
            }

            private java.lang.Object fileName_ = "";

            /**
             * <code>string fileName = 3;</code>
             *
             * @return The fileName.
             */
            public java.lang.String getFileName() {
                java.lang.Object ref = fileName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    fileName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string fileName = 3;</code>
             *
             * @return The bytes for fileName.
             */
            public com.google.protobuf.ByteString
            getFileNameBytes() {
                java.lang.Object ref = fileName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    fileName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string fileName = 3;</code>
             *
             * @param value The fileName to set.
             * @return This builder for chaining.
             */
            public Builder setFileName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                fileName_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string fileName = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFileName() {

                fileName_ = getDefaultInstance().getFileName();
                onChanged();
                return this;
            }

            /**
             * <code>string fileName = 3;</code>
             *
             * @param value The bytes for fileName to set.
             * @return This builder for chaining.
             */
            public Builder setFileNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                fileName_ = value;
                onChanged();
                return this;
            }

            private long position_;

            /**
             * <code>uint64 position = 4;</code>
             *
             * @return The position.
             */
            public long getPosition() {
                return position_;
            }

            /**
             * <code>uint64 position = 4;</code>
             *
             * @param value The position to set.
             * @return This builder for chaining.
             */
            public Builder setPosition(long value) {

                position_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint64 position = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPosition() {

                position_ = 0L;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.CheckpointEvent)
        }

        // @@protoc_insertion_point(class_scope:subscribe.CheckpointEvent)
        private static final com.tencent.subscribe.SubscribeDataProto.CheckpointEvent DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.CheckpointEvent();
        }

        public static com.tencent.subscribe.SubscribeDataProto.CheckpointEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CheckpointEvent>
                PARSER = new com.google.protobuf.AbstractParser<CheckpointEvent>() {
            @java.lang.Override
            public CheckpointEvent parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CheckpointEvent(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CheckpointEvent> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CheckpointEvent> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EventOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Event)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.subscribe.BeginEvent beginEvent = 1;</code>
         *
         * @return Whether the beginEvent field is set.
         */
        boolean hasBeginEvent();

        /**
         * <code>.subscribe.BeginEvent beginEvent = 1;</code>
         *
         * @return The beginEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.BeginEvent getBeginEvent();

        /**
         * <code>.subscribe.BeginEvent beginEvent = 1;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder getBeginEventOrBuilder();

        /**
         * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
         *
         * @return Whether the dmlEvent field is set.
         */
        boolean hasDmlEvent();

        /**
         * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
         *
         * @return The dmlEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.DMLEvent getDmlEvent();

        /**
         * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder getDmlEventOrBuilder();

        /**
         * <code>.subscribe.CommitEvent commitEvent = 3;</code>
         *
         * @return Whether the commitEvent field is set.
         */
        boolean hasCommitEvent();

        /**
         * <code>.subscribe.CommitEvent commitEvent = 3;</code>
         *
         * @return The commitEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.CommitEvent getCommitEvent();

        /**
         * <code>.subscribe.CommitEvent commitEvent = 3;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder getCommitEventOrBuilder();

        /**
         * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
         *
         * @return Whether the ddlEvent field is set.
         */
        boolean hasDdlEvent();

        /**
         * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
         *
         * @return The ddlEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.DDLEvent getDdlEvent();

        /**
         * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder getDdlEventOrBuilder();

        /**
         * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
         *
         * @return Whether the rollbackEvent field is set.
         */
        boolean hasRollbackEvent();

        /**
         * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
         *
         * @return The rollbackEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.RollbackEvent getRollbackEvent();

        /**
         * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder getRollbackEventOrBuilder();

        /**
         * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
         *
         * @return Whether the heartbeatEvent field is set.
         */
        boolean hasHeartbeatEvent();

        /**
         * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
         *
         * @return The heartbeatEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent getHeartbeatEvent();

        /**
         * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder getHeartbeatEventOrBuilder();

        /**
         * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
         *
         * @return Whether the checkpointEvent field is set.
         */
        boolean hasCheckpointEvent();

        /**
         * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
         *
         * @return The checkpointEvent.
         */
        com.tencent.subscribe.SubscribeDataProto.CheckpointEvent getCheckpointEvent();

        /**
         * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder getCheckpointEventOrBuilder();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair>
        getPropertiesList();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index);

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        int getPropertiesCount();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code subscribe.Event}
     */
    public static final class Event extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Event)
            EventOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Event.newBuilder() to construct.
        private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Event() {
            properties_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Event();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Event(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder subBuilder = null;
                            if (beginEvent_ != null) {
                                subBuilder = beginEvent_.toBuilder();
                            }
                            beginEvent_ = input.readMessage(
                                    com.tencent.subscribe.SubscribeDataProto.BeginEvent.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(beginEvent_);
                                beginEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 18: {
                            com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder subBuilder = null;
                            if (dmlEvent_ != null) {
                                subBuilder = dmlEvent_.toBuilder();
                            }
                            dmlEvent_ = input.readMessage(com.tencent.subscribe.SubscribeDataProto.DMLEvent.parser(),
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(dmlEvent_);
                                dmlEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 26: {
                            com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder subBuilder = null;
                            if (commitEvent_ != null) {
                                subBuilder = commitEvent_.toBuilder();
                            }
                            commitEvent_ = input.readMessage(
                                    com.tencent.subscribe.SubscribeDataProto.CommitEvent.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(commitEvent_);
                                commitEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 34: {
                            com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder subBuilder = null;
                            if (ddlEvent_ != null) {
                                subBuilder = ddlEvent_.toBuilder();
                            }
                            ddlEvent_ = input.readMessage(com.tencent.subscribe.SubscribeDataProto.DDLEvent.parser(),
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(ddlEvent_);
                                ddlEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 42: {
                            com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder subBuilder = null;
                            if (rollbackEvent_ != null) {
                                subBuilder = rollbackEvent_.toBuilder();
                            }
                            rollbackEvent_ = input.readMessage(
                                    com.tencent.subscribe.SubscribeDataProto.RollbackEvent.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(rollbackEvent_);
                                rollbackEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 50: {
                            com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder subBuilder = null;
                            if (heartbeatEvent_ != null) {
                                subBuilder = heartbeatEvent_.toBuilder();
                            }
                            heartbeatEvent_ = input.readMessage(
                                    com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.parser(),
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(heartbeatEvent_);
                                heartbeatEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 58: {
                            com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder subBuilder = null;
                            if (checkpointEvent_ != null) {
                                subBuilder = checkpointEvent_.toBuilder();
                            }
                            checkpointEvent_ = input.readMessage(
                                    com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.parser(),
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(checkpointEvent_);
                                checkpointEvent_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 122: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            properties_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.KVPair.parser(),
                                            extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    properties_ = java.util.Collections.unmodifiableList(properties_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Event_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Event_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Event.class,
                            com.tencent.subscribe.SubscribeDataProto.Event.Builder.class);
        }

        public static final int BEGINEVENT_FIELD_NUMBER = 1;
        private com.tencent.subscribe.SubscribeDataProto.BeginEvent beginEvent_;

        /**
         * <code>.subscribe.BeginEvent beginEvent = 1;</code>
         *
         * @return Whether the beginEvent field is set.
         */
        public boolean hasBeginEvent() {
            return beginEvent_ != null;
        }

        /**
         * <code>.subscribe.BeginEvent beginEvent = 1;</code>
         *
         * @return The beginEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.BeginEvent getBeginEvent() {
            return beginEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.BeginEvent.getDefaultInstance()
                    : beginEvent_;
        }

        /**
         * <code>.subscribe.BeginEvent beginEvent = 1;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder getBeginEventOrBuilder() {
            return getBeginEvent();
        }

        public static final int DMLEVENT_FIELD_NUMBER = 2;
        private com.tencent.subscribe.SubscribeDataProto.DMLEvent dmlEvent_;

        /**
         * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
         *
         * @return Whether the dmlEvent field is set.
         */
        public boolean hasDmlEvent() {
            return dmlEvent_ != null;
        }

        /**
         * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
         *
         * @return The dmlEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.DMLEvent getDmlEvent() {
            return dmlEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.DMLEvent.getDefaultInstance()
                    : dmlEvent_;
        }

        /**
         * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder getDmlEventOrBuilder() {
            return getDmlEvent();
        }

        public static final int COMMITEVENT_FIELD_NUMBER = 3;
        private com.tencent.subscribe.SubscribeDataProto.CommitEvent commitEvent_;

        /**
         * <code>.subscribe.CommitEvent commitEvent = 3;</code>
         *
         * @return Whether the commitEvent field is set.
         */
        public boolean hasCommitEvent() {
            return commitEvent_ != null;
        }

        /**
         * <code>.subscribe.CommitEvent commitEvent = 3;</code>
         *
         * @return The commitEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.CommitEvent getCommitEvent() {
            return commitEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.CommitEvent.getDefaultInstance()
                    : commitEvent_;
        }

        /**
         * <code>.subscribe.CommitEvent commitEvent = 3;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder getCommitEventOrBuilder() {
            return getCommitEvent();
        }

        public static final int DDLEVENT_FIELD_NUMBER = 4;
        private com.tencent.subscribe.SubscribeDataProto.DDLEvent ddlEvent_;

        /**
         * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
         *
         * @return Whether the ddlEvent field is set.
         */
        public boolean hasDdlEvent() {
            return ddlEvent_ != null;
        }

        /**
         * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
         *
         * @return The ddlEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.DDLEvent getDdlEvent() {
            return ddlEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.DDLEvent.getDefaultInstance()
                    : ddlEvent_;
        }

        /**
         * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder getDdlEventOrBuilder() {
            return getDdlEvent();
        }

        public static final int ROLLBACKEVENT_FIELD_NUMBER = 5;
        private com.tencent.subscribe.SubscribeDataProto.RollbackEvent rollbackEvent_;

        /**
         * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
         *
         * @return Whether the rollbackEvent field is set.
         */
        public boolean hasRollbackEvent() {
            return rollbackEvent_ != null;
        }

        /**
         * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
         *
         * @return The rollbackEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.RollbackEvent getRollbackEvent() {
            return rollbackEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.RollbackEvent.getDefaultInstance()
                    : rollbackEvent_;
        }

        /**
         * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder getRollbackEventOrBuilder() {
            return getRollbackEvent();
        }

        public static final int HEARTBEATEVENT_FIELD_NUMBER = 6;
        private com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent heartbeatEvent_;

        /**
         * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
         *
         * @return Whether the heartbeatEvent field is set.
         */
        public boolean hasHeartbeatEvent() {
            return heartbeatEvent_ != null;
        }

        /**
         * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
         *
         * @return The heartbeatEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent getHeartbeatEvent() {
            return heartbeatEvent_ == null
                    ? com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.getDefaultInstance() : heartbeatEvent_;
        }

        /**
         * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder getHeartbeatEventOrBuilder() {
            return getHeartbeatEvent();
        }

        public static final int CHECKPOINTEVENT_FIELD_NUMBER = 7;
        private com.tencent.subscribe.SubscribeDataProto.CheckpointEvent checkpointEvent_;

        /**
         * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
         *
         * @return Whether the checkpointEvent field is set.
         */
        public boolean hasCheckpointEvent() {
            return checkpointEvent_ != null;
        }

        /**
         * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
         *
         * @return The checkpointEvent.
         */
        public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent getCheckpointEvent() {
            return checkpointEvent_ == null
                    ? com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.getDefaultInstance() : checkpointEvent_;
        }

        /**
         * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder getCheckpointEventOrBuilder() {
            return getCheckpointEvent();
        }

        public static final int PROPERTIES_FIELD_NUMBER = 15;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_;

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
            return properties_;
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList() {
            return properties_;
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public int getPropertiesCount() {
            return properties_.size();
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
            return properties_.get(index);
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index) {
            return properties_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (beginEvent_ != null) {
                output.writeMessage(1, getBeginEvent());
            }
            if (dmlEvent_ != null) {
                output.writeMessage(2, getDmlEvent());
            }
            if (commitEvent_ != null) {
                output.writeMessage(3, getCommitEvent());
            }
            if (ddlEvent_ != null) {
                output.writeMessage(4, getDdlEvent());
            }
            if (rollbackEvent_ != null) {
                output.writeMessage(5, getRollbackEvent());
            }
            if (heartbeatEvent_ != null) {
                output.writeMessage(6, getHeartbeatEvent());
            }
            if (checkpointEvent_ != null) {
                output.writeMessage(7, getCheckpointEvent());
            }
            for (int i = 0; i < properties_.size(); i++) {
                output.writeMessage(15, properties_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (beginEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getBeginEvent());
            }
            if (dmlEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getDmlEvent());
            }
            if (commitEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getCommitEvent());
            }
            if (ddlEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, getDdlEvent());
            }
            if (rollbackEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, getRollbackEvent());
            }
            if (heartbeatEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, getHeartbeatEvent());
            }
            if (checkpointEvent_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, getCheckpointEvent());
            }
            for (int i = 0; i < properties_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, properties_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Event)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Event other = (com.tencent.subscribe.SubscribeDataProto.Event) obj;

            if (hasBeginEvent() != other.hasBeginEvent()) {
                return false;
            }
            if (hasBeginEvent()) {
                if (!getBeginEvent()
                        .equals(other.getBeginEvent())) {
                    return false;
                }
            }
            if (hasDmlEvent() != other.hasDmlEvent()) {
                return false;
            }
            if (hasDmlEvent()) {
                if (!getDmlEvent()
                        .equals(other.getDmlEvent())) {
                    return false;
                }
            }
            if (hasCommitEvent() != other.hasCommitEvent()) {
                return false;
            }
            if (hasCommitEvent()) {
                if (!getCommitEvent()
                        .equals(other.getCommitEvent())) {
                    return false;
                }
            }
            if (hasDdlEvent() != other.hasDdlEvent()) {
                return false;
            }
            if (hasDdlEvent()) {
                if (!getDdlEvent()
                        .equals(other.getDdlEvent())) {
                    return false;
                }
            }
            if (hasRollbackEvent() != other.hasRollbackEvent()) {
                return false;
            }
            if (hasRollbackEvent()) {
                if (!getRollbackEvent()
                        .equals(other.getRollbackEvent())) {
                    return false;
                }
            }
            if (hasHeartbeatEvent() != other.hasHeartbeatEvent()) {
                return false;
            }
            if (hasHeartbeatEvent()) {
                if (!getHeartbeatEvent()
                        .equals(other.getHeartbeatEvent())) {
                    return false;
                }
            }
            if (hasCheckpointEvent() != other.hasCheckpointEvent()) {
                return false;
            }
            if (hasCheckpointEvent()) {
                if (!getCheckpointEvent()
                        .equals(other.getCheckpointEvent())) {
                    return false;
                }
            }
            if (!getPropertiesList()
                    .equals(other.getPropertiesList())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasBeginEvent()) {
                hash = (37 * hash) + BEGINEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getBeginEvent().hashCode();
            }
            if (hasDmlEvent()) {
                hash = (37 * hash) + DMLEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getDmlEvent().hashCode();
            }
            if (hasCommitEvent()) {
                hash = (37 * hash) + COMMITEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getCommitEvent().hashCode();
            }
            if (hasDdlEvent()) {
                hash = (37 * hash) + DDLEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getDdlEvent().hashCode();
            }
            if (hasRollbackEvent()) {
                hash = (37 * hash) + ROLLBACKEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getRollbackEvent().hashCode();
            }
            if (hasHeartbeatEvent()) {
                hash = (37 * hash) + HEARTBEATEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getHeartbeatEvent().hashCode();
            }
            if (hasCheckpointEvent()) {
                hash = (37 * hash) + CHECKPOINTEVENT_FIELD_NUMBER;
                hash = (53 * hash) + getCheckpointEvent().hashCode();
            }
            if (getPropertiesCount() > 0) {
                hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
                hash = (53 * hash) + getPropertiesList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Event prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Event}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Event)
                com.tencent.subscribe.SubscribeDataProto.EventOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Event_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Event_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Event.class,
                                com.tencent.subscribe.SubscribeDataProto.Event.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Event.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getPropertiesFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (beginEventBuilder_ == null) {
                    beginEvent_ = null;
                } else {
                    beginEvent_ = null;
                    beginEventBuilder_ = null;
                }
                if (dmlEventBuilder_ == null) {
                    dmlEvent_ = null;
                } else {
                    dmlEvent_ = null;
                    dmlEventBuilder_ = null;
                }
                if (commitEventBuilder_ == null) {
                    commitEvent_ = null;
                } else {
                    commitEvent_ = null;
                    commitEventBuilder_ = null;
                }
                if (ddlEventBuilder_ == null) {
                    ddlEvent_ = null;
                } else {
                    ddlEvent_ = null;
                    ddlEventBuilder_ = null;
                }
                if (rollbackEventBuilder_ == null) {
                    rollbackEvent_ = null;
                } else {
                    rollbackEvent_ = null;
                    rollbackEventBuilder_ = null;
                }
                if (heartbeatEventBuilder_ == null) {
                    heartbeatEvent_ = null;
                } else {
                    heartbeatEvent_ = null;
                    heartbeatEventBuilder_ = null;
                }
                if (checkpointEventBuilder_ == null) {
                    checkpointEvent_ = null;
                } else {
                    checkpointEvent_ = null;
                    checkpointEventBuilder_ = null;
                }
                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Event_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Event getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Event.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Event build() {
                com.tencent.subscribe.SubscribeDataProto.Event result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Event buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Event result = new com.tencent.subscribe.SubscribeDataProto.Event(
                        this);
                int from_bitField0_ = bitField0_;
                if (beginEventBuilder_ == null) {
                    result.beginEvent_ = beginEvent_;
                } else {
                    result.beginEvent_ = beginEventBuilder_.build();
                }
                if (dmlEventBuilder_ == null) {
                    result.dmlEvent_ = dmlEvent_;
                } else {
                    result.dmlEvent_ = dmlEventBuilder_.build();
                }
                if (commitEventBuilder_ == null) {
                    result.commitEvent_ = commitEvent_;
                } else {
                    result.commitEvent_ = commitEventBuilder_.build();
                }
                if (ddlEventBuilder_ == null) {
                    result.ddlEvent_ = ddlEvent_;
                } else {
                    result.ddlEvent_ = ddlEventBuilder_.build();
                }
                if (rollbackEventBuilder_ == null) {
                    result.rollbackEvent_ = rollbackEvent_;
                } else {
                    result.rollbackEvent_ = rollbackEventBuilder_.build();
                }
                if (heartbeatEventBuilder_ == null) {
                    result.heartbeatEvent_ = heartbeatEvent_;
                } else {
                    result.heartbeatEvent_ = heartbeatEventBuilder_.build();
                }
                if (checkpointEventBuilder_ == null) {
                    result.checkpointEvent_ = checkpointEvent_;
                } else {
                    result.checkpointEvent_ = checkpointEventBuilder_.build();
                }
                if (propertiesBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        properties_ = java.util.Collections.unmodifiableList(properties_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.properties_ = properties_;
                } else {
                    result.properties_ = propertiesBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Event) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Event) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Event other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Event.getDefaultInstance()) {
                    return this;
                }
                if (other.hasBeginEvent()) {
                    mergeBeginEvent(other.getBeginEvent());
                }
                if (other.hasDmlEvent()) {
                    mergeDmlEvent(other.getDmlEvent());
                }
                if (other.hasCommitEvent()) {
                    mergeCommitEvent(other.getCommitEvent());
                }
                if (other.hasDdlEvent()) {
                    mergeDdlEvent(other.getDdlEvent());
                }
                if (other.hasRollbackEvent()) {
                    mergeRollbackEvent(other.getRollbackEvent());
                }
                if (other.hasHeartbeatEvent()) {
                    mergeHeartbeatEvent(other.getHeartbeatEvent());
                }
                if (other.hasCheckpointEvent()) {
                    mergeCheckpointEvent(other.getCheckpointEvent());
                }
                if (propertiesBuilder_ == null) {
                    if (!other.properties_.isEmpty()) {
                        if (properties_.isEmpty()) {
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensurePropertiesIsMutable();
                            properties_.addAll(other.properties_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.properties_.isEmpty()) {
                        if (propertiesBuilder_.isEmpty()) {
                            propertiesBuilder_.dispose();
                            propertiesBuilder_ = null;
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            propertiesBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getPropertiesFieldBuilder() : null;
                        } else {
                            propertiesBuilder_.addAllMessages(other.properties_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Event parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Event) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.tencent.subscribe.SubscribeDataProto.BeginEvent beginEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.BeginEvent, com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder, com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder> beginEventBuilder_;

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             *
             * @return Whether the beginEvent field is set.
             */
            public boolean hasBeginEvent() {
                return beginEventBuilder_ != null || beginEvent_ != null;
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             *
             * @return The beginEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.BeginEvent getBeginEvent() {
                if (beginEventBuilder_ == null) {
                    return beginEvent_ == null
                            ? com.tencent.subscribe.SubscribeDataProto.BeginEvent.getDefaultInstance() : beginEvent_;
                } else {
                    return beginEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            public Builder setBeginEvent(com.tencent.subscribe.SubscribeDataProto.BeginEvent value) {
                if (beginEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    beginEvent_ = value;
                    onChanged();
                } else {
                    beginEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            public Builder setBeginEvent(
                    com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder builderForValue) {
                if (beginEventBuilder_ == null) {
                    beginEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    beginEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            public Builder mergeBeginEvent(com.tencent.subscribe.SubscribeDataProto.BeginEvent value) {
                if (beginEventBuilder_ == null) {
                    if (beginEvent_ != null) {
                        beginEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.BeginEvent.newBuilder(beginEvent_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        beginEvent_ = value;
                    }
                    onChanged();
                } else {
                    beginEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            public Builder clearBeginEvent() {
                if (beginEventBuilder_ == null) {
                    beginEvent_ = null;
                    onChanged();
                } else {
                    beginEvent_ = null;
                    beginEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder getBeginEventBuilder() {

                onChanged();
                return getBeginEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder getBeginEventOrBuilder() {
                if (beginEventBuilder_ != null) {
                    return beginEventBuilder_.getMessageOrBuilder();
                } else {
                    return beginEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.BeginEvent.getDefaultInstance() : beginEvent_;
                }
            }

            /**
             * <code>.subscribe.BeginEvent beginEvent = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.BeginEvent, com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder, com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder>
            getBeginEventFieldBuilder() {
                if (beginEventBuilder_ == null) {
                    beginEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.BeginEvent, com.tencent.subscribe.SubscribeDataProto.BeginEvent.Builder, com.tencent.subscribe.SubscribeDataProto.BeginEventOrBuilder>(
                            getBeginEvent(),
                            getParentForChildren(),
                            isClean());
                    beginEvent_ = null;
                }
                return beginEventBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.DMLEvent dmlEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.DMLEvent, com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder, com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder> dmlEventBuilder_;

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             *
             * @return Whether the dmlEvent field is set.
             */
            public boolean hasDmlEvent() {
                return dmlEventBuilder_ != null || dmlEvent_ != null;
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             *
             * @return The dmlEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.DMLEvent getDmlEvent() {
                if (dmlEventBuilder_ == null) {
                    return dmlEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.DMLEvent.getDefaultInstance()
                            : dmlEvent_;
                } else {
                    return dmlEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            public Builder setDmlEvent(com.tencent.subscribe.SubscribeDataProto.DMLEvent value) {
                if (dmlEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    dmlEvent_ = value;
                    onChanged();
                } else {
                    dmlEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            public Builder setDmlEvent(
                    com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder builderForValue) {
                if (dmlEventBuilder_ == null) {
                    dmlEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    dmlEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            public Builder mergeDmlEvent(com.tencent.subscribe.SubscribeDataProto.DMLEvent value) {
                if (dmlEventBuilder_ == null) {
                    if (dmlEvent_ != null) {
                        dmlEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.DMLEvent.newBuilder(dmlEvent_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        dmlEvent_ = value;
                    }
                    onChanged();
                } else {
                    dmlEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            public Builder clearDmlEvent() {
                if (dmlEventBuilder_ == null) {
                    dmlEvent_ = null;
                    onChanged();
                } else {
                    dmlEvent_ = null;
                    dmlEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder getDmlEventBuilder() {

                onChanged();
                return getDmlEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder getDmlEventOrBuilder() {
                if (dmlEventBuilder_ != null) {
                    return dmlEventBuilder_.getMessageOrBuilder();
                } else {
                    return dmlEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.DMLEvent.getDefaultInstance() : dmlEvent_;
                }
            }

            /**
             * <code>.subscribe.DMLEvent dmlEvent = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.DMLEvent, com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder, com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder>
            getDmlEventFieldBuilder() {
                if (dmlEventBuilder_ == null) {
                    dmlEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.DMLEvent, com.tencent.subscribe.SubscribeDataProto.DMLEvent.Builder, com.tencent.subscribe.SubscribeDataProto.DMLEventOrBuilder>(
                            getDmlEvent(),
                            getParentForChildren(),
                            isClean());
                    dmlEvent_ = null;
                }
                return dmlEventBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.CommitEvent commitEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.CommitEvent, com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder, com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder> commitEventBuilder_;

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             *
             * @return Whether the commitEvent field is set.
             */
            public boolean hasCommitEvent() {
                return commitEventBuilder_ != null || commitEvent_ != null;
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             *
             * @return The commitEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.CommitEvent getCommitEvent() {
                if (commitEventBuilder_ == null) {
                    return commitEvent_ == null
                            ? com.tencent.subscribe.SubscribeDataProto.CommitEvent.getDefaultInstance() : commitEvent_;
                } else {
                    return commitEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            public Builder setCommitEvent(com.tencent.subscribe.SubscribeDataProto.CommitEvent value) {
                if (commitEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    commitEvent_ = value;
                    onChanged();
                } else {
                    commitEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            public Builder setCommitEvent(
                    com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder builderForValue) {
                if (commitEventBuilder_ == null) {
                    commitEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    commitEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            public Builder mergeCommitEvent(com.tencent.subscribe.SubscribeDataProto.CommitEvent value) {
                if (commitEventBuilder_ == null) {
                    if (commitEvent_ != null) {
                        commitEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.CommitEvent.newBuilder(commitEvent_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        commitEvent_ = value;
                    }
                    onChanged();
                } else {
                    commitEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            public Builder clearCommitEvent() {
                if (commitEventBuilder_ == null) {
                    commitEvent_ = null;
                    onChanged();
                } else {
                    commitEvent_ = null;
                    commitEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder getCommitEventBuilder() {

                onChanged();
                return getCommitEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder getCommitEventOrBuilder() {
                if (commitEventBuilder_ != null) {
                    return commitEventBuilder_.getMessageOrBuilder();
                } else {
                    return commitEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.CommitEvent.getDefaultInstance() : commitEvent_;
                }
            }

            /**
             * <code>.subscribe.CommitEvent commitEvent = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.CommitEvent, com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder, com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder>
            getCommitEventFieldBuilder() {
                if (commitEventBuilder_ == null) {
                    commitEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.CommitEvent, com.tencent.subscribe.SubscribeDataProto.CommitEvent.Builder, com.tencent.subscribe.SubscribeDataProto.CommitEventOrBuilder>(
                            getCommitEvent(),
                            getParentForChildren(),
                            isClean());
                    commitEvent_ = null;
                }
                return commitEventBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.DDLEvent ddlEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.DDLEvent, com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder, com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder> ddlEventBuilder_;

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             *
             * @return Whether the ddlEvent field is set.
             */
            public boolean hasDdlEvent() {
                return ddlEventBuilder_ != null || ddlEvent_ != null;
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             *
             * @return The ddlEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.DDLEvent getDdlEvent() {
                if (ddlEventBuilder_ == null) {
                    return ddlEvent_ == null ? com.tencent.subscribe.SubscribeDataProto.DDLEvent.getDefaultInstance()
                            : ddlEvent_;
                } else {
                    return ddlEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            public Builder setDdlEvent(com.tencent.subscribe.SubscribeDataProto.DDLEvent value) {
                if (ddlEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ddlEvent_ = value;
                    onChanged();
                } else {
                    ddlEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            public Builder setDdlEvent(
                    com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder builderForValue) {
                if (ddlEventBuilder_ == null) {
                    ddlEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    ddlEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            public Builder mergeDdlEvent(com.tencent.subscribe.SubscribeDataProto.DDLEvent value) {
                if (ddlEventBuilder_ == null) {
                    if (ddlEvent_ != null) {
                        ddlEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.DDLEvent.newBuilder(ddlEvent_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        ddlEvent_ = value;
                    }
                    onChanged();
                } else {
                    ddlEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            public Builder clearDdlEvent() {
                if (ddlEventBuilder_ == null) {
                    ddlEvent_ = null;
                    onChanged();
                } else {
                    ddlEvent_ = null;
                    ddlEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder getDdlEventBuilder() {

                onChanged();
                return getDdlEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder getDdlEventOrBuilder() {
                if (ddlEventBuilder_ != null) {
                    return ddlEventBuilder_.getMessageOrBuilder();
                } else {
                    return ddlEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.DDLEvent.getDefaultInstance() : ddlEvent_;
                }
            }

            /**
             * <code>.subscribe.DDLEvent ddlEvent = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.DDLEvent, com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder, com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder>
            getDdlEventFieldBuilder() {
                if (ddlEventBuilder_ == null) {
                    ddlEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.DDLEvent, com.tencent.subscribe.SubscribeDataProto.DDLEvent.Builder, com.tencent.subscribe.SubscribeDataProto.DDLEventOrBuilder>(
                            getDdlEvent(),
                            getParentForChildren(),
                            isClean());
                    ddlEvent_ = null;
                }
                return ddlEventBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.RollbackEvent rollbackEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.RollbackEvent, com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder, com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder> rollbackEventBuilder_;

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             *
             * @return Whether the rollbackEvent field is set.
             */
            public boolean hasRollbackEvent() {
                return rollbackEventBuilder_ != null || rollbackEvent_ != null;
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             *
             * @return The rollbackEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.RollbackEvent getRollbackEvent() {
                if (rollbackEventBuilder_ == null) {
                    return rollbackEvent_ == null
                            ? com.tencent.subscribe.SubscribeDataProto.RollbackEvent.getDefaultInstance()
                            : rollbackEvent_;
                } else {
                    return rollbackEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            public Builder setRollbackEvent(com.tencent.subscribe.SubscribeDataProto.RollbackEvent value) {
                if (rollbackEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    rollbackEvent_ = value;
                    onChanged();
                } else {
                    rollbackEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            public Builder setRollbackEvent(
                    com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder builderForValue) {
                if (rollbackEventBuilder_ == null) {
                    rollbackEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    rollbackEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            public Builder mergeRollbackEvent(com.tencent.subscribe.SubscribeDataProto.RollbackEvent value) {
                if (rollbackEventBuilder_ == null) {
                    if (rollbackEvent_ != null) {
                        rollbackEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.RollbackEvent.newBuilder(rollbackEvent_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        rollbackEvent_ = value;
                    }
                    onChanged();
                } else {
                    rollbackEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            public Builder clearRollbackEvent() {
                if (rollbackEventBuilder_ == null) {
                    rollbackEvent_ = null;
                    onChanged();
                } else {
                    rollbackEvent_ = null;
                    rollbackEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder getRollbackEventBuilder() {

                onChanged();
                return getRollbackEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder getRollbackEventOrBuilder() {
                if (rollbackEventBuilder_ != null) {
                    return rollbackEventBuilder_.getMessageOrBuilder();
                } else {
                    return rollbackEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.RollbackEvent.getDefaultInstance()
                            : rollbackEvent_;
                }
            }

            /**
             * <code>.subscribe.RollbackEvent rollbackEvent = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.RollbackEvent, com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder, com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder>
            getRollbackEventFieldBuilder() {
                if (rollbackEventBuilder_ == null) {
                    rollbackEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.RollbackEvent, com.tencent.subscribe.SubscribeDataProto.RollbackEvent.Builder, com.tencent.subscribe.SubscribeDataProto.RollbackEventOrBuilder>(
                            getRollbackEvent(),
                            getParentForChildren(),
                            isClean());
                    rollbackEvent_ = null;
                }
                return rollbackEventBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent heartbeatEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent, com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder, com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder> heartbeatEventBuilder_;

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             *
             * @return Whether the heartbeatEvent field is set.
             */
            public boolean hasHeartbeatEvent() {
                return heartbeatEventBuilder_ != null || heartbeatEvent_ != null;
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             *
             * @return The heartbeatEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent getHeartbeatEvent() {
                if (heartbeatEventBuilder_ == null) {
                    return heartbeatEvent_ == null
                            ? com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.getDefaultInstance()
                            : heartbeatEvent_;
                } else {
                    return heartbeatEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            public Builder setHeartbeatEvent(com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent value) {
                if (heartbeatEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    heartbeatEvent_ = value;
                    onChanged();
                } else {
                    heartbeatEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            public Builder setHeartbeatEvent(
                    com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder builderForValue) {
                if (heartbeatEventBuilder_ == null) {
                    heartbeatEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    heartbeatEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            public Builder mergeHeartbeatEvent(com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent value) {
                if (heartbeatEventBuilder_ == null) {
                    if (heartbeatEvent_ != null) {
                        heartbeatEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.newBuilder(heartbeatEvent_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        heartbeatEvent_ = value;
                    }
                    onChanged();
                } else {
                    heartbeatEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            public Builder clearHeartbeatEvent() {
                if (heartbeatEventBuilder_ == null) {
                    heartbeatEvent_ = null;
                    onChanged();
                } else {
                    heartbeatEvent_ = null;
                    heartbeatEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder getHeartbeatEventBuilder() {

                onChanged();
                return getHeartbeatEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder getHeartbeatEventOrBuilder() {
                if (heartbeatEventBuilder_ != null) {
                    return heartbeatEventBuilder_.getMessageOrBuilder();
                } else {
                    return heartbeatEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.getDefaultInstance()
                            : heartbeatEvent_;
                }
            }

            /**
             * <code>.subscribe.HeartbeatEvent heartbeatEvent = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent, com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder, com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder>
            getHeartbeatEventFieldBuilder() {
                if (heartbeatEventBuilder_ == null) {
                    heartbeatEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent, com.tencent.subscribe.SubscribeDataProto.HeartbeatEvent.Builder, com.tencent.subscribe.SubscribeDataProto.HeartbeatEventOrBuilder>(
                            getHeartbeatEvent(),
                            getParentForChildren(),
                            isClean());
                    heartbeatEvent_ = null;
                }
                return heartbeatEventBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.CheckpointEvent checkpointEvent_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.CheckpointEvent, com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder, com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder> checkpointEventBuilder_;

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             *
             * @return Whether the checkpointEvent field is set.
             */
            public boolean hasCheckpointEvent() {
                return checkpointEventBuilder_ != null || checkpointEvent_ != null;
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             *
             * @return The checkpointEvent.
             */
            public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent getCheckpointEvent() {
                if (checkpointEventBuilder_ == null) {
                    return checkpointEvent_ == null
                            ? com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.getDefaultInstance()
                            : checkpointEvent_;
                } else {
                    return checkpointEventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            public Builder setCheckpointEvent(com.tencent.subscribe.SubscribeDataProto.CheckpointEvent value) {
                if (checkpointEventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    checkpointEvent_ = value;
                    onChanged();
                } else {
                    checkpointEventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            public Builder setCheckpointEvent(
                    com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder builderForValue) {
                if (checkpointEventBuilder_ == null) {
                    checkpointEvent_ = builderForValue.build();
                    onChanged();
                } else {
                    checkpointEventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            public Builder mergeCheckpointEvent(com.tencent.subscribe.SubscribeDataProto.CheckpointEvent value) {
                if (checkpointEventBuilder_ == null) {
                    if (checkpointEvent_ != null) {
                        checkpointEvent_ =
                                com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.newBuilder(checkpointEvent_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        checkpointEvent_ = value;
                    }
                    onChanged();
                } else {
                    checkpointEventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            public Builder clearCheckpointEvent() {
                if (checkpointEventBuilder_ == null) {
                    checkpointEvent_ = null;
                    onChanged();
                } else {
                    checkpointEvent_ = null;
                    checkpointEventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder getCheckpointEventBuilder() {

                onChanged();
                return getCheckpointEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder getCheckpointEventOrBuilder() {
                if (checkpointEventBuilder_ != null) {
                    return checkpointEventBuilder_.getMessageOrBuilder();
                } else {
                    return checkpointEvent_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.getDefaultInstance()
                            : checkpointEvent_;
                }
            }

            /**
             * <code>.subscribe.CheckpointEvent checkpointEvent = 7;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.CheckpointEvent, com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder, com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder>
            getCheckpointEventFieldBuilder() {
                if (checkpointEventBuilder_ == null) {
                    checkpointEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.CheckpointEvent, com.tencent.subscribe.SubscribeDataProto.CheckpointEvent.Builder, com.tencent.subscribe.SubscribeDataProto.CheckpointEventOrBuilder>(
                            getCheckpointEvent(),
                            getParentForChildren(),
                            isClean());
                    checkpointEvent_ = null;
                }
                return checkpointEventBuilder_;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_ =
                    java.util.Collections.emptyList();

            private void ensurePropertiesIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>(properties_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder> propertiesBuilder_;

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
                if (propertiesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(properties_);
                } else {
                    return propertiesBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public int getPropertiesCount() {
                if (propertiesBuilder_ == null) {
                    return properties_.size();
                } else {
                    return propertiesBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.set(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addAllProperties(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.KVPair> values) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, properties_);
                    onChanged();
                } else {
                    propertiesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder clearProperties() {
                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder removeProperties(int index) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.remove(index);
                    onChanged();
                } else {
                    propertiesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder getPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                    int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesOrBuilderList() {
                if (propertiesBuilder_ != null) {
                    return propertiesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(properties_);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder() {
                return getPropertiesFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair.Builder>
            getPropertiesBuilderList() {
                return getPropertiesFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesFieldBuilder() {
                if (propertiesBuilder_ == null) {
                    propertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>(
                            properties_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    properties_ = null;
                }
                return propertiesBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Event)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Event)
        private static final com.tencent.subscribe.SubscribeDataProto.Event DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Event();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Event>
                PARSER = new com.google.protobuf.AbstractParser<Event>() {
            @java.lang.Override
            public Event parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Event(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Event> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Event> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EntryOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Entry)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 事件的头部
         * </pre>
         *
         * <code>.subscribe.Header header = 1;</code>
         *
         * @return Whether the header field is set.
         */
        boolean hasHeader();

        /**
         * <pre>
         * 事件的头部
         * </pre>
         *
         * <code>.subscribe.Header header = 1;</code>
         *
         * @return The header.
         */
        com.tencent.subscribe.SubscribeDataProto.Header getHeader();

        /**
         * <pre>
         * 事件的头部
         * </pre>
         *
         * <code>.subscribe.Header header = 1;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder getHeaderOrBuilder();

        /**
         * <code>.subscribe.Event event = 2;</code>
         *
         * @return Whether the event field is set.
         */
        boolean hasEvent();

        /**
         * <code>.subscribe.Event event = 2;</code>
         *
         * @return The event.
         */
        com.tencent.subscribe.SubscribeDataProto.Event getEvent();

        /**
         * <code>.subscribe.Event event = 2;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.EventOrBuilder getEventOrBuilder();
    }

    /**
     * Protobuf type {@code subscribe.Entry}
     */
    public static final class Entry extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Entry)
            EntryOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Entry.newBuilder() to construct.
        private Entry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Entry() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Entry();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Entry(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            com.tencent.subscribe.SubscribeDataProto.Header.Builder subBuilder = null;
                            if (header_ != null) {
                                subBuilder = header_.toBuilder();
                            }
                            header_ = input.readMessage(com.tencent.subscribe.SubscribeDataProto.Header.parser(),
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(header_);
                                header_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 18: {
                            com.tencent.subscribe.SubscribeDataProto.Event.Builder subBuilder = null;
                            if (event_ != null) {
                                subBuilder = event_.toBuilder();
                            }
                            event_ = input.readMessage(com.tencent.subscribe.SubscribeDataProto.Event.parser(),
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(event_);
                                event_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entry_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entry_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Entry.class,
                            com.tencent.subscribe.SubscribeDataProto.Entry.Builder.class);
        }

        public static final int HEADER_FIELD_NUMBER = 1;
        private com.tencent.subscribe.SubscribeDataProto.Header header_;

        /**
         * <pre>
         * 事件的头部
         * </pre>
         *
         * <code>.subscribe.Header header = 1;</code>
         *
         * @return Whether the header field is set.
         */
        public boolean hasHeader() {
            return header_ != null;
        }

        /**
         * <pre>
         * 事件的头部
         * </pre>
         *
         * <code>.subscribe.Header header = 1;</code>
         *
         * @return The header.
         */
        public com.tencent.subscribe.SubscribeDataProto.Header getHeader() {
            return header_ == null ? com.tencent.subscribe.SubscribeDataProto.Header.getDefaultInstance() : header_;
        }

        /**
         * <pre>
         * 事件的头部
         * </pre>
         *
         * <code>.subscribe.Header header = 1;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder getHeaderOrBuilder() {
            return getHeader();
        }

        public static final int EVENT_FIELD_NUMBER = 2;
        private com.tencent.subscribe.SubscribeDataProto.Event event_;

        /**
         * <code>.subscribe.Event event = 2;</code>
         *
         * @return Whether the event field is set.
         */
        public boolean hasEvent() {
            return event_ != null;
        }

        /**
         * <code>.subscribe.Event event = 2;</code>
         *
         * @return The event.
         */
        public com.tencent.subscribe.SubscribeDataProto.Event getEvent() {
            return event_ == null ? com.tencent.subscribe.SubscribeDataProto.Event.getDefaultInstance() : event_;
        }

        /**
         * <code>.subscribe.Event event = 2;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.EventOrBuilder getEventOrBuilder() {
            return getEvent();
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (header_ != null) {
                output.writeMessage(1, getHeader());
            }
            if (event_ != null) {
                output.writeMessage(2, getEvent());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (header_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getHeader());
            }
            if (event_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getEvent());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Entry)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Entry other = (com.tencent.subscribe.SubscribeDataProto.Entry) obj;

            if (hasHeader() != other.hasHeader()) {
                return false;
            }
            if (hasHeader()) {
                if (!getHeader()
                        .equals(other.getHeader())) {
                    return false;
                }
            }
            if (hasEvent() != other.hasEvent()) {
                return false;
            }
            if (hasEvent()) {
                if (!getEvent()
                        .equals(other.getEvent())) {
                    return false;
                }
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasHeader()) {
                hash = (37 * hash) + HEADER_FIELD_NUMBER;
                hash = (53 * hash) + getHeader().hashCode();
            }
            if (hasEvent()) {
                hash = (37 * hash) + EVENT_FIELD_NUMBER;
                hash = (53 * hash) + getEvent().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Entry prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Entry}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Entry)
                com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entry_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entry_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Entry.class,
                                com.tencent.subscribe.SubscribeDataProto.Entry.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Entry.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (headerBuilder_ == null) {
                    header_ = null;
                } else {
                    header_ = null;
                    headerBuilder_ = null;
                }
                if (eventBuilder_ == null) {
                    event_ = null;
                } else {
                    event_ = null;
                    eventBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entry_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Entry getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Entry.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Entry build() {
                com.tencent.subscribe.SubscribeDataProto.Entry result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Entry buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Entry result = new com.tencent.subscribe.SubscribeDataProto.Entry(
                        this);
                if (headerBuilder_ == null) {
                    result.header_ = header_;
                } else {
                    result.header_ = headerBuilder_.build();
                }
                if (eventBuilder_ == null) {
                    result.event_ = event_;
                } else {
                    result.event_ = eventBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Entry) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Entry) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Entry other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Entry.getDefaultInstance()) {
                    return this;
                }
                if (other.hasHeader()) {
                    mergeHeader(other.getHeader());
                }
                if (other.hasEvent()) {
                    mergeEvent(other.getEvent());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Entry parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Entry) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private com.tencent.subscribe.SubscribeDataProto.Header header_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Header, com.tencent.subscribe.SubscribeDataProto.Header.Builder, com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder> headerBuilder_;

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             *
             * @return Whether the header field is set.
             */
            public boolean hasHeader() {
                return headerBuilder_ != null || header_ != null;
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             *
             * @return The header.
             */
            public com.tencent.subscribe.SubscribeDataProto.Header getHeader() {
                if (headerBuilder_ == null) {
                    return header_ == null ? com.tencent.subscribe.SubscribeDataProto.Header.getDefaultInstance()
                            : header_;
                } else {
                    return headerBuilder_.getMessage();
                }
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            public Builder setHeader(com.tencent.subscribe.SubscribeDataProto.Header value) {
                if (headerBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    header_ = value;
                    onChanged();
                } else {
                    headerBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            public Builder setHeader(
                    com.tencent.subscribe.SubscribeDataProto.Header.Builder builderForValue) {
                if (headerBuilder_ == null) {
                    header_ = builderForValue.build();
                    onChanged();
                } else {
                    headerBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            public Builder mergeHeader(com.tencent.subscribe.SubscribeDataProto.Header value) {
                if (headerBuilder_ == null) {
                    if (header_ != null) {
                        header_ =
                                com.tencent.subscribe.SubscribeDataProto.Header.newBuilder(header_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        header_ = value;
                    }
                    onChanged();
                } else {
                    headerBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            public Builder clearHeader() {
                if (headerBuilder_ == null) {
                    header_ = null;
                    onChanged();
                } else {
                    header_ = null;
                    headerBuilder_ = null;
                }

                return this;
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Header.Builder getHeaderBuilder() {

                onChanged();
                return getHeaderFieldBuilder().getBuilder();
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder getHeaderOrBuilder() {
                if (headerBuilder_ != null) {
                    return headerBuilder_.getMessageOrBuilder();
                } else {
                    return header_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.Header.getDefaultInstance() : header_;
                }
            }

            /**
             * <pre>
             * 事件的头部
             * </pre>
             *
             * <code>.subscribe.Header header = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Header, com.tencent.subscribe.SubscribeDataProto.Header.Builder, com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder>
            getHeaderFieldBuilder() {
                if (headerBuilder_ == null) {
                    headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.Header, com.tencent.subscribe.SubscribeDataProto.Header.Builder, com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder>(
                            getHeader(),
                            getParentForChildren(),
                            isClean());
                    header_ = null;
                }
                return headerBuilder_;
            }

            private com.tencent.subscribe.SubscribeDataProto.Event event_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Event, com.tencent.subscribe.SubscribeDataProto.Event.Builder, com.tencent.subscribe.SubscribeDataProto.EventOrBuilder> eventBuilder_;

            /**
             * <code>.subscribe.Event event = 2;</code>
             *
             * @return Whether the event field is set.
             */
            public boolean hasEvent() {
                return eventBuilder_ != null || event_ != null;
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             *
             * @return The event.
             */
            public com.tencent.subscribe.SubscribeDataProto.Event getEvent() {
                if (eventBuilder_ == null) {
                    return event_ == null ? com.tencent.subscribe.SubscribeDataProto.Event.getDefaultInstance()
                            : event_;
                } else {
                    return eventBuilder_.getMessage();
                }
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            public Builder setEvent(com.tencent.subscribe.SubscribeDataProto.Event value) {
                if (eventBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    event_ = value;
                    onChanged();
                } else {
                    eventBuilder_.setMessage(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            public Builder setEvent(
                    com.tencent.subscribe.SubscribeDataProto.Event.Builder builderForValue) {
                if (eventBuilder_ == null) {
                    event_ = builderForValue.build();
                    onChanged();
                } else {
                    eventBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            public Builder mergeEvent(com.tencent.subscribe.SubscribeDataProto.Event value) {
                if (eventBuilder_ == null) {
                    if (event_ != null) {
                        event_ =
                                com.tencent.subscribe.SubscribeDataProto.Event.newBuilder(event_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        event_ = value;
                    }
                    onChanged();
                } else {
                    eventBuilder_.mergeFrom(value);
                }

                return this;
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            public Builder clearEvent() {
                if (eventBuilder_ == null) {
                    event_ = null;
                    onChanged();
                } else {
                    event_ = null;
                    eventBuilder_ = null;
                }

                return this;
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Event.Builder getEventBuilder() {

                onChanged();
                return getEventFieldBuilder().getBuilder();
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.EventOrBuilder getEventOrBuilder() {
                if (eventBuilder_ != null) {
                    return eventBuilder_.getMessageOrBuilder();
                } else {
                    return event_ == null ?
                            com.tencent.subscribe.SubscribeDataProto.Event.getDefaultInstance() : event_;
                }
            }

            /**
             * <code>.subscribe.Event event = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Event, com.tencent.subscribe.SubscribeDataProto.Event.Builder, com.tencent.subscribe.SubscribeDataProto.EventOrBuilder>
            getEventFieldBuilder() {
                if (eventBuilder_ == null) {
                    eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.Event, com.tencent.subscribe.SubscribeDataProto.Event.Builder, com.tencent.subscribe.SubscribeDataProto.EventOrBuilder>(
                            getEvent(),
                            getParentForChildren(),
                            isClean());
                    event_ = null;
                }
                return eventBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Entry)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Entry)
        private static final com.tencent.subscribe.SubscribeDataProto.Entry DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Entry();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Entry>
                PARSER = new com.google.protobuf.AbstractParser<Entry>() {
            @java.lang.Override
            public Entry parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Entry(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Entry> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Entry> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Entry getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface HeaderOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Header)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 version = 1;</code>
         *
         * @return The version.
         */
        int getVersion();

        /**
         * <pre>
         * 源库的类型信息，包括mysql，oracle等类型
         * </pre>
         *
         * <code>.subscribe.SourceType sourceType = 2;</code>
         *
         * @return The enum numeric value on the wire for sourceType.
         */
        int getSourceTypeValue();

        /**
         * <pre>
         * 源库的类型信息，包括mysql，oracle等类型
         * </pre>
         *
         * <code>.subscribe.SourceType sourceType = 2;</code>
         *
         * @return The sourceType.
         */
        com.tencent.subscribe.SubscribeDataProto.SourceType getSourceType();

        /**
         * <pre>
         * 消息的类型
         * </pre>
         *
         * <code>.subscribe.MessageType messageType = 3;</code>
         *
         * @return The enum numeric value on the wire for messageType.
         */
        int getMessageTypeValue();

        /**
         * <pre>
         * 消息的类型
         * </pre>
         *
         * <code>.subscribe.MessageType messageType = 3;</code>
         *
         * @return The messageType.
         */
        com.tencent.subscribe.SubscribeDataProto.MessageType getMessageType();

        /**
         * <pre>
         * Event在原始binlog中的时间戳
         * </pre>
         *
         * <code>uint32 timestamp = 4;</code>
         *
         * @return The timestamp.
         */
        int getTimestamp();

        /**
         * <pre>
         * 源的serverId
         * </pre>
         *
         * <code>int64 serverId = 5;</code>
         *
         * @return The serverId.
         */
        long getServerId();

        /**
         * <pre>
         * 源binlog的文件名称
         * </pre>
         *
         * <code>string fileName = 6;</code>
         *
         * @return The fileName.
         */
        java.lang.String getFileName();

        /**
         * <pre>
         * 源binlog的文件名称
         * </pre>
         *
         * <code>string fileName = 6;</code>
         *
         * @return The bytes for fileName.
         */
        com.google.protobuf.ByteString
        getFileNameBytes();

        /**
         * <pre>
         * 事件在源binlog文件中的偏移量
         * </pre>
         *
         * <code>uint64 position = 7;</code>
         *
         * @return The position.
         */
        long getPosition();

        /**
         * <pre>
         * 当前事务的gtid
         * </pre>
         *
         * <code>string gtid = 8;</code>
         *
         * @return The gtid.
         */
        java.lang.String getGtid();

        /**
         * <pre>
         * 当前事务的gtid
         * </pre>
         *
         * <code>string gtid = 8;</code>
         *
         * @return The bytes for gtid.
         */
        com.google.protobuf.ByteString
        getGtidBytes();

        /**
         * <pre>
         * 变更影响的schema
         * </pre>
         *
         * <code>string schemaName = 9;</code>
         *
         * @return The schemaName.
         */
        java.lang.String getSchemaName();

        /**
         * <pre>
         * 变更影响的schema
         * </pre>
         *
         * <code>string schemaName = 9;</code>
         *
         * @return The bytes for schemaName.
         */
        com.google.protobuf.ByteString
        getSchemaNameBytes();

        /**
         * <pre>
         * 变更影响table
         * </pre>
         *
         * <code>string tableName = 10;</code>
         *
         * @return The tableName.
         */
        java.lang.String getTableName();

        /**
         * <pre>
         * 变更影响table
         * </pre>
         *
         * <code>string tableName = 10;</code>
         *
         * @return The bytes for tableName.
         */
        com.google.protobuf.ByteString
        getTableNameBytes();

        /**
         * <pre>
         * 如果event分片，同一分片的seqId一致
         * </pre>
         *
         * <code>uint64 seqId = 11;</code>
         *
         * @return The seqId.
         */
        long getSeqId();

        /**
         * <pre>
         * 大的event分片，序号从0开始
         * </pre>
         *
         * <code>uint64 eventIndex = 12;</code>
         *
         * @return The eventIndex.
         */
        long getEventIndex();

        /**
         * <pre>
         * 当前event是不是event分片的最后一块，如果第一块也是最后一块，isLast为true
         * </pre>
         *
         * <code>bool isLast = 13;</code>
         *
         * @return The isLast.
         */
        boolean getIsLast();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair>
        getPropertiesList();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index);

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        int getPropertiesCount();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList();

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code subscribe.Header}
     */
    public static final class Header extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Header)
            HeaderOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Header.newBuilder() to construct.
        private Header(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Header() {
            sourceType_ = 0;
            messageType_ = 0;
            fileName_ = "";
            gtid_ = "";
            schemaName_ = "";
            tableName_ = "";
            properties_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Header();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Header(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            version_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();

                            sourceType_ = rawValue;
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();

                            messageType_ = rawValue;
                            break;
                        }
                        case 32: {

                            timestamp_ = input.readUInt32();
                            break;
                        }
                        case 40: {

                            serverId_ = input.readInt64();
                            break;
                        }
                        case 50: {
                            java.lang.String s = input.readStringRequireUtf8();

                            fileName_ = s;
                            break;
                        }
                        case 56: {

                            position_ = input.readUInt64();
                            break;
                        }
                        case 66: {
                            java.lang.String s = input.readStringRequireUtf8();

                            gtid_ = s;
                            break;
                        }
                        case 74: {
                            java.lang.String s = input.readStringRequireUtf8();

                            schemaName_ = s;
                            break;
                        }
                        case 82: {
                            java.lang.String s = input.readStringRequireUtf8();

                            tableName_ = s;
                            break;
                        }
                        case 88: {

                            seqId_ = input.readUInt64();
                            break;
                        }
                        case 96: {

                            eventIndex_ = input.readUInt64();
                            break;
                        }
                        case 104: {

                            isLast_ = input.readBool();
                            break;
                        }
                        case 122: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            properties_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.KVPair.parser(),
                                            extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    properties_ = java.util.Collections.unmodifiableList(properties_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Header_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Header_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Header.class,
                            com.tencent.subscribe.SubscribeDataProto.Header.Builder.class);
        }

        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;

        /**
         * <code>int32 version = 1;</code>
         *
         * @return The version.
         */
        public int getVersion() {
            return version_;
        }

        public static final int SOURCETYPE_FIELD_NUMBER = 2;
        private int sourceType_;

        /**
         * <pre>
         * 源库的类型信息，包括mysql，oracle等类型
         * </pre>
         *
         * <code>.subscribe.SourceType sourceType = 2;</code>
         *
         * @return The enum numeric value on the wire for sourceType.
         */
        public int getSourceTypeValue() {
            return sourceType_;
        }

        /**
         * <pre>
         * 源库的类型信息，包括mysql，oracle等类型
         * </pre>
         *
         * <code>.subscribe.SourceType sourceType = 2;</code>
         *
         * @return The sourceType.
         */
        public com.tencent.subscribe.SubscribeDataProto.SourceType getSourceType() {
            @SuppressWarnings("deprecation")
            com.tencent.subscribe.SubscribeDataProto.SourceType result = com.tencent.subscribe.SubscribeDataProto.SourceType.valueOf(
                    sourceType_);
            return result == null ? com.tencent.subscribe.SubscribeDataProto.SourceType.UNRECOGNIZED : result;
        }

        public static final int MESSAGETYPE_FIELD_NUMBER = 3;
        private int messageType_;

        /**
         * <pre>
         * 消息的类型
         * </pre>
         *
         * <code>.subscribe.MessageType messageType = 3;</code>
         *
         * @return The enum numeric value on the wire for messageType.
         */
        public int getMessageTypeValue() {
            return messageType_;
        }

        /**
         * <pre>
         * 消息的类型
         * </pre>
         *
         * <code>.subscribe.MessageType messageType = 3;</code>
         *
         * @return The messageType.
         */
        public com.tencent.subscribe.SubscribeDataProto.MessageType getMessageType() {
            @SuppressWarnings("deprecation")
            com.tencent.subscribe.SubscribeDataProto.MessageType result = com.tencent.subscribe.SubscribeDataProto.MessageType.valueOf(
                    messageType_);
            return result == null ? com.tencent.subscribe.SubscribeDataProto.MessageType.UNRECOGNIZED : result;
        }

        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private int timestamp_;

        /**
         * <pre>
         * Event在原始binlog中的时间戳
         * </pre>
         *
         * <code>uint32 timestamp = 4;</code>
         *
         * @return The timestamp.
         */
        public int getTimestamp() {
            return timestamp_;
        }

        public static final int SERVERID_FIELD_NUMBER = 5;
        private long serverId_;

        /**
         * <pre>
         * 源的serverId
         * </pre>
         *
         * <code>int64 serverId = 5;</code>
         *
         * @return The serverId.
         */
        public long getServerId() {
            return serverId_;
        }

        public static final int FILENAME_FIELD_NUMBER = 6;
        private volatile java.lang.Object fileName_;

        /**
         * <pre>
         * 源binlog的文件名称
         * </pre>
         *
         * <code>string fileName = 6;</code>
         *
         * @return The fileName.
         */
        public java.lang.String getFileName() {
            java.lang.Object ref = fileName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                fileName_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 源binlog的文件名称
         * </pre>
         *
         * <code>string fileName = 6;</code>
         *
         * @return The bytes for fileName.
         */
        public com.google.protobuf.ByteString
        getFileNameBytes() {
            java.lang.Object ref = fileName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                fileName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int POSITION_FIELD_NUMBER = 7;
        private long position_;

        /**
         * <pre>
         * 事件在源binlog文件中的偏移量
         * </pre>
         *
         * <code>uint64 position = 7;</code>
         *
         * @return The position.
         */
        public long getPosition() {
            return position_;
        }

        public static final int GTID_FIELD_NUMBER = 8;
        private volatile java.lang.Object gtid_;

        /**
         * <pre>
         * 当前事务的gtid
         * </pre>
         *
         * <code>string gtid = 8;</code>
         *
         * @return The gtid.
         */
        public java.lang.String getGtid() {
            java.lang.Object ref = gtid_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                gtid_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 当前事务的gtid
         * </pre>
         *
         * <code>string gtid = 8;</code>
         *
         * @return The bytes for gtid.
         */
        public com.google.protobuf.ByteString
        getGtidBytes() {
            java.lang.Object ref = gtid_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                gtid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SCHEMANAME_FIELD_NUMBER = 9;
        private volatile java.lang.Object schemaName_;

        /**
         * <pre>
         * 变更影响的schema
         * </pre>
         *
         * <code>string schemaName = 9;</code>
         *
         * @return The schemaName.
         */
        public java.lang.String getSchemaName() {
            java.lang.Object ref = schemaName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                schemaName_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 变更影响的schema
         * </pre>
         *
         * <code>string schemaName = 9;</code>
         *
         * @return The bytes for schemaName.
         */
        public com.google.protobuf.ByteString
        getSchemaNameBytes() {
            java.lang.Object ref = schemaName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                schemaName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int TABLENAME_FIELD_NUMBER = 10;
        private volatile java.lang.Object tableName_;

        /**
         * <pre>
         * 变更影响table
         * </pre>
         *
         * <code>string tableName = 10;</code>
         *
         * @return The tableName.
         */
        public java.lang.String getTableName() {
            java.lang.Object ref = tableName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                tableName_ = s;
                return s;
            }
        }

        /**
         * <pre>
         * 变更影响table
         * </pre>
         *
         * <code>string tableName = 10;</code>
         *
         * @return The bytes for tableName.
         */
        public com.google.protobuf.ByteString
        getTableNameBytes() {
            java.lang.Object ref = tableName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                tableName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SEQID_FIELD_NUMBER = 11;
        private long seqId_;

        /**
         * <pre>
         * 如果event分片，同一分片的seqId一致
         * </pre>
         *
         * <code>uint64 seqId = 11;</code>
         *
         * @return The seqId.
         */
        public long getSeqId() {
            return seqId_;
        }

        public static final int EVENTINDEX_FIELD_NUMBER = 12;
        private long eventIndex_;

        /**
         * <pre>
         * 大的event分片，序号从0开始
         * </pre>
         *
         * <code>uint64 eventIndex = 12;</code>
         *
         * @return The eventIndex.
         */
        public long getEventIndex() {
            return eventIndex_;
        }

        public static final int ISLAST_FIELD_NUMBER = 13;
        private boolean isLast_;

        /**
         * <pre>
         * 当前event是不是event分片的最后一块，如果第一块也是最后一块，isLast为true
         * </pre>
         *
         * <code>bool isLast = 13;</code>
         *
         * @return The isLast.
         */
        public boolean getIsLast() {
            return isLast_;
        }

        public static final int PROPERTIES_FIELD_NUMBER = 15;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_;

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
            return properties_;
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
        getPropertiesOrBuilderList() {
            return properties_;
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public int getPropertiesCount() {
            return properties_.size();
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
            return properties_.get(index);
        }

        /**
         * <code>repeated .subscribe.KVPair properties = 15;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                int index) {
            return properties_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (version_ != 0) {
                output.writeInt32(1, version_);
            }
            if (sourceType_ != com.tencent.subscribe.SubscribeDataProto.SourceType.ORACLE.getNumber()) {
                output.writeEnum(2, sourceType_);
            }
            if (messageType_ != com.tencent.subscribe.SubscribeDataProto.MessageType.BEGIN.getNumber()) {
                output.writeEnum(3, messageType_);
            }
            if (timestamp_ != 0) {
                output.writeUInt32(4, timestamp_);
            }
            if (serverId_ != 0L) {
                output.writeInt64(5, serverId_);
            }
            if (!getFileNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, fileName_);
            }
            if (position_ != 0L) {
                output.writeUInt64(7, position_);
            }
            if (!getGtidBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 8, gtid_);
            }
            if (!getSchemaNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 9, schemaName_);
            }
            if (!getTableNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 10, tableName_);
            }
            if (seqId_ != 0L) {
                output.writeUInt64(11, seqId_);
            }
            if (eventIndex_ != 0L) {
                output.writeUInt64(12, eventIndex_);
            }
            if (isLast_ != false) {
                output.writeBool(13, isLast_);
            }
            for (int i = 0; i < properties_.size(); i++) {
                output.writeMessage(15, properties_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (version_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, version_);
            }
            if (sourceType_ != com.tencent.subscribe.SubscribeDataProto.SourceType.ORACLE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(2, sourceType_);
            }
            if (messageType_ != com.tencent.subscribe.SubscribeDataProto.MessageType.BEGIN.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(3, messageType_);
            }
            if (timestamp_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, timestamp_);
            }
            if (serverId_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, serverId_);
            }
            if (!getFileNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, fileName_);
            }
            if (position_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(7, position_);
            }
            if (!getGtidBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, gtid_);
            }
            if (!getSchemaNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, schemaName_);
            }
            if (!getTableNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, tableName_);
            }
            if (seqId_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(11, seqId_);
            }
            if (eventIndex_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(12, eventIndex_);
            }
            if (isLast_ != false) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(13, isLast_);
            }
            for (int i = 0; i < properties_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(15, properties_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Header)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Header other = (com.tencent.subscribe.SubscribeDataProto.Header) obj;

            if (getVersion()
                    != other.getVersion()) {
                return false;
            }
            if (sourceType_ != other.sourceType_) {
                return false;
            }
            if (messageType_ != other.messageType_) {
                return false;
            }
            if (getTimestamp()
                    != other.getTimestamp()) {
                return false;
            }
            if (getServerId()
                    != other.getServerId()) {
                return false;
            }
            if (!getFileName()
                    .equals(other.getFileName())) {
                return false;
            }
            if (getPosition()
                    != other.getPosition()) {
                return false;
            }
            if (!getGtid()
                    .equals(other.getGtid())) {
                return false;
            }
            if (!getSchemaName()
                    .equals(other.getSchemaName())) {
                return false;
            }
            if (!getTableName()
                    .equals(other.getTableName())) {
                return false;
            }
            if (getSeqId()
                    != other.getSeqId()) {
                return false;
            }
            if (getEventIndex()
                    != other.getEventIndex()) {
                return false;
            }
            if (getIsLast()
                    != other.getIsLast()) {
                return false;
            }
            if (!getPropertiesList()
                    .equals(other.getPropertiesList())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + VERSION_FIELD_NUMBER;
            hash = (53 * hash) + getVersion();
            hash = (37 * hash) + SOURCETYPE_FIELD_NUMBER;
            hash = (53 * hash) + sourceType_;
            hash = (37 * hash) + MESSAGETYPE_FIELD_NUMBER;
            hash = (53 * hash) + messageType_;
            hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
            hash = (53 * hash) + getTimestamp();
            hash = (37 * hash) + SERVERID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getServerId());
            hash = (37 * hash) + FILENAME_FIELD_NUMBER;
            hash = (53 * hash) + getFileName().hashCode();
            hash = (37 * hash) + POSITION_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getPosition());
            hash = (37 * hash) + GTID_FIELD_NUMBER;
            hash = (53 * hash) + getGtid().hashCode();
            hash = (37 * hash) + SCHEMANAME_FIELD_NUMBER;
            hash = (53 * hash) + getSchemaName().hashCode();
            hash = (37 * hash) + TABLENAME_FIELD_NUMBER;
            hash = (53 * hash) + getTableName().hashCode();
            hash = (37 * hash) + SEQID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getSeqId());
            hash = (37 * hash) + EVENTINDEX_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getEventIndex());
            hash = (37 * hash) + ISLAST_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                    getIsLast());
            if (getPropertiesCount() > 0) {
                hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
                hash = (53 * hash) + getPropertiesList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Header prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Header}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Header)
                com.tencent.subscribe.SubscribeDataProto.HeaderOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Header_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Header_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Header.class,
                                com.tencent.subscribe.SubscribeDataProto.Header.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Header.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getPropertiesFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                version_ = 0;

                sourceType_ = 0;

                messageType_ = 0;

                timestamp_ = 0;

                serverId_ = 0L;

                fileName_ = "";

                position_ = 0L;

                gtid_ = "";

                schemaName_ = "";

                tableName_ = "";

                seqId_ = 0L;

                eventIndex_ = 0L;

                isLast_ = false;

                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Header_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Header getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Header.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Header build() {
                com.tencent.subscribe.SubscribeDataProto.Header result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Header buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Header result = new com.tencent.subscribe.SubscribeDataProto.Header(
                        this);
                int from_bitField0_ = bitField0_;
                result.version_ = version_;
                result.sourceType_ = sourceType_;
                result.messageType_ = messageType_;
                result.timestamp_ = timestamp_;
                result.serverId_ = serverId_;
                result.fileName_ = fileName_;
                result.position_ = position_;
                result.gtid_ = gtid_;
                result.schemaName_ = schemaName_;
                result.tableName_ = tableName_;
                result.seqId_ = seqId_;
                result.eventIndex_ = eventIndex_;
                result.isLast_ = isLast_;
                if (propertiesBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        properties_ = java.util.Collections.unmodifiableList(properties_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.properties_ = properties_;
                } else {
                    result.properties_ = propertiesBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Header) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Header) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Header other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Header.getDefaultInstance()) {
                    return this;
                }
                if (other.getVersion() != 0) {
                    setVersion(other.getVersion());
                }
                if (other.sourceType_ != 0) {
                    setSourceTypeValue(other.getSourceTypeValue());
                }
                if (other.messageType_ != 0) {
                    setMessageTypeValue(other.getMessageTypeValue());
                }
                if (other.getTimestamp() != 0) {
                    setTimestamp(other.getTimestamp());
                }
                if (other.getServerId() != 0L) {
                    setServerId(other.getServerId());
                }
                if (!other.getFileName().isEmpty()) {
                    fileName_ = other.fileName_;
                    onChanged();
                }
                if (other.getPosition() != 0L) {
                    setPosition(other.getPosition());
                }
                if (!other.getGtid().isEmpty()) {
                    gtid_ = other.gtid_;
                    onChanged();
                }
                if (!other.getSchemaName().isEmpty()) {
                    schemaName_ = other.schemaName_;
                    onChanged();
                }
                if (!other.getTableName().isEmpty()) {
                    tableName_ = other.tableName_;
                    onChanged();
                }
                if (other.getSeqId() != 0L) {
                    setSeqId(other.getSeqId());
                }
                if (other.getEventIndex() != 0L) {
                    setEventIndex(other.getEventIndex());
                }
                if (other.getIsLast() != false) {
                    setIsLast(other.getIsLast());
                }
                if (propertiesBuilder_ == null) {
                    if (!other.properties_.isEmpty()) {
                        if (properties_.isEmpty()) {
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensurePropertiesIsMutable();
                            properties_.addAll(other.properties_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.properties_.isEmpty()) {
                        if (propertiesBuilder_.isEmpty()) {
                            propertiesBuilder_.dispose();
                            propertiesBuilder_ = null;
                            properties_ = other.properties_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            propertiesBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getPropertiesFieldBuilder() : null;
                        } else {
                            propertiesBuilder_.addAllMessages(other.properties_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Header parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Header) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private int version_;

            /**
             * <code>int32 version = 1;</code>
             *
             * @return The version.
             */
            public int getVersion() {
                return version_;
            }

            /**
             * <code>int32 version = 1;</code>
             *
             * @param value The version to set.
             * @return This builder for chaining.
             */
            public Builder setVersion(int value) {

                version_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 version = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearVersion() {

                version_ = 0;
                onChanged();
                return this;
            }

            private int sourceType_ = 0;

            /**
             * <pre>
             * 源库的类型信息，包括mysql，oracle等类型
             * </pre>
             *
             * <code>.subscribe.SourceType sourceType = 2;</code>
             *
             * @return The enum numeric value on the wire for sourceType.
             */
            public int getSourceTypeValue() {
                return sourceType_;
            }

            /**
             * <pre>
             * 源库的类型信息，包括mysql，oracle等类型
             * </pre>
             *
             * <code>.subscribe.SourceType sourceType = 2;</code>
             *
             * @param value The enum numeric value on the wire for sourceType to set.
             * @return This builder for chaining.
             */
            public Builder setSourceTypeValue(int value) {
                sourceType_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源库的类型信息，包括mysql，oracle等类型
             * </pre>
             *
             * <code>.subscribe.SourceType sourceType = 2;</code>
             *
             * @return The sourceType.
             */
            public com.tencent.subscribe.SubscribeDataProto.SourceType getSourceType() {
                @SuppressWarnings("deprecation")
                com.tencent.subscribe.SubscribeDataProto.SourceType result = com.tencent.subscribe.SubscribeDataProto.SourceType.valueOf(
                        sourceType_);
                return result == null ? com.tencent.subscribe.SubscribeDataProto.SourceType.UNRECOGNIZED : result;
            }

            /**
             * <pre>
             * 源库的类型信息，包括mysql，oracle等类型
             * </pre>
             *
             * <code>.subscribe.SourceType sourceType = 2;</code>
             *
             * @param value The sourceType to set.
             * @return This builder for chaining.
             */
            public Builder setSourceType(com.tencent.subscribe.SubscribeDataProto.SourceType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                sourceType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源库的类型信息，包括mysql，oracle等类型
             * </pre>
             *
             * <code>.subscribe.SourceType sourceType = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSourceType() {

                sourceType_ = 0;
                onChanged();
                return this;
            }

            private int messageType_ = 0;

            /**
             * <pre>
             * 消息的类型
             * </pre>
             *
             * <code>.subscribe.MessageType messageType = 3;</code>
             *
             * @return The enum numeric value on the wire for messageType.
             */
            public int getMessageTypeValue() {
                return messageType_;
            }

            /**
             * <pre>
             * 消息的类型
             * </pre>
             *
             * <code>.subscribe.MessageType messageType = 3;</code>
             *
             * @param value The enum numeric value on the wire for messageType to set.
             * @return This builder for chaining.
             */
            public Builder setMessageTypeValue(int value) {
                messageType_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 消息的类型
             * </pre>
             *
             * <code>.subscribe.MessageType messageType = 3;</code>
             *
             * @return The messageType.
             */
            public com.tencent.subscribe.SubscribeDataProto.MessageType getMessageType() {
                @SuppressWarnings("deprecation")
                com.tencent.subscribe.SubscribeDataProto.MessageType result = com.tencent.subscribe.SubscribeDataProto.MessageType.valueOf(
                        messageType_);
                return result == null ? com.tencent.subscribe.SubscribeDataProto.MessageType.UNRECOGNIZED : result;
            }

            /**
             * <pre>
             * 消息的类型
             * </pre>
             *
             * <code>.subscribe.MessageType messageType = 3;</code>
             *
             * @param value The messageType to set.
             * @return This builder for chaining.
             */
            public Builder setMessageType(com.tencent.subscribe.SubscribeDataProto.MessageType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                messageType_ = value.getNumber();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 消息的类型
             * </pre>
             *
             * <code>.subscribe.MessageType messageType = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMessageType() {

                messageType_ = 0;
                onChanged();
                return this;
            }

            private int timestamp_;

            /**
             * <pre>
             * Event在原始binlog中的时间戳
             * </pre>
             *
             * <code>uint32 timestamp = 4;</code>
             *
             * @return The timestamp.
             */
            public int getTimestamp() {
                return timestamp_;
            }

            /**
             * <pre>
             * Event在原始binlog中的时间戳
             * </pre>
             *
             * <code>uint32 timestamp = 4;</code>
             *
             * @param value The timestamp to set.
             * @return This builder for chaining.
             */
            public Builder setTimestamp(int value) {

                timestamp_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * Event在原始binlog中的时间戳
             * </pre>
             *
             * <code>uint32 timestamp = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTimestamp() {

                timestamp_ = 0;
                onChanged();
                return this;
            }

            private long serverId_;

            /**
             * <pre>
             * 源的serverId
             * </pre>
             *
             * <code>int64 serverId = 5;</code>
             *
             * @return The serverId.
             */
            public long getServerId() {
                return serverId_;
            }

            /**
             * <pre>
             * 源的serverId
             * </pre>
             *
             * <code>int64 serverId = 5;</code>
             *
             * @param value The serverId to set.
             * @return This builder for chaining.
             */
            public Builder setServerId(long value) {

                serverId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源的serverId
             * </pre>
             *
             * <code>int64 serverId = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearServerId() {

                serverId_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object fileName_ = "";

            /**
             * <pre>
             * 源binlog的文件名称
             * </pre>
             *
             * <code>string fileName = 6;</code>
             *
             * @return The fileName.
             */
            public java.lang.String getFileName() {
                java.lang.Object ref = fileName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    fileName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 源binlog的文件名称
             * </pre>
             *
             * <code>string fileName = 6;</code>
             *
             * @return The bytes for fileName.
             */
            public com.google.protobuf.ByteString
            getFileNameBytes() {
                java.lang.Object ref = fileName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    fileName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 源binlog的文件名称
             * </pre>
             *
             * <code>string fileName = 6;</code>
             *
             * @param value The fileName to set.
             * @return This builder for chaining.
             */
            public Builder setFileName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                fileName_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源binlog的文件名称
             * </pre>
             *
             * <code>string fileName = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFileName() {

                fileName_ = getDefaultInstance().getFileName();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 源binlog的文件名称
             * </pre>
             *
             * <code>string fileName = 6;</code>
             *
             * @param value The bytes for fileName to set.
             * @return This builder for chaining.
             */
            public Builder setFileNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                fileName_ = value;
                onChanged();
                return this;
            }

            private long position_;

            /**
             * <pre>
             * 事件在源binlog文件中的偏移量
             * </pre>
             *
             * <code>uint64 position = 7;</code>
             *
             * @return The position.
             */
            public long getPosition() {
                return position_;
            }

            /**
             * <pre>
             * 事件在源binlog文件中的偏移量
             * </pre>
             *
             * <code>uint64 position = 7;</code>
             *
             * @param value The position to set.
             * @return This builder for chaining.
             */
            public Builder setPosition(long value) {

                position_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 事件在源binlog文件中的偏移量
             * </pre>
             *
             * <code>uint64 position = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPosition() {

                position_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object gtid_ = "";

            /**
             * <pre>
             * 当前事务的gtid
             * </pre>
             *
             * <code>string gtid = 8;</code>
             *
             * @return The gtid.
             */
            public java.lang.String getGtid() {
                java.lang.Object ref = gtid_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    gtid_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 当前事务的gtid
             * </pre>
             *
             * <code>string gtid = 8;</code>
             *
             * @return The bytes for gtid.
             */
            public com.google.protobuf.ByteString
            getGtidBytes() {
                java.lang.Object ref = gtid_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    gtid_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 当前事务的gtid
             * </pre>
             *
             * <code>string gtid = 8;</code>
             *
             * @param value The gtid to set.
             * @return This builder for chaining.
             */
            public Builder setGtid(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                gtid_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 当前事务的gtid
             * </pre>
             *
             * <code>string gtid = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGtid() {

                gtid_ = getDefaultInstance().getGtid();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 当前事务的gtid
             * </pre>
             *
             * <code>string gtid = 8;</code>
             *
             * @param value The bytes for gtid to set.
             * @return This builder for chaining.
             */
            public Builder setGtidBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                gtid_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object schemaName_ = "";

            /**
             * <pre>
             * 变更影响的schema
             * </pre>
             *
             * <code>string schemaName = 9;</code>
             *
             * @return The schemaName.
             */
            public java.lang.String getSchemaName() {
                java.lang.Object ref = schemaName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    schemaName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 变更影响的schema
             * </pre>
             *
             * <code>string schemaName = 9;</code>
             *
             * @return The bytes for schemaName.
             */
            public com.google.protobuf.ByteString
            getSchemaNameBytes() {
                java.lang.Object ref = schemaName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    schemaName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 变更影响的schema
             * </pre>
             *
             * <code>string schemaName = 9;</code>
             *
             * @param value The schemaName to set.
             * @return This builder for chaining.
             */
            public Builder setSchemaName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                schemaName_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 变更影响的schema
             * </pre>
             *
             * <code>string schemaName = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSchemaName() {

                schemaName_ = getDefaultInstance().getSchemaName();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 变更影响的schema
             * </pre>
             *
             * <code>string schemaName = 9;</code>
             *
             * @param value The bytes for schemaName to set.
             * @return This builder for chaining.
             */
            public Builder setSchemaNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                schemaName_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object tableName_ = "";

            /**
             * <pre>
             * 变更影响table
             * </pre>
             *
             * <code>string tableName = 10;</code>
             *
             * @return The tableName.
             */
            public java.lang.String getTableName() {
                java.lang.Object ref = tableName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    tableName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <pre>
             * 变更影响table
             * </pre>
             *
             * <code>string tableName = 10;</code>
             *
             * @return The bytes for tableName.
             */
            public com.google.protobuf.ByteString
            getTableNameBytes() {
                java.lang.Object ref = tableName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    tableName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <pre>
             * 变更影响table
             * </pre>
             *
             * <code>string tableName = 10;</code>
             *
             * @param value The tableName to set.
             * @return This builder for chaining.
             */
            public Builder setTableName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                tableName_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 变更影响table
             * </pre>
             *
             * <code>string tableName = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTableName() {

                tableName_ = getDefaultInstance().getTableName();
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 变更影响table
             * </pre>
             *
             * <code>string tableName = 10;</code>
             *
             * @param value The bytes for tableName to set.
             * @return This builder for chaining.
             */
            public Builder setTableNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                tableName_ = value;
                onChanged();
                return this;
            }

            private long seqId_;

            /**
             * <pre>
             * 如果event分片，同一分片的seqId一致
             * </pre>
             *
             * <code>uint64 seqId = 11;</code>
             *
             * @return The seqId.
             */
            public long getSeqId() {
                return seqId_;
            }

            /**
             * <pre>
             * 如果event分片，同一分片的seqId一致
             * </pre>
             *
             * <code>uint64 seqId = 11;</code>
             *
             * @param value The seqId to set.
             * @return This builder for chaining.
             */
            public Builder setSeqId(long value) {

                seqId_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 如果event分片，同一分片的seqId一致
             * </pre>
             *
             * <code>uint64 seqId = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSeqId() {

                seqId_ = 0L;
                onChanged();
                return this;
            }

            private long eventIndex_;

            /**
             * <pre>
             * 大的event分片，序号从0开始
             * </pre>
             *
             * <code>uint64 eventIndex = 12;</code>
             *
             * @return The eventIndex.
             */
            public long getEventIndex() {
                return eventIndex_;
            }

            /**
             * <pre>
             * 大的event分片，序号从0开始
             * </pre>
             *
             * <code>uint64 eventIndex = 12;</code>
             *
             * @param value The eventIndex to set.
             * @return This builder for chaining.
             */
            public Builder setEventIndex(long value) {

                eventIndex_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 大的event分片，序号从0开始
             * </pre>
             *
             * <code>uint64 eventIndex = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEventIndex() {

                eventIndex_ = 0L;
                onChanged();
                return this;
            }

            private boolean isLast_;

            /**
             * <pre>
             * 当前event是不是event分片的最后一块，如果第一块也是最后一块，isLast为true
             * </pre>
             *
             * <code>bool isLast = 13;</code>
             *
             * @return The isLast.
             */
            public boolean getIsLast() {
                return isLast_;
            }

            /**
             * <pre>
             * 当前event是不是event分片的最后一块，如果第一块也是最后一块，isLast为true
             * </pre>
             *
             * <code>bool isLast = 13;</code>
             *
             * @param value The isLast to set.
             * @return This builder for chaining.
             */
            public Builder setIsLast(boolean value) {

                isLast_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 当前event是不是event分片的最后一块，如果第一块也是最后一块，isLast为true
             * </pre>
             *
             * <code>bool isLast = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsLast() {

                isLast_ = false;
                onChanged();
                return this;
            }

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> properties_ =
                    java.util.Collections.emptyList();

            private void ensurePropertiesIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    properties_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.KVPair>(properties_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder> propertiesBuilder_;

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair> getPropertiesList() {
                if (propertiesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(properties_);
                } else {
                    return propertiesBuilder_.getMessageList();
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public int getPropertiesCount() {
                if (propertiesBuilder_ == null) {
                    return properties_.size();
                } else {
                    return propertiesBuilder_.getCount();
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair getProperties(int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessage(index);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.set(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder setProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair value) {
                if (propertiesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensurePropertiesIsMutable();
                    properties_.add(index, value);
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addProperties(
                    int index, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder builderForValue) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    propertiesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder addAllProperties(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.KVPair> values) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, properties_);
                    onChanged();
                } else {
                    propertiesBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder clearProperties() {
                if (propertiesBuilder_ == null) {
                    properties_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    propertiesBuilder_.clear();
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public Builder removeProperties(int index) {
                if (propertiesBuilder_ == null) {
                    ensurePropertiesIsMutable();
                    properties_.remove(index);
                    onChanged();
                } else {
                    propertiesBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder getPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().getBuilder(index);
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder getPropertiesOrBuilder(
                    int index) {
                if (propertiesBuilder_ == null) {
                    return properties_.get(index);
                } else {
                    return propertiesBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesOrBuilderList() {
                if (propertiesBuilder_ != null) {
                    return propertiesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(properties_);
                }
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder() {
                return getPropertiesFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.KVPair.Builder addPropertiesBuilder(
                    int index) {
                return getPropertiesFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance());
            }

            /**
             * <code>repeated .subscribe.KVPair properties = 15;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.KVPair.Builder>
            getPropertiesBuilderList() {
                return getPropertiesFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>
            getPropertiesFieldBuilder() {
                if (propertiesBuilder_ == null) {
                    propertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.KVPair, com.tencent.subscribe.SubscribeDataProto.KVPair.Builder, com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder>(
                            properties_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    properties_ = null;
                }
                return propertiesBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Header)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Header)
        private static final com.tencent.subscribe.SubscribeDataProto.Header DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Header();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Header getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Header>
                PARSER = new com.google.protobuf.AbstractParser<Header>() {
            @java.lang.Override
            public Header parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Header(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Header> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Header> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Header getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface KVPairOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.KVPair)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string key = 1;</code>
         *
         * @return The key.
         */
        java.lang.String getKey();

        /**
         * <code>string key = 1;</code>
         *
         * @return The bytes for key.
         */
        com.google.protobuf.ByteString
        getKeyBytes();

        /**
         * <code>string value = 2;</code>
         *
         * @return The value.
         */
        java.lang.String getValue();

        /**
         * <code>string value = 2;</code>
         *
         * @return The bytes for value.
         */
        com.google.protobuf.ByteString
        getValueBytes();
    }

    /**
     * Protobuf type {@code subscribe.KVPair}
     */
    public static final class KVPair extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.KVPair)
            KVPairOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use KVPair.newBuilder() to construct.
        private KVPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private KVPair() {
            key_ = "";
            value_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new KVPair();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private KVPair(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            key_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            value_ = s;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_KVPair_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_KVPair_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.KVPair.class,
                            com.tencent.subscribe.SubscribeDataProto.KVPair.Builder.class);
        }

        public static final int KEY_FIELD_NUMBER = 1;
        private volatile java.lang.Object key_;

        /**
         * <code>string key = 1;</code>
         *
         * @return The key.
         */
        public java.lang.String getKey() {
            java.lang.Object ref = key_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                key_ = s;
                return s;
            }
        }

        /**
         * <code>string key = 1;</code>
         *
         * @return The bytes for key.
         */
        public com.google.protobuf.ByteString
        getKeyBytes() {
            java.lang.Object ref = key_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                key_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int VALUE_FIELD_NUMBER = 2;
        private volatile java.lang.Object value_;

        /**
         * <code>string value = 2;</code>
         *
         * @return The value.
         */
        public java.lang.String getValue() {
            java.lang.Object ref = value_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                value_ = s;
                return s;
            }
        }

        /**
         * <code>string value = 2;</code>
         *
         * @return The bytes for value.
         */
        public com.google.protobuf.ByteString
        getValueBytes() {
            java.lang.Object ref = value_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                value_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getKeyBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
            }
            if (!getValueBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (!getKeyBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
            }
            if (!getValueBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.KVPair)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.KVPair other = (com.tencent.subscribe.SubscribeDataProto.KVPair) obj;

            if (!getKey()
                    .equals(other.getKey())) {
                return false;
            }
            if (!getValue()
                    .equals(other.getValue())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + KEY_FIELD_NUMBER;
            hash = (53 * hash) + getKey().hashCode();
            hash = (37 * hash) + VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getValue().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.KVPair prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.KVPair}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.KVPair)
                com.tencent.subscribe.SubscribeDataProto.KVPairOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_KVPair_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_KVPair_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.KVPair.class,
                                com.tencent.subscribe.SubscribeDataProto.KVPair.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.KVPair.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                key_ = "";

                value_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_KVPair_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.KVPair getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.KVPair build() {
                com.tencent.subscribe.SubscribeDataProto.KVPair result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.KVPair buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.KVPair result = new com.tencent.subscribe.SubscribeDataProto.KVPair(
                        this);
                result.key_ = key_;
                result.value_ = value_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.KVPair) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.KVPair) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.KVPair other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.KVPair.getDefaultInstance()) {
                    return this;
                }
                if (!other.getKey().isEmpty()) {
                    key_ = other.key_;
                    onChanged();
                }
                if (!other.getValue().isEmpty()) {
                    value_ = other.value_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.KVPair parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.KVPair) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object key_ = "";

            /**
             * <code>string key = 1;</code>
             *
             * @return The key.
             */
            public java.lang.String getKey() {
                java.lang.Object ref = key_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    key_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string key = 1;</code>
             *
             * @return The bytes for key.
             */
            public com.google.protobuf.ByteString
            getKeyBytes() {
                java.lang.Object ref = key_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    key_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string key = 1;</code>
             *
             * @param value The key to set.
             * @return This builder for chaining.
             */
            public Builder setKey(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                key_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string key = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearKey() {

                key_ = getDefaultInstance().getKey();
                onChanged();
                return this;
            }

            /**
             * <code>string key = 1;</code>
             *
             * @param value The bytes for key to set.
             * @return This builder for chaining.
             */
            public Builder setKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                key_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object value_ = "";

            /**
             * <code>string value = 2;</code>
             *
             * @return The value.
             */
            public java.lang.String getValue() {
                java.lang.Object ref = value_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    value_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string value = 2;</code>
             *
             * @return The bytes for value.
             */
            public com.google.protobuf.ByteString
            getValueBytes() {
                java.lang.Object ref = value_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string value = 2;</code>
             *
             * @param value The value to set.
             * @return This builder for chaining.
             */
            public Builder setValue(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                value_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string value = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearValue() {

                value_ = getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            /**
             * <code>string value = 2;</code>
             *
             * @param value The bytes for value to set.
             * @return This builder for chaining.
             */
            public Builder setValueBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                value_ = value;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.KVPair)
        }

        // @@protoc_insertion_point(class_scope:subscribe.KVPair)
        private static final com.tencent.subscribe.SubscribeDataProto.KVPair DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.KVPair();
        }

        public static com.tencent.subscribe.SubscribeDataProto.KVPair getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<KVPair>
                PARSER = new com.google.protobuf.AbstractParser<KVPair>() {
            @java.lang.Override
            public KVPair parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new KVPair(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<KVPair> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<KVPair> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.KVPair getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EnvelopeOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Envelope)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * protocol version, 决定了data内容如何解码
         * </pre>
         *
         * <code>int32 version = 1;</code>
         *
         * @return The version.
         */
        int getVersion();

        /**
         * <code>uint32 total = 2;</code>
         *
         * @return The total.
         */
        int getTotal();

        /**
         * <code>uint32 index = 3;</code>
         *
         * @return The index.
         */
        int getIndex();

        /**
         * <pre>
         * 当前version为0, 表示data中数据为Entries被PB序列化之后的结果, 通过PB反序列化可以得到一个Entries对象。
         * </pre>
         *
         * <code>bytes data = 4;</code>
         *
         * @return The data.
         */
        com.google.protobuf.ByteString getData();
    }

    /**
     * Protobuf type {@code subscribe.Envelope}
     */
    public static final class Envelope extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Envelope)
            EnvelopeOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Envelope.newBuilder() to construct.
        private Envelope(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Envelope() {
            data_ = com.google.protobuf.ByteString.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Envelope();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Envelope(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8: {

                            version_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            total_ = input.readUInt32();
                            break;
                        }
                        case 24: {

                            index_ = input.readUInt32();
                            break;
                        }
                        case 34: {

                            data_ = input.readBytes();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Envelope_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Envelope_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Envelope.class,
                            com.tencent.subscribe.SubscribeDataProto.Envelope.Builder.class);
        }

        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;

        /**
         * <pre>
         * protocol version, 决定了data内容如何解码
         * </pre>
         *
         * <code>int32 version = 1;</code>
         *
         * @return The version.
         */
        public int getVersion() {
            return version_;
        }

        public static final int TOTAL_FIELD_NUMBER = 2;
        private int total_;

        /**
         * <code>uint32 total = 2;</code>
         *
         * @return The total.
         */
        public int getTotal() {
            return total_;
        }

        public static final int INDEX_FIELD_NUMBER = 3;
        private int index_;

        /**
         * <code>uint32 index = 3;</code>
         *
         * @return The index.
         */
        public int getIndex() {
            return index_;
        }

        public static final int DATA_FIELD_NUMBER = 4;
        private com.google.protobuf.ByteString data_;

        /**
         * <pre>
         * 当前version为0, 表示data中数据为Entries被PB序列化之后的结果, 通过PB反序列化可以得到一个Entries对象。
         * </pre>
         *
         * <code>bytes data = 4;</code>
         *
         * @return The data.
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (version_ != 0) {
                output.writeInt32(1, version_);
            }
            if (total_ != 0) {
                output.writeUInt32(2, total_);
            }
            if (index_ != 0) {
                output.writeUInt32(3, index_);
            }
            if (!data_.isEmpty()) {
                output.writeBytes(4, data_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (version_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, version_);
            }
            if (total_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, total_);
            }
            if (index_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, index_);
            }
            if (!data_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, data_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Envelope)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Envelope other = (com.tencent.subscribe.SubscribeDataProto.Envelope) obj;

            if (getVersion()
                    != other.getVersion()) {
                return false;
            }
            if (getTotal()
                    != other.getTotal()) {
                return false;
            }
            if (getIndex()
                    != other.getIndex()) {
                return false;
            }
            if (!getData()
                    .equals(other.getData())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + VERSION_FIELD_NUMBER;
            hash = (53 * hash) + getVersion();
            hash = (37 * hash) + TOTAL_FIELD_NUMBER;
            hash = (53 * hash) + getTotal();
            hash = (37 * hash) + INDEX_FIELD_NUMBER;
            hash = (53 * hash) + getIndex();
            hash = (37 * hash) + DATA_FIELD_NUMBER;
            hash = (53 * hash) + getData().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Envelope prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Envelope}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Envelope)
                com.tencent.subscribe.SubscribeDataProto.EnvelopeOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Envelope_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Envelope_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Envelope.class,
                                com.tencent.subscribe.SubscribeDataProto.Envelope.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Envelope.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                version_ = 0;

                total_ = 0;

                index_ = 0;

                data_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Envelope_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Envelope getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Envelope.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Envelope build() {
                com.tencent.subscribe.SubscribeDataProto.Envelope result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Envelope buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Envelope result = new com.tencent.subscribe.SubscribeDataProto.Envelope(
                        this);
                result.version_ = version_;
                result.total_ = total_;
                result.index_ = index_;
                result.data_ = data_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Envelope) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Envelope) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Envelope other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Envelope.getDefaultInstance()) {
                    return this;
                }
                if (other.getVersion() != 0) {
                    setVersion(other.getVersion());
                }
                if (other.getTotal() != 0) {
                    setTotal(other.getTotal());
                }
                if (other.getIndex() != 0) {
                    setIndex(other.getIndex());
                }
                if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
                    setData(other.getData());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Envelope parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Envelope) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int version_;

            /**
             * <pre>
             * protocol version, 决定了data内容如何解码
             * </pre>
             *
             * <code>int32 version = 1;</code>
             *
             * @return The version.
             */
            public int getVersion() {
                return version_;
            }

            /**
             * <pre>
             * protocol version, 决定了data内容如何解码
             * </pre>
             *
             * <code>int32 version = 1;</code>
             *
             * @param value The version to set.
             * @return This builder for chaining.
             */
            public Builder setVersion(int value) {

                version_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * protocol version, 决定了data内容如何解码
             * </pre>
             *
             * <code>int32 version = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearVersion() {

                version_ = 0;
                onChanged();
                return this;
            }

            private int total_;

            /**
             * <code>uint32 total = 2;</code>
             *
             * @return The total.
             */
            public int getTotal() {
                return total_;
            }

            /**
             * <code>uint32 total = 2;</code>
             *
             * @param value The total to set.
             * @return This builder for chaining.
             */
            public Builder setTotal(int value) {

                total_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 total = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTotal() {

                total_ = 0;
                onChanged();
                return this;
            }

            private int index_;

            /**
             * <code>uint32 index = 3;</code>
             *
             * @return The index.
             */
            public int getIndex() {
                return index_;
            }

            /**
             * <code>uint32 index = 3;</code>
             *
             * @param value The index to set.
             * @return This builder for chaining.
             */
            public Builder setIndex(int value) {

                index_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 index = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIndex() {

                index_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

            /**
             * <pre>
             * 当前version为0, 表示data中数据为Entries被PB序列化之后的结果, 通过PB反序列化可以得到一个Entries对象。
             * </pre>
             *
             * <code>bytes data = 4;</code>
             *
             * @return The data.
             */
            public com.google.protobuf.ByteString getData() {
                return data_;
            }

            /**
             * <pre>
             * 当前version为0, 表示data中数据为Entries被PB序列化之后的结果, 通过PB反序列化可以得到一个Entries对象。
             * </pre>
             *
             * <code>bytes data = 4;</code>
             *
             * @param value The data to set.
             * @return This builder for chaining.
             */
            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                data_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 当前version为0, 表示data中数据为Entries被PB序列化之后的结果, 通过PB反序列化可以得到一个Entries对象。
             * </pre>
             *
             * <code>bytes data = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearData() {

                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Envelope)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Envelope)
        private static final com.tencent.subscribe.SubscribeDataProto.Envelope DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Envelope();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Envelope getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Envelope>
                PARSER = new com.google.protobuf.AbstractParser<Envelope>() {
            @java.lang.Override
            public Envelope parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Envelope(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Envelope> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Envelope> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Envelope getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface EntriesOrBuilder extends
            // @@protoc_insertion_point(interface_extends:subscribe.Entries)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        java.util.List<com.tencent.subscribe.SubscribeDataProto.Entry>
        getItemsList();

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.Entry getItems(int index);

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        int getItemsCount();

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder>
        getItemsOrBuilderList();

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder getItemsOrBuilder(
                int index);
    }

    /**
     * Protobuf type {@code subscribe.Entries}
     */
    public static final class Entries extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:subscribe.Entries)
            EntriesOrBuilder {

        private static final long serialVersionUID = 0L;

        // Use Entries.newBuilder() to construct.
        private Entries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Entries() {
            items_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Entries();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private Entries(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                items_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Entry>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            items_.add(
                                    input.readMessage(com.tencent.subscribe.SubscribeDataProto.Entry.parser(),
                                            extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    items_ = java.util.Collections.unmodifiableList(items_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entries_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entries_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.tencent.subscribe.SubscribeDataProto.Entries.class,
                            com.tencent.subscribe.SubscribeDataProto.Entries.Builder.class);
        }

        public static final int ITEMS_FIELD_NUMBER = 1;
        private java.util.List<com.tencent.subscribe.SubscribeDataProto.Entry> items_;

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        public java.util.List<com.tencent.subscribe.SubscribeDataProto.Entry> getItemsList() {
            return items_;
        }

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder>
        getItemsOrBuilderList() {
            return items_;
        }

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        public int getItemsCount() {
            return items_.size();
        }

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.Entry getItems(int index) {
            return items_.get(index);
        }

        /**
         * <pre>
         * entry list
         * </pre>
         *
         * <code>repeated .subscribe.Entry items = 1;</code>
         */
        public com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder getItemsOrBuilder(
                int index) {
            return items_.get(index);
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < items_.size(); i++) {
                output.writeMessage(1, items_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            for (int i = 0; i < items_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, items_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.tencent.subscribe.SubscribeDataProto.Entries)) {
                return super.equals(obj);
            }
            com.tencent.subscribe.SubscribeDataProto.Entries other = (com.tencent.subscribe.SubscribeDataProto.Entries) obj;

            if (!getItemsList()
                    .equals(other.getItemsList())) {
                return false;
            }
            if (!unknownFields.equals(other.unknownFields)) {
                return false;
            }
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getItemsCount() > 0) {
                hash = (37 * hash) + ITEMS_FIELD_NUMBER;
                hash = (53 * hash) + getItemsList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.tencent.subscribe.SubscribeDataProto.Entries prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code subscribe.Entries}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:subscribe.Entries)
                com.tencent.subscribe.SubscribeDataProto.EntriesOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entries_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entries_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.tencent.subscribe.SubscribeDataProto.Entries.class,
                                com.tencent.subscribe.SubscribeDataProto.Entries.Builder.class);
            }

            // Construct using com.tencent.subscribe.SubscribeDataProto.Entries.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getItemsFieldBuilder();
                }
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (itemsBuilder_ == null) {
                    items_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    itemsBuilder_.clear();
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.tencent.subscribe.SubscribeDataProto.internal_static_subscribe_Entries_descriptor;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Entries getDefaultInstanceForType() {
                return com.tencent.subscribe.SubscribeDataProto.Entries.getDefaultInstance();
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Entries build() {
                com.tencent.subscribe.SubscribeDataProto.Entries result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.tencent.subscribe.SubscribeDataProto.Entries buildPartial() {
                com.tencent.subscribe.SubscribeDataProto.Entries result = new com.tencent.subscribe.SubscribeDataProto.Entries(
                        this);
                int from_bitField0_ = bitField0_;
                if (itemsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        items_ = java.util.Collections.unmodifiableList(items_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.items_ = items_;
                } else {
                    result.items_ = itemsBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.tencent.subscribe.SubscribeDataProto.Entries) {
                    return mergeFrom((com.tencent.subscribe.SubscribeDataProto.Entries) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.tencent.subscribe.SubscribeDataProto.Entries other) {
                if (other == com.tencent.subscribe.SubscribeDataProto.Entries.getDefaultInstance()) {
                    return this;
                }
                if (itemsBuilder_ == null) {
                    if (!other.items_.isEmpty()) {
                        if (items_.isEmpty()) {
                            items_ = other.items_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureItemsIsMutable();
                            items_.addAll(other.items_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.items_.isEmpty()) {
                        if (itemsBuilder_.isEmpty()) {
                            itemsBuilder_.dispose();
                            itemsBuilder_ = null;
                            items_ = other.items_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            itemsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getItemsFieldBuilder() : null;
                        } else {
                            itemsBuilder_.addAllMessages(other.items_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.tencent.subscribe.SubscribeDataProto.Entries parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.tencent.subscribe.SubscribeDataProto.Entries) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private java.util.List<com.tencent.subscribe.SubscribeDataProto.Entry> items_ =
                    java.util.Collections.emptyList();

            private void ensureItemsIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    items_ = new java.util.ArrayList<com.tencent.subscribe.SubscribeDataProto.Entry>(items_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Entry, com.tencent.subscribe.SubscribeDataProto.Entry.Builder, com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder> itemsBuilder_;

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Entry> getItemsList() {
                if (itemsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(items_);
                } else {
                    return itemsBuilder_.getMessageList();
                }
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public int getItemsCount() {
                if (itemsBuilder_ == null) {
                    return items_.size();
                } else {
                    return itemsBuilder_.getCount();
                }
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Entry getItems(int index) {
                if (itemsBuilder_ == null) {
                    return items_.get(index);
                } else {
                    return itemsBuilder_.getMessage(index);
                }
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder setItems(
                    int index, com.tencent.subscribe.SubscribeDataProto.Entry value) {
                if (itemsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureItemsIsMutable();
                    items_.set(index, value);
                    onChanged();
                } else {
                    itemsBuilder_.setMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder setItems(
                    int index, com.tencent.subscribe.SubscribeDataProto.Entry.Builder builderForValue) {
                if (itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    items_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    itemsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder addItems(com.tencent.subscribe.SubscribeDataProto.Entry value) {
                if (itemsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureItemsIsMutable();
                    items_.add(value);
                    onChanged();
                } else {
                    itemsBuilder_.addMessage(value);
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder addItems(
                    int index, com.tencent.subscribe.SubscribeDataProto.Entry value) {
                if (itemsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureItemsIsMutable();
                    items_.add(index, value);
                    onChanged();
                } else {
                    itemsBuilder_.addMessage(index, value);
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder addItems(
                    com.tencent.subscribe.SubscribeDataProto.Entry.Builder builderForValue) {
                if (itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    items_.add(builderForValue.build());
                    onChanged();
                } else {
                    itemsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder addItems(
                    int index, com.tencent.subscribe.SubscribeDataProto.Entry.Builder builderForValue) {
                if (itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    items_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    itemsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder addAllItems(
                    java.lang.Iterable<? extends com.tencent.subscribe.SubscribeDataProto.Entry> values) {
                if (itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, items_);
                    onChanged();
                } else {
                    itemsBuilder_.addAllMessages(values);
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder clearItems() {
                if (itemsBuilder_ == null) {
                    items_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    itemsBuilder_.clear();
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public Builder removeItems(int index) {
                if (itemsBuilder_ == null) {
                    ensureItemsIsMutable();
                    items_.remove(index);
                    onChanged();
                } else {
                    itemsBuilder_.remove(index);
                }
                return this;
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Entry.Builder getItemsBuilder(
                    int index) {
                return getItemsFieldBuilder().getBuilder(index);
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder getItemsOrBuilder(
                    int index) {
                if (itemsBuilder_ == null) {
                    return items_.get(index);
                } else {
                    return itemsBuilder_.getMessageOrBuilder(index);
                }
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public java.util.List<? extends com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder>
            getItemsOrBuilderList() {
                if (itemsBuilder_ != null) {
                    return itemsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(items_);
                }
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Entry.Builder addItemsBuilder() {
                return getItemsFieldBuilder().addBuilder(
                        com.tencent.subscribe.SubscribeDataProto.Entry.getDefaultInstance());
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public com.tencent.subscribe.SubscribeDataProto.Entry.Builder addItemsBuilder(
                    int index) {
                return getItemsFieldBuilder().addBuilder(
                        index, com.tencent.subscribe.SubscribeDataProto.Entry.getDefaultInstance());
            }

            /**
             * <pre>
             * entry list
             * </pre>
             *
             * <code>repeated .subscribe.Entry items = 1;</code>
             */
            public java.util.List<com.tencent.subscribe.SubscribeDataProto.Entry.Builder>
            getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.tencent.subscribe.SubscribeDataProto.Entry, com.tencent.subscribe.SubscribeDataProto.Entry.Builder, com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder>
            getItemsFieldBuilder() {
                if (itemsBuilder_ == null) {
                    itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.tencent.subscribe.SubscribeDataProto.Entry, com.tencent.subscribe.SubscribeDataProto.Entry.Builder, com.tencent.subscribe.SubscribeDataProto.EntryOrBuilder>(
                            items_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    items_ = null;
                }
                return itemsBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:subscribe.Entries)
        }

        // @@protoc_insertion_point(class_scope:subscribe.Entries)
        private static final com.tencent.subscribe.SubscribeDataProto.Entries DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.tencent.subscribe.SubscribeDataProto.Entries();
        }

        public static com.tencent.subscribe.SubscribeDataProto.Entries getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Entries>
                PARSER = new com.google.protobuf.AbstractParser<Entries>() {
            @java.lang.Override
            public Entries parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Entries(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Entries> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Entries> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.tencent.subscribe.SubscribeDataProto.Entries getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_DMLEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_DMLEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Column_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Column_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_RowChange_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_RowChange_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Data_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Data_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_DDLEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_DDLEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_BeginEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_BeginEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_CommitEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_CommitEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_RollbackEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_RollbackEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_HeartbeatEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_HeartbeatEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_CheckpointEvent_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_CheckpointEvent_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Event_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Event_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Entry_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Entry_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Header_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Header_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_KVPair_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_KVPair_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Envelope_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Envelope_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_subscribe_Entries_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_subscribe_Entries_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\017subscribe.proto\022\tsubscribe\"|\n\010DMLEvent" +
                        "\022(\n\014dmlEventType\030\001 \001(\0162\022.subscribe.DMLTy" +
                        "pe\022\"\n\007columns\030\002 \003(\0132\021.subscribe.Column\022\"" +
                        "\n\004rows\030\003 \003(\0132\024.subscribe.RowChange\"b\n\006Co" +
                        "lumn\022\014\n\004name\030\001 \001(\t\022\024\n\014originalType\030\002 \001(\t" +
                        "\022\r\n\005isKey\030\003 \001(\010\022%\n\nproperties\030\017 \003(\0132\021.su" +
                        "bscribe.KVPair\"|\n\tRowChange\022#\n\noldColumn" +
                        "s\030\001 \003(\0132\017.subscribe.Data\022#\n\nnewColumns\030\002" +
                        " \003(\0132\017.subscribe.Data\022%\n\nproperties\030\017 \003(" +
                        "\0132\021.subscribe.KVPair\"V\n\004Data\022%\n\010dataType" +
                        "\030\001 \001(\0162\023.subscribe.DataType\022\017\n\007charset\030\002" +
                        " \001(\t\022\n\n\002sv\030\003 \001(\t\022\n\n\002bv\030\004 \001(\014\"B\n\010DDLEvent" +
                        "\022\022\n\nschemaName\030\001 \001(\t\022\013\n\003sql\030\002 \001(\t\022\025\n\rexe" +
                        "cutionTime\030\003 \001(\r\"5\n\nBeginEvent\022\025\n\rtransa" +
                        "ctionId\030\001 \001(\t\022\020\n\010threadId\030\002 \001(\003\"$\n\013Commi" +
                        "tEvent\022\025\n\rtransactionId\030\001 \001(\t\"\017\n\rRollbac" +
                        "kEvent\"\037\n\016HeartbeatEvent\022\r\n\005epoch\030\001 \001(\003\"" +
                        "[\n\017CheckpointEvent\022\022\n\nsyncedGtid\030\001 \001(\t\022\020" +
                        "\n\010fakeGtid\030\002 \001(\010\022\020\n\010fileName\030\003 \001(\t\022\020\n\010po" +
                        "sition\030\004 \001(\004\"\355\002\n\005Event\022)\n\nbeginEvent\030\001 \001" +
                        "(\0132\025.subscribe.BeginEvent\022%\n\010dmlEvent\030\002 " +
                        "\001(\0132\023.subscribe.DMLEvent\022+\n\013commitEvent\030" +
                        "\003 \001(\0132\026.subscribe.CommitEvent\022%\n\010ddlEven" +
                        "t\030\004 \001(\0132\023.subscribe.DDLEvent\022/\n\rrollback" +
                        "Event\030\005 \001(\0132\030.subscribe.RollbackEvent\0221\n" +
                        "\016heartbeatEvent\030\006 \001(\0132\031.subscribe.Heartb" +
                        "eatEvent\0223\n\017checkpointEvent\030\007 \001(\0132\032.subs" +
                        "cribe.CheckpointEvent\022%\n\nproperties\030\017 \003(" +
                        "\0132\021.subscribe.KVPair\"K\n\005Entry\022!\n\006header\030" +
                        "\001 \001(\0132\021.subscribe.Header\022\037\n\005event\030\002 \001(\0132" +
                        "\020.subscribe.Event\"\311\002\n\006Header\022\017\n\007version\030" +
                        "\001 \001(\005\022)\n\nsourceType\030\002 \001(\0162\025.subscribe.So" +
                        "urceType\022+\n\013messageType\030\003 \001(\0162\026.subscrib" +
                        "e.MessageType\022\021\n\ttimestamp\030\004 \001(\r\022\020\n\010serv" +
                        "erId\030\005 \001(\003\022\020\n\010fileName\030\006 \001(\t\022\020\n\010position" +
                        "\030\007 \001(\004\022\014\n\004gtid\030\010 \001(\t\022\022\n\nschemaName\030\t \001(\t" +
                        "\022\021\n\ttableName\030\n \001(\t\022\r\n\005seqId\030\013 \001(\004\022\022\n\nev" +
                        "entIndex\030\014 \001(\004\022\016\n\006isLast\030\r \001(\010\022%\n\nproper" +
                        "ties\030\017 \003(\0132\021.subscribe.KVPair\"$\n\006KVPair\022" +
                        "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"G\n\010Envelope\022" +
                        "\017\n\007version\030\001 \001(\005\022\r\n\005total\030\002 \001(\r\022\r\n\005index" +
                        "\030\003 \001(\r\022\014\n\004data\030\004 \001(\014\"*\n\007Entries\022\037\n\005items" +
                        "\030\001 \003(\0132\020.subscribe.Entry*-\n\007DMLType\022\n\n\006I" +
                        "NSERT\020\000\022\n\n\006UPDATE\020\001\022\n\n\006DELETE\020\002*c\n\013Messa" +
                        "geType\022\t\n\005BEGIN\020\000\022\n\n\006COMMIT\020\001\022\007\n\003DML\020\002\022\007" +
                        "\n\003DDL\020\003\022\014\n\010ROLLBACK\020\004\022\r\n\tHEARTBEAT\020\005\022\016\n\n" +
                        "CHECKPOINT\020\006*;\n\nSourceType\022\n\n\006ORACLE\020\000\022\t" +
                        "\n\005MYSQL\020\001\022\t\n\005PGSQL\020\002\022\013\n\007MARIADB\020\003*\263\001\n\010Da" +
                        "taType\022\007\n\003NIL\020\000\022\010\n\004INT8\020\001\022\t\n\005INT16\020\002\022\t\n\005"
                        +
                        "INT32\020\003\022\t\n\005INT64\020\004\022\t\n\005UINT8\020\005\022\n\n\006UINT16\020" +
                        "\006\022\n\n\006UINT32\020\007\022\n\n\006UINT64\020\010\022\013\n\007FLOAT32\020\t\022\013" +
                        "\n\007FLOAT64\020\n\022\t\n\005BYTES\020\013\022\013\n\007DECIMAL\020\014\022\n\n\006S" +
                        "TRING\020\r\022\006\n\002NA\020\016B+\n\025com.tencent.subscribe" +
                        "B\022SubscribeDataProtob\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_subscribe_DMLEvent_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_subscribe_DMLEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_DMLEvent_descriptor,
                new java.lang.String[]{"DmlEventType", "Columns", "Rows",});
        internal_static_subscribe_Column_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_subscribe_Column_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Column_descriptor,
                new java.lang.String[]{"Name", "OriginalType", "IsKey", "Properties",});
        internal_static_subscribe_RowChange_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_subscribe_RowChange_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_RowChange_descriptor,
                new java.lang.String[]{"OldColumns", "NewColumns", "Properties",});
        internal_static_subscribe_Data_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_subscribe_Data_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Data_descriptor,
                new java.lang.String[]{"DataType", "Charset", "Sv", "Bv",});
        internal_static_subscribe_DDLEvent_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_subscribe_DDLEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_DDLEvent_descriptor,
                new java.lang.String[]{"SchemaName", "Sql", "ExecutionTime",});
        internal_static_subscribe_BeginEvent_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_subscribe_BeginEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_BeginEvent_descriptor,
                new java.lang.String[]{"TransactionId", "ThreadId",});
        internal_static_subscribe_CommitEvent_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_subscribe_CommitEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_CommitEvent_descriptor,
                new java.lang.String[]{"TransactionId",});
        internal_static_subscribe_RollbackEvent_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_subscribe_RollbackEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_RollbackEvent_descriptor,
                new java.lang.String[]{});
        internal_static_subscribe_HeartbeatEvent_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_subscribe_HeartbeatEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_HeartbeatEvent_descriptor,
                new java.lang.String[]{"Epoch",});
        internal_static_subscribe_CheckpointEvent_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_subscribe_CheckpointEvent_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_CheckpointEvent_descriptor,
                new java.lang.String[]{"SyncedGtid", "FakeGtid", "FileName", "Position",});
        internal_static_subscribe_Event_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_subscribe_Event_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Event_descriptor,
                new java.lang.String[]{"BeginEvent", "DmlEvent", "CommitEvent", "DdlEvent", "RollbackEvent",
                        "HeartbeatEvent", "CheckpointEvent", "Properties",});
        internal_static_subscribe_Entry_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_subscribe_Entry_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Entry_descriptor,
                new java.lang.String[]{"Header", "Event",});
        internal_static_subscribe_Header_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_subscribe_Header_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Header_descriptor,
                new java.lang.String[]{"Version", "SourceType", "MessageType", "Timestamp", "ServerId", "FileName",
                        "Position", "Gtid", "SchemaName", "TableName", "SeqId", "EventIndex", "IsLast", "Properties",});
        internal_static_subscribe_KVPair_descriptor =
                getDescriptor().getMessageTypes().get(13);
        internal_static_subscribe_KVPair_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_KVPair_descriptor,
                new java.lang.String[]{"Key", "Value",});
        internal_static_subscribe_Envelope_descriptor =
                getDescriptor().getMessageTypes().get(14);
        internal_static_subscribe_Envelope_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Envelope_descriptor,
                new java.lang.String[]{"Version", "Total", "Index", "Data",});
        internal_static_subscribe_Entries_descriptor =
                getDescriptor().getMessageTypes().get(15);
        internal_static_subscribe_Entries_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_subscribe_Entries_descriptor,
                new java.lang.String[]{"Items",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/mdb/clickhouse/v1/ml_model.proto

package yandex.cloud.api.mdb.clickhouse.v1;

public final class MlModelOuterClass {
  private MlModelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code yandex.cloud.mdb.clickhouse.v1.MlModelType}
   */
  public enum MlModelType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ML_MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    ML_MODEL_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * CatBoost model.
     * </pre>
     *
     * <code>ML_MODEL_TYPE_CATBOOST = 1;</code>
     */
    ML_MODEL_TYPE_CATBOOST(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ML_MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int ML_MODEL_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * CatBoost model.
     * </pre>
     *
     * <code>ML_MODEL_TYPE_CATBOOST = 1;</code>
     */
    public static final int ML_MODEL_TYPE_CATBOOST_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MlModelType valueOf(int value) {
      return forNumber(value);
    }

    public static MlModelType forNumber(int value) {
      switch (value) {
        case 0: return ML_MODEL_TYPE_UNSPECIFIED;
        case 1: return ML_MODEL_TYPE_CATBOOST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MlModelType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MlModelType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MlModelType>() {
            public MlModelType findValueByNumber(int number) {
              return MlModelType.forNumber(number);
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
      return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MlModelType[] VALUES = values();

    public static MlModelType valueOf(
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

    private MlModelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:yandex.cloud.mdb.clickhouse.v1.MlModelType)
  }

  public interface MlModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.mdb.clickhouse.v1.MlModel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Name of the the model.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * Name of the the model.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * ID of the ClickHouse cluster that the model belongs to.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    java.lang.String getClusterId();
    /**
     * <pre>
     * ID of the ClickHouse cluster that the model belongs to.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getClusterIdBytes();

    /**
     * <pre>
     * Type of the model.
     * </pre>
     *
     * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
     */
    int getTypeValue();
    /**
     * <pre>
     * Type of the model.
     * </pre>
     *
     * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
     */
    yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType getType();

    /**
     * <pre>
     * Model file URL. You can only use models stored in Yandex Object Storage.
     * </pre>
     *
     * <code>string uri = 4;</code>
     */
    java.lang.String getUri();
    /**
     * <pre>
     * Model file URL. You can only use models stored in Yandex Object Storage.
     * </pre>
     *
     * <code>string uri = 4;</code>
     */
    com.google.protobuf.ByteString
        getUriBytes();
  }
  /**
   * Protobuf type {@code yandex.cloud.mdb.clickhouse.v1.MlModel}
   */
  public  static final class MlModel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.mdb.clickhouse.v1.MlModel)
      MlModelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MlModel.newBuilder() to construct.
    private MlModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MlModel() {
      name_ = "";
      clusterId_ = "";
      type_ = 0;
      uri_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MlModel(
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

              clusterId_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              uri_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.class, yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Name of the the model.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the the model.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    public static final int CLUSTER_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object clusterId_;
    /**
     * <pre>
     * ID of the ClickHouse cluster that the model belongs to.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the ClickHouse cluster that the model belongs to.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * Type of the model.
     * </pre>
     *
     * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of the model.
     * </pre>
     *
     * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
     */
    public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType getType() {
      @SuppressWarnings("deprecation")
      yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType result = yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType.valueOf(type_);
      return result == null ? yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType.UNRECOGNIZED : result;
    }

    public static final int URI_FIELD_NUMBER = 4;
    private volatile java.lang.Object uri_;
    /**
     * <pre>
     * Model file URL. You can only use models stored in Yandex Object Storage.
     * </pre>
     *
     * <code>string uri = 4;</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Model file URL. You can only use models stored in Yandex Object Storage.
     * </pre>
     *
     * <code>string uri = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getClusterIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterId_);
      }
      if (type_ != yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType.ML_MODEL_TYPE_UNSPECIFIED.getNumber()) {
        output.writeEnum(3, type_);
      }
      if (!getUriBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uri_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getClusterIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterId_);
      }
      if (type_ != yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType.ML_MODEL_TYPE_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      if (!getUriBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uri_);
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
      if (!(obj instanceof yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel)) {
        return super.equals(obj);
      }
      yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel other = (yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && getClusterId()
          .equals(other.getClusterId());
      result = result && type_ == other.type_;
      result = result && getUri()
          .equals(other.getUri());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
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
      hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClusterId().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + URI_FIELD_NUMBER;
      hash = (53 * hash) + getUri().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel prototype) {
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
     * Protobuf type {@code yandex.cloud.mdb.clickhouse.v1.MlModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.mdb.clickhouse.v1.MlModel)
        yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.class, yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.Builder.class);
      }

      // Construct using yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.newBuilder()
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
        name_ = "";

        clusterId_ = "";

        type_ = 0;

        uri_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel getDefaultInstanceForType() {
        return yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel build() {
        yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel buildPartial() {
        yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel result = new yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel(this);
        result.name_ = name_;
        result.clusterId_ = clusterId_;
        result.type_ = type_;
        result.uri_ = uri_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel) {
          return mergeFrom((yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel other) {
        if (other == yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getClusterId().isEmpty()) {
          clusterId_ = other.clusterId_;
          onChanged();
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getUri().isEmpty()) {
          uri_ = other.uri_;
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
        yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Name of the the model.
       * </pre>
       *
       * <code>string name = 1;</code>
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
       * Name of the the model.
       * </pre>
       *
       * <code>string name = 1;</code>
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
       * Name of the the model.
       * </pre>
       *
       * <code>string name = 1;</code>
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
       * Name of the the model.
       * </pre>
       *
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the the model.
       * </pre>
       *
       * <code>string name = 1;</code>
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

      private java.lang.Object clusterId_ = "";
      /**
       * <pre>
       * ID of the ClickHouse cluster that the model belongs to.
       * </pre>
       *
       * <code>string cluster_id = 2;</code>
       */
      public java.lang.String getClusterId() {
        java.lang.Object ref = clusterId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clusterId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the ClickHouse cluster that the model belongs to.
       * </pre>
       *
       * <code>string cluster_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getClusterIdBytes() {
        java.lang.Object ref = clusterId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clusterId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the ClickHouse cluster that the model belongs to.
       * </pre>
       *
       * <code>string cluster_id = 2;</code>
       */
      public Builder setClusterId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clusterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the ClickHouse cluster that the model belongs to.
       * </pre>
       *
       * <code>string cluster_id = 2;</code>
       */
      public Builder clearClusterId() {
        
        clusterId_ = getDefaultInstance().getClusterId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the ClickHouse cluster that the model belongs to.
       * </pre>
       *
       * <code>string cluster_id = 2;</code>
       */
      public Builder setClusterIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clusterId_ = value;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       * Type of the model.
       * </pre>
       *
       * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       * Type of the model.
       * </pre>
       *
       * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type of the model.
       * </pre>
       *
       * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
       */
      public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType getType() {
        @SuppressWarnings("deprecation")
        yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType result = yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType.valueOf(type_);
        return result == null ? yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Type of the model.
       * </pre>
       *
       * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
       */
      public Builder setType(yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModelType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type of the model.
       * </pre>
       *
       * <code>.yandex.cloud.mdb.clickhouse.v1.MlModelType type = 3;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object uri_ = "";
      /**
       * <pre>
       * Model file URL. You can only use models stored in Yandex Object Storage.
       * </pre>
       *
       * <code>string uri = 4;</code>
       */
      public java.lang.String getUri() {
        java.lang.Object ref = uri_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          uri_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Model file URL. You can only use models stored in Yandex Object Storage.
       * </pre>
       *
       * <code>string uri = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUriBytes() {
        java.lang.Object ref = uri_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          uri_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Model file URL. You can only use models stored in Yandex Object Storage.
       * </pre>
       *
       * <code>string uri = 4;</code>
       */
      public Builder setUri(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uri_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Model file URL. You can only use models stored in Yandex Object Storage.
       * </pre>
       *
       * <code>string uri = 4;</code>
       */
      public Builder clearUri() {
        
        uri_ = getDefaultInstance().getUri();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Model file URL. You can only use models stored in Yandex Object Storage.
       * </pre>
       *
       * <code>string uri = 4;</code>
       */
      public Builder setUriBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uri_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:yandex.cloud.mdb.clickhouse.v1.MlModel)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.mdb.clickhouse.v1.MlModel)
    private static final yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel();
    }

    public static yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MlModel>
        PARSER = new com.google.protobuf.AbstractParser<MlModel>() {
      @java.lang.Override
      public MlModel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MlModel(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MlModel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MlModel> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.mdb.clickhouse.v1.MlModelOuterClass.MlModel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-yandex/cloud/mdb/clickhouse/v1/ml_mode" +
      "l.proto\022\036yandex.cloud.mdb.clickhouse.v1\"" +
      "s\n\007MlModel\022\014\n\004name\030\001 \001(\t\022\022\n\ncluster_id\030\002" +
      " \001(\t\0229\n\004type\030\003 \001(\0162+.yandex.cloud.mdb.cl" +
      "ickhouse.v1.MlModelType\022\013\n\003uri\030\004 \001(\t*H\n\013" +
      "MlModelType\022\035\n\031ML_MODEL_TYPE_UNSPECIFIED" +
      "\020\000\022\032\n\026ML_MODEL_TYPE_CATBOOST\020\001Bs\n\"yandex" +
      ".cloud.api.mdb.clickhouse.v1ZMgithub.com" +
      "/yandex-cloud/go-genproto/yandex/cloud/m" +
      "db/clickhouse/v1;clickhouseb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_mdb_clickhouse_v1_MlModel_descriptor,
        new java.lang.String[] { "Name", "ClusterId", "Type", "Uri", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

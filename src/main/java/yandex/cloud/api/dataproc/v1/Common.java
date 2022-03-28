// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/dataproc/v1/common.proto

package yandex.cloud.api.dataproc.v1;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code yandex.cloud.dataproc.v1.Health}
   */
  public enum Health
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Object is in unknown state (we have no data).
     * </pre>
     *
     * <code>HEALTH_UNKNOWN = 0;</code>
     */
    HEALTH_UNKNOWN(0),
    /**
     * <pre>
     * Object is alive and well (for example, all hosts of the cluster are alive).
     * </pre>
     *
     * <code>ALIVE = 1;</code>
     */
    ALIVE(1),
    /**
     * <pre>
     * Object is inoperable (it cannot perform any of its essential functions).
     * </pre>
     *
     * <code>DEAD = 2;</code>
     */
    DEAD(2),
    /**
     * <pre>
     * Object is partially alive (it can perform some of its essential functions).
     * </pre>
     *
     * <code>DEGRADED = 3;</code>
     */
    DEGRADED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Object is in unknown state (we have no data).
     * </pre>
     *
     * <code>HEALTH_UNKNOWN = 0;</code>
     */
    public static final int HEALTH_UNKNOWN_VALUE = 0;
    /**
     * <pre>
     * Object is alive and well (for example, all hosts of the cluster are alive).
     * </pre>
     *
     * <code>ALIVE = 1;</code>
     */
    public static final int ALIVE_VALUE = 1;
    /**
     * <pre>
     * Object is inoperable (it cannot perform any of its essential functions).
     * </pre>
     *
     * <code>DEAD = 2;</code>
     */
    public static final int DEAD_VALUE = 2;
    /**
     * <pre>
     * Object is partially alive (it can perform some of its essential functions).
     * </pre>
     *
     * <code>DEGRADED = 3;</code>
     */
    public static final int DEGRADED_VALUE = 3;


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
    public static Health valueOf(int value) {
      return forNumber(value);
    }

    public static Health forNumber(int value) {
      switch (value) {
        case 0: return HEALTH_UNKNOWN;
        case 1: return ALIVE;
        case 2: return DEAD;
        case 3: return DEGRADED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Health>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Health> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Health>() {
            public Health findValueByNumber(int number) {
              return Health.forNumber(number);
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
      return yandex.cloud.api.dataproc.v1.Common.getDescriptor().getEnumTypes().get(0);
    }

    private static final Health[] VALUES = values();

    public static Health valueOf(
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

    private Health(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:yandex.cloud.dataproc.v1.Health)
  }

  public interface ResourcesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.dataproc.v1.Resources)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
     * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
     * </pre>
     *
     * <code>string resource_preset_id = 1;</code>
     */
    java.lang.String getResourcePresetId();
    /**
     * <pre>
     * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
     * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
     * </pre>
     *
     * <code>string resource_preset_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getResourcePresetIdBytes();

    /**
     * <pre>
     * Type of the storage environment for the host.
     * Possible values:
     * * network-hdd - network HDD drive,
     * * network-ssd - network SSD drive.
     * </pre>
     *
     * <code>string disk_type_id = 2;</code>
     */
    java.lang.String getDiskTypeId();
    /**
     * <pre>
     * Type of the storage environment for the host.
     * Possible values:
     * * network-hdd - network HDD drive,
     * * network-ssd - network SSD drive.
     * </pre>
     *
     * <code>string disk_type_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getDiskTypeIdBytes();

    /**
     * <pre>
     * Volume of the storage available to a host, in bytes.
     * </pre>
     *
     * <code>int64 disk_size = 3;</code>
     */
    long getDiskSize();
  }
  /**
   * Protobuf type {@code yandex.cloud.dataproc.v1.Resources}
   */
  public  static final class Resources extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.dataproc.v1.Resources)
      ResourcesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Resources.newBuilder() to construct.
    private Resources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Resources() {
      resourcePresetId_ = "";
      diskTypeId_ = "";
      diskSize_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Resources(
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

              resourcePresetId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              diskTypeId_ = s;
              break;
            }
            case 24: {

              diskSize_ = input.readInt64();
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
      return yandex.cloud.api.dataproc.v1.Common.internal_static_yandex_cloud_dataproc_v1_Resources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.dataproc.v1.Common.internal_static_yandex_cloud_dataproc_v1_Resources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.dataproc.v1.Common.Resources.class, yandex.cloud.api.dataproc.v1.Common.Resources.Builder.class);
    }

    public static final int RESOURCE_PRESET_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object resourcePresetId_;
    /**
     * <pre>
     * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
     * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
     * </pre>
     *
     * <code>string resource_preset_id = 1;</code>
     */
    public java.lang.String getResourcePresetId() {
      java.lang.Object ref = resourcePresetId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourcePresetId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
     * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
     * </pre>
     *
     * <code>string resource_preset_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourcePresetIdBytes() {
      java.lang.Object ref = resourcePresetId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourcePresetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISK_TYPE_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object diskTypeId_;
    /**
     * <pre>
     * Type of the storage environment for the host.
     * Possible values:
     * * network-hdd - network HDD drive,
     * * network-ssd - network SSD drive.
     * </pre>
     *
     * <code>string disk_type_id = 2;</code>
     */
    public java.lang.String getDiskTypeId() {
      java.lang.Object ref = diskTypeId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diskTypeId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Type of the storage environment for the host.
     * Possible values:
     * * network-hdd - network HDD drive,
     * * network-ssd - network SSD drive.
     * </pre>
     *
     * <code>string disk_type_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDiskTypeIdBytes() {
      java.lang.Object ref = diskTypeId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diskTypeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISK_SIZE_FIELD_NUMBER = 3;
    private long diskSize_;
    /**
     * <pre>
     * Volume of the storage available to a host, in bytes.
     * </pre>
     *
     * <code>int64 disk_size = 3;</code>
     */
    public long getDiskSize() {
      return diskSize_;
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
      if (!getResourcePresetIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourcePresetId_);
      }
      if (!getDiskTypeIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diskTypeId_);
      }
      if (diskSize_ != 0L) {
        output.writeInt64(3, diskSize_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getResourcePresetIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourcePresetId_);
      }
      if (!getDiskTypeIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diskTypeId_);
      }
      if (diskSize_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, diskSize_);
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
      if (!(obj instanceof yandex.cloud.api.dataproc.v1.Common.Resources)) {
        return super.equals(obj);
      }
      yandex.cloud.api.dataproc.v1.Common.Resources other = (yandex.cloud.api.dataproc.v1.Common.Resources) obj;

      boolean result = true;
      result = result && getResourcePresetId()
          .equals(other.getResourcePresetId());
      result = result && getDiskTypeId()
          .equals(other.getDiskTypeId());
      result = result && (getDiskSize()
          == other.getDiskSize());
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
      hash = (37 * hash) + RESOURCE_PRESET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getResourcePresetId().hashCode();
      hash = (37 * hash) + DISK_TYPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDiskTypeId().hashCode();
      hash = (37 * hash) + DISK_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDiskSize());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.dataproc.v1.Common.Resources parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.dataproc.v1.Common.Resources prototype) {
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
     * Protobuf type {@code yandex.cloud.dataproc.v1.Resources}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.dataproc.v1.Resources)
        yandex.cloud.api.dataproc.v1.Common.ResourcesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.dataproc.v1.Common.internal_static_yandex_cloud_dataproc_v1_Resources_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.dataproc.v1.Common.internal_static_yandex_cloud_dataproc_v1_Resources_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.dataproc.v1.Common.Resources.class, yandex.cloud.api.dataproc.v1.Common.Resources.Builder.class);
      }

      // Construct using yandex.cloud.api.dataproc.v1.Common.Resources.newBuilder()
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
        resourcePresetId_ = "";

        diskTypeId_ = "";

        diskSize_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.dataproc.v1.Common.internal_static_yandex_cloud_dataproc_v1_Resources_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.dataproc.v1.Common.Resources getDefaultInstanceForType() {
        return yandex.cloud.api.dataproc.v1.Common.Resources.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.dataproc.v1.Common.Resources build() {
        yandex.cloud.api.dataproc.v1.Common.Resources result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.dataproc.v1.Common.Resources buildPartial() {
        yandex.cloud.api.dataproc.v1.Common.Resources result = new yandex.cloud.api.dataproc.v1.Common.Resources(this);
        result.resourcePresetId_ = resourcePresetId_;
        result.diskTypeId_ = diskTypeId_;
        result.diskSize_ = diskSize_;
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
        if (other instanceof yandex.cloud.api.dataproc.v1.Common.Resources) {
          return mergeFrom((yandex.cloud.api.dataproc.v1.Common.Resources)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.dataproc.v1.Common.Resources other) {
        if (other == yandex.cloud.api.dataproc.v1.Common.Resources.getDefaultInstance()) return this;
        if (!other.getResourcePresetId().isEmpty()) {
          resourcePresetId_ = other.resourcePresetId_;
          onChanged();
        }
        if (!other.getDiskTypeId().isEmpty()) {
          diskTypeId_ = other.diskTypeId_;
          onChanged();
        }
        if (other.getDiskSize() != 0L) {
          setDiskSize(other.getDiskSize());
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
        yandex.cloud.api.dataproc.v1.Common.Resources parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.dataproc.v1.Common.Resources) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object resourcePresetId_ = "";
      /**
       * <pre>
       * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
       * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
       * </pre>
       *
       * <code>string resource_preset_id = 1;</code>
       */
      public java.lang.String getResourcePresetId() {
        java.lang.Object ref = resourcePresetId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resourcePresetId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
       * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
       * </pre>
       *
       * <code>string resource_preset_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getResourcePresetIdBytes() {
        java.lang.Object ref = resourcePresetId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          resourcePresetId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
       * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
       * </pre>
       *
       * <code>string resource_preset_id = 1;</code>
       */
      public Builder setResourcePresetId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        resourcePresetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
       * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
       * </pre>
       *
       * <code>string resource_preset_id = 1;</code>
       */
      public Builder clearResourcePresetId() {
        
        resourcePresetId_ = getDefaultInstance().getResourcePresetId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the resource preset for computational resources available to a host (CPU, memory etc.).
       * All available presets are listed in the [documentation](/docs/data-proc/concepts/instance-types).
       * </pre>
       *
       * <code>string resource_preset_id = 1;</code>
       */
      public Builder setResourcePresetIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        resourcePresetId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object diskTypeId_ = "";
      /**
       * <pre>
       * Type of the storage environment for the host.
       * Possible values:
       * * network-hdd - network HDD drive,
       * * network-ssd - network SSD drive.
       * </pre>
       *
       * <code>string disk_type_id = 2;</code>
       */
      public java.lang.String getDiskTypeId() {
        java.lang.Object ref = diskTypeId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          diskTypeId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Type of the storage environment for the host.
       * Possible values:
       * * network-hdd - network HDD drive,
       * * network-ssd - network SSD drive.
       * </pre>
       *
       * <code>string disk_type_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDiskTypeIdBytes() {
        java.lang.Object ref = diskTypeId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          diskTypeId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Type of the storage environment for the host.
       * Possible values:
       * * network-hdd - network HDD drive,
       * * network-ssd - network SSD drive.
       * </pre>
       *
       * <code>string disk_type_id = 2;</code>
       */
      public Builder setDiskTypeId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        diskTypeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type of the storage environment for the host.
       * Possible values:
       * * network-hdd - network HDD drive,
       * * network-ssd - network SSD drive.
       * </pre>
       *
       * <code>string disk_type_id = 2;</code>
       */
      public Builder clearDiskTypeId() {
        
        diskTypeId_ = getDefaultInstance().getDiskTypeId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type of the storage environment for the host.
       * Possible values:
       * * network-hdd - network HDD drive,
       * * network-ssd - network SSD drive.
       * </pre>
       *
       * <code>string disk_type_id = 2;</code>
       */
      public Builder setDiskTypeIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        diskTypeId_ = value;
        onChanged();
        return this;
      }

      private long diskSize_ ;
      /**
       * <pre>
       * Volume of the storage available to a host, in bytes.
       * </pre>
       *
       * <code>int64 disk_size = 3;</code>
       */
      public long getDiskSize() {
        return diskSize_;
      }
      /**
       * <pre>
       * Volume of the storage available to a host, in bytes.
       * </pre>
       *
       * <code>int64 disk_size = 3;</code>
       */
      public Builder setDiskSize(long value) {
        
        diskSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Volume of the storage available to a host, in bytes.
       * </pre>
       *
       * <code>int64 disk_size = 3;</code>
       */
      public Builder clearDiskSize() {
        
        diskSize_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.dataproc.v1.Resources)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.dataproc.v1.Resources)
    private static final yandex.cloud.api.dataproc.v1.Common.Resources DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.dataproc.v1.Common.Resources();
    }

    public static yandex.cloud.api.dataproc.v1.Common.Resources getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Resources>
        PARSER = new com.google.protobuf.AbstractParser<Resources>() {
      @java.lang.Override
      public Resources parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Resources(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Resources> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Resources> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.dataproc.v1.Common.Resources getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_dataproc_v1_Resources_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_dataproc_v1_Resources_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%yandex/cloud/dataproc/v1/common.proto\022" +
      "\030yandex.cloud.dataproc.v1\"P\n\tResources\022\032" +
      "\n\022resource_preset_id\030\001 \001(\t\022\024\n\014disk_type_" +
      "id\030\002 \001(\t\022\021\n\tdisk_size\030\003 \001(\003*?\n\006Health\022\022\n" +
      "\016HEALTH_UNKNOWN\020\000\022\t\n\005ALIVE\020\001\022\010\n\004DEAD\020\002\022\014" +
      "\n\010DEGRADED\020\003Be\n\034yandex.cloud.api.datapro" +
      "c.v1ZEgithub.com/yandex-cloud/go-genprot" +
      "o/yandex/cloud/dataproc/v1;dataprocb\006pro" +
      "to3"
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
    internal_static_yandex_cloud_dataproc_v1_Resources_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_dataproc_v1_Resources_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_dataproc_v1_Resources_descriptor,
        new java.lang.String[] { "ResourcePresetId", "DiskTypeId", "DiskSize", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

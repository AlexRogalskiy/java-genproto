// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/compute/v1/zone.proto

package yandex.cloud.api.compute.v1;

public final class ZoneOuterClass {
  private ZoneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ZoneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.compute.v1.Zone)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the zone.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <pre>
     * ID of the zone.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     * ID of the region.
     * </pre>
     *
     * <code>string region_id = 2;</code>
     */
    java.lang.String getRegionId();
    /**
     * <pre>
     * ID of the region.
     * </pre>
     *
     * <code>string region_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getRegionIdBytes();

    /**
     * <pre>
     * Status of the zone.
     * </pre>
     *
     * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
     */
    int getStatusValue();
    /**
     * <pre>
     * Status of the zone.
     * </pre>
     *
     * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
     */
    yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status getStatus();
  }
  /**
   * <pre>
   * Availability zone. For more information, see [Availability zones](/docs/overview/concepts/geo-scope).
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.compute.v1.Zone}
   */
  public  static final class Zone extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.compute.v1.Zone)
      ZoneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Zone.newBuilder() to construct.
    private Zone(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Zone() {
      id_ = "";
      regionId_ = "";
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Zone(
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

              id_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              regionId_ = s;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              status_ = rawValue;
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
      return yandex.cloud.api.compute.v1.ZoneOuterClass.internal_static_yandex_cloud_compute_v1_Zone_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.compute.v1.ZoneOuterClass.internal_static_yandex_cloud_compute_v1_Zone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.class, yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Builder.class);
    }

    /**
     * Protobuf enum {@code yandex.cloud.compute.v1.Zone.Status}
     */
    public enum Status
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>STATUS_UNSPECIFIED = 0;</code>
       */
      STATUS_UNSPECIFIED(0),
      /**
       * <pre>
       * Zone is available. You can access the resources allocated in this zone.
       * </pre>
       *
       * <code>UP = 1;</code>
       */
      UP(1),
      /**
       * <pre>
       * Zone is not available.
       * </pre>
       *
       * <code>DOWN = 2;</code>
       */
      DOWN(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>STATUS_UNSPECIFIED = 0;</code>
       */
      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      /**
       * <pre>
       * Zone is available. You can access the resources allocated in this zone.
       * </pre>
       *
       * <code>UP = 1;</code>
       */
      public static final int UP_VALUE = 1;
      /**
       * <pre>
       * Zone is not available.
       * </pre>
       *
       * <code>DOWN = 2;</code>
       */
      public static final int DOWN_VALUE = 2;


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
      public static Status valueOf(int value) {
        return forNumber(value);
      }

      public static Status forNumber(int value) {
        switch (value) {
          case 0: return STATUS_UNSPECIFIED;
          case 1: return UP;
          case 2: return DOWN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Status>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Status> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Status>() {
              public Status findValueByNumber(int number) {
                return Status.forNumber(number);
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
        return yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.getDescriptor().getEnumTypes().get(0);
      }

      private static final Status[] VALUES = values();

      public static Status valueOf(
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

      private Status(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:yandex.cloud.compute.v1.Zone.Status)
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     * ID of the zone.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the zone.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REGION_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object regionId_;
    /**
     * <pre>
     * ID of the region.
     * </pre>
     *
     * <code>string region_id = 2;</code>
     */
    public java.lang.String getRegionId() {
      java.lang.Object ref = regionId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ID of the region.
     * </pre>
     *
     * <code>string region_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRegionIdBytes() {
      java.lang.Object ref = regionId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private int status_;
    /**
     * <pre>
     * Status of the zone.
     * </pre>
     *
     * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Status of the zone.
     * </pre>
     *
     * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
     */
    public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status getStatus() {
      @SuppressWarnings("deprecation")
      yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status result = yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status.valueOf(status_);
      return result == null ? yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status.UNRECOGNIZED : result;
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
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!getRegionIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, regionId_);
      }
      if (status_ != yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status.STATUS_UNSPECIFIED.getNumber()) {
        output.writeEnum(3, status_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!getRegionIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, regionId_);
      }
      if (status_ != yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status.STATUS_UNSPECIFIED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, status_);
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
      if (!(obj instanceof yandex.cloud.api.compute.v1.ZoneOuterClass.Zone)) {
        return super.equals(obj);
      }
      yandex.cloud.api.compute.v1.ZoneOuterClass.Zone other = (yandex.cloud.api.compute.v1.ZoneOuterClass.Zone) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      result = result && getRegionId()
          .equals(other.getRegionId());
      result = result && status_ == other.status_;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRegionId().hashCode();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.compute.v1.ZoneOuterClass.Zone prototype) {
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
     * <pre>
     * Availability zone. For more information, see [Availability zones](/docs/overview/concepts/geo-scope).
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.compute.v1.Zone}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.compute.v1.Zone)
        yandex.cloud.api.compute.v1.ZoneOuterClass.ZoneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.compute.v1.ZoneOuterClass.internal_static_yandex_cloud_compute_v1_Zone_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.compute.v1.ZoneOuterClass.internal_static_yandex_cloud_compute_v1_Zone_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.class, yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Builder.class);
      }

      // Construct using yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.newBuilder()
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
        id_ = "";

        regionId_ = "";

        status_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.compute.v1.ZoneOuterClass.internal_static_yandex_cloud_compute_v1_Zone_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone getDefaultInstanceForType() {
        return yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone build() {
        yandex.cloud.api.compute.v1.ZoneOuterClass.Zone result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone buildPartial() {
        yandex.cloud.api.compute.v1.ZoneOuterClass.Zone result = new yandex.cloud.api.compute.v1.ZoneOuterClass.Zone(this);
        result.id_ = id_;
        result.regionId_ = regionId_;
        result.status_ = status_;
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
        if (other instanceof yandex.cloud.api.compute.v1.ZoneOuterClass.Zone) {
          return mergeFrom((yandex.cloud.api.compute.v1.ZoneOuterClass.Zone)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.compute.v1.ZoneOuterClass.Zone other) {
        if (other == yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getRegionId().isEmpty()) {
          regionId_ = other.regionId_;
          onChanged();
        }
        if (other.status_ != 0) {
          setStatusValue(other.getStatusValue());
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
        yandex.cloud.api.compute.v1.ZoneOuterClass.Zone parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.compute.v1.ZoneOuterClass.Zone) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <pre>
       * ID of the zone.
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the zone.
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the zone.
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the zone.
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the zone.
       * </pre>
       *
       * <code>string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object regionId_ = "";
      /**
       * <pre>
       * ID of the region.
       * </pre>
       *
       * <code>string region_id = 2;</code>
       */
      public java.lang.String getRegionId() {
        java.lang.Object ref = regionId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          regionId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the region.
       * </pre>
       *
       * <code>string region_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getRegionIdBytes() {
        java.lang.Object ref = regionId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          regionId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the region.
       * </pre>
       *
       * <code>string region_id = 2;</code>
       */
      public Builder setRegionId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        regionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the region.
       * </pre>
       *
       * <code>string region_id = 2;</code>
       */
      public Builder clearRegionId() {
        
        regionId_ = getDefaultInstance().getRegionId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the region.
       * </pre>
       *
       * <code>string region_id = 2;</code>
       */
      public Builder setRegionIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        regionId_ = value;
        onChanged();
        return this;
      }

      private int status_ = 0;
      /**
       * <pre>
       * Status of the zone.
       * </pre>
       *
       * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
       */
      public int getStatusValue() {
        return status_;
      }
      /**
       * <pre>
       * Status of the zone.
       * </pre>
       *
       * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
       */
      public Builder setStatusValue(int value) {
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Status of the zone.
       * </pre>
       *
       * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
       */
      public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status getStatus() {
        @SuppressWarnings("deprecation")
        yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status result = yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status.valueOf(status_);
        return result == null ? yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Status of the zone.
       * </pre>
       *
       * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
       */
      public Builder setStatus(yandex.cloud.api.compute.v1.ZoneOuterClass.Zone.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        status_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Status of the zone.
       * </pre>
       *
       * <code>.yandex.cloud.compute.v1.Zone.Status status = 3;</code>
       */
      public Builder clearStatus() {
        
        status_ = 0;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.compute.v1.Zone)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.compute.v1.Zone)
    private static final yandex.cloud.api.compute.v1.ZoneOuterClass.Zone DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.compute.v1.ZoneOuterClass.Zone();
    }

    public static yandex.cloud.api.compute.v1.ZoneOuterClass.Zone getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Zone>
        PARSER = new com.google.protobuf.AbstractParser<Zone>() {
      @java.lang.Override
      public Zone parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Zone(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Zone> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Zone> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.compute.v1.ZoneOuterClass.Zone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_compute_v1_Zone_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_compute_v1_Zone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"yandex/cloud/compute/v1/zone.proto\022\027ya" +
      "ndex.cloud.compute.v1\"\217\001\n\004Zone\022\n\n\002id\030\001 \001" +
      "(\t\022\021\n\tregion_id\030\002 \001(\t\0224\n\006status\030\003 \001(\0162$." +
      "yandex.cloud.compute.v1.Zone.Status\"2\n\006S" +
      "tatus\022\026\n\022STATUS_UNSPECIFIED\020\000\022\006\n\002UP\020\001\022\010\n" +
      "\004DOWN\020\002Bb\n\033yandex.cloud.api.compute.v1ZC" +
      "github.com/yandex-cloud/go-genproto/yand" +
      "ex/cloud/compute/v1;computeb\006proto3"
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
    internal_static_yandex_cloud_compute_v1_Zone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_compute_v1_Zone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_compute_v1_Zone_descriptor,
        new java.lang.String[] { "Id", "RegionId", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/dataproc/v1/resource_preset.proto

package yandex.cloud.api.dataproc.v1;

public final class ResourcePresetOuterClass {
  private ResourcePresetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResourcePresetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.dataproc.v1.ResourcePreset)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the ResourcePreset resource.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <pre>
     * ID of the ResourcePreset resource.
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    java.util.List<java.lang.String>
        getZoneIdsList();
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    int getZoneIdsCount();
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    java.lang.String getZoneIds(int index);
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    com.google.protobuf.ByteString
        getZoneIdsBytes(int index);

    /**
     * <pre>
     * Number of CPU cores for a Data Proc host created with the preset.
     * </pre>
     *
     * <code>int64 cores = 3;</code>
     */
    long getCores();

    /**
     * <pre>
     * RAM volume for a Data Proc host created with the preset, in bytes.
     * </pre>
     *
     * <code>int64 memory = 4;</code>
     */
    long getMemory();
  }
  /**
   * <pre>
   * A ResourcePreset resource for describing hardware configuration presets.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.dataproc.v1.ResourcePreset}
   */
  public  static final class ResourcePreset extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.dataproc.v1.ResourcePreset)
      ResourcePresetOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResourcePreset.newBuilder() to construct.
    private ResourcePreset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResourcePreset() {
      id_ = "";
      zoneIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      cores_ = 0L;
      memory_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResourcePreset(
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
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                zoneIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              zoneIds_.add(s);
              break;
            }
            case 24: {

              cores_ = input.readInt64();
              break;
            }
            case 32: {

              memory_ = input.readInt64();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          zoneIds_ = zoneIds_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.internal_static_yandex_cloud_dataproc_v1_ResourcePreset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.internal_static_yandex_cloud_dataproc_v1_ResourcePreset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.class, yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     * ID of the ResourcePreset resource.
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
     * ID of the ResourcePreset resource.
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

    public static final int ZONE_IDS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList zoneIds_;
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getZoneIdsList() {
      return zoneIds_;
    }
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    public int getZoneIdsCount() {
      return zoneIds_.size();
    }
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    public java.lang.String getZoneIds(int index) {
      return zoneIds_.get(index);
    }
    /**
     * <pre>
     * IDs of availability zones where the resource preset is available.
     * </pre>
     *
     * <code>repeated string zone_ids = 2;</code>
     */
    public com.google.protobuf.ByteString
        getZoneIdsBytes(int index) {
      return zoneIds_.getByteString(index);
    }

    public static final int CORES_FIELD_NUMBER = 3;
    private long cores_;
    /**
     * <pre>
     * Number of CPU cores for a Data Proc host created with the preset.
     * </pre>
     *
     * <code>int64 cores = 3;</code>
     */
    public long getCores() {
      return cores_;
    }

    public static final int MEMORY_FIELD_NUMBER = 4;
    private long memory_;
    /**
     * <pre>
     * RAM volume for a Data Proc host created with the preset, in bytes.
     * </pre>
     *
     * <code>int64 memory = 4;</code>
     */
    public long getMemory() {
      return memory_;
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
      for (int i = 0; i < zoneIds_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zoneIds_.getRaw(i));
      }
      if (cores_ != 0L) {
        output.writeInt64(3, cores_);
      }
      if (memory_ != 0L) {
        output.writeInt64(4, memory_);
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
      {
        int dataSize = 0;
        for (int i = 0; i < zoneIds_.size(); i++) {
          dataSize += computeStringSizeNoTag(zoneIds_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getZoneIdsList().size();
      }
      if (cores_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, cores_);
      }
      if (memory_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, memory_);
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
      if (!(obj instanceof yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset)) {
        return super.equals(obj);
      }
      yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset other = (yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      result = result && getZoneIdsList()
          .equals(other.getZoneIdsList());
      result = result && (getCores()
          == other.getCores());
      result = result && (getMemory()
          == other.getMemory());
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
      if (getZoneIdsCount() > 0) {
        hash = (37 * hash) + ZONE_IDS_FIELD_NUMBER;
        hash = (53 * hash) + getZoneIdsList().hashCode();
      }
      hash = (37 * hash) + CORES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCores());
      hash = (37 * hash) + MEMORY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMemory());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset prototype) {
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
     * A ResourcePreset resource for describing hardware configuration presets.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.dataproc.v1.ResourcePreset}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.dataproc.v1.ResourcePreset)
        yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePresetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.internal_static_yandex_cloud_dataproc_v1_ResourcePreset_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.internal_static_yandex_cloud_dataproc_v1_ResourcePreset_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.class, yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.Builder.class);
      }

      // Construct using yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.newBuilder()
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

        zoneIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        cores_ = 0L;

        memory_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.internal_static_yandex_cloud_dataproc_v1_ResourcePreset_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset getDefaultInstanceForType() {
        return yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset build() {
        yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset buildPartial() {
        yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset result = new yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.id_ = id_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          zoneIds_ = zoneIds_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.zoneIds_ = zoneIds_;
        result.cores_ = cores_;
        result.memory_ = memory_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset) {
          return mergeFrom((yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset other) {
        if (other == yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.zoneIds_.isEmpty()) {
          if (zoneIds_.isEmpty()) {
            zoneIds_ = other.zoneIds_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureZoneIdsIsMutable();
            zoneIds_.addAll(other.zoneIds_);
          }
          onChanged();
        }
        if (other.getCores() != 0L) {
          setCores(other.getCores());
        }
        if (other.getMemory() != 0L) {
          setMemory(other.getMemory());
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
        yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object id_ = "";
      /**
       * <pre>
       * ID of the ResourcePreset resource.
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
       * ID of the ResourcePreset resource.
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
       * ID of the ResourcePreset resource.
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
       * ID of the ResourcePreset resource.
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
       * ID of the ResourcePreset resource.
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

      private com.google.protobuf.LazyStringList zoneIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureZoneIdsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          zoneIds_ = new com.google.protobuf.LazyStringArrayList(zoneIds_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getZoneIdsList() {
        return zoneIds_.getUnmodifiableView();
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public int getZoneIdsCount() {
        return zoneIds_.size();
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public java.lang.String getZoneIds(int index) {
        return zoneIds_.get(index);
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public com.google.protobuf.ByteString
          getZoneIdsBytes(int index) {
        return zoneIds_.getByteString(index);
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public Builder setZoneIds(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureZoneIdsIsMutable();
        zoneIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public Builder addZoneIds(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureZoneIdsIsMutable();
        zoneIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public Builder addAllZoneIds(
          java.lang.Iterable<java.lang.String> values) {
        ensureZoneIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, zoneIds_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public Builder clearZoneIds() {
        zoneIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IDs of availability zones where the resource preset is available.
       * </pre>
       *
       * <code>repeated string zone_ids = 2;</code>
       */
      public Builder addZoneIdsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureZoneIdsIsMutable();
        zoneIds_.add(value);
        onChanged();
        return this;
      }

      private long cores_ ;
      /**
       * <pre>
       * Number of CPU cores for a Data Proc host created with the preset.
       * </pre>
       *
       * <code>int64 cores = 3;</code>
       */
      public long getCores() {
        return cores_;
      }
      /**
       * <pre>
       * Number of CPU cores for a Data Proc host created with the preset.
       * </pre>
       *
       * <code>int64 cores = 3;</code>
       */
      public Builder setCores(long value) {
        
        cores_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Number of CPU cores for a Data Proc host created with the preset.
       * </pre>
       *
       * <code>int64 cores = 3;</code>
       */
      public Builder clearCores() {
        
        cores_ = 0L;
        onChanged();
        return this;
      }

      private long memory_ ;
      /**
       * <pre>
       * RAM volume for a Data Proc host created with the preset, in bytes.
       * </pre>
       *
       * <code>int64 memory = 4;</code>
       */
      public long getMemory() {
        return memory_;
      }
      /**
       * <pre>
       * RAM volume for a Data Proc host created with the preset, in bytes.
       * </pre>
       *
       * <code>int64 memory = 4;</code>
       */
      public Builder setMemory(long value) {
        
        memory_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * RAM volume for a Data Proc host created with the preset, in bytes.
       * </pre>
       *
       * <code>int64 memory = 4;</code>
       */
      public Builder clearMemory() {
        
        memory_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.dataproc.v1.ResourcePreset)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.dataproc.v1.ResourcePreset)
    private static final yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset();
    }

    public static yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResourcePreset>
        PARSER = new com.google.protobuf.AbstractParser<ResourcePreset>() {
      @java.lang.Override
      public ResourcePreset parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResourcePreset(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResourcePreset> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourcePreset> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.dataproc.v1.ResourcePresetOuterClass.ResourcePreset getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_dataproc_v1_ResourcePreset_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_dataproc_v1_ResourcePreset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.yandex/cloud/dataproc/v1/resource_pres" +
      "et.proto\022\030yandex.cloud.dataproc.v1\"M\n\016Re" +
      "sourcePreset\022\n\n\002id\030\001 \001(\t\022\020\n\010zone_ids\030\002 \003" +
      "(\t\022\r\n\005cores\030\003 \001(\003\022\016\n\006memory\030\004 \001(\003Be\n\034yan" +
      "dex.cloud.api.dataproc.v1ZEgithub.com/ya" +
      "ndex-cloud/go-genproto/yandex/cloud/data" +
      "proc/v1;dataprocb\006proto3"
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
    internal_static_yandex_cloud_dataproc_v1_ResourcePreset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_dataproc_v1_ResourcePreset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_dataproc_v1_ResourcePreset_descriptor,
        new java.lang.String[] { "Id", "ZoneIds", "Cores", "Memory", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

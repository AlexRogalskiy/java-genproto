// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/compute/v1/host_type.proto

package yandex.cloud.api.compute.v1;

public final class HostTypeOuterClass {
  private HostTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HostTypeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.compute.v1.HostType)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Unique type identifier
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <pre>
     * Unique type identifier
     * </pre>
     *
     * <code>string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     * Total number of cores available for instances
     * </pre>
     *
     * <code>int64 cores = 2;</code>
     */
    long getCores();

    /**
     * <pre>
     * Ammount of memory available for instances
     * </pre>
     *
     * <code>int64 memory = 3;</code>
     */
    long getMemory();
  }
  /**
   * <pre>
   * Represents host resources
   * Note: Platform can use hosts with different number of memory and cores
   * TODO: Do we need sockets here?
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.compute.v1.HostType}
   */
  public  static final class HostType extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.compute.v1.HostType)
      HostTypeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HostType.newBuilder() to construct.
    private HostType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HostType() {
      id_ = "";
      cores_ = 0L;
      memory_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HostType(
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
            case 16: {

              cores_ = input.readInt64();
              break;
            }
            case 24: {

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return yandex.cloud.api.compute.v1.HostTypeOuterClass.internal_static_yandex_cloud_compute_v1_HostType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.compute.v1.HostTypeOuterClass.internal_static_yandex_cloud_compute_v1_HostType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.class, yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     * Unique type identifier
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
     * Unique type identifier
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

    public static final int CORES_FIELD_NUMBER = 2;
    private long cores_;
    /**
     * <pre>
     * Total number of cores available for instances
     * </pre>
     *
     * <code>int64 cores = 2;</code>
     */
    public long getCores() {
      return cores_;
    }

    public static final int MEMORY_FIELD_NUMBER = 3;
    private long memory_;
    /**
     * <pre>
     * Ammount of memory available for instances
     * </pre>
     *
     * <code>int64 memory = 3;</code>
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
      if (cores_ != 0L) {
        output.writeInt64(2, cores_);
      }
      if (memory_ != 0L) {
        output.writeInt64(3, memory_);
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
      if (cores_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, cores_);
      }
      if (memory_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, memory_);
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
      if (!(obj instanceof yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType)) {
        return super.equals(obj);
      }
      yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType other = (yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
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

    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType prototype) {
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
     * Represents host resources
     * Note: Platform can use hosts with different number of memory and cores
     * TODO: Do we need sockets here?
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.compute.v1.HostType}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.compute.v1.HostType)
        yandex.cloud.api.compute.v1.HostTypeOuterClass.HostTypeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.compute.v1.HostTypeOuterClass.internal_static_yandex_cloud_compute_v1_HostType_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.compute.v1.HostTypeOuterClass.internal_static_yandex_cloud_compute_v1_HostType_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.class, yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.Builder.class);
      }

      // Construct using yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.newBuilder()
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

        cores_ = 0L;

        memory_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.compute.v1.HostTypeOuterClass.internal_static_yandex_cloud_compute_v1_HostType_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType getDefaultInstanceForType() {
        return yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType build() {
        yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType buildPartial() {
        yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType result = new yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType(this);
        result.id_ = id_;
        result.cores_ = cores_;
        result.memory_ = memory_;
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
        if (other instanceof yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType) {
          return mergeFrom((yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType other) {
        if (other == yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
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
        yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType) e.getUnfinishedMessage();
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
       * Unique type identifier
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
       * Unique type identifier
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
       * Unique type identifier
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
       * Unique type identifier
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
       * Unique type identifier
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

      private long cores_ ;
      /**
       * <pre>
       * Total number of cores available for instances
       * </pre>
       *
       * <code>int64 cores = 2;</code>
       */
      public long getCores() {
        return cores_;
      }
      /**
       * <pre>
       * Total number of cores available for instances
       * </pre>
       *
       * <code>int64 cores = 2;</code>
       */
      public Builder setCores(long value) {
        
        cores_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Total number of cores available for instances
       * </pre>
       *
       * <code>int64 cores = 2;</code>
       */
      public Builder clearCores() {
        
        cores_ = 0L;
        onChanged();
        return this;
      }

      private long memory_ ;
      /**
       * <pre>
       * Ammount of memory available for instances
       * </pre>
       *
       * <code>int64 memory = 3;</code>
       */
      public long getMemory() {
        return memory_;
      }
      /**
       * <pre>
       * Ammount of memory available for instances
       * </pre>
       *
       * <code>int64 memory = 3;</code>
       */
      public Builder setMemory(long value) {
        
        memory_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Ammount of memory available for instances
       * </pre>
       *
       * <code>int64 memory = 3;</code>
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.compute.v1.HostType)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.compute.v1.HostType)
    private static final yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType();
    }

    public static yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HostType>
        PARSER = new com.google.protobuf.AbstractParser<HostType>() {
      @java.lang.Override
      public HostType parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HostType(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HostType> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HostType> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.compute.v1.HostTypeOuterClass.HostType getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_compute_v1_HostType_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_compute_v1_HostType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'yandex/cloud/compute/v1/host_type.prot" +
      "o\022\027yandex.cloud.compute.v1\"5\n\010HostType\022\n" +
      "\n\002id\030\001 \001(\t\022\r\n\005cores\030\002 \001(\003\022\016\n\006memory\030\003 \001(" +
      "\003Bb\n\033yandex.cloud.api.compute.v1ZCgithub" +
      ".com/yandex-cloud/go-genproto/yandex/clo" +
      "ud/compute/v1;computeb\006proto3"
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
    internal_static_yandex_cloud_compute_v1_HostType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_compute_v1_HostType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_compute_v1_HostType_descriptor,
        new java.lang.String[] { "Id", "Cores", "Memory", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

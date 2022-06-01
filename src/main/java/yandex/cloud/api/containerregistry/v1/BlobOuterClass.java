// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/containerregistry/v1/blob.proto

package yandex.cloud.api.containerregistry.v1;

public final class BlobOuterClass {
  private BlobOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlobOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.containerregistry.v1.Blob)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Output only. ID of the blob.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <pre>
     * Output only. ID of the blob.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     * Content-addressable identifier of the blob.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return The digest.
     */
    java.lang.String getDigest();
    /**
     * <pre>
     * Content-addressable identifier of the blob.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return The bytes for digest.
     */
    com.google.protobuf.ByteString
        getDigestBytes();

    /**
     * <pre>
     * Size of the blob, specified in bytes.
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @return The size.
     */
    long getSize();

    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @return A list containing the urls.
     */
    java.util.List<java.lang.String>
        getUrlsList();
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @return The count of urls.
     */
    int getUrlsCount();
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @param index The index of the element to return.
     * @return The urls at the given index.
     */
    java.lang.String getUrls(int index);
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the urls at the given index.
     */
    com.google.protobuf.ByteString
        getUrlsBytes(int index);
  }
  /**
   * <pre>
   * A Blob resource.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.containerregistry.v1.Blob}
   */
  public static final class Blob extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.containerregistry.v1.Blob)
      BlobOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Blob.newBuilder() to construct.
    private Blob(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Blob() {
      id_ = "";
      digest_ = "";
      urls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Blob();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Blob(
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

              digest_ = s;
              break;
            }
            case 24: {

              size_ = input.readInt64();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                urls_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              urls_.add(s);
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
          urls_ = urls_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return yandex.cloud.api.containerregistry.v1.BlobOuterClass.internal_static_yandex_cloud_containerregistry_v1_Blob_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.containerregistry.v1.BlobOuterClass.internal_static_yandex_cloud_containerregistry_v1_Blob_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.class, yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     * Output only. ID of the blob.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
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
     * Output only. ID of the blob.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
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

    public static final int DIGEST_FIELD_NUMBER = 2;
    private volatile java.lang.Object digest_;
    /**
     * <pre>
     * Content-addressable identifier of the blob.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return The digest.
     */
    @java.lang.Override
    public java.lang.String getDigest() {
      java.lang.Object ref = digest_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        digest_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Content-addressable identifier of the blob.
     * </pre>
     *
     * <code>string digest = 2;</code>
     * @return The bytes for digest.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDigestBytes() {
      java.lang.Object ref = digest_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        digest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SIZE_FIELD_NUMBER = 3;
    private long size_;
    /**
     * <pre>
     * Size of the blob, specified in bytes.
     * </pre>
     *
     * <code>int64 size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }

    public static final int URLS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList urls_;
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @return A list containing the urls.
     */
    public com.google.protobuf.ProtocolStringList
        getUrlsList() {
      return urls_;
    }
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @return The count of urls.
     */
    public int getUrlsCount() {
      return urls_.size();
    }
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @param index The index of the element to return.
     * @return The urls at the given index.
     */
    public java.lang.String getUrls(int index) {
      return urls_.get(index);
    }
    /**
     * <pre>
     * List of blob urls.
     * </pre>
     *
     * <code>repeated string urls = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the urls at the given index.
     */
    public com.google.protobuf.ByteString
        getUrlsBytes(int index) {
      return urls_.getByteString(index);
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(digest_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, digest_);
      }
      if (size_ != 0L) {
        output.writeInt64(3, size_);
      }
      for (int i = 0; i < urls_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, urls_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(digest_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, digest_);
      }
      if (size_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, size_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < urls_.size(); i++) {
          dataSize += computeStringSizeNoTag(urls_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getUrlsList().size();
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
      if (!(obj instanceof yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob)) {
        return super.equals(obj);
      }
      yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob other = (yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob) obj;

      if (!getId()
          .equals(other.getId())) return false;
      if (!getDigest()
          .equals(other.getDigest())) return false;
      if (getSize()
          != other.getSize()) return false;
      if (!getUrlsList()
          .equals(other.getUrlsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
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
      hash = (37 * hash) + DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getDigest().hashCode();
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSize());
      if (getUrlsCount() > 0) {
        hash = (37 * hash) + URLS_FIELD_NUMBER;
        hash = (53 * hash) + getUrlsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob prototype) {
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
     * A Blob resource.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.containerregistry.v1.Blob}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.containerregistry.v1.Blob)
        yandex.cloud.api.containerregistry.v1.BlobOuterClass.BlobOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.containerregistry.v1.BlobOuterClass.internal_static_yandex_cloud_containerregistry_v1_Blob_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.containerregistry.v1.BlobOuterClass.internal_static_yandex_cloud_containerregistry_v1_Blob_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.class, yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.Builder.class);
      }

      // Construct using yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.newBuilder()
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

        digest_ = "";

        size_ = 0L;

        urls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.containerregistry.v1.BlobOuterClass.internal_static_yandex_cloud_containerregistry_v1_Blob_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob getDefaultInstanceForType() {
        return yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob build() {
        yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob buildPartial() {
        yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob result = new yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob(this);
        int from_bitField0_ = bitField0_;
        result.id_ = id_;
        result.digest_ = digest_;
        result.size_ = size_;
        if (((bitField0_ & 0x00000001) != 0)) {
          urls_ = urls_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.urls_ = urls_;
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
        if (other instanceof yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob) {
          return mergeFrom((yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob other) {
        if (other == yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getDigest().isEmpty()) {
          digest_ = other.digest_;
          onChanged();
        }
        if (other.getSize() != 0L) {
          setSize(other.getSize());
        }
        if (!other.urls_.isEmpty()) {
          if (urls_.isEmpty()) {
            urls_ = other.urls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUrlsIsMutable();
            urls_.addAll(other.urls_);
          }
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
        yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob) e.getUnfinishedMessage();
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
       * Output only. ID of the blob.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return The id.
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
       * Output only. ID of the blob.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return The bytes for id.
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
       * Output only. ID of the blob.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
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
       * Output only. ID of the blob.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Output only. ID of the blob.
       * </pre>
       *
       * <code>string id = 1;</code>
       * @param value The bytes for id to set.
       * @return This builder for chaining.
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

      private java.lang.Object digest_ = "";
      /**
       * <pre>
       * Content-addressable identifier of the blob.
       * </pre>
       *
       * <code>string digest = 2;</code>
       * @return The digest.
       */
      public java.lang.String getDigest() {
        java.lang.Object ref = digest_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          digest_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Content-addressable identifier of the blob.
       * </pre>
       *
       * <code>string digest = 2;</code>
       * @return The bytes for digest.
       */
      public com.google.protobuf.ByteString
          getDigestBytes() {
        java.lang.Object ref = digest_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          digest_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Content-addressable identifier of the blob.
       * </pre>
       *
       * <code>string digest = 2;</code>
       * @param value The digest to set.
       * @return This builder for chaining.
       */
      public Builder setDigest(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        digest_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Content-addressable identifier of the blob.
       * </pre>
       *
       * <code>string digest = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDigest() {
        
        digest_ = getDefaultInstance().getDigest();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Content-addressable identifier of the blob.
       * </pre>
       *
       * <code>string digest = 2;</code>
       * @param value The bytes for digest to set.
       * @return This builder for chaining.
       */
      public Builder setDigestBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        digest_ = value;
        onChanged();
        return this;
      }

      private long size_ ;
      /**
       * <pre>
       * Size of the blob, specified in bytes.
       * </pre>
       *
       * <code>int64 size = 3;</code>
       * @return The size.
       */
      @java.lang.Override
      public long getSize() {
        return size_;
      }
      /**
       * <pre>
       * Size of the blob, specified in bytes.
       * </pre>
       *
       * <code>int64 size = 3;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(long value) {
        
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Size of the blob, specified in bytes.
       * </pre>
       *
       * <code>int64 size = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        
        size_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList urls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureUrlsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          urls_ = new com.google.protobuf.LazyStringArrayList(urls_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @return A list containing the urls.
       */
      public com.google.protobuf.ProtocolStringList
          getUrlsList() {
        return urls_.getUnmodifiableView();
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @return The count of urls.
       */
      public int getUrlsCount() {
        return urls_.size();
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @param index The index of the element to return.
       * @return The urls at the given index.
       */
      public java.lang.String getUrls(int index) {
        return urls_.get(index);
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @param index The index of the value to return.
       * @return The bytes of the urls at the given index.
       */
      public com.google.protobuf.ByteString
          getUrlsBytes(int index) {
        return urls_.getByteString(index);
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @param index The index to set the value at.
       * @param value The urls to set.
       * @return This builder for chaining.
       */
      public Builder setUrls(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUrlsIsMutable();
        urls_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @param value The urls to add.
       * @return This builder for chaining.
       */
      public Builder addUrls(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUrlsIsMutable();
        urls_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @param values The urls to add.
       * @return This builder for chaining.
       */
      public Builder addAllUrls(
          java.lang.Iterable<java.lang.String> values) {
        ensureUrlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, urls_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUrls() {
        urls_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * List of blob urls.
       * </pre>
       *
       * <code>repeated string urls = 4;</code>
       * @param value The bytes of the urls to add.
       * @return This builder for chaining.
       */
      public Builder addUrlsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureUrlsIsMutable();
        urls_.add(value);
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.containerregistry.v1.Blob)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.containerregistry.v1.Blob)
    private static final yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob();
    }

    public static yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Blob>
        PARSER = new com.google.protobuf.AbstractParser<Blob>() {
      @java.lang.Override
      public Blob parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Blob(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Blob> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Blob> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.containerregistry.v1.BlobOuterClass.Blob getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_containerregistry_v1_Blob_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_containerregistry_v1_Blob_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,yandex/cloud/containerregistry/v1/blob" +
      ".proto\022!yandex.cloud.containerregistry.v" +
      "1\">\n\004Blob\022\n\n\002id\030\001 \001(\t\022\016\n\006digest\030\002 \001(\t\022\014\n" +
      "\004size\030\003 \001(\003\022\014\n\004urls\030\004 \003(\tB\200\001\n%yandex.clo" +
      "ud.api.containerregistry.v1ZWgithub.com/" +
      "yandex-cloud/go-genproto/yandex/cloud/co" +
      "ntainerregistry/v1;containerregistryb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_yandex_cloud_containerregistry_v1_Blob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_containerregistry_v1_Blob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_containerregistry_v1_Blob_descriptor,
        new java.lang.String[] { "Id", "Digest", "Size", "Urls", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

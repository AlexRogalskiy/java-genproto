// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/apploadbalancer/v1/tls.proto

package yandex.cloud.api.apploadbalancer.v1;

public final class Tls {
  private Tls() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ValidationContextOrBuilder extends
      // @@protoc_insertion_point(interface_extends:yandex.cloud.apploadbalancer.v1.ValidationContext)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string trusted_ca_id = 1;</code>
     */
    java.lang.String getTrustedCaId();
    /**
     * <code>string trusted_ca_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getTrustedCaIdBytes();

    /**
     * <pre>
     * X.509 certificate contents in PEM format.
     * </pre>
     *
     * <code>string trusted_ca_bytes = 2;</code>
     */
    java.lang.String getTrustedCaBytes();
    /**
     * <pre>
     * X.509 certificate contents in PEM format.
     * </pre>
     *
     * <code>string trusted_ca_bytes = 2;</code>
     */
    com.google.protobuf.ByteString
        getTrustedCaBytesBytes();

    public yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.TrustedCaCase getTrustedCaCase();
  }
  /**
   * <pre>
   * A TLS validation context resource.
   * </pre>
   *
   * Protobuf type {@code yandex.cloud.apploadbalancer.v1.ValidationContext}
   */
  public  static final class ValidationContext extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:yandex.cloud.apploadbalancer.v1.ValidationContext)
      ValidationContextOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ValidationContext.newBuilder() to construct.
    private ValidationContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ValidationContext() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ValidationContext(
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
              trustedCaCase_ = 1;
              trustedCa_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              trustedCaCase_ = 2;
              trustedCa_ = s;
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
      return yandex.cloud.api.apploadbalancer.v1.Tls.internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return yandex.cloud.api.apploadbalancer.v1.Tls.internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.class, yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.Builder.class);
    }

    private int trustedCaCase_ = 0;
    private java.lang.Object trustedCa_;
    public enum TrustedCaCase
        implements com.google.protobuf.Internal.EnumLite {
      TRUSTED_CA_ID(1),
      TRUSTED_CA_BYTES(2),
      TRUSTEDCA_NOT_SET(0);
      private final int value;
      private TrustedCaCase(int value) {
        this.value = value;
      }
      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static TrustedCaCase valueOf(int value) {
        return forNumber(value);
      }

      public static TrustedCaCase forNumber(int value) {
        switch (value) {
          case 1: return TRUSTED_CA_ID;
          case 2: return TRUSTED_CA_BYTES;
          case 0: return TRUSTEDCA_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public TrustedCaCase
    getTrustedCaCase() {
      return TrustedCaCase.forNumber(
          trustedCaCase_);
    }

    public static final int TRUSTED_CA_ID_FIELD_NUMBER = 1;
    /**
     * <code>string trusted_ca_id = 1;</code>
     */
    public java.lang.String getTrustedCaId() {
      java.lang.Object ref = "";
      if (trustedCaCase_ == 1) {
        ref = trustedCa_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (trustedCaCase_ == 1) {
          trustedCa_ = s;
        }
        return s;
      }
    }
    /**
     * <code>string trusted_ca_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTrustedCaIdBytes() {
      java.lang.Object ref = "";
      if (trustedCaCase_ == 1) {
        ref = trustedCa_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (trustedCaCase_ == 1) {
          trustedCa_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TRUSTED_CA_BYTES_FIELD_NUMBER = 2;
    /**
     * <pre>
     * X.509 certificate contents in PEM format.
     * </pre>
     *
     * <code>string trusted_ca_bytes = 2;</code>
     */
    public java.lang.String getTrustedCaBytes() {
      java.lang.Object ref = "";
      if (trustedCaCase_ == 2) {
        ref = trustedCa_;
      }
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (trustedCaCase_ == 2) {
          trustedCa_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * X.509 certificate contents in PEM format.
     * </pre>
     *
     * <code>string trusted_ca_bytes = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTrustedCaBytesBytes() {
      java.lang.Object ref = "";
      if (trustedCaCase_ == 2) {
        ref = trustedCa_;
      }
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (trustedCaCase_ == 2) {
          trustedCa_ = b;
        }
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
      if (trustedCaCase_ == 1) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trustedCa_);
      }
      if (trustedCaCase_ == 2) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, trustedCa_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (trustedCaCase_ == 1) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trustedCa_);
      }
      if (trustedCaCase_ == 2) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, trustedCa_);
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
      if (!(obj instanceof yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext)) {
        return super.equals(obj);
      }
      yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext other = (yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext) obj;

      boolean result = true;
      result = result && getTrustedCaCase().equals(
          other.getTrustedCaCase());
      if (!result) return false;
      switch (trustedCaCase_) {
        case 1:
          result = result && getTrustedCaId()
              .equals(other.getTrustedCaId());
          break;
        case 2:
          result = result && getTrustedCaBytes()
              .equals(other.getTrustedCaBytes());
          break;
        case 0:
        default:
      }
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
      switch (trustedCaCase_) {
        case 1:
          hash = (37 * hash) + TRUSTED_CA_ID_FIELD_NUMBER;
          hash = (53 * hash) + getTrustedCaId().hashCode();
          break;
        case 2:
          hash = (37 * hash) + TRUSTED_CA_BYTES_FIELD_NUMBER;
          hash = (53 * hash) + getTrustedCaBytes().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parseFrom(
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
    public static Builder newBuilder(yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext prototype) {
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
     * A TLS validation context resource.
     * </pre>
     *
     * Protobuf type {@code yandex.cloud.apploadbalancer.v1.ValidationContext}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:yandex.cloud.apploadbalancer.v1.ValidationContext)
        yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContextOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return yandex.cloud.api.apploadbalancer.v1.Tls.internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return yandex.cloud.api.apploadbalancer.v1.Tls.internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.class, yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.Builder.class);
      }

      // Construct using yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.newBuilder()
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
        trustedCaCase_ = 0;
        trustedCa_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return yandex.cloud.api.apploadbalancer.v1.Tls.internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_descriptor;
      }

      @java.lang.Override
      public yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext getDefaultInstanceForType() {
        return yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.getDefaultInstance();
      }

      @java.lang.Override
      public yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext build() {
        yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext buildPartial() {
        yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext result = new yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext(this);
        if (trustedCaCase_ == 1) {
          result.trustedCa_ = trustedCa_;
        }
        if (trustedCaCase_ == 2) {
          result.trustedCa_ = trustedCa_;
        }
        result.trustedCaCase_ = trustedCaCase_;
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
        if (other instanceof yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext) {
          return mergeFrom((yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext other) {
        if (other == yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext.getDefaultInstance()) return this;
        switch (other.getTrustedCaCase()) {
          case TRUSTED_CA_ID: {
            trustedCaCase_ = 1;
            trustedCa_ = other.trustedCa_;
            onChanged();
            break;
          }
          case TRUSTED_CA_BYTES: {
            trustedCaCase_ = 2;
            trustedCa_ = other.trustedCa_;
            onChanged();
            break;
          }
          case TRUSTEDCA_NOT_SET: {
            break;
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
        yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int trustedCaCase_ = 0;
      private java.lang.Object trustedCa_;
      public TrustedCaCase
          getTrustedCaCase() {
        return TrustedCaCase.forNumber(
            trustedCaCase_);
      }

      public Builder clearTrustedCa() {
        trustedCaCase_ = 0;
        trustedCa_ = null;
        onChanged();
        return this;
      }


      /**
       * <code>string trusted_ca_id = 1;</code>
       */
      public java.lang.String getTrustedCaId() {
        java.lang.Object ref = "";
        if (trustedCaCase_ == 1) {
          ref = trustedCa_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (trustedCaCase_ == 1) {
            trustedCa_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string trusted_ca_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTrustedCaIdBytes() {
        java.lang.Object ref = "";
        if (trustedCaCase_ == 1) {
          ref = trustedCa_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (trustedCaCase_ == 1) {
            trustedCa_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string trusted_ca_id = 1;</code>
       */
      public Builder setTrustedCaId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  trustedCaCase_ = 1;
        trustedCa_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string trusted_ca_id = 1;</code>
       */
      public Builder clearTrustedCaId() {
        if (trustedCaCase_ == 1) {
          trustedCaCase_ = 0;
          trustedCa_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <code>string trusted_ca_id = 1;</code>
       */
      public Builder setTrustedCaIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        trustedCaCase_ = 1;
        trustedCa_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * X.509 certificate contents in PEM format.
       * </pre>
       *
       * <code>string trusted_ca_bytes = 2;</code>
       */
      public java.lang.String getTrustedCaBytes() {
        java.lang.Object ref = "";
        if (trustedCaCase_ == 2) {
          ref = trustedCa_;
        }
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (trustedCaCase_ == 2) {
            trustedCa_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * X.509 certificate contents in PEM format.
       * </pre>
       *
       * <code>string trusted_ca_bytes = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTrustedCaBytesBytes() {
        java.lang.Object ref = "";
        if (trustedCaCase_ == 2) {
          ref = trustedCa_;
        }
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          if (trustedCaCase_ == 2) {
            trustedCa_ = b;
          }
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * X.509 certificate contents in PEM format.
       * </pre>
       *
       * <code>string trusted_ca_bytes = 2;</code>
       */
      public Builder setTrustedCaBytes(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  trustedCaCase_ = 2;
        trustedCa_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * X.509 certificate contents in PEM format.
       * </pre>
       *
       * <code>string trusted_ca_bytes = 2;</code>
       */
      public Builder clearTrustedCaBytes() {
        if (trustedCaCase_ == 2) {
          trustedCaCase_ = 0;
          trustedCa_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * X.509 certificate contents in PEM format.
       * </pre>
       *
       * <code>string trusted_ca_bytes = 2;</code>
       */
      public Builder setTrustedCaBytesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        trustedCaCase_ = 2;
        trustedCa_ = value;
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


      // @@protoc_insertion_point(builder_scope:yandex.cloud.apploadbalancer.v1.ValidationContext)
    }

    // @@protoc_insertion_point(class_scope:yandex.cloud.apploadbalancer.v1.ValidationContext)
    private static final yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext();
    }

    public static yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ValidationContext>
        PARSER = new com.google.protobuf.AbstractParser<ValidationContext>() {
      @java.lang.Override
      public ValidationContext parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ValidationContext(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ValidationContext> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ValidationContext> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public yandex.cloud.api.apploadbalancer.v1.Tls.ValidationContext getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)yandex/cloud/apploadbalancer/v1/tls.pr" +
      "oto\022\037yandex.cloud.apploadbalancer.v1\032\035ya" +
      "ndex/cloud/validation.proto\"\\\n\021Validatio" +
      "nContext\022\027\n\rtrusted_ca_id\030\001 \001(\tH\000\022\032\n\020tru" +
      "sted_ca_bytes\030\002 \001(\tH\000B\022\n\ntrusted_ca\022\004\300\3011" +
      "\001Bz\n#yandex.cloud.api.apploadbalancer.v1" +
      "ZSgithub.com/yandex-cloud/go-genproto/ya" +
      "ndex/cloud/apploadbalancer/v1;apploadbal" +
      "ancerb\006proto3"
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
          yandex.cloud.api.Validation.getDescriptor(),
        }, assigner);
    internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_yandex_cloud_apploadbalancer_v1_ValidationContext_descriptor,
        new java.lang.String[] { "TrustedCaId", "TrustedCaBytes", "TrustedCa", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(yandex.cloud.api.Validation.exactlyOne);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    yandex.cloud.api.Validation.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.Authentication}
 */
public final class Authentication extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.Authentication)
    AuthenticationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Authentication.newBuilder() to construct.
  private Authentication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Authentication() {
    method_ = 0;
    identity_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Authentication();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Authentication(
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

            method_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            identity_ = s;
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
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Authentication_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Authentication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.Authentication.class, apache.rocketmq.v2.Authentication.Builder.class);
  }

  public static final int METHOD_FIELD_NUMBER = 1;
  private int method_;
  /**
   * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
   * @return The enum numeric value on the wire for method.
   */
  @java.lang.Override public int getMethodValue() {
    return method_;
  }
  /**
   * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
   * @return The method.
   */
  @java.lang.Override public apache.rocketmq.v2.AuthenticationMethod getMethod() {
    @SuppressWarnings("deprecation")
    apache.rocketmq.v2.AuthenticationMethod result = apache.rocketmq.v2.AuthenticationMethod.valueOf(method_);
    return result == null ? apache.rocketmq.v2.AuthenticationMethod.UNRECOGNIZED : result;
  }

  public static final int IDENTITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object identity_;
  /**
   * <code>string identity = 2;</code>
   * @return The identity.
   */
  @java.lang.Override
  public java.lang.String getIdentity() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identity_ = s;
      return s;
    }
  }
  /**
   * <code>string identity = 2;</code>
   * @return The bytes for identity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdentityBytes() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identity_ = b;
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
    if (method_ != apache.rocketmq.v2.AuthenticationMethod.AUTHENTICATION_METHOD_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, method_);
    }
    if (!getIdentityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (method_ != apache.rocketmq.v2.AuthenticationMethod.AUTHENTICATION_METHOD_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, method_);
    }
    if (!getIdentityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identity_);
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
    if (!(obj instanceof apache.rocketmq.v2.Authentication)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.Authentication other = (apache.rocketmq.v2.Authentication) obj;

    if (method_ != other.method_) return false;
    if (!getIdentity()
        .equals(other.getIdentity())) return false;
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
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + method_;
    hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getIdentity().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.Authentication parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.Authentication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Authentication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.Authentication parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.Authentication prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.Authentication}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.Authentication)
      apache.rocketmq.v2.AuthenticationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Authentication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Authentication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.Authentication.class, apache.rocketmq.v2.Authentication.Builder.class);
    }

    // Construct using apache.rocketmq.v2.Authentication.newBuilder()
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
      method_ = 0;

      identity_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_Authentication_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.Authentication getDefaultInstanceForType() {
      return apache.rocketmq.v2.Authentication.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.Authentication build() {
      apache.rocketmq.v2.Authentication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.Authentication buildPartial() {
      apache.rocketmq.v2.Authentication result = new apache.rocketmq.v2.Authentication(this);
      result.method_ = method_;
      result.identity_ = identity_;
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
      if (other instanceof apache.rocketmq.v2.Authentication) {
        return mergeFrom((apache.rocketmq.v2.Authentication)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.Authentication other) {
      if (other == apache.rocketmq.v2.Authentication.getDefaultInstance()) return this;
      if (other.method_ != 0) {
        setMethodValue(other.getMethodValue());
      }
      if (!other.getIdentity().isEmpty()) {
        identity_ = other.identity_;
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
      apache.rocketmq.v2.Authentication parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.Authentication) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int method_ = 0;
    /**
     * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
     * @return The enum numeric value on the wire for method.
     */
    @java.lang.Override public int getMethodValue() {
      return method_;
    }
    /**
     * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
     * @param value The enum numeric value on the wire for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodValue(int value) {
      
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
     * @return The method.
     */
    @java.lang.Override
    public apache.rocketmq.v2.AuthenticationMethod getMethod() {
      @SuppressWarnings("deprecation")
      apache.rocketmq.v2.AuthenticationMethod result = apache.rocketmq.v2.AuthenticationMethod.valueOf(method_);
      return result == null ? apache.rocketmq.v2.AuthenticationMethod.UNRECOGNIZED : result;
    }
    /**
     * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(apache.rocketmq.v2.AuthenticationMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      method_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.AuthenticationMethod method = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      
      method_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object identity_ = "";
    /**
     * <code>string identity = 2;</code>
     * @return The identity.
     */
    public java.lang.String getIdentity() {
      java.lang.Object ref = identity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identity = 2;</code>
     * @return The bytes for identity.
     */
    public com.google.protobuf.ByteString
        getIdentityBytes() {
      java.lang.Object ref = identity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identity = 2;</code>
     * @param value The identity to set.
     * @return This builder for chaining.
     */
    public Builder setIdentity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdentity() {
      
      identity_ = getDefaultInstance().getIdentity();
      onChanged();
      return this;
    }
    /**
     * <code>string identity = 2;</code>
     * @param value The bytes for identity to set.
     * @return This builder for chaining.
     */
    public Builder setIdentityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identity_ = value;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.Authentication)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.Authentication)
  private static final apache.rocketmq.v2.Authentication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.Authentication();
  }

  public static apache.rocketmq.v2.Authentication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Authentication>
      PARSER = new com.google.protobuf.AbstractParser<Authentication>() {
    @java.lang.Override
    public Authentication parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Authentication(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Authentication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Authentication> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.Authentication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

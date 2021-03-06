// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.RetryPolicy}
 */
public final class RetryPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.RetryPolicy)
    RetryPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RetryPolicy.newBuilder() to construct.
  private RetryPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetryPolicy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RetryPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RetryPolicy(
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

            maxAttempts_ = input.readInt32();
            break;
          }
          case 18: {
            apache.rocketmq.v2.ExponentialBackoff.Builder subBuilder = null;
            if (strategyCase_ == 2) {
              subBuilder = ((apache.rocketmq.v2.ExponentialBackoff) strategy_).toBuilder();
            }
            strategy_ =
                input.readMessage(apache.rocketmq.v2.ExponentialBackoff.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((apache.rocketmq.v2.ExponentialBackoff) strategy_);
              strategy_ = subBuilder.buildPartial();
            }
            strategyCase_ = 2;
            break;
          }
          case 26: {
            apache.rocketmq.v2.CustomizedBackoff.Builder subBuilder = null;
            if (strategyCase_ == 3) {
              subBuilder = ((apache.rocketmq.v2.CustomizedBackoff) strategy_).toBuilder();
            }
            strategy_ =
                input.readMessage(apache.rocketmq.v2.CustomizedBackoff.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((apache.rocketmq.v2.CustomizedBackoff) strategy_);
              strategy_ = subBuilder.buildPartial();
            }
            strategyCase_ = 3;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_RetryPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_RetryPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.RetryPolicy.class, apache.rocketmq.v2.RetryPolicy.Builder.class);
  }

  private int strategyCase_ = 0;
  private java.lang.Object strategy_;
  public enum StrategyCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXPONENTIAL_BACKOFF(2),
    CUSTOMIZED_BACKOFF(3),
    STRATEGY_NOT_SET(0);
    private final int value;
    private StrategyCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static StrategyCase valueOf(int value) {
      return forNumber(value);
    }

    public static StrategyCase forNumber(int value) {
      switch (value) {
        case 2: return EXPONENTIAL_BACKOFF;
        case 3: return CUSTOMIZED_BACKOFF;
        case 0: return STRATEGY_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StrategyCase
  getStrategyCase() {
    return StrategyCase.forNumber(
        strategyCase_);
  }

  public static final int MAX_ATTEMPTS_FIELD_NUMBER = 1;
  private int maxAttempts_;
  /**
   * <code>int32 max_attempts = 1;</code>
   * @return The maxAttempts.
   */
  @java.lang.Override
  public int getMaxAttempts() {
    return maxAttempts_;
  }

  public static final int EXPONENTIAL_BACKOFF_FIELD_NUMBER = 2;
  /**
   * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
   * @return Whether the exponentialBackoff field is set.
   */
  @java.lang.Override
  public boolean hasExponentialBackoff() {
    return strategyCase_ == 2;
  }
  /**
   * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
   * @return The exponentialBackoff.
   */
  @java.lang.Override
  public apache.rocketmq.v2.ExponentialBackoff getExponentialBackoff() {
    if (strategyCase_ == 2) {
       return (apache.rocketmq.v2.ExponentialBackoff) strategy_;
    }
    return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
  }
  /**
   * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.ExponentialBackoffOrBuilder getExponentialBackoffOrBuilder() {
    if (strategyCase_ == 2) {
       return (apache.rocketmq.v2.ExponentialBackoff) strategy_;
    }
    return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
  }

  public static final int CUSTOMIZED_BACKOFF_FIELD_NUMBER = 3;
  /**
   * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
   * @return Whether the customizedBackoff field is set.
   */
  @java.lang.Override
  public boolean hasCustomizedBackoff() {
    return strategyCase_ == 3;
  }
  /**
   * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
   * @return The customizedBackoff.
   */
  @java.lang.Override
  public apache.rocketmq.v2.CustomizedBackoff getCustomizedBackoff() {
    if (strategyCase_ == 3) {
       return (apache.rocketmq.v2.CustomizedBackoff) strategy_;
    }
    return apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance();
  }
  /**
   * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.CustomizedBackoffOrBuilder getCustomizedBackoffOrBuilder() {
    if (strategyCase_ == 3) {
       return (apache.rocketmq.v2.CustomizedBackoff) strategy_;
    }
    return apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance();
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
    if (maxAttempts_ != 0) {
      output.writeInt32(1, maxAttempts_);
    }
    if (strategyCase_ == 2) {
      output.writeMessage(2, (apache.rocketmq.v2.ExponentialBackoff) strategy_);
    }
    if (strategyCase_ == 3) {
      output.writeMessage(3, (apache.rocketmq.v2.CustomizedBackoff) strategy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxAttempts_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, maxAttempts_);
    }
    if (strategyCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (apache.rocketmq.v2.ExponentialBackoff) strategy_);
    }
    if (strategyCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (apache.rocketmq.v2.CustomizedBackoff) strategy_);
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
    if (!(obj instanceof apache.rocketmq.v2.RetryPolicy)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.RetryPolicy other = (apache.rocketmq.v2.RetryPolicy) obj;

    if (getMaxAttempts()
        != other.getMaxAttempts()) return false;
    if (!getStrategyCase().equals(other.getStrategyCase())) return false;
    switch (strategyCase_) {
      case 2:
        if (!getExponentialBackoff()
            .equals(other.getExponentialBackoff())) return false;
        break;
      case 3:
        if (!getCustomizedBackoff()
            .equals(other.getCustomizedBackoff())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + MAX_ATTEMPTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxAttempts();
    switch (strategyCase_) {
      case 2:
        hash = (37 * hash) + EXPONENTIAL_BACKOFF_FIELD_NUMBER;
        hash = (53 * hash) + getExponentialBackoff().hashCode();
        break;
      case 3:
        hash = (37 * hash) + CUSTOMIZED_BACKOFF_FIELD_NUMBER;
        hash = (53 * hash) + getCustomizedBackoff().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.RetryPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.RetryPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.RetryPolicy parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.RetryPolicy prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.RetryPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.RetryPolicy)
      apache.rocketmq.v2.RetryPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_RetryPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_RetryPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.RetryPolicy.class, apache.rocketmq.v2.RetryPolicy.Builder.class);
    }

    // Construct using apache.rocketmq.v2.RetryPolicy.newBuilder()
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
      maxAttempts_ = 0;

      strategyCase_ = 0;
      strategy_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQDomain.internal_static_apache_rocketmq_v2_RetryPolicy_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.RetryPolicy getDefaultInstanceForType() {
      return apache.rocketmq.v2.RetryPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.RetryPolicy build() {
      apache.rocketmq.v2.RetryPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.RetryPolicy buildPartial() {
      apache.rocketmq.v2.RetryPolicy result = new apache.rocketmq.v2.RetryPolicy(this);
      result.maxAttempts_ = maxAttempts_;
      if (strategyCase_ == 2) {
        if (exponentialBackoffBuilder_ == null) {
          result.strategy_ = strategy_;
        } else {
          result.strategy_ = exponentialBackoffBuilder_.build();
        }
      }
      if (strategyCase_ == 3) {
        if (customizedBackoffBuilder_ == null) {
          result.strategy_ = strategy_;
        } else {
          result.strategy_ = customizedBackoffBuilder_.build();
        }
      }
      result.strategyCase_ = strategyCase_;
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
      if (other instanceof apache.rocketmq.v2.RetryPolicy) {
        return mergeFrom((apache.rocketmq.v2.RetryPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.RetryPolicy other) {
      if (other == apache.rocketmq.v2.RetryPolicy.getDefaultInstance()) return this;
      if (other.getMaxAttempts() != 0) {
        setMaxAttempts(other.getMaxAttempts());
      }
      switch (other.getStrategyCase()) {
        case EXPONENTIAL_BACKOFF: {
          mergeExponentialBackoff(other.getExponentialBackoff());
          break;
        }
        case CUSTOMIZED_BACKOFF: {
          mergeCustomizedBackoff(other.getCustomizedBackoff());
          break;
        }
        case STRATEGY_NOT_SET: {
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
      apache.rocketmq.v2.RetryPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.RetryPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int strategyCase_ = 0;
    private java.lang.Object strategy_;
    public StrategyCase
        getStrategyCase() {
      return StrategyCase.forNumber(
          strategyCase_);
    }

    public Builder clearStrategy() {
      strategyCase_ = 0;
      strategy_ = null;
      onChanged();
      return this;
    }


    private int maxAttempts_ ;
    /**
     * <code>int32 max_attempts = 1;</code>
     * @return The maxAttempts.
     */
    @java.lang.Override
    public int getMaxAttempts() {
      return maxAttempts_;
    }
    /**
     * <code>int32 max_attempts = 1;</code>
     * @param value The maxAttempts to set.
     * @return This builder for chaining.
     */
    public Builder setMaxAttempts(int value) {
      
      maxAttempts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_attempts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxAttempts() {
      
      maxAttempts_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.ExponentialBackoff, apache.rocketmq.v2.ExponentialBackoff.Builder, apache.rocketmq.v2.ExponentialBackoffOrBuilder> exponentialBackoffBuilder_;
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     * @return Whether the exponentialBackoff field is set.
     */
    @java.lang.Override
    public boolean hasExponentialBackoff() {
      return strategyCase_ == 2;
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     * @return The exponentialBackoff.
     */
    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoff getExponentialBackoff() {
      if (exponentialBackoffBuilder_ == null) {
        if (strategyCase_ == 2) {
          return (apache.rocketmq.v2.ExponentialBackoff) strategy_;
        }
        return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
      } else {
        if (strategyCase_ == 2) {
          return exponentialBackoffBuilder_.getMessage();
        }
        return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    public Builder setExponentialBackoff(apache.rocketmq.v2.ExponentialBackoff value) {
      if (exponentialBackoffBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        strategy_ = value;
        onChanged();
      } else {
        exponentialBackoffBuilder_.setMessage(value);
      }
      strategyCase_ = 2;
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    public Builder setExponentialBackoff(
        apache.rocketmq.v2.ExponentialBackoff.Builder builderForValue) {
      if (exponentialBackoffBuilder_ == null) {
        strategy_ = builderForValue.build();
        onChanged();
      } else {
        exponentialBackoffBuilder_.setMessage(builderForValue.build());
      }
      strategyCase_ = 2;
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    public Builder mergeExponentialBackoff(apache.rocketmq.v2.ExponentialBackoff value) {
      if (exponentialBackoffBuilder_ == null) {
        if (strategyCase_ == 2 &&
            strategy_ != apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance()) {
          strategy_ = apache.rocketmq.v2.ExponentialBackoff.newBuilder((apache.rocketmq.v2.ExponentialBackoff) strategy_)
              .mergeFrom(value).buildPartial();
        } else {
          strategy_ = value;
        }
        onChanged();
      } else {
        if (strategyCase_ == 2) {
          exponentialBackoffBuilder_.mergeFrom(value);
        } else {
          exponentialBackoffBuilder_.setMessage(value);
        }
      }
      strategyCase_ = 2;
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    public Builder clearExponentialBackoff() {
      if (exponentialBackoffBuilder_ == null) {
        if (strategyCase_ == 2) {
          strategyCase_ = 0;
          strategy_ = null;
          onChanged();
        }
      } else {
        if (strategyCase_ == 2) {
          strategyCase_ = 0;
          strategy_ = null;
        }
        exponentialBackoffBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    public apache.rocketmq.v2.ExponentialBackoff.Builder getExponentialBackoffBuilder() {
      return getExponentialBackoffFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    @java.lang.Override
    public apache.rocketmq.v2.ExponentialBackoffOrBuilder getExponentialBackoffOrBuilder() {
      if ((strategyCase_ == 2) && (exponentialBackoffBuilder_ != null)) {
        return exponentialBackoffBuilder_.getMessageOrBuilder();
      } else {
        if (strategyCase_ == 2) {
          return (apache.rocketmq.v2.ExponentialBackoff) strategy_;
        }
        return apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.ExponentialBackoff exponential_backoff = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.ExponentialBackoff, apache.rocketmq.v2.ExponentialBackoff.Builder, apache.rocketmq.v2.ExponentialBackoffOrBuilder> 
        getExponentialBackoffFieldBuilder() {
      if (exponentialBackoffBuilder_ == null) {
        if (!(strategyCase_ == 2)) {
          strategy_ = apache.rocketmq.v2.ExponentialBackoff.getDefaultInstance();
        }
        exponentialBackoffBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.ExponentialBackoff, apache.rocketmq.v2.ExponentialBackoff.Builder, apache.rocketmq.v2.ExponentialBackoffOrBuilder>(
                (apache.rocketmq.v2.ExponentialBackoff) strategy_,
                getParentForChildren(),
                isClean());
        strategy_ = null;
      }
      strategyCase_ = 2;
      onChanged();;
      return exponentialBackoffBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.CustomizedBackoff, apache.rocketmq.v2.CustomizedBackoff.Builder, apache.rocketmq.v2.CustomizedBackoffOrBuilder> customizedBackoffBuilder_;
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     * @return Whether the customizedBackoff field is set.
     */
    @java.lang.Override
    public boolean hasCustomizedBackoff() {
      return strategyCase_ == 3;
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     * @return The customizedBackoff.
     */
    @java.lang.Override
    public apache.rocketmq.v2.CustomizedBackoff getCustomizedBackoff() {
      if (customizedBackoffBuilder_ == null) {
        if (strategyCase_ == 3) {
          return (apache.rocketmq.v2.CustomizedBackoff) strategy_;
        }
        return apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance();
      } else {
        if (strategyCase_ == 3) {
          return customizedBackoffBuilder_.getMessage();
        }
        return apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    public Builder setCustomizedBackoff(apache.rocketmq.v2.CustomizedBackoff value) {
      if (customizedBackoffBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        strategy_ = value;
        onChanged();
      } else {
        customizedBackoffBuilder_.setMessage(value);
      }
      strategyCase_ = 3;
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    public Builder setCustomizedBackoff(
        apache.rocketmq.v2.CustomizedBackoff.Builder builderForValue) {
      if (customizedBackoffBuilder_ == null) {
        strategy_ = builderForValue.build();
        onChanged();
      } else {
        customizedBackoffBuilder_.setMessage(builderForValue.build());
      }
      strategyCase_ = 3;
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    public Builder mergeCustomizedBackoff(apache.rocketmq.v2.CustomizedBackoff value) {
      if (customizedBackoffBuilder_ == null) {
        if (strategyCase_ == 3 &&
            strategy_ != apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance()) {
          strategy_ = apache.rocketmq.v2.CustomizedBackoff.newBuilder((apache.rocketmq.v2.CustomizedBackoff) strategy_)
              .mergeFrom(value).buildPartial();
        } else {
          strategy_ = value;
        }
        onChanged();
      } else {
        if (strategyCase_ == 3) {
          customizedBackoffBuilder_.mergeFrom(value);
        } else {
          customizedBackoffBuilder_.setMessage(value);
        }
      }
      strategyCase_ = 3;
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    public Builder clearCustomizedBackoff() {
      if (customizedBackoffBuilder_ == null) {
        if (strategyCase_ == 3) {
          strategyCase_ = 0;
          strategy_ = null;
          onChanged();
        }
      } else {
        if (strategyCase_ == 3) {
          strategyCase_ = 0;
          strategy_ = null;
        }
        customizedBackoffBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    public apache.rocketmq.v2.CustomizedBackoff.Builder getCustomizedBackoffBuilder() {
      return getCustomizedBackoffFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    @java.lang.Override
    public apache.rocketmq.v2.CustomizedBackoffOrBuilder getCustomizedBackoffOrBuilder() {
      if ((strategyCase_ == 3) && (customizedBackoffBuilder_ != null)) {
        return customizedBackoffBuilder_.getMessageOrBuilder();
      } else {
        if (strategyCase_ == 3) {
          return (apache.rocketmq.v2.CustomizedBackoff) strategy_;
        }
        return apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.CustomizedBackoff customized_backoff = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.CustomizedBackoff, apache.rocketmq.v2.CustomizedBackoff.Builder, apache.rocketmq.v2.CustomizedBackoffOrBuilder> 
        getCustomizedBackoffFieldBuilder() {
      if (customizedBackoffBuilder_ == null) {
        if (!(strategyCase_ == 3)) {
          strategy_ = apache.rocketmq.v2.CustomizedBackoff.getDefaultInstance();
        }
        customizedBackoffBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.CustomizedBackoff, apache.rocketmq.v2.CustomizedBackoff.Builder, apache.rocketmq.v2.CustomizedBackoffOrBuilder>(
                (apache.rocketmq.v2.CustomizedBackoff) strategy_,
                getParentForChildren(),
                isClean());
        strategy_ = null;
      }
      strategyCase_ = 3;
      onChanged();;
      return customizedBackoffBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.RetryPolicy)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.RetryPolicy)
  private static final apache.rocketmq.v2.RetryPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.RetryPolicy();
  }

  public static apache.rocketmq.v2.RetryPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetryPolicy>
      PARSER = new com.google.protobuf.AbstractParser<RetryPolicy>() {
    @java.lang.Override
    public RetryPolicy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RetryPolicy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RetryPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetryPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.RetryPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


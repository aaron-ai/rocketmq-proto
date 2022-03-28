// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

/**
 * Protobuf type {@code apache.rocketmq.v2.QueryRouteResponse}
 */
public final class QueryRouteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v2.QueryRouteResponse)
    QueryRouteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRouteResponse.newBuilder() to construct.
  private QueryRouteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRouteResponse() {
    messageQueues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRouteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryRouteResponse(
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
            apache.rocketmq.v2.ResponseCommon.Builder subBuilder = null;
            if (common_ != null) {
              subBuilder = common_.toBuilder();
            }
            common_ = input.readMessage(apache.rocketmq.v2.ResponseCommon.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(common_);
              common_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              messageQueues_ = new java.util.ArrayList<apache.rocketmq.v2.MessageQueue>();
              mutable_bitField0_ |= 0x00000001;
            }
            messageQueues_.add(
                input.readMessage(apache.rocketmq.v2.MessageQueue.parser(), extensionRegistry));
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
        messageQueues_ = java.util.Collections.unmodifiableList(messageQueues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryRouteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryRouteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v2.QueryRouteResponse.class, apache.rocketmq.v2.QueryRouteResponse.Builder.class);
  }

  public static final int COMMON_FIELD_NUMBER = 1;
  private apache.rocketmq.v2.ResponseCommon common_;
  /**
   * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return common_ != null;
  }
  /**
   * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public apache.rocketmq.v2.ResponseCommon getCommon() {
    return common_ == null ? apache.rocketmq.v2.ResponseCommon.getDefaultInstance() : common_;
  }
  /**
   * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.ResponseCommonOrBuilder getCommonOrBuilder() {
    return getCommon();
  }

  public static final int MESSAGE_QUEUES_FIELD_NUMBER = 2;
  private java.util.List<apache.rocketmq.v2.MessageQueue> messageQueues_;
  /**
   * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
   */
  @java.lang.Override
  public java.util.List<apache.rocketmq.v2.MessageQueue> getMessageQueuesList() {
    return messageQueues_;
  }
  /**
   * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends apache.rocketmq.v2.MessageQueueOrBuilder> 
      getMessageQueuesOrBuilderList() {
    return messageQueues_;
  }
  /**
   * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
   */
  @java.lang.Override
  public int getMessageQueuesCount() {
    return messageQueues_.size();
  }
  /**
   * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageQueue getMessageQueues(int index) {
    return messageQueues_.get(index);
  }
  /**
   * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueuesOrBuilder(
      int index) {
    return messageQueues_.get(index);
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
    if (common_ != null) {
      output.writeMessage(1, getCommon());
    }
    for (int i = 0; i < messageQueues_.size(); i++) {
      output.writeMessage(2, messageQueues_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (common_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    for (int i = 0; i < messageQueues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, messageQueues_.get(i));
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
    if (!(obj instanceof apache.rocketmq.v2.QueryRouteResponse)) {
      return super.equals(obj);
    }
    apache.rocketmq.v2.QueryRouteResponse other = (apache.rocketmq.v2.QueryRouteResponse) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (!getMessageQueuesList()
        .equals(other.getMessageQueuesList())) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (getMessageQueuesCount() > 0) {
      hash = (37 * hash) + MESSAGE_QUEUES_FIELD_NUMBER;
      hash = (53 * hash) + getMessageQueuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v2.QueryRouteResponse parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v2.QueryRouteResponse prototype) {
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
   * Protobuf type {@code apache.rocketmq.v2.QueryRouteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v2.QueryRouteResponse)
      apache.rocketmq.v2.QueryRouteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryRouteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryRouteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v2.QueryRouteResponse.class, apache.rocketmq.v2.QueryRouteResponse.Builder.class);
    }

    // Construct using apache.rocketmq.v2.QueryRouteResponse.newBuilder()
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
        getMessageQueuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (commonBuilder_ == null) {
        common_ = null;
      } else {
        common_ = null;
        commonBuilder_ = null;
      }
      if (messageQueuesBuilder_ == null) {
        messageQueues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        messageQueuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v2.MQService.internal_static_apache_rocketmq_v2_QueryRouteResponse_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v2.QueryRouteResponse getDefaultInstanceForType() {
      return apache.rocketmq.v2.QueryRouteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v2.QueryRouteResponse build() {
      apache.rocketmq.v2.QueryRouteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v2.QueryRouteResponse buildPartial() {
      apache.rocketmq.v2.QueryRouteResponse result = new apache.rocketmq.v2.QueryRouteResponse(this);
      int from_bitField0_ = bitField0_;
      if (commonBuilder_ == null) {
        result.common_ = common_;
      } else {
        result.common_ = commonBuilder_.build();
      }
      if (messageQueuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          messageQueues_ = java.util.Collections.unmodifiableList(messageQueues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messageQueues_ = messageQueues_;
      } else {
        result.messageQueues_ = messageQueuesBuilder_.build();
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
      if (other instanceof apache.rocketmq.v2.QueryRouteResponse) {
        return mergeFrom((apache.rocketmq.v2.QueryRouteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v2.QueryRouteResponse other) {
      if (other == apache.rocketmq.v2.QueryRouteResponse.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (messageQueuesBuilder_ == null) {
        if (!other.messageQueues_.isEmpty()) {
          if (messageQueues_.isEmpty()) {
            messageQueues_ = other.messageQueues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessageQueuesIsMutable();
            messageQueues_.addAll(other.messageQueues_);
          }
          onChanged();
        }
      } else {
        if (!other.messageQueues_.isEmpty()) {
          if (messageQueuesBuilder_.isEmpty()) {
            messageQueuesBuilder_.dispose();
            messageQueuesBuilder_ = null;
            messageQueues_ = other.messageQueues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messageQueuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessageQueuesFieldBuilder() : null;
          } else {
            messageQueuesBuilder_.addAllMessages(other.messageQueues_);
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
      apache.rocketmq.v2.QueryRouteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v2.QueryRouteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private apache.rocketmq.v2.ResponseCommon common_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.ResponseCommon, apache.rocketmq.v2.ResponseCommon.Builder, apache.rocketmq.v2.ResponseCommonOrBuilder> commonBuilder_;
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return commonBuilder_ != null || common_ != null;
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     * @return The common.
     */
    public apache.rocketmq.v2.ResponseCommon getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? apache.rocketmq.v2.ResponseCommon.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    public Builder setCommon(apache.rocketmq.v2.ResponseCommon value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
        onChanged();
      } else {
        commonBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    public Builder setCommon(
        apache.rocketmq.v2.ResponseCommon.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
        onChanged();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    public Builder mergeCommon(apache.rocketmq.v2.ResponseCommon value) {
      if (commonBuilder_ == null) {
        if (common_ != null) {
          common_ =
            apache.rocketmq.v2.ResponseCommon.newBuilder(common_).mergeFrom(value).buildPartial();
        } else {
          common_ = value;
        }
        onChanged();
      } else {
        commonBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    public Builder clearCommon() {
      if (commonBuilder_ == null) {
        common_ = null;
        onChanged();
      } else {
        common_ = null;
        commonBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    public apache.rocketmq.v2.ResponseCommon.Builder getCommonBuilder() {
      
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    public apache.rocketmq.v2.ResponseCommonOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            apache.rocketmq.v2.ResponseCommon.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.apache.rocketmq.v2.ResponseCommon common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v2.ResponseCommon, apache.rocketmq.v2.ResponseCommon.Builder, apache.rocketmq.v2.ResponseCommonOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v2.ResponseCommon, apache.rocketmq.v2.ResponseCommon.Builder, apache.rocketmq.v2.ResponseCommonOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private java.util.List<apache.rocketmq.v2.MessageQueue> messageQueues_ =
      java.util.Collections.emptyList();
    private void ensureMessageQueuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messageQueues_ = new java.util.ArrayList<apache.rocketmq.v2.MessageQueue>(messageQueues_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder> messageQueuesBuilder_;

    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public java.util.List<apache.rocketmq.v2.MessageQueue> getMessageQueuesList() {
      if (messageQueuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messageQueues_);
      } else {
        return messageQueuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public int getMessageQueuesCount() {
      if (messageQueuesBuilder_ == null) {
        return messageQueues_.size();
      } else {
        return messageQueuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public apache.rocketmq.v2.MessageQueue getMessageQueues(int index) {
      if (messageQueuesBuilder_ == null) {
        return messageQueues_.get(index);
      } else {
        return messageQueuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder setMessageQueues(
        int index, apache.rocketmq.v2.MessageQueue value) {
      if (messageQueuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageQueuesIsMutable();
        messageQueues_.set(index, value);
        onChanged();
      } else {
        messageQueuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder setMessageQueues(
        int index, apache.rocketmq.v2.MessageQueue.Builder builderForValue) {
      if (messageQueuesBuilder_ == null) {
        ensureMessageQueuesIsMutable();
        messageQueues_.set(index, builderForValue.build());
        onChanged();
      } else {
        messageQueuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder addMessageQueues(apache.rocketmq.v2.MessageQueue value) {
      if (messageQueuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageQueuesIsMutable();
        messageQueues_.add(value);
        onChanged();
      } else {
        messageQueuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder addMessageQueues(
        int index, apache.rocketmq.v2.MessageQueue value) {
      if (messageQueuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessageQueuesIsMutable();
        messageQueues_.add(index, value);
        onChanged();
      } else {
        messageQueuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder addMessageQueues(
        apache.rocketmq.v2.MessageQueue.Builder builderForValue) {
      if (messageQueuesBuilder_ == null) {
        ensureMessageQueuesIsMutable();
        messageQueues_.add(builderForValue.build());
        onChanged();
      } else {
        messageQueuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder addMessageQueues(
        int index, apache.rocketmq.v2.MessageQueue.Builder builderForValue) {
      if (messageQueuesBuilder_ == null) {
        ensureMessageQueuesIsMutable();
        messageQueues_.add(index, builderForValue.build());
        onChanged();
      } else {
        messageQueuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder addAllMessageQueues(
        java.lang.Iterable<? extends apache.rocketmq.v2.MessageQueue> values) {
      if (messageQueuesBuilder_ == null) {
        ensureMessageQueuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messageQueues_);
        onChanged();
      } else {
        messageQueuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder clearMessageQueues() {
      if (messageQueuesBuilder_ == null) {
        messageQueues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messageQueuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public Builder removeMessageQueues(int index) {
      if (messageQueuesBuilder_ == null) {
        ensureMessageQueuesIsMutable();
        messageQueues_.remove(index);
        onChanged();
      } else {
        messageQueuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public apache.rocketmq.v2.MessageQueue.Builder getMessageQueuesBuilder(
        int index) {
      return getMessageQueuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueuesOrBuilder(
        int index) {
      if (messageQueuesBuilder_ == null) {
        return messageQueues_.get(index);  } else {
        return messageQueuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public java.util.List<? extends apache.rocketmq.v2.MessageQueueOrBuilder> 
         getMessageQueuesOrBuilderList() {
      if (messageQueuesBuilder_ != null) {
        return messageQueuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messageQueues_);
      }
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public apache.rocketmq.v2.MessageQueue.Builder addMessageQueuesBuilder() {
      return getMessageQueuesFieldBuilder().addBuilder(
          apache.rocketmq.v2.MessageQueue.getDefaultInstance());
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public apache.rocketmq.v2.MessageQueue.Builder addMessageQueuesBuilder(
        int index) {
      return getMessageQueuesFieldBuilder().addBuilder(
          index, apache.rocketmq.v2.MessageQueue.getDefaultInstance());
    }
    /**
     * <code>repeated .apache.rocketmq.v2.MessageQueue message_queues = 2;</code>
     */
    public java.util.List<apache.rocketmq.v2.MessageQueue.Builder> 
         getMessageQueuesBuilderList() {
      return getMessageQueuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder> 
        getMessageQueuesFieldBuilder() {
      if (messageQueuesBuilder_ == null) {
        messageQueuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            apache.rocketmq.v2.MessageQueue, apache.rocketmq.v2.MessageQueue.Builder, apache.rocketmq.v2.MessageQueueOrBuilder>(
                messageQueues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        messageQueues_ = null;
      }
      return messageQueuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v2.QueryRouteResponse)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v2.QueryRouteResponse)
  private static final apache.rocketmq.v2.QueryRouteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v2.QueryRouteResponse();
  }

  public static apache.rocketmq.v2.QueryRouteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRouteResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryRouteResponse>() {
    @java.lang.Override
    public QueryRouteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryRouteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryRouteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRouteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v2.QueryRouteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

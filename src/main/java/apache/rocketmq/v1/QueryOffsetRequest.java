// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

/**
 * Protobuf type {@code apache.rocketmq.v1.QueryOffsetRequest}
 */
public final class QueryOffsetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apache.rocketmq.v1.QueryOffsetRequest)
    QueryOffsetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryOffsetRequest.newBuilder() to construct.
  private QueryOffsetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryOffsetRequest() {
    policy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryOffsetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryOffsetRequest(
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
          case 10: {
            apache.rocketmq.v1.Partition.Builder subBuilder = null;
            if (partition_ != null) {
              subBuilder = partition_.toBuilder();
            }
            partition_ = input.readMessage(apache.rocketmq.v1.Partition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partition_);
              partition_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            policy_ = rawValue;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (timePoint_ != null) {
              subBuilder = timePoint_.toBuilder();
            }
            timePoint_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timePoint_);
              timePoint_ = subBuilder.buildPartial();
            }

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
    return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryOffsetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryOffsetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            apache.rocketmq.v1.QueryOffsetRequest.class, apache.rocketmq.v1.QueryOffsetRequest.Builder.class);
  }

  public static final int PARTITION_FIELD_NUMBER = 1;
  private apache.rocketmq.v1.Partition partition_;
  /**
   * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
   * @return Whether the partition field is set.
   */
  @java.lang.Override
  public boolean hasPartition() {
    return partition_ != null;
  }
  /**
   * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
   * @return The partition.
   */
  @java.lang.Override
  public apache.rocketmq.v1.Partition getPartition() {
    return partition_ == null ? apache.rocketmq.v1.Partition.getDefaultInstance() : partition_;
  }
  /**
   * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
   */
  @java.lang.Override
  public apache.rocketmq.v1.PartitionOrBuilder getPartitionOrBuilder() {
    return getPartition();
  }

  public static final int POLICY_FIELD_NUMBER = 2;
  private int policy_;
  /**
   * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
   * @return The enum numeric value on the wire for policy.
   */
  @java.lang.Override public int getPolicyValue() {
    return policy_;
  }
  /**
   * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
   * @return The policy.
   */
  @java.lang.Override public apache.rocketmq.v1.QueryOffsetPolicy getPolicy() {
    @SuppressWarnings("deprecation")
    apache.rocketmq.v1.QueryOffsetPolicy result = apache.rocketmq.v1.QueryOffsetPolicy.valueOf(policy_);
    return result == null ? apache.rocketmq.v1.QueryOffsetPolicy.UNRECOGNIZED : result;
  }

  public static final int TIME_POINT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp timePoint_;
  /**
   * <code>.google.protobuf.Timestamp time_point = 3;</code>
   * @return Whether the timePoint field is set.
   */
  @java.lang.Override
  public boolean hasTimePoint() {
    return timePoint_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time_point = 3;</code>
   * @return The timePoint.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimePoint() {
    return timePoint_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timePoint_;
  }
  /**
   * <code>.google.protobuf.Timestamp time_point = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimePointOrBuilder() {
    return getTimePoint();
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
    if (partition_ != null) {
      output.writeMessage(1, getPartition());
    }
    if (policy_ != apache.rocketmq.v1.QueryOffsetPolicy.BEGINNING.getNumber()) {
      output.writeEnum(2, policy_);
    }
    if (timePoint_ != null) {
      output.writeMessage(3, getTimePoint());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPartition());
    }
    if (policy_ != apache.rocketmq.v1.QueryOffsetPolicy.BEGINNING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, policy_);
    }
    if (timePoint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getTimePoint());
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
    if (!(obj instanceof apache.rocketmq.v1.QueryOffsetRequest)) {
      return super.equals(obj);
    }
    apache.rocketmq.v1.QueryOffsetRequest other = (apache.rocketmq.v1.QueryOffsetRequest) obj;

    if (hasPartition() != other.hasPartition()) return false;
    if (hasPartition()) {
      if (!getPartition()
          .equals(other.getPartition())) return false;
    }
    if (policy_ != other.policy_) return false;
    if (hasTimePoint() != other.hasTimePoint()) return false;
    if (hasTimePoint()) {
      if (!getTimePoint()
          .equals(other.getTimePoint())) return false;
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
    if (hasPartition()) {
      hash = (37 * hash) + PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getPartition().hashCode();
    }
    hash = (37 * hash) + POLICY_FIELD_NUMBER;
    hash = (53 * hash) + policy_;
    if (hasTimePoint()) {
      hash = (37 * hash) + TIME_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getTimePoint().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static apache.rocketmq.v1.QueryOffsetRequest parseFrom(
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
  public static Builder newBuilder(apache.rocketmq.v1.QueryOffsetRequest prototype) {
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
   * Protobuf type {@code apache.rocketmq.v1.QueryOffsetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apache.rocketmq.v1.QueryOffsetRequest)
      apache.rocketmq.v1.QueryOffsetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryOffsetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryOffsetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              apache.rocketmq.v1.QueryOffsetRequest.class, apache.rocketmq.v1.QueryOffsetRequest.Builder.class);
    }

    // Construct using apache.rocketmq.v1.QueryOffsetRequest.newBuilder()
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
      if (partitionBuilder_ == null) {
        partition_ = null;
      } else {
        partition_ = null;
        partitionBuilder_ = null;
      }
      policy_ = 0;

      if (timePointBuilder_ == null) {
        timePoint_ = null;
      } else {
        timePoint_ = null;
        timePointBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return apache.rocketmq.v1.MQService.internal_static_apache_rocketmq_v1_QueryOffsetRequest_descriptor;
    }

    @java.lang.Override
    public apache.rocketmq.v1.QueryOffsetRequest getDefaultInstanceForType() {
      return apache.rocketmq.v1.QueryOffsetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public apache.rocketmq.v1.QueryOffsetRequest build() {
      apache.rocketmq.v1.QueryOffsetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public apache.rocketmq.v1.QueryOffsetRequest buildPartial() {
      apache.rocketmq.v1.QueryOffsetRequest result = new apache.rocketmq.v1.QueryOffsetRequest(this);
      if (partitionBuilder_ == null) {
        result.partition_ = partition_;
      } else {
        result.partition_ = partitionBuilder_.build();
      }
      result.policy_ = policy_;
      if (timePointBuilder_ == null) {
        result.timePoint_ = timePoint_;
      } else {
        result.timePoint_ = timePointBuilder_.build();
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
      if (other instanceof apache.rocketmq.v1.QueryOffsetRequest) {
        return mergeFrom((apache.rocketmq.v1.QueryOffsetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(apache.rocketmq.v1.QueryOffsetRequest other) {
      if (other == apache.rocketmq.v1.QueryOffsetRequest.getDefaultInstance()) return this;
      if (other.hasPartition()) {
        mergePartition(other.getPartition());
      }
      if (other.policy_ != 0) {
        setPolicyValue(other.getPolicyValue());
      }
      if (other.hasTimePoint()) {
        mergeTimePoint(other.getTimePoint());
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
      apache.rocketmq.v1.QueryOffsetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (apache.rocketmq.v1.QueryOffsetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private apache.rocketmq.v1.Partition partition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Partition, apache.rocketmq.v1.Partition.Builder, apache.rocketmq.v1.PartitionOrBuilder> partitionBuilder_;
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     * @return Whether the partition field is set.
     */
    public boolean hasPartition() {
      return partitionBuilder_ != null || partition_ != null;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     * @return The partition.
     */
    public apache.rocketmq.v1.Partition getPartition() {
      if (partitionBuilder_ == null) {
        return partition_ == null ? apache.rocketmq.v1.Partition.getDefaultInstance() : partition_;
      } else {
        return partitionBuilder_.getMessage();
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    public Builder setPartition(apache.rocketmq.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partition_ = value;
        onChanged();
      } else {
        partitionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    public Builder setPartition(
        apache.rocketmq.v1.Partition.Builder builderForValue) {
      if (partitionBuilder_ == null) {
        partition_ = builderForValue.build();
        onChanged();
      } else {
        partitionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    public Builder mergePartition(apache.rocketmq.v1.Partition value) {
      if (partitionBuilder_ == null) {
        if (partition_ != null) {
          partition_ =
            apache.rocketmq.v1.Partition.newBuilder(partition_).mergeFrom(value).buildPartial();
        } else {
          partition_ = value;
        }
        onChanged();
      } else {
        partitionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    public Builder clearPartition() {
      if (partitionBuilder_ == null) {
        partition_ = null;
        onChanged();
      } else {
        partition_ = null;
        partitionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    public apache.rocketmq.v1.Partition.Builder getPartitionBuilder() {
      
      onChanged();
      return getPartitionFieldBuilder().getBuilder();
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    public apache.rocketmq.v1.PartitionOrBuilder getPartitionOrBuilder() {
      if (partitionBuilder_ != null) {
        return partitionBuilder_.getMessageOrBuilder();
      } else {
        return partition_ == null ?
            apache.rocketmq.v1.Partition.getDefaultInstance() : partition_;
      }
    }
    /**
     * <code>.apache.rocketmq.v1.Partition partition = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        apache.rocketmq.v1.Partition, apache.rocketmq.v1.Partition.Builder, apache.rocketmq.v1.PartitionOrBuilder> 
        getPartitionFieldBuilder() {
      if (partitionBuilder_ == null) {
        partitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            apache.rocketmq.v1.Partition, apache.rocketmq.v1.Partition.Builder, apache.rocketmq.v1.PartitionOrBuilder>(
                getPartition(),
                getParentForChildren(),
                isClean());
        partition_ = null;
      }
      return partitionBuilder_;
    }

    private int policy_ = 0;
    /**
     * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
     * @return The enum numeric value on the wire for policy.
     */
    @java.lang.Override public int getPolicyValue() {
      return policy_;
    }
    /**
     * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
     * @param value The enum numeric value on the wire for policy to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyValue(int value) {
      
      policy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
     * @return The policy.
     */
    @java.lang.Override
    public apache.rocketmq.v1.QueryOffsetPolicy getPolicy() {
      @SuppressWarnings("deprecation")
      apache.rocketmq.v1.QueryOffsetPolicy result = apache.rocketmq.v1.QueryOffsetPolicy.valueOf(policy_);
      return result == null ? apache.rocketmq.v1.QueryOffsetPolicy.UNRECOGNIZED : result;
    }
    /**
     * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
     * @param value The policy to set.
     * @return This builder for chaining.
     */
    public Builder setPolicy(apache.rocketmq.v1.QueryOffsetPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      policy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.apache.rocketmq.v1.QueryOffsetPolicy policy = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPolicy() {
      
      policy_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp timePoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timePointBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     * @return Whether the timePoint field is set.
     */
    public boolean hasTimePoint() {
      return timePointBuilder_ != null || timePoint_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     * @return The timePoint.
     */
    public com.google.protobuf.Timestamp getTimePoint() {
      if (timePointBuilder_ == null) {
        return timePoint_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timePoint_;
      } else {
        return timePointBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    public Builder setTimePoint(com.google.protobuf.Timestamp value) {
      if (timePointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timePoint_ = value;
        onChanged();
      } else {
        timePointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    public Builder setTimePoint(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timePointBuilder_ == null) {
        timePoint_ = builderForValue.build();
        onChanged();
      } else {
        timePointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    public Builder mergeTimePoint(com.google.protobuf.Timestamp value) {
      if (timePointBuilder_ == null) {
        if (timePoint_ != null) {
          timePoint_ =
            com.google.protobuf.Timestamp.newBuilder(timePoint_).mergeFrom(value).buildPartial();
        } else {
          timePoint_ = value;
        }
        onChanged();
      } else {
        timePointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    public Builder clearTimePoint() {
      if (timePointBuilder_ == null) {
        timePoint_ = null;
        onChanged();
      } else {
        timePoint_ = null;
        timePointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimePointBuilder() {
      
      onChanged();
      return getTimePointFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimePointOrBuilder() {
      if (timePointBuilder_ != null) {
        return timePointBuilder_.getMessageOrBuilder();
      } else {
        return timePoint_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timePoint_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time_point = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimePointFieldBuilder() {
      if (timePointBuilder_ == null) {
        timePointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimePoint(),
                getParentForChildren(),
                isClean());
        timePoint_ = null;
      }
      return timePointBuilder_;
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


    // @@protoc_insertion_point(builder_scope:apache.rocketmq.v1.QueryOffsetRequest)
  }

  // @@protoc_insertion_point(class_scope:apache.rocketmq.v1.QueryOffsetRequest)
  private static final apache.rocketmq.v1.QueryOffsetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new apache.rocketmq.v1.QueryOffsetRequest();
  }

  public static apache.rocketmq.v1.QueryOffsetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryOffsetRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryOffsetRequest>() {
    @java.lang.Override
    public QueryOffsetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryOffsetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryOffsetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryOffsetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public apache.rocketmq.v1.QueryOffsetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

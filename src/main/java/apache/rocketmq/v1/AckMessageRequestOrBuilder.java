// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v1/service.proto

package apache.rocketmq.v1;

public interface AckMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v1.AckMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v1.Resource group = 1;</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <code>.apache.rocketmq.v1.Resource group = 1;</code>
   * @return The group.
   */
  apache.rocketmq.v1.Resource getGroup();
  /**
   * <code>.apache.rocketmq.v1.Resource group = 1;</code>
   */
  apache.rocketmq.v1.ResourceOrBuilder getGroupOrBuilder();

  /**
   * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
   * @return The topic.
   */
  apache.rocketmq.v1.Resource getTopic();
  /**
   * <code>.apache.rocketmq.v1.Resource topic = 2;</code>
   */
  apache.rocketmq.v1.ResourceOrBuilder getTopicOrBuilder();

  /**
   * <code>string client_id = 3;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 3;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string receipt_handle = 4;</code>
   * @return Whether the receiptHandle field is set.
   */
  boolean hasReceiptHandle();
  /**
   * <code>string receipt_handle = 4;</code>
   * @return The receiptHandle.
   */
  java.lang.String getReceiptHandle();
  /**
   * <code>string receipt_handle = 4;</code>
   * @return The bytes for receiptHandle.
   */
  com.google.protobuf.ByteString
      getReceiptHandleBytes();

  /**
   * <code>int64 offset = 5;</code>
   * @return Whether the offset field is set.
   */
  boolean hasOffset();
  /**
   * <code>int64 offset = 5;</code>
   * @return The offset.
   */
  long getOffset();

  /**
   * <code>string message_id = 6;</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <code>string message_id = 6;</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  public apache.rocketmq.v1.AckMessageRequest.HandleCase getHandleCase();
}

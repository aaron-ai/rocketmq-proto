// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface ReceiveMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.ReceiveMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v2.Resource group = 1;</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <code>.apache.rocketmq.v2.Resource group = 1;</code>
   * @return The group.
   */
  apache.rocketmq.v2.Resource getGroup();
  /**
   * <code>.apache.rocketmq.v2.Resource group = 1;</code>
   */
  apache.rocketmq.v2.ResourceOrBuilder getGroupOrBuilder();

  /**
   * <code>string client_id = 2;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 2;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 3;</code>
   * @return Whether the messageQueue field is set.
   */
  boolean hasMessageQueue();
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 3;</code>
   * @return The messageQueue.
   */
  apache.rocketmq.v2.MessageQueue getMessageQueue();
  /**
   * <code>.apache.rocketmq.v2.MessageQueue message_queue = 3;</code>
   */
  apache.rocketmq.v2.MessageQueueOrBuilder getMessageQueueOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.FilterExpression filter_expression = 4;</code>
   * @return Whether the filterExpression field is set.
   */
  boolean hasFilterExpression();
  /**
   * <code>.apache.rocketmq.v2.FilterExpression filter_expression = 4;</code>
   * @return The filterExpression.
   */
  apache.rocketmq.v2.FilterExpression getFilterExpression();
  /**
   * <code>.apache.rocketmq.v2.FilterExpression filter_expression = 4;</code>
   */
  apache.rocketmq.v2.FilterExpressionOrBuilder getFilterExpressionOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp initialization_timestamp = 5;</code>
   * @return Whether the initializationTimestamp field is set.
   */
  boolean hasInitializationTimestamp();
  /**
   * <code>.google.protobuf.Timestamp initialization_timestamp = 5;</code>
   * @return The initializationTimestamp.
   */
  com.google.protobuf.Timestamp getInitializationTimestamp();
  /**
   * <code>.google.protobuf.Timestamp initialization_timestamp = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInitializationTimestampOrBuilder();

  /**
   * <code>int32 batch_size = 6;</code>
   * @return The batchSize.
   */
  int getBatchSize();

  /**
   * <code>.google.protobuf.Duration invisible_duration = 7;</code>
   * @return Whether the invisibleDuration field is set.
   */
  boolean hasInvisibleDuration();
  /**
   * <code>.google.protobuf.Duration invisible_duration = 7;</code>
   * @return The invisibleDuration.
   */
  com.google.protobuf.Duration getInvisibleDuration();
  /**
   * <code>.google.protobuf.Duration invisible_duration = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getInvisibleDurationOrBuilder();

  /**
   * <code>.google.protobuf.Duration await_duration = 8;</code>
   * @return Whether the awaitDuration field is set.
   */
  boolean hasAwaitDuration();
  /**
   * <code>.google.protobuf.Duration await_duration = 8;</code>
   * @return The awaitDuration.
   */
  com.google.protobuf.Duration getAwaitDuration();
  /**
   * <code>.google.protobuf.Duration await_duration = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getAwaitDurationOrBuilder();

  /**
   * <code>bool fifo = 9;</code>
   * @return The fifo.
   */
  boolean getFifo();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface ReceiveMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.ReceiveMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   * @return The status.
   */
  apache.rocketmq.v2.Status getStatus();
  /**
   * <code>.apache.rocketmq.v2.Status status = 1;</code>
   */
  apache.rocketmq.v2.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Message message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.apache.rocketmq.v2.Message message = 2;</code>
   * @return The message.
   */
  apache.rocketmq.v2.Message getMessage();
  /**
   * <code>.apache.rocketmq.v2.Message message = 2;</code>
   */
  apache.rocketmq.v2.MessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * The timestamp that brokers start to deliver status line or message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delivery_timestamp = 3;</code>
   * @return Whether the deliveryTimestamp field is set.
   */
  boolean hasDeliveryTimestamp();
  /**
   * <pre>
   * The timestamp that brokers start to deliver status line or message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delivery_timestamp = 3;</code>
   * @return The deliveryTimestamp.
   */
  com.google.protobuf.Timestamp getDeliveryTimestamp();
  /**
   * <pre>
   * The timestamp that brokers start to deliver status line or message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delivery_timestamp = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeliveryTimestampOrBuilder();

  public apache.rocketmq.v2.ReceiveMessageResponse.ContentCase getContentCase();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface AckMessageEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.AckMessageEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message_id = 1;</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <code>string message_id = 1;</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <code>string receipt_handle = 2;</code>
   * @return The receiptHandle.
   */
  java.lang.String getReceiptHandle();
  /**
   * <code>string receipt_handle = 2;</code>
   * @return The bytes for receiptHandle.
   */
  com.google.protobuf.ByteString
      getReceiptHandleBytes();
}

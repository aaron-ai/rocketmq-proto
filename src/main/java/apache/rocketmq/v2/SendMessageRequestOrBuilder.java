// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface SendMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.SendMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .apache.rocketmq.v2.Message messages = 1;</code>
   */
  java.util.List<apache.rocketmq.v2.Message> 
      getMessagesList();
  /**
   * <code>repeated .apache.rocketmq.v2.Message messages = 1;</code>
   */
  apache.rocketmq.v2.Message getMessages(int index);
  /**
   * <code>repeated .apache.rocketmq.v2.Message messages = 1;</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .apache.rocketmq.v2.Message messages = 1;</code>
   */
  java.util.List<? extends apache.rocketmq.v2.MessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .apache.rocketmq.v2.Message messages = 1;</code>
   */
  apache.rocketmq.v2.MessageOrBuilder getMessagesOrBuilder(
      int index);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

public interface PublishingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.Publishing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Publishing settings below here is appointed by client, thus it is
   * unnecessary for server to push at present.
   * List of topics to which messages will publish to.
   * </pre>
   *
   * <code>repeated .apache.rocketmq.v2.Resource topics = 1;</code>
   */
  java.util.List<apache.rocketmq.v2.Resource> 
      getTopicsList();
  /**
   * <pre>
   * Publishing settings below here is appointed by client, thus it is
   * unnecessary for server to push at present.
   * List of topics to which messages will publish to.
   * </pre>
   *
   * <code>repeated .apache.rocketmq.v2.Resource topics = 1;</code>
   */
  apache.rocketmq.v2.Resource getTopics(int index);
  /**
   * <pre>
   * Publishing settings below here is appointed by client, thus it is
   * unnecessary for server to push at present.
   * List of topics to which messages will publish to.
   * </pre>
   *
   * <code>repeated .apache.rocketmq.v2.Resource topics = 1;</code>
   */
  int getTopicsCount();
  /**
   * <pre>
   * Publishing settings below here is appointed by client, thus it is
   * unnecessary for server to push at present.
   * List of topics to which messages will publish to.
   * </pre>
   *
   * <code>repeated .apache.rocketmq.v2.Resource topics = 1;</code>
   */
  java.util.List<? extends apache.rocketmq.v2.ResourceOrBuilder> 
      getTopicsOrBuilderList();
  /**
   * <pre>
   * Publishing settings below here is appointed by client, thus it is
   * unnecessary for server to push at present.
   * List of topics to which messages will publish to.
   * </pre>
   *
   * <code>repeated .apache.rocketmq.v2.Resource topics = 1;</code>
   */
  apache.rocketmq.v2.ResourceOrBuilder getTopicsOrBuilder(
      int index);

  /**
   * <pre>
   * If the message body size exceeds `max_body_size`, broker servers would
   * reject the request. As a result, it is advisable that Producer performs
   * client-side check validation.
   * </pre>
   *
   * <code>int32 max_body_size = 2;</code>
   * @return The maxBodySize.
   */
  int getMaxBodySize();

  /**
   * <pre>
   * When `validate_message_type` flag set `false`, no need to validate message's type
   * with messageQueue's `accept_message_types` before publishing.
   * </pre>
   *
   * <code>bool validate_message_type = 3;</code>
   * @return The validateMessageType.
   */
  boolean getValidateMessageType();
}

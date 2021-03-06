// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface AckMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.AckMessageRequest)
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
   * <code>.apache.rocketmq.v2.Resource topic = 2;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>.apache.rocketmq.v2.Resource topic = 2;</code>
   * @return The topic.
   */
  apache.rocketmq.v2.Resource getTopic();
  /**
   * <code>.apache.rocketmq.v2.Resource topic = 2;</code>
   */
  apache.rocketmq.v2.ResourceOrBuilder getTopicOrBuilder();

  /**
   * <code>repeated .apache.rocketmq.v2.AckMessageEntry entries = 3;</code>
   */
  java.util.List<apache.rocketmq.v2.AckMessageEntry> 
      getEntriesList();
  /**
   * <code>repeated .apache.rocketmq.v2.AckMessageEntry entries = 3;</code>
   */
  apache.rocketmq.v2.AckMessageEntry getEntries(int index);
  /**
   * <code>repeated .apache.rocketmq.v2.AckMessageEntry entries = 3;</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .apache.rocketmq.v2.AckMessageEntry entries = 3;</code>
   */
  java.util.List<? extends apache.rocketmq.v2.AckMessageEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .apache.rocketmq.v2.AckMessageEntry entries = 3;</code>
   */
  apache.rocketmq.v2.AckMessageEntryOrBuilder getEntriesOrBuilder(
      int index);
}

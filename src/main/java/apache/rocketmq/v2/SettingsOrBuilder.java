// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/service.proto

package apache.rocketmq.v2;

public interface SettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Common settings for all kind of clients.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.ClientType client_type = 1;</code>
   * @return Whether the clientType field is set.
   */
  boolean hasClientType();
  /**
   * <pre>
   * Common settings for all kind of clients.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.ClientType client_type = 1;</code>
   * @return The enum numeric value on the wire for clientType.
   */
  int getClientTypeValue();
  /**
   * <pre>
   * Common settings for all kind of clients.
   * </pre>
   *
   * <code>optional .apache.rocketmq.v2.ClientType client_type = 1;</code>
   * @return The clientType.
   */
  apache.rocketmq.v2.ClientType getClientType();

  /**
   * <code>optional .apache.rocketmq.v2.Endpoints access_point = 2;</code>
   * @return Whether the accessPoint field is set.
   */
  boolean hasAccessPoint();
  /**
   * <code>optional .apache.rocketmq.v2.Endpoints access_point = 2;</code>
   * @return The accessPoint.
   */
  apache.rocketmq.v2.Endpoints getAccessPoint();
  /**
   * <code>optional .apache.rocketmq.v2.Endpoints access_point = 2;</code>
   */
  apache.rocketmq.v2.EndpointsOrBuilder getAccessPointOrBuilder();

  /**
   * <pre>
   * Request timeout for RPCs excluding long-polling.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration request_timeout = 3;</code>
   * @return Whether the requestTimeout field is set.
   */
  boolean hasRequestTimeout();
  /**
   * <pre>
   * Request timeout for RPCs excluding long-polling.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration request_timeout = 3;</code>
   * @return The requestTimeout.
   */
  com.google.protobuf.Duration getRequestTimeout();
  /**
   * <pre>
   * Request timeout for RPCs excluding long-polling.
   * </pre>
   *
   * <code>optional .google.protobuf.Duration request_timeout = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getRequestTimeoutOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Publishing publishing = 4;</code>
   * @return Whether the publishing field is set.
   */
  boolean hasPublishing();
  /**
   * <code>.apache.rocketmq.v2.Publishing publishing = 4;</code>
   * @return The publishing.
   */
  apache.rocketmq.v2.Publishing getPublishing();
  /**
   * <code>.apache.rocketmq.v2.Publishing publishing = 4;</code>
   */
  apache.rocketmq.v2.PublishingOrBuilder getPublishingOrBuilder();

  /**
   * <code>.apache.rocketmq.v2.Subscription subscription = 5;</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <code>.apache.rocketmq.v2.Subscription subscription = 5;</code>
   * @return The subscription.
   */
  apache.rocketmq.v2.Subscription getSubscription();
  /**
   * <code>.apache.rocketmq.v2.Subscription subscription = 5;</code>
   */
  apache.rocketmq.v2.SubscriptionOrBuilder getSubscriptionOrBuilder();

  public apache.rocketmq.v2.Settings.PubSubCase getPubSubCase();
}
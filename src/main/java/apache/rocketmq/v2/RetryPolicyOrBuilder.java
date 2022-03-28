// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

public interface RetryPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apache.rocketmq.v2.RetryPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 max_attempts = 1;</code>
   * @return The maxAttempts.
   */
  int getMaxAttempts();

  /**
   * <code>float initial_backoff = 2;</code>
   * @return The initialBackoff.
   */
  float getInitialBackoff();

  /**
   * <code>float max_backoff = 3;</code>
   * @return The maxBackoff.
   */
  float getMaxBackoff();

  /**
   * <code>float backoff_multiplier = 4;</code>
   * @return The backoffMultiplier.
   */
  float getBackoffMultiplier();
}
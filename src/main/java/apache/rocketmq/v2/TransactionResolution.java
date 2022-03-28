// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf enum {@code apache.rocketmq.v2.TransactionResolution}
 */
public enum TransactionResolution
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRANSACTION_RESOLUTION_UNSPECIFIED = 0;</code>
   */
  TRANSACTION_RESOLUTION_UNSPECIFIED(0),
  /**
   * <code>COMMIT = 1;</code>
   */
  COMMIT(1),
  /**
   * <code>ROLLBACK = 2;</code>
   */
  ROLLBACK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRANSACTION_RESOLUTION_UNSPECIFIED = 0;</code>
   */
  public static final int TRANSACTION_RESOLUTION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>COMMIT = 1;</code>
   */
  public static final int COMMIT_VALUE = 1;
  /**
   * <code>ROLLBACK = 2;</code>
   */
  public static final int ROLLBACK_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TransactionResolution valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransactionResolution forNumber(int value) {
    switch (value) {
      case 0: return TRANSACTION_RESOLUTION_UNSPECIFIED;
      case 1: return COMMIT;
      case 2: return ROLLBACK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransactionResolution>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransactionResolution> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransactionResolution>() {
          public TransactionResolution findValueByNumber(int number) {
            return TransactionResolution.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return apache.rocketmq.v2.MQDomain.getDescriptor().getEnumTypes().get(0);
  }

  private static final TransactionResolution[] VALUES = values();

  public static TransactionResolution valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TransactionResolution(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v2.TransactionResolution)
}

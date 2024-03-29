// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf enum {@code apache.rocketmq.v2.QueryOffsetPolicy}
 */
public enum QueryOffsetPolicy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Use this option if client wishes to playback all existing messages.
   * </pre>
   *
   * <code>BEGINNING = 0;</code>
   */
  BEGINNING(0),
  /**
   * <pre>
   * Use this option if client wishes to skip all existing messages.
   * </pre>
   *
   * <code>END = 1;</code>
   */
  END(1),
  /**
   * <pre>
   * Use this option if time-based seek is targeted.
   * </pre>
   *
   * <code>TIMESTAMP = 2;</code>
   */
  TIMESTAMP(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Use this option if client wishes to playback all existing messages.
   * </pre>
   *
   * <code>BEGINNING = 0;</code>
   */
  public static final int BEGINNING_VALUE = 0;
  /**
   * <pre>
   * Use this option if client wishes to skip all existing messages.
   * </pre>
   *
   * <code>END = 1;</code>
   */
  public static final int END_VALUE = 1;
  /**
   * <pre>
   * Use this option if time-based seek is targeted.
   * </pre>
   *
   * <code>TIMESTAMP = 2;</code>
   */
  public static final int TIMESTAMP_VALUE = 2;


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
  public static QueryOffsetPolicy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QueryOffsetPolicy forNumber(int value) {
    switch (value) {
      case 0: return BEGINNING;
      case 1: return END;
      case 2: return TIMESTAMP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QueryOffsetPolicy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      QueryOffsetPolicy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<QueryOffsetPolicy>() {
          public QueryOffsetPolicy findValueByNumber(int number) {
            return QueryOffsetPolicy.forNumber(number);
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
    return apache.rocketmq.v2.MQDomain.getDescriptor().getEnumTypes().get(11);
  }

  private static final QueryOffsetPolicy[] VALUES = values();

  public static QueryOffsetPolicy valueOf(
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

  private QueryOffsetPolicy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v2.QueryOffsetPolicy)
}


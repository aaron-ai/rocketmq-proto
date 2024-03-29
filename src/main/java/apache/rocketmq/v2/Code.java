// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apache/rocketmq/v2/definition.proto

package apache.rocketmq.v2;

/**
 * Protobuf enum {@code apache.rocketmq.v2.Code}
 */
public enum Code
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CODE_UNSPECIFIED = 0;</code>
   */
  CODE_UNSPECIFIED(0),
  /**
   * <pre>
   * Generic code for success.
   * </pre>
   *
   * <code>OK = 20000;</code>
   */
  OK(20000),
  /**
   * <pre>
   * Generic code for multiple return results.
   * </pre>
   *
   * <code>MULTIPLE_RESULTS = 30000;</code>
   */
  MULTIPLE_RESULTS(30000),
  /**
   * <pre>
   * Generic code for bad request, indicating that required fields or headers are missing.
   * </pre>
   *
   * <code>BAD_REQUEST = 40000;</code>
   */
  BAD_REQUEST(40000),
  /**
   * <pre>
   * Format of access point is illegal.
   * </pre>
   *
   * <code>ILLEGAL_ACCESS_POINT = 40001;</code>
   */
  ILLEGAL_ACCESS_POINT(40001),
  /**
   * <pre>
   * Format of topic is illegal.
   * </pre>
   *
   * <code>ILLEGAL_TOPIC = 40002;</code>
   */
  ILLEGAL_TOPIC(40002),
  /**
   * <pre>
   * Format of consumer group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_CONSUMER_GROUP = 40003;</code>
   */
  ILLEGAL_CONSUMER_GROUP(40003),
  /**
   * <pre>
   * Format of message tag is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_TAG = 40004;</code>
   */
  ILLEGAL_MESSAGE_TAG(40004),
  /**
   * <pre>
   * Format of message key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_KEY = 40005;</code>
   */
  ILLEGAL_MESSAGE_KEY(40005),
  /**
   * <pre>
   * Format of message group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_GROUP = 40006;</code>
   */
  ILLEGAL_MESSAGE_GROUP(40006),
  /**
   * <pre>
   * Format of message property key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_PROPERTY_KEY = 40007;</code>
   */
  ILLEGAL_MESSAGE_PROPERTY_KEY(40007),
  /**
   * <pre>
   * Transaction id is invalid.
   * </pre>
   *
   * <code>INVALID_TRANSACTION_ID = 40008;</code>
   */
  INVALID_TRANSACTION_ID(40008),
  /**
   * <pre>
   * Format of message id is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_ID = 40009;</code>
   */
  ILLEGAL_MESSAGE_ID(40009),
  /**
   * <pre>
   * Format of filter expression is illegal.
   * </pre>
   *
   * <code>ILLEGAL_FILTER_EXPRESSION = 40010;</code>
   */
  ILLEGAL_FILTER_EXPRESSION(40010),
  /**
   * <pre>
   * The invisible time of request is invalid.
   * </pre>
   *
   * <code>ILLEGAL_INVISIBLE_TIME = 40011;</code>
   */
  ILLEGAL_INVISIBLE_TIME(40011),
  /**
   * <pre>
   * The delivery timestamp of message is invalid.
   * </pre>
   *
   * <code>ILLEGAL_DELIVERY_TIME = 40012;</code>
   */
  ILLEGAL_DELIVERY_TIME(40012),
  /**
   * <pre>
   * Receipt handle of message is invalid.
   * </pre>
   *
   * <code>INVALID_RECEIPT_HANDLE = 40013;</code>
   */
  INVALID_RECEIPT_HANDLE(40013),
  /**
   * <pre>
   * Message property conflicts with its type.
   * </pre>
   *
   * <code>MESSAGE_PROPERTY_CONFLICT_WITH_TYPE = 40014;</code>
   */
  MESSAGE_PROPERTY_CONFLICT_WITH_TYPE(40014),
  /**
   * <pre>
   * Client type could not be recognized.
   * </pre>
   *
   * <code>UNRECOGNIZED_CLIENT_TYPE = 40015;</code>
   */
  UNRECOGNIZED_CLIENT_TYPE(40015),
  /**
   * <pre>
   * Message is corrupted.
   * </pre>
   *
   * <code>MESSAGE_CORRUPTED = 40016;</code>
   */
  MESSAGE_CORRUPTED(40016),
  /**
   * <pre>
   * Request is rejected due to missing of x-mq-client-id header.
   * </pre>
   *
   * <code>CLIENT_ID_REQUIRED = 40017;</code>
   */
  CLIENT_ID_REQUIRED(40017),
  /**
   * <pre>
   * Polling time is illegal.
   * </pre>
   *
   * <code>ILLEGAL_POLLING_TIME = 40018;</code>
   */
  ILLEGAL_POLLING_TIME(40018),
  /**
   * <pre>
   * Offset is illegal.
   * </pre>
   *
   * <code>ILLEGAL_OFFSET = 40019;</code>
   */
  ILLEGAL_OFFSET(40019),
  /**
   * <pre>
   * Generic code indicates that the client request lacks valid authentication
   * credentials for the requested resource.
   * </pre>
   *
   * <code>UNAUTHORIZED = 40100;</code>
   */
  UNAUTHORIZED(40100),
  /**
   * <pre>
   * Generic code indicates that the account is suspended due to overdue of payment.
   * </pre>
   *
   * <code>PAYMENT_REQUIRED = 40200;</code>
   */
  PAYMENT_REQUIRED(40200),
  /**
   * <pre>
   * Generic code for the case that user does not have the permission to operate.
   * </pre>
   *
   * <code>FORBIDDEN = 40300;</code>
   */
  FORBIDDEN(40300),
  /**
   * <pre>
   * Generic code for resource not found.
   * </pre>
   *
   * <code>NOT_FOUND = 40400;</code>
   */
  NOT_FOUND(40400),
  /**
   * <pre>
   * Message not found from server.
   * </pre>
   *
   * <code>MESSAGE_NOT_FOUND = 40401;</code>
   */
  MESSAGE_NOT_FOUND(40401),
  /**
   * <pre>
   * Topic resource does not exist.
   * </pre>
   *
   * <code>TOPIC_NOT_FOUND = 40402;</code>
   */
  TOPIC_NOT_FOUND(40402),
  /**
   * <pre>
   * Consumer group resource does not exist.
   * </pre>
   *
   * <code>CONSUMER_GROUP_NOT_FOUND = 40403;</code>
   */
  CONSUMER_GROUP_NOT_FOUND(40403),
  /**
   * <pre>
   * Offset not found from server.
   * </pre>
   *
   * <code>OFFSET_NOT_FOUND = 40404;</code>
   */
  OFFSET_NOT_FOUND(40404),
  /**
   * <pre>
   * Generic code representing client side timeout when connecting to, reading data from, or write data to server.
   * </pre>
   *
   * <code>REQUEST_TIMEOUT = 40800;</code>
   */
  REQUEST_TIMEOUT(40800),
  /**
   * <pre>
   * Generic code represents that the request entity is larger than limits defined by server.
   * </pre>
   *
   * <code>PAYLOAD_TOO_LARGE = 41300;</code>
   */
  PAYLOAD_TOO_LARGE(41300),
  /**
   * <pre>
   * Message body size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_BODY_TOO_LARGE = 41301;</code>
   */
  MESSAGE_BODY_TOO_LARGE(41301),
  /**
   * <pre>
   * Generic code for use cases where pre-conditions are not met.
   * For example, if a producer instance is used to publish messages without prior start() invocation,
   * this error code will be raised.
   * </pre>
   *
   * <code>PRECONDITION_FAILED = 42800;</code>
   */
  PRECONDITION_FAILED(42800),
  /**
   * <pre>
   * Generic code indicates that too many requests are made in short period of duration.
   * Requests are throttled.
   * </pre>
   *
   * <code>TOO_MANY_REQUESTS = 42900;</code>
   */
  TOO_MANY_REQUESTS(42900),
  /**
   * <pre>
   * Generic code for the case that the server is unwilling to process the request because its header fields are too large.
   * The request may be resubmitted after reducing the size of the request header fields.
   * </pre>
   *
   * <code>REQUEST_HEADER_FIELDS_TOO_LARGE = 43100;</code>
   */
  REQUEST_HEADER_FIELDS_TOO_LARGE(43100),
  /**
   * <pre>
   * Message properties total size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_PROPERTIES_TOO_LARGE = 43101;</code>
   */
  MESSAGE_PROPERTIES_TOO_LARGE(43101),
  /**
   * <pre>
   * Generic code indicates that server/client encountered an unexpected
   * condition that prevented it from fulfilling the request.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 50000;</code>
   */
  INTERNAL_ERROR(50000),
  /**
   * <pre>
   * Code indicates that the server encountered an unexpected condition
   * that prevented it from fulfilling the request.
   * This error response is a generic "catch-all" response.
   * Usually, this indicates the server cannot find a better alternative
   * error code to response. Sometimes, server administrators log error
   * responses like the 500 status code with more details about the request
   * to prevent the error from happening again in the future.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500
   * </pre>
   *
   * <code>INTERNAL_SERVER_ERROR = 50001;</code>
   */
  INTERNAL_SERVER_ERROR(50001),
  /**
   * <pre>
   * The HA-mechanism is not working now.
   * </pre>
   *
   * <code>HA_NOT_AVAILABLE = 50002;</code>
   */
  HA_NOT_AVAILABLE(50002),
  /**
   * <pre>
   * Generic code means that the server or client does not support the
   * functionality required to fulfill the request.
   * </pre>
   *
   * <code>NOT_IMPLEMENTED = 50100;</code>
   */
  NOT_IMPLEMENTED(50100),
  /**
   * <pre>
   * Generic code represents that the server, which acts as a gateway or proxy,
   * does not get an satisfied response in time from its upstream servers.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/504
   * </pre>
   *
   * <code>PROXY_TIMEOUT = 50400;</code>
   */
  PROXY_TIMEOUT(50400),
  /**
   * <pre>
   * Message persistence timeout.
   * </pre>
   *
   * <code>MASTER_PERSISTENCE_TIMEOUT = 50401;</code>
   */
  MASTER_PERSISTENCE_TIMEOUT(50401),
  /**
   * <pre>
   * Slave persistence timeout.
   * </pre>
   *
   * <code>SLAVE_PERSISTENCE_TIMEOUT = 50402;</code>
   */
  SLAVE_PERSISTENCE_TIMEOUT(50402),
  /**
   * <pre>
   * Generic code for unsupported operation.
   * </pre>
   *
   * <code>UNSUPPORTED = 50500;</code>
   */
  UNSUPPORTED(50500),
  /**
   * <pre>
   * Operation is not allowed in current version.
   * </pre>
   *
   * <code>VERSION_UNSUPPORTED = 50501;</code>
   */
  VERSION_UNSUPPORTED(50501),
  /**
   * <pre>
   * Not allowed to verify message. Chances are that you are verifying
   * a FIFO message, as is violating FIFO semantics.
   * </pre>
   *
   * <code>VERIFY_FIFO_MESSAGE_UNSUPPORTED = 50502;</code>
   */
  VERIFY_FIFO_MESSAGE_UNSUPPORTED(50502),
  /**
   * <pre>
   * Generic code for failed message consumption.
   * </pre>
   *
   * <code>FAILED_TO_CONSUME_MESSAGE = 60000;</code>
   */
  FAILED_TO_CONSUME_MESSAGE(60000),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CODE_UNSPECIFIED = 0;</code>
   */
  public static final int CODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Generic code for success.
   * </pre>
   *
   * <code>OK = 20000;</code>
   */
  public static final int OK_VALUE = 20000;
  /**
   * <pre>
   * Generic code for multiple return results.
   * </pre>
   *
   * <code>MULTIPLE_RESULTS = 30000;</code>
   */
  public static final int MULTIPLE_RESULTS_VALUE = 30000;
  /**
   * <pre>
   * Generic code for bad request, indicating that required fields or headers are missing.
   * </pre>
   *
   * <code>BAD_REQUEST = 40000;</code>
   */
  public static final int BAD_REQUEST_VALUE = 40000;
  /**
   * <pre>
   * Format of access point is illegal.
   * </pre>
   *
   * <code>ILLEGAL_ACCESS_POINT = 40001;</code>
   */
  public static final int ILLEGAL_ACCESS_POINT_VALUE = 40001;
  /**
   * <pre>
   * Format of topic is illegal.
   * </pre>
   *
   * <code>ILLEGAL_TOPIC = 40002;</code>
   */
  public static final int ILLEGAL_TOPIC_VALUE = 40002;
  /**
   * <pre>
   * Format of consumer group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_CONSUMER_GROUP = 40003;</code>
   */
  public static final int ILLEGAL_CONSUMER_GROUP_VALUE = 40003;
  /**
   * <pre>
   * Format of message tag is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_TAG = 40004;</code>
   */
  public static final int ILLEGAL_MESSAGE_TAG_VALUE = 40004;
  /**
   * <pre>
   * Format of message key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_KEY = 40005;</code>
   */
  public static final int ILLEGAL_MESSAGE_KEY_VALUE = 40005;
  /**
   * <pre>
   * Format of message group is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_GROUP = 40006;</code>
   */
  public static final int ILLEGAL_MESSAGE_GROUP_VALUE = 40006;
  /**
   * <pre>
   * Format of message property key is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_PROPERTY_KEY = 40007;</code>
   */
  public static final int ILLEGAL_MESSAGE_PROPERTY_KEY_VALUE = 40007;
  /**
   * <pre>
   * Transaction id is invalid.
   * </pre>
   *
   * <code>INVALID_TRANSACTION_ID = 40008;</code>
   */
  public static final int INVALID_TRANSACTION_ID_VALUE = 40008;
  /**
   * <pre>
   * Format of message id is illegal.
   * </pre>
   *
   * <code>ILLEGAL_MESSAGE_ID = 40009;</code>
   */
  public static final int ILLEGAL_MESSAGE_ID_VALUE = 40009;
  /**
   * <pre>
   * Format of filter expression is illegal.
   * </pre>
   *
   * <code>ILLEGAL_FILTER_EXPRESSION = 40010;</code>
   */
  public static final int ILLEGAL_FILTER_EXPRESSION_VALUE = 40010;
  /**
   * <pre>
   * The invisible time of request is invalid.
   * </pre>
   *
   * <code>ILLEGAL_INVISIBLE_TIME = 40011;</code>
   */
  public static final int ILLEGAL_INVISIBLE_TIME_VALUE = 40011;
  /**
   * <pre>
   * The delivery timestamp of message is invalid.
   * </pre>
   *
   * <code>ILLEGAL_DELIVERY_TIME = 40012;</code>
   */
  public static final int ILLEGAL_DELIVERY_TIME_VALUE = 40012;
  /**
   * <pre>
   * Receipt handle of message is invalid.
   * </pre>
   *
   * <code>INVALID_RECEIPT_HANDLE = 40013;</code>
   */
  public static final int INVALID_RECEIPT_HANDLE_VALUE = 40013;
  /**
   * <pre>
   * Message property conflicts with its type.
   * </pre>
   *
   * <code>MESSAGE_PROPERTY_CONFLICT_WITH_TYPE = 40014;</code>
   */
  public static final int MESSAGE_PROPERTY_CONFLICT_WITH_TYPE_VALUE = 40014;
  /**
   * <pre>
   * Client type could not be recognized.
   * </pre>
   *
   * <code>UNRECOGNIZED_CLIENT_TYPE = 40015;</code>
   */
  public static final int UNRECOGNIZED_CLIENT_TYPE_VALUE = 40015;
  /**
   * <pre>
   * Message is corrupted.
   * </pre>
   *
   * <code>MESSAGE_CORRUPTED = 40016;</code>
   */
  public static final int MESSAGE_CORRUPTED_VALUE = 40016;
  /**
   * <pre>
   * Request is rejected due to missing of x-mq-client-id header.
   * </pre>
   *
   * <code>CLIENT_ID_REQUIRED = 40017;</code>
   */
  public static final int CLIENT_ID_REQUIRED_VALUE = 40017;
  /**
   * <pre>
   * Polling time is illegal.
   * </pre>
   *
   * <code>ILLEGAL_POLLING_TIME = 40018;</code>
   */
  public static final int ILLEGAL_POLLING_TIME_VALUE = 40018;
  /**
   * <pre>
   * Offset is illegal.
   * </pre>
   *
   * <code>ILLEGAL_OFFSET = 40019;</code>
   */
  public static final int ILLEGAL_OFFSET_VALUE = 40019;
  /**
   * <pre>
   * Generic code indicates that the client request lacks valid authentication
   * credentials for the requested resource.
   * </pre>
   *
   * <code>UNAUTHORIZED = 40100;</code>
   */
  public static final int UNAUTHORIZED_VALUE = 40100;
  /**
   * <pre>
   * Generic code indicates that the account is suspended due to overdue of payment.
   * </pre>
   *
   * <code>PAYMENT_REQUIRED = 40200;</code>
   */
  public static final int PAYMENT_REQUIRED_VALUE = 40200;
  /**
   * <pre>
   * Generic code for the case that user does not have the permission to operate.
   * </pre>
   *
   * <code>FORBIDDEN = 40300;</code>
   */
  public static final int FORBIDDEN_VALUE = 40300;
  /**
   * <pre>
   * Generic code for resource not found.
   * </pre>
   *
   * <code>NOT_FOUND = 40400;</code>
   */
  public static final int NOT_FOUND_VALUE = 40400;
  /**
   * <pre>
   * Message not found from server.
   * </pre>
   *
   * <code>MESSAGE_NOT_FOUND = 40401;</code>
   */
  public static final int MESSAGE_NOT_FOUND_VALUE = 40401;
  /**
   * <pre>
   * Topic resource does not exist.
   * </pre>
   *
   * <code>TOPIC_NOT_FOUND = 40402;</code>
   */
  public static final int TOPIC_NOT_FOUND_VALUE = 40402;
  /**
   * <pre>
   * Consumer group resource does not exist.
   * </pre>
   *
   * <code>CONSUMER_GROUP_NOT_FOUND = 40403;</code>
   */
  public static final int CONSUMER_GROUP_NOT_FOUND_VALUE = 40403;
  /**
   * <pre>
   * Offset not found from server.
   * </pre>
   *
   * <code>OFFSET_NOT_FOUND = 40404;</code>
   */
  public static final int OFFSET_NOT_FOUND_VALUE = 40404;
  /**
   * <pre>
   * Generic code representing client side timeout when connecting to, reading data from, or write data to server.
   * </pre>
   *
   * <code>REQUEST_TIMEOUT = 40800;</code>
   */
  public static final int REQUEST_TIMEOUT_VALUE = 40800;
  /**
   * <pre>
   * Generic code represents that the request entity is larger than limits defined by server.
   * </pre>
   *
   * <code>PAYLOAD_TOO_LARGE = 41300;</code>
   */
  public static final int PAYLOAD_TOO_LARGE_VALUE = 41300;
  /**
   * <pre>
   * Message body size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_BODY_TOO_LARGE = 41301;</code>
   */
  public static final int MESSAGE_BODY_TOO_LARGE_VALUE = 41301;
  /**
   * <pre>
   * Generic code for use cases where pre-conditions are not met.
   * For example, if a producer instance is used to publish messages without prior start() invocation,
   * this error code will be raised.
   * </pre>
   *
   * <code>PRECONDITION_FAILED = 42800;</code>
   */
  public static final int PRECONDITION_FAILED_VALUE = 42800;
  /**
   * <pre>
   * Generic code indicates that too many requests are made in short period of duration.
   * Requests are throttled.
   * </pre>
   *
   * <code>TOO_MANY_REQUESTS = 42900;</code>
   */
  public static final int TOO_MANY_REQUESTS_VALUE = 42900;
  /**
   * <pre>
   * Generic code for the case that the server is unwilling to process the request because its header fields are too large.
   * The request may be resubmitted after reducing the size of the request header fields.
   * </pre>
   *
   * <code>REQUEST_HEADER_FIELDS_TOO_LARGE = 43100;</code>
   */
  public static final int REQUEST_HEADER_FIELDS_TOO_LARGE_VALUE = 43100;
  /**
   * <pre>
   * Message properties total size exceeds the threshold.
   * </pre>
   *
   * <code>MESSAGE_PROPERTIES_TOO_LARGE = 43101;</code>
   */
  public static final int MESSAGE_PROPERTIES_TOO_LARGE_VALUE = 43101;
  /**
   * <pre>
   * Generic code indicates that server/client encountered an unexpected
   * condition that prevented it from fulfilling the request.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 50000;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 50000;
  /**
   * <pre>
   * Code indicates that the server encountered an unexpected condition
   * that prevented it from fulfilling the request.
   * This error response is a generic "catch-all" response.
   * Usually, this indicates the server cannot find a better alternative
   * error code to response. Sometimes, server administrators log error
   * responses like the 500 status code with more details about the request
   * to prevent the error from happening again in the future.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500
   * </pre>
   *
   * <code>INTERNAL_SERVER_ERROR = 50001;</code>
   */
  public static final int INTERNAL_SERVER_ERROR_VALUE = 50001;
  /**
   * <pre>
   * The HA-mechanism is not working now.
   * </pre>
   *
   * <code>HA_NOT_AVAILABLE = 50002;</code>
   */
  public static final int HA_NOT_AVAILABLE_VALUE = 50002;
  /**
   * <pre>
   * Generic code means that the server or client does not support the
   * functionality required to fulfill the request.
   * </pre>
   *
   * <code>NOT_IMPLEMENTED = 50100;</code>
   */
  public static final int NOT_IMPLEMENTED_VALUE = 50100;
  /**
   * <pre>
   * Generic code represents that the server, which acts as a gateway or proxy,
   * does not get an satisfied response in time from its upstream servers.
   * See https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/504
   * </pre>
   *
   * <code>PROXY_TIMEOUT = 50400;</code>
   */
  public static final int PROXY_TIMEOUT_VALUE = 50400;
  /**
   * <pre>
   * Message persistence timeout.
   * </pre>
   *
   * <code>MASTER_PERSISTENCE_TIMEOUT = 50401;</code>
   */
  public static final int MASTER_PERSISTENCE_TIMEOUT_VALUE = 50401;
  /**
   * <pre>
   * Slave persistence timeout.
   * </pre>
   *
   * <code>SLAVE_PERSISTENCE_TIMEOUT = 50402;</code>
   */
  public static final int SLAVE_PERSISTENCE_TIMEOUT_VALUE = 50402;
  /**
   * <pre>
   * Generic code for unsupported operation.
   * </pre>
   *
   * <code>UNSUPPORTED = 50500;</code>
   */
  public static final int UNSUPPORTED_VALUE = 50500;
  /**
   * <pre>
   * Operation is not allowed in current version.
   * </pre>
   *
   * <code>VERSION_UNSUPPORTED = 50501;</code>
   */
  public static final int VERSION_UNSUPPORTED_VALUE = 50501;
  /**
   * <pre>
   * Not allowed to verify message. Chances are that you are verifying
   * a FIFO message, as is violating FIFO semantics.
   * </pre>
   *
   * <code>VERIFY_FIFO_MESSAGE_UNSUPPORTED = 50502;</code>
   */
  public static final int VERIFY_FIFO_MESSAGE_UNSUPPORTED_VALUE = 50502;
  /**
   * <pre>
   * Generic code for failed message consumption.
   * </pre>
   *
   * <code>FAILED_TO_CONSUME_MESSAGE = 60000;</code>
   */
  public static final int FAILED_TO_CONSUME_MESSAGE_VALUE = 60000;


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
  public static Code valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Code forNumber(int value) {
    switch (value) {
      case 0: return CODE_UNSPECIFIED;
      case 20000: return OK;
      case 30000: return MULTIPLE_RESULTS;
      case 40000: return BAD_REQUEST;
      case 40001: return ILLEGAL_ACCESS_POINT;
      case 40002: return ILLEGAL_TOPIC;
      case 40003: return ILLEGAL_CONSUMER_GROUP;
      case 40004: return ILLEGAL_MESSAGE_TAG;
      case 40005: return ILLEGAL_MESSAGE_KEY;
      case 40006: return ILLEGAL_MESSAGE_GROUP;
      case 40007: return ILLEGAL_MESSAGE_PROPERTY_KEY;
      case 40008: return INVALID_TRANSACTION_ID;
      case 40009: return ILLEGAL_MESSAGE_ID;
      case 40010: return ILLEGAL_FILTER_EXPRESSION;
      case 40011: return ILLEGAL_INVISIBLE_TIME;
      case 40012: return ILLEGAL_DELIVERY_TIME;
      case 40013: return INVALID_RECEIPT_HANDLE;
      case 40014: return MESSAGE_PROPERTY_CONFLICT_WITH_TYPE;
      case 40015: return UNRECOGNIZED_CLIENT_TYPE;
      case 40016: return MESSAGE_CORRUPTED;
      case 40017: return CLIENT_ID_REQUIRED;
      case 40018: return ILLEGAL_POLLING_TIME;
      case 40019: return ILLEGAL_OFFSET;
      case 40100: return UNAUTHORIZED;
      case 40200: return PAYMENT_REQUIRED;
      case 40300: return FORBIDDEN;
      case 40400: return NOT_FOUND;
      case 40401: return MESSAGE_NOT_FOUND;
      case 40402: return TOPIC_NOT_FOUND;
      case 40403: return CONSUMER_GROUP_NOT_FOUND;
      case 40404: return OFFSET_NOT_FOUND;
      case 40800: return REQUEST_TIMEOUT;
      case 41300: return PAYLOAD_TOO_LARGE;
      case 41301: return MESSAGE_BODY_TOO_LARGE;
      case 42800: return PRECONDITION_FAILED;
      case 42900: return TOO_MANY_REQUESTS;
      case 43100: return REQUEST_HEADER_FIELDS_TOO_LARGE;
      case 43101: return MESSAGE_PROPERTIES_TOO_LARGE;
      case 50000: return INTERNAL_ERROR;
      case 50001: return INTERNAL_SERVER_ERROR;
      case 50002: return HA_NOT_AVAILABLE;
      case 50100: return NOT_IMPLEMENTED;
      case 50400: return PROXY_TIMEOUT;
      case 50401: return MASTER_PERSISTENCE_TIMEOUT;
      case 50402: return SLAVE_PERSISTENCE_TIMEOUT;
      case 50500: return UNSUPPORTED;
      case 50501: return VERSION_UNSUPPORTED;
      case 50502: return VERIFY_FIFO_MESSAGE_UNSUPPORTED;
      case 60000: return FAILED_TO_CONSUME_MESSAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Code>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Code> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Code>() {
          public Code findValueByNumber(int number) {
            return Code.forNumber(number);
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
    return apache.rocketmq.v2.MQDomain.getDescriptor().getEnumTypes().get(9);
  }

  private static final Code[] VALUES = values();

  public static Code valueOf(
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

  private Code(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apache.rocketmq.v2.Code)
}


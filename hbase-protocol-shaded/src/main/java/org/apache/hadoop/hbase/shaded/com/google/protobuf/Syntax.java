// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package org.apache.hadoop.hbase.shaded.com.google.protobuf;

/**
 * <pre>
 * The syntax in which a protocol buffer element is defined.
 * </pre>
 *
 * Protobuf enum {@code google.protobuf.Syntax}
 */
public enum Syntax
    implements org.apache.hadoop.hbase.shaded.com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Syntax `proto2`.
   * </pre>
   *
   * <code>SYNTAX_PROTO2 = 0;</code>
   */
  SYNTAX_PROTO2(0),
  /**
   * <pre>
   * Syntax `proto3`.
   * </pre>
   *
   * <code>SYNTAX_PROTO3 = 1;</code>
   */
  SYNTAX_PROTO3(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Syntax `proto2`.
   * </pre>
   *
   * <code>SYNTAX_PROTO2 = 0;</code>
   */
  public static final int SYNTAX_PROTO2_VALUE = 0;
  /**
   * <pre>
   * Syntax `proto3`.
   * </pre>
   *
   * <code>SYNTAX_PROTO3 = 1;</code>
   */
  public static final int SYNTAX_PROTO3_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Syntax valueOf(int value) {
    return forNumber(value);
  }

  public static Syntax forNumber(int value) {
    switch (value) {
      case 0: return SYNTAX_PROTO2;
      case 1: return SYNTAX_PROTO3;
      default: return null;
    }
  }

  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Internal.EnumLiteMap<Syntax>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final org.apache.hadoop.hbase.shaded.com.google.protobuf.Internal.EnumLiteMap<
      Syntax> internalValueMap =
        new org.apache.hadoop.hbase.shaded.com.google.protobuf.Internal.EnumLiteMap<Syntax>() {
          public Syntax findValueByNumber(int number) {
            return Syntax.forNumber(number);
          }
        };

  public final org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.TypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Syntax[] VALUES = values();

  public static Syntax valueOf(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
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

  private Syntax(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.protobuf.Syntax)
}

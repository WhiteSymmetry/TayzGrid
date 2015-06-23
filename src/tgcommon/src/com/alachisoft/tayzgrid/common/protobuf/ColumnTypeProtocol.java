// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ColumnType.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class ColumnTypeProtocol {
  private ColumnTypeProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ColumnType
      implements com.google.protobuf.ProtocolMessageEnum {
    ATTRIBUTE_COLUMN(0, 0),
    AGGREGATERESULT_COLUMN(1, 1),
    ;
    
    
    public final int getNumber() { return value; }
    
    public static ColumnType valueOf(int value) {
      switch (value) {
        case 0: return ATTRIBUTE_COLUMN;
        case 1: return AGGREGATERESULT_COLUMN;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ColumnType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ColumnType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ColumnType>() {
            public ColumnType findValueByNumber(int number) {
              return ColumnType.valueOf(number)
    ;        }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ColumnType[] VALUES = {
      ATTRIBUTE_COLUMN, AGGREGATERESULT_COLUMN, 
    };
    public static ColumnType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    private final int index;
    private final int value;
    private ColumnType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    static {
      com.alachisoft.tayzgrid.common.protobuf.ColumnTypeProtocol.getDescriptor();
    }
    
    // @@protoc_insertion_point(enum_scope:com.alachisoft.tayzgrid.common.protobuf.ColumnType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ColumnType.proto\022\'com.alachisoft.tayzg" +
      "rid.common.protobuf*>\n\nColumnType\022\024\n\020ATT" +
      "RIBUTE_COLUMN\020\000\022\032\n\026AGGREGATERESULT_COLUM" +
      "N\020\001B\024B\022ColumnTypeProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

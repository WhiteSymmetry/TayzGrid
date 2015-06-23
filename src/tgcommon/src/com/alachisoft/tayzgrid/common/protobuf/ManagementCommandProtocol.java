// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ManagementCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

import com.alachisoft.tayzgrid.common.communication.IRequest;
import com.alachisoft.tayzgrid.common.rpcframework.TargetMethodParameter;

public final class ManagementCommandProtocol {
  private ManagementCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class ManagementCommand extends
      com.google.protobuf.GeneratedMessage implements IRequest{
    // Use ManagementCommand.newBuilder() to construct.
    private ManagementCommand() {
      initFields();
    }
    private ManagementCommand(boolean noInit) {}
    
    private static final ManagementCommand defaultInstance;
    public static ManagementCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public ManagementCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_fieldAccessorTable;
    }
    
    public enum SourceType
        implements com.google.protobuf.ProtocolMessageEnum {
      TOOL(0, 1),
      MANAGER(1, 2),
      MONITOR(2, 3),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static SourceType valueOf(int value) {
        switch (value) {
          case 1: return TOOL;
          case 2: return MANAGER;
          case 3: return MONITOR;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<SourceType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<SourceType>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SourceType>() {
              public SourceType findValueByNumber(int number) {
                return SourceType.valueOf(number)
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
        return com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final SourceType[] VALUES = {
        TOOL, MANAGER, MONITOR, 
      };
      public static SourceType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private SourceType(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      static {
        com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.getDescriptor();
      }
      
      // @@protoc_insertion_point(enum_scope:com.alachisoft.tayzgrid.common.protobuf.ManagementCommand.SourceType)
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional int32 commandVersion = 2 [default = 0];
    public static final int COMMANDVERSION_FIELD_NUMBER = 2;
    private boolean hasCommandVersion;
    private int commandVersion_ = 0;
    public boolean hasCommandVersion() { return hasCommandVersion; }
    public int getCommandVersion() { return commandVersion_; }
    
    @Override
    public void setRequestId(long value){
        requestId_ = value;
    }
    
    // optional string methodName = 3;
    public static final int METHODNAME_FIELD_NUMBER = 3;
    private boolean hasMethodName;
    private java.lang.String methodName_ = "";
    public boolean hasMethodName() { return hasMethodName; }
    public java.lang.String getMethodName() { return methodName_; }
    
    // optional int32 overload = 4;
    public static final int OVERLOAD_FIELD_NUMBER = 4;
    private boolean hasOverload;
    private int overload_ = 0;
    public boolean hasOverload() { return hasOverload; }
    public int getOverload() { return overload_; }
    
    // optional bytes arguments = 5;
    public static final int ARGUMENTS_FIELD_NUMBER = 5;
    private boolean hasArguments;
    private com.google.protobuf.ByteString arguments_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasArguments() { return hasArguments; }
    public com.google.protobuf.ByteString getArguments() { return arguments_; }
    
    // optional string objectName = 6;
    public static final int OBJECTNAME_FIELD_NUMBER = 6;
    private boolean hasObjectName;
    private java.lang.String objectName_ = "";
    public boolean hasObjectName() { return hasObjectName; }
    public java.lang.String getObjectName() { return objectName_; }
    private TargetMethodParameter _parameters = new TargetMethodParameter();
    
    public TargetMethodParameter getParameters(){
        return _parameters;
    }
    // optional .com.alachisoft.tayzgrid.common.protobuf.ManagementCommand.SourceType source = 7;
    public static final int SOURCE_FIELD_NUMBER = 7;
    private boolean hasSource;
    private com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType source_;
    public boolean hasSource() { return hasSource; }
    public com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType getSource() { return source_; }
    
    private void initFields() {
      source_ = com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType.TOOL;
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRequestId()) {
        output.writeInt64(1, getRequestId());
      }
      if (hasCommandVersion()) {
        output.writeInt32(2, getCommandVersion());
      }
      if (hasMethodName()) {
        output.writeString(3, getMethodName());
      }
      if (hasOverload()) {
        output.writeInt32(4, getOverload());
      }
      if (hasArguments()) {
        output.writeBytes(5, getArguments());
      }
      if (hasObjectName()) {
        output.writeString(6, getObjectName());
      }
      if (hasSource()) {
        output.writeEnum(7, getSource().getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, getRequestId());
      }
      if (hasCommandVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, getCommandVersion());
      }
      if (hasMethodName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getMethodName());
      }
      if (hasOverload()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, getOverload());
      }
      if (hasArguments()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getArguments());
      }
      if (hasObjectName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getObjectName());
      }
      if (hasSource()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, getSource().getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasCommandVersion()) {
          setCommandVersion(other.getCommandVersion());
        }
        if (other.hasMethodName()) {
          setMethodName(other.getMethodName());
        }
        if (other.hasOverload()) {
          setOverload(other.getOverload());
        }
        if (other.hasArguments()) {
          setArguments(other.getArguments());
        }
        if (other.hasObjectName()) {
          setObjectName(other.getObjectName());
        }
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              setRequestId(input.readInt64());
              break;
            }
            case 16: {
              setCommandVersion(input.readInt32());
              break;
            }
            case 26: {
              setMethodName(input.readString());
              break;
            }
            case 32: {
              setOverload(input.readInt32());
              break;
            }
            case 42: {
              setArguments(input.readBytes());
              break;
            }
            case 50: {
              setObjectName(input.readString());
              break;
            }
            case 56: {
              int rawValue = input.readEnum();
              com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType value = com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(7, rawValue);
              } else {
                setSource(value);
              }
              break;
            }
          }
        }
      }
      
      
      // optional int64 requestId = 1;
      public boolean hasRequestId() {
        return result.hasRequestId();
      }
      public long getRequestId() {
        return result.getRequestId();
      }
      public Builder setRequestId(long value) {
        result.hasRequestId = true;
        result.requestId_ = value;
        return this;
      }
      public Builder clearRequestId() {
        result.hasRequestId = false;
        result.requestId_ = 0L;
        return this;
      }
      
      // optional int32 commandVersion = 2 [default = 0];
      public boolean hasCommandVersion() {
        return result.hasCommandVersion();
      }
      public int getCommandVersion() {
        return result.getCommandVersion();
      }
      public Builder setCommandVersion(int value) {
        result.hasCommandVersion = true;
        result.commandVersion_ = value;
        return this;
      }
      public Builder clearCommandVersion() {
        result.hasCommandVersion = false;
        result.commandVersion_ = 0;
        return this;
      }
      
      // optional string methodName = 3;
      public boolean hasMethodName() {
        return result.hasMethodName();
      }
      public java.lang.String getMethodName() {
        return result.getMethodName();
      }
      public Builder setMethodName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasMethodName = true;
        result.methodName_ = value;
        return this;
      }
      public Builder clearMethodName() {
        result.hasMethodName = false;
        result.methodName_ = getDefaultInstance().getMethodName();
        return this;
      }
      
      // optional int32 overload = 4;
      public boolean hasOverload() {
        return result.hasOverload();
      }
      public int getOverload() {
        return result.getOverload();
      }
      public Builder setOverload(int value) {
        result.hasOverload = true;
        result.overload_ = value;
        return this;
      }
      public Builder clearOverload() {
        result.hasOverload = false;
        result.overload_ = 0;
        return this;
      }
      
      // optional bytes arguments = 5;
      public boolean hasArguments() {
        return result.hasArguments();
      }
      public com.google.protobuf.ByteString getArguments() {
        return result.getArguments();
      }
      public Builder setArguments(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasArguments = true;
        result.arguments_ = value;
        return this;
      }
      public Builder clearArguments() {
        result.hasArguments = false;
        result.arguments_ = getDefaultInstance().getArguments();
        return this;
      }
      
      // optional string objectName = 6;
      public boolean hasObjectName() {
        return result.hasObjectName();
      }
      public java.lang.String getObjectName() {
        return result.getObjectName();
      }
      public Builder setObjectName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasObjectName = true;
        result.objectName_ = value;
        return this;
      }
      public Builder clearObjectName() {
        result.hasObjectName = false;
        result.objectName_ = getDefaultInstance().getObjectName();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.ManagementCommand.SourceType source = 7;
      public boolean hasSource() {
        return result.hasSource();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType getSource() {
        return result.getSource();
      }
      public Builder setSource(com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasSource = true;
        result.source_ = value;
        return this;
      }
      public Builder clearSource() {
        result.hasSource = false;
        result.source_ = com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.SourceType.TOOL;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.ManagementCommand)
    }
    
    static {
      defaultInstance = new ManagementCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.ManagementCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ManagementCommand.proto\022\'com.alachisof" +
      "t.tayzgrid.common.protobuf\"\227\002\n\021Managemen" +
      "tCommand\022\021\n\trequestId\030\001 \001(\003\022\031\n\016commandVe" +
      "rsion\030\002 \001(\005:\0010\022\022\n\nmethodName\030\003 \001(\t\022\020\n\010ov" +
      "erload\030\004 \001(\005\022\021\n\targuments\030\005 \001(\014\022\022\n\nobjec" +
      "tName\030\006 \001(\t\022U\n\006source\030\007 \001(\0162E.com.alachi" +
      "soft.tayzgrid.common.protobuf.Management" +
      "Command.SourceType\"0\n\nSourceType\022\010\n\004TOOL" +
      "\020\001\022\013\n\007MANAGER\020\002\022\013\n\007MONITOR\020\003B\033B\031Manageme" +
      "ntCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_ManagementCommand_descriptor,
              new java.lang.String[] { "RequestId", "CommandVersion", "MethodName", "Overload", "Arguments", "ObjectName", "Source", },
              com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.ManagementCommandProtocol.ManagementCommand.Builder.class);
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

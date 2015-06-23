// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapReduceTaskCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class MapReduceTaskCommandProtocol {
  private MapReduceTaskCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class MapReduceTaskCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use MapReduceTaskCommand.newBuilder() to construct.
    private MapReduceTaskCommand() {
      initFields();
    }
    private MapReduceTaskCommand(boolean noInit) {}
    
    private static final MapReduceTaskCommand defaultInstance;
    public static MapReduceTaskCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public MapReduceTaskCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_fieldAccessorTable;
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional string taskId = 2;
    public static final int TASKID_FIELD_NUMBER = 2;
    private boolean hasTaskId;
    private java.lang.String taskId_ = "";
    public boolean hasTaskId() { return hasTaskId; }
    public java.lang.String getTaskId() { return taskId_; }
    
    // optional bytes mapReduceTask = 3;
    public static final int MAPREDUCETASK_FIELD_NUMBER = 3;
    private boolean hasMapReduceTask;
    private com.google.protobuf.ByteString mapReduceTask_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasMapReduceTask() { return hasMapReduceTask; }
    public com.google.protobuf.ByteString getMapReduceTask() { return mapReduceTask_; }
    
    // optional int64 outputOption = 4;
    public static final int OUTPUTOPTION_FIELD_NUMBER = 4;
    private boolean hasOutputOption;
    private long outputOption_ = 0L;
    public boolean hasOutputOption() { return hasOutputOption; }
    public long getOutputOption() { return outputOption_; }
    
    // optional sint32 callbackId = 5;
    public static final int CALLBACKID_FIELD_NUMBER = 5;
    private boolean hasCallbackId;
    private int callbackId_ = 0;
    public boolean hasCallbackId() { return hasCallbackId; }
    public int getCallbackId() { return callbackId_; }
    
    private void initFields() {
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
      if (hasTaskId()) {
        output.writeString(2, getTaskId());
      }
      if (hasMapReduceTask()) {
        output.writeBytes(3, getMapReduceTask());
      }
      if (hasOutputOption()) {
        output.writeInt64(4, getOutputOption());
      }
      if (hasCallbackId()) {
        output.writeSInt32(5, getCallbackId());
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
      if (hasTaskId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTaskId());
      }
      if (hasMapReduceTask()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMapReduceTask());
      }
      if (hasOutputOption()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, getOutputOption());
      }
      if (hasCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(5, getCallbackId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasMapReduceTask()) {
          setMapReduceTask(other.getMapReduceTask());
        }
        if (other.hasOutputOption()) {
          setOutputOption(other.getOutputOption());
        }
        if (other.hasCallbackId()) {
          setCallbackId(other.getCallbackId());
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
            case 18: {
              setTaskId(input.readString());
              break;
            }
            case 26: {
              setMapReduceTask(input.readBytes());
              break;
            }
            case 32: {
              setOutputOption(input.readInt64());
              break;
            }
            case 40: {
              setCallbackId(input.readSInt32());
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
      
      // optional string taskId = 2;
      public boolean hasTaskId() {
        return result.hasTaskId();
      }
      public java.lang.String getTaskId() {
        return result.getTaskId();
      }
      public Builder setTaskId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTaskId = true;
        result.taskId_ = value;
        return this;
      }
      public Builder clearTaskId() {
        result.hasTaskId = false;
        result.taskId_ = getDefaultInstance().getTaskId();
        return this;
      }
      
      // optional bytes mapReduceTask = 3;
      public boolean hasMapReduceTask() {
        return result.hasMapReduceTask();
      }
      public com.google.protobuf.ByteString getMapReduceTask() {
        return result.getMapReduceTask();
      }
      public Builder setMapReduceTask(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasMapReduceTask = true;
        result.mapReduceTask_ = value;
        return this;
      }
      public Builder clearMapReduceTask() {
        result.hasMapReduceTask = false;
        result.mapReduceTask_ = getDefaultInstance().getMapReduceTask();
        return this;
      }
      
      // optional int64 outputOption = 4;
      public boolean hasOutputOption() {
        return result.hasOutputOption();
      }
      public long getOutputOption() {
        return result.getOutputOption();
      }
      public Builder setOutputOption(long value) {
        result.hasOutputOption = true;
        result.outputOption_ = value;
        return this;
      }
      public Builder clearOutputOption() {
        result.hasOutputOption = false;
        result.outputOption_ = 0L;
        return this;
      }
      
      // optional sint32 callbackId = 5;
      public boolean hasCallbackId() {
        return result.hasCallbackId();
      }
      public int getCallbackId() {
        return result.getCallbackId();
      }
      public Builder setCallbackId(int value) {
        result.hasCallbackId = true;
        result.callbackId_ = value;
        return this;
      }
      public Builder clearCallbackId() {
        result.hasCallbackId = false;
        result.callbackId_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommand)
    }
    
    static {
      defaultInstance = new MapReduceTaskCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032MapReduceTaskCommand.proto\022\'com.alachi" +
      "soft.tayzgrid.common.protobuf\"z\n\024MapRedu" +
      "ceTaskCommand\022\021\n\trequestId\030\001 \001(\003\022\016\n\006task" +
      "Id\030\002 \001(\t\022\025\n\rmapReduceTask\030\003 \001(\014\022\024\n\014outpu" +
      "tOption\030\004 \001(\003\022\022\n\ncallbackId\030\005 \001(\021B\036B\034Map" +
      "ReduceTaskCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCommand_descriptor,
              new java.lang.String[] { "RequestId", "TaskId", "MapReduceTask", "OutputOption", "CallbackId", },
              com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCommandProtocol.MapReduceTaskCommand.Builder.class);
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

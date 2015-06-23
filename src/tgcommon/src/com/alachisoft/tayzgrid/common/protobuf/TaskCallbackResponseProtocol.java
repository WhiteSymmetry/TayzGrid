// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TaskCallbackResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class TaskCallbackResponseProtocol {
  private TaskCallbackResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class TaskCallbackResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use TaskCallbackResponse.newBuilder() to construct.
    private TaskCallbackResponse() {
      initFields();
    }
    private TaskCallbackResponse(boolean noInit) {}
    
    private static final TaskCallbackResponse defaultInstance;
    public static TaskCallbackResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public TaskCallbackResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_fieldAccessorTable;
    }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.EventId eventId = 1;
    public static final int EVENTID_FIELD_NUMBER = 1;
    private boolean hasEventId;
    private com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId eventId_;
    public boolean hasEventId() { return hasEventId; }
    public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId getEventId() { return eventId_; }
    
    // optional string taskId = 2;
    public static final int TASKID_FIELD_NUMBER = 2;
    private boolean hasTaskId;
    private java.lang.String taskId_ = "";
    public boolean hasTaskId() { return hasTaskId; }
    public java.lang.String getTaskId() { return taskId_; }
    
    // optional int64 taskStatus = 3;
    public static final int TASKSTATUS_FIELD_NUMBER = 3;
    private boolean hasTaskStatus;
    private long taskStatus_ = 0L;
    public boolean hasTaskStatus() { return hasTaskStatus; }
    public long getTaskStatus() { return taskStatus_; }
    
    // optional bytes taskResult = 4;
    public static final int TASKRESULT_FIELD_NUMBER = 4;
    private boolean hasTaskResult;
    private com.google.protobuf.ByteString taskResult_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasTaskResult() { return hasTaskResult; }
    public com.google.protobuf.ByteString getTaskResult() { return taskResult_; }
    
    // optional int64 callbackId = 5;
    public static final int CALLBACKID_FIELD_NUMBER = 5;
    private boolean hasCallbackId;
    private long callbackId_ = 0L;
    public boolean hasCallbackId() { return hasCallbackId; }
    public long getCallbackId() { return callbackId_; }
    
    private void initFields() {
      eventId_ = com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasEventId()) {
        output.writeMessage(1, getEventId());
      }
      if (hasTaskId()) {
        output.writeString(2, getTaskId());
      }
      if (hasTaskStatus()) {
        output.writeInt64(3, getTaskStatus());
      }
      if (hasTaskResult()) {
        output.writeBytes(4, getTaskResult());
      }
      if (hasCallbackId()) {
        output.writeInt64(5, getCallbackId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasEventId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getEventId());
      }
      if (hasTaskId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTaskId());
      }
      if (hasTaskStatus()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, getTaskStatus());
      }
      if (hasTaskResult()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getTaskResult());
      }
      if (hasCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, getCallbackId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse.getDefaultInstance()) return this;
        if (other.hasEventId()) {
          mergeEventId(other.getEventId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasTaskStatus()) {
          setTaskStatus(other.getTaskStatus());
        }
        if (other.hasTaskResult()) {
          setTaskResult(other.getTaskResult());
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
            case 10: {
              com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.newBuilder();
              if (hasEventId()) {
                subBuilder.mergeFrom(getEventId());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setEventId(subBuilder.buildPartial());
              break;
            }
            case 18: {
              setTaskId(input.readString());
              break;
            }
            case 24: {
              setTaskStatus(input.readInt64());
              break;
            }
            case 34: {
              setTaskResult(input.readBytes());
              break;
            }
            case 40: {
              setCallbackId(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.EventId eventId = 1;
      public boolean hasEventId() {
        return result.hasEventId();
      }
      public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId getEventId() {
        return result.getEventId();
      }
      public Builder setEventId(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasEventId = true;
        result.eventId_ = value;
        return this;
      }
      public Builder setEventId(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.Builder builderForValue) {
        result.hasEventId = true;
        result.eventId_ = builderForValue.build();
        return this;
      }
      public Builder mergeEventId(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId value) {
        if (result.hasEventId() &&
            result.eventId_ != com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance()) {
          result.eventId_ =
            com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.newBuilder(result.eventId_).mergeFrom(value).buildPartial();
        } else {
          result.eventId_ = value;
        }
        result.hasEventId = true;
        return this;
      }
      public Builder clearEventId() {
        result.hasEventId = false;
        result.eventId_ = com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance();
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
      
      // optional int64 taskStatus = 3;
      public boolean hasTaskStatus() {
        return result.hasTaskStatus();
      }
      public long getTaskStatus() {
        return result.getTaskStatus();
      }
      public Builder setTaskStatus(long value) {
        result.hasTaskStatus = true;
        result.taskStatus_ = value;
        return this;
      }
      public Builder clearTaskStatus() {
        result.hasTaskStatus = false;
        result.taskStatus_ = 0L;
        return this;
      }
      
      // optional bytes taskResult = 4;
      public boolean hasTaskResult() {
        return result.hasTaskResult();
      }
      public com.google.protobuf.ByteString getTaskResult() {
        return result.getTaskResult();
      }
      public Builder setTaskResult(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTaskResult = true;
        result.taskResult_ = value;
        return this;
      }
      public Builder clearTaskResult() {
        result.hasTaskResult = false;
        result.taskResult_ = getDefaultInstance().getTaskResult();
        return this;
      }
      
      // optional int64 callbackId = 5;
      public boolean hasCallbackId() {
        return result.hasCallbackId();
      }
      public long getCallbackId() {
        return result.getCallbackId();
      }
      public Builder setCallbackId(long value) {
        result.hasCallbackId = true;
        result.callbackId_ = value;
        return this;
      }
      public Builder clearCallbackId() {
        result.hasCallbackId = false;
        result.callbackId_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponse)
    }
    
    static {
      defaultInstance = new TaskCallbackResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TaskCallbackResponse.proto\022\'com.alachi" +
      "soft.tayzgrid.common.protobuf\032\rEventId.p" +
      "roto\"\245\001\n\024TaskCallbackResponse\022A\n\007eventId" +
      "\030\001 \001(\01320.com.alachisoft.tayzgrid.common." +
      "protobuf.EventId\022\016\n\006taskId\030\002 \001(\t\022\022\n\ntask" +
      "Status\030\003 \001(\003\022\022\n\ntaskResult\030\004 \001(\014\022\022\n\ncall" +
      "backId\030\005 \001(\003B\036B\034TaskCallbackResponseProt" +
      "ocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_TaskCallbackResponse_descriptor,
              new java.lang.String[] { "EventId", "TaskId", "TaskStatus", "TaskResult", "CallbackId", },
              com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.TaskCallbackResponseProtocol.TaskCallbackResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

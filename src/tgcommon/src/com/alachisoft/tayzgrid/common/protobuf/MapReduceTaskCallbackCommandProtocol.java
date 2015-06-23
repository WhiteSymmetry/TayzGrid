// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapReduceTaskCallbackCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class MapReduceTaskCallbackCommandProtocol {
  private MapReduceTaskCallbackCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class MapReduceTaskCallbackCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use MapReduceTaskCallbackCommand.newBuilder() to construct.
    private MapReduceTaskCallbackCommand() {
      initFields();
    }
    private MapReduceTaskCallbackCommand(boolean noInit) {}
    
    private static final MapReduceTaskCallbackCommand defaultInstance;
    public static MapReduceTaskCallbackCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public MapReduceTaskCallbackCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_fieldAccessorTable;
    }
    
    // optional int64 callbackId = 1;
    public static final int CALLBACKID_FIELD_NUMBER = 1;
    private boolean hasCallbackId;
    private long callbackId_ = 0L;
    public boolean hasCallbackId() { return hasCallbackId; }
    public long getCallbackId() { return callbackId_; }
    
    // optional string taskId = 2;
    public static final int TASKID_FIELD_NUMBER = 2;
    private boolean hasTaskId;
    private java.lang.String taskId_ = "";
    public boolean hasTaskId() { return hasTaskId; }
    public java.lang.String getTaskId() { return taskId_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasCallbackId()) {
        output.writeInt64(1, getCallbackId());
      }
      if (hasTaskId()) {
        output.writeString(2, getTaskId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, getCallbackId());
      }
      if (hasTaskId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTaskId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand.getDefaultInstance()) return this;
        if (other.hasCallbackId()) {
          setCallbackId(other.getCallbackId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
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
              setCallbackId(input.readInt64());
              break;
            }
            case 18: {
              setTaskId(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional int64 callbackId = 1;
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
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommand)
    }
    
    static {
      defaultInstance = new MapReduceTaskCallbackCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MapReduceTaskCallbackCommand.proto\022\'co" +
      "m.alachisoft.tayzgrid.common.protobuf\"B\n" +
      "\034MapReduceTaskCallbackCommand\022\022\n\ncallbac" +
      "kId\030\001 \001(\003\022\016\n\006taskId\030\002 \001(\tB&B$MapReduceTa" +
      "skCallbackCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskCallbackCommand_descriptor,
              new java.lang.String[] { "CallbackId", "TaskId", },
              com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskCallbackCommandProtocol.MapReduceTaskCallbackCommand.Builder.class);
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

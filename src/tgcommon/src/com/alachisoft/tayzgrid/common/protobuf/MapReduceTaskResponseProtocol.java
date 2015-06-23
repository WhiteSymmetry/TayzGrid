// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapReduceTaskResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class MapReduceTaskResponseProtocol {
  private MapReduceTaskResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class MapReduceTaskResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use MapReduceTaskResponse.newBuilder() to construct.
    private MapReduceTaskResponse() {
      initFields();
    }
    private MapReduceTaskResponse(boolean noInit) {}
    
    private static final MapReduceTaskResponse defaultInstance;
    public static MapReduceTaskResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public MapReduceTaskResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_fieldAccessorTable;
    }
    
    // optional bytes taskResult = 1;
    public static final int TASKRESULT_FIELD_NUMBER = 1;
    private boolean hasTaskResult;
    private com.google.protobuf.ByteString taskResult_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasTaskResult() { return hasTaskResult; }
    public com.google.protobuf.ByteString getTaskResult() { return taskResult_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasTaskResult()) {
        output.writeBytes(1, getTaskResult());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasTaskResult()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTaskResult());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse.getDefaultInstance()) return this;
        if (other.hasTaskResult()) {
          setTaskResult(other.getTaskResult());
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
              setTaskResult(input.readBytes());
              break;
            }
          }
        }
      }
      
      
      // optional bytes taskResult = 1;
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
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponse)
    }
    
    static {
      defaultInstance = new MapReduceTaskResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033MapReduceTaskResponse.proto\022\'com.alach" +
      "isoft.tayzgrid.common.protobuf\"+\n\025MapRed" +
      "uceTaskResponse\022\022\n\ntaskResult\030\001 \001(\014B\037B\035M" +
      "apReduceTaskResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_MapReduceTaskResponse_descriptor,
              new java.lang.String[] { "TaskResult", },
              com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.MapReduceTaskResponseProtocol.MapReduceTaskResponse.Builder.class);
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

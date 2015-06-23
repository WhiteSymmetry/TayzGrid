// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetCacheBindingCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetCacheBindingCommandProtocol {
  private GetCacheBindingCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetCacheBindingCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use GetCacheBindingCommand.newBuilder() to construct.
    private GetCacheBindingCommand() {
      initFields();
    }
    private GetCacheBindingCommand(boolean noInit) {}
    
    private static final GetCacheBindingCommand defaultInstance;
    public static GetCacheBindingCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetCacheBindingCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_fieldAccessorTable;
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional string cacheId = 2;
    public static final int CACHEID_FIELD_NUMBER = 2;
    private boolean hasCacheId;
    private java.lang.String cacheId_ = "";
    public boolean hasCacheId() { return hasCacheId; }
    public java.lang.String getCacheId() { return cacheId_; }
    
    // optional bool isRunning = 3;
    public static final int ISRUNNING_FIELD_NUMBER = 3;
    private boolean hasIsRunning;
    private boolean isRunning_ = false;
    public boolean hasIsRunning() { return hasIsRunning; }
    public boolean getIsRunning() { return isRunning_; }
    
    // optional bool isDotnetClient = 4 [default = true];
    public static final int ISDOTNETCLIENT_FIELD_NUMBER = 4;
    private boolean hasIsDotnetClient;
    private boolean isDotnetClient_ = true;
    public boolean hasIsDotnetClient() { return hasIsDotnetClient; }
    public boolean getIsDotnetClient() { return isDotnetClient_; }
    
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
      if (hasCacheId()) {
        output.writeString(2, getCacheId());
      }
      if (hasIsRunning()) {
        output.writeBool(3, getIsRunning());
      }
      if (hasIsDotnetClient()) {
        output.writeBool(4, getIsDotnetClient());
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
      if (hasCacheId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getCacheId());
      }
      if (hasIsRunning()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getIsRunning());
      }
      if (hasIsDotnetClient()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, getIsDotnetClient());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasCacheId()) {
          setCacheId(other.getCacheId());
        }
        if (other.hasIsRunning()) {
          setIsRunning(other.getIsRunning());
        }
        if (other.hasIsDotnetClient()) {
          setIsDotnetClient(other.getIsDotnetClient());
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
              setCacheId(input.readString());
              break;
            }
            case 24: {
              setIsRunning(input.readBool());
              break;
            }
            case 32: {
              setIsDotnetClient(input.readBool());
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
      
      // optional string cacheId = 2;
      public boolean hasCacheId() {
        return result.hasCacheId();
      }
      public java.lang.String getCacheId() {
        return result.getCacheId();
      }
      public Builder setCacheId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCacheId = true;
        result.cacheId_ = value;
        return this;
      }
      public Builder clearCacheId() {
        result.hasCacheId = false;
        result.cacheId_ = getDefaultInstance().getCacheId();
        return this;
      }
      
      // optional bool isRunning = 3;
      public boolean hasIsRunning() {
        return result.hasIsRunning();
      }
      public boolean getIsRunning() {
        return result.getIsRunning();
      }
      public Builder setIsRunning(boolean value) {
        result.hasIsRunning = true;
        result.isRunning_ = value;
        return this;
      }
      public Builder clearIsRunning() {
        result.hasIsRunning = false;
        result.isRunning_ = false;
        return this;
      }
      
      // optional bool isDotnetClient = 4 [default = true];
      public boolean hasIsDotnetClient() {
        return result.hasIsDotnetClient();
      }
      public boolean getIsDotnetClient() {
        return result.getIsDotnetClient();
      }
      public Builder setIsDotnetClient(boolean value) {
        result.hasIsDotnetClient = true;
        result.isDotnetClient_ = value;
        return this;
      }
      public Builder clearIsDotnetClient() {
        result.hasIsDotnetClient = false;
        result.isDotnetClient_ = true;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommand)
    }
    
    static {
      defaultInstance = new GetCacheBindingCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetCacheBindingCommand.proto\022\'com.alac" +
      "hisoft.tayzgrid.common.protobuf\"m\n\026GetCa" +
      "cheBindingCommand\022\021\n\trequestId\030\001 \001(\003\022\017\n\007" +
      "cacheId\030\002 \001(\t\022\021\n\tisRunning\030\003 \001(\010\022\034\n\016isDo" +
      "tnetClient\030\004 \001(\010:\004trueB B\036GetCacheBindin" +
      "gCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheBindingCommand_descriptor,
              new java.lang.String[] { "RequestId", "CacheId", "IsRunning", "IsDotnetClient", },
              com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.GetCacheBindingCommandProtocol.GetCacheBindingCommand.Builder.class);
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

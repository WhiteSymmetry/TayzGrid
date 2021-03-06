// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LockCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class LockCommandProtocol {
  private LockCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class LockCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use LockCommand.newBuilder() to construct.
    private LockCommand() {
      initFields();
    }
    private LockCommand(boolean noInit) {}
    
    private static final LockCommand defaultInstance;
    public static LockCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public LockCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_fieldAccessorTable;
    }
    
    // optional bytes key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private boolean hasKey;
    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasKey() { return hasKey; }
    public com.google.protobuf.ByteString getKey() { return key_; }
    
    // optional int64 lockTimeout = 2;
    public static final int LOCKTIMEOUT_FIELD_NUMBER = 2;
    private boolean hasLockTimeout;
    private long lockTimeout_ = 0L;
    public boolean hasLockTimeout() { return hasLockTimeout; }
    public long getLockTimeout() { return lockTimeout_; }
    
    // optional int64 requestId = 3;
    public static final int REQUESTID_FIELD_NUMBER = 3;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasKey()) {
        output.writeBytes(1, getKey());
      }
      if (hasLockTimeout()) {
        output.writeInt64(2, getLockTimeout());
      }
      if (hasRequestId()) {
        output.writeInt64(3, getRequestId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasKey()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getKey());
      }
      if (hasLockTimeout()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, getLockTimeout());
      }
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, getRequestId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasLockTimeout()) {
          setLockTimeout(other.getLockTimeout());
        }
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
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
              setKey(input.readBytes());
              break;
            }
            case 16: {
              setLockTimeout(input.readInt64());
              break;
            }
            case 24: {
              setRequestId(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // optional bytes key = 1;
      public boolean hasKey() {
        return result.hasKey();
      }
      public com.google.protobuf.ByteString getKey() {
        return result.getKey();
      }
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasKey = true;
        result.key_ = value;
        return this;
      }
      public Builder clearKey() {
        result.hasKey = false;
        result.key_ = getDefaultInstance().getKey();
        return this;
      }
      
      // optional int64 lockTimeout = 2;
      public boolean hasLockTimeout() {
        return result.hasLockTimeout();
      }
      public long getLockTimeout() {
        return result.getLockTimeout();
      }
      public Builder setLockTimeout(long value) {
        result.hasLockTimeout = true;
        result.lockTimeout_ = value;
        return this;
      }
      public Builder clearLockTimeout() {
        result.hasLockTimeout = false;
        result.lockTimeout_ = 0L;
        return this;
      }
      
      // optional int64 requestId = 3;
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
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.LockCommand)
    }
    
    static {
      defaultInstance = new LockCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.LockCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LockCommand.proto\022\'com.alachisoft.tayz" +
      "grid.common.protobuf\"B\n\013LockCommand\022\013\n\003k" +
      "ey\030\001 \001(\014\022\023\n\013lockTimeout\030\002 \001(\003\022\021\n\trequest" +
      "Id\030\003 \001(\003B\025B\023LockCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_LockCommand_descriptor,
              new java.lang.String[] { "Key", "LockTimeout", "RequestId", },
              com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.LockCommandProtocol.LockCommand.Builder.class);
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

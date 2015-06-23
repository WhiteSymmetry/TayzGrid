// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class UnlockCommandProtocol {
  private UnlockCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class UnlockCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use UnlockCommand.newBuilder() to construct.
    private UnlockCommand() {
      initFields();
    }
    private UnlockCommand(boolean noInit) {}
    
    private static final UnlockCommand defaultInstance;
    public static UnlockCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public UnlockCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_fieldAccessorTable;
    }
    
    // optional bytes key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private boolean hasKey;
    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasKey() { return hasKey; }
    public com.google.protobuf.ByteString getKey() { return key_; }
    
    // optional string lockId = 2;
    public static final int LOCKID_FIELD_NUMBER = 2;
    private boolean hasLockId;
    private java.lang.String lockId_ = "";
    public boolean hasLockId() { return hasLockId; }
    public java.lang.String getLockId() { return lockId_; }
    
    // optional bool preemptive = 3;
    public static final int PREEMPTIVE_FIELD_NUMBER = 3;
    private boolean hasPreemptive;
    private boolean preemptive_ = false;
    public boolean hasPreemptive() { return hasPreemptive; }
    public boolean getPreemptive() { return preemptive_; }
    
    // optional int64 requestId = 4;
    public static final int REQUESTID_FIELD_NUMBER = 4;
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
      if (hasLockId()) {
        output.writeString(2, getLockId());
      }
      if (hasPreemptive()) {
        output.writeBool(3, getPreemptive());
      }
      if (hasRequestId()) {
        output.writeInt64(4, getRequestId());
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
      if (hasLockId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getLockId());
      }
      if (hasPreemptive()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getPreemptive());
      }
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, getRequestId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasLockId()) {
          setLockId(other.getLockId());
        }
        if (other.hasPreemptive()) {
          setPreemptive(other.getPreemptive());
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
            case 18: {
              setLockId(input.readString());
              break;
            }
            case 24: {
              setPreemptive(input.readBool());
              break;
            }
            case 32: {
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
      
      // optional string lockId = 2;
      public boolean hasLockId() {
        return result.hasLockId();
      }
      public java.lang.String getLockId() {
        return result.getLockId();
      }
      public Builder setLockId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasLockId = true;
        result.lockId_ = value;
        return this;
      }
      public Builder clearLockId() {
        result.hasLockId = false;
        result.lockId_ = getDefaultInstance().getLockId();
        return this;
      }
      
      // optional bool preemptive = 3;
      public boolean hasPreemptive() {
        return result.hasPreemptive();
      }
      public boolean getPreemptive() {
        return result.getPreemptive();
      }
      public Builder setPreemptive(boolean value) {
        result.hasPreemptive = true;
        result.preemptive_ = value;
        return this;
      }
      public Builder clearPreemptive() {
        result.hasPreemptive = false;
        result.preemptive_ = false;
        return this;
      }
      
      // optional int64 requestId = 4;
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
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.UnlockCommand)
    }
    
    static {
      defaultInstance = new UnlockCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.UnlockCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023UnlockCommand.proto\022\'com.alachisoft.ta" +
      "yzgrid.common.protobuf\"S\n\rUnlockCommand\022" +
      "\013\n\003key\030\001 \001(\014\022\016\n\006lockId\030\002 \001(\t\022\022\n\npreempti" +
      "ve\030\003 \001(\010\022\021\n\trequestId\030\004 \001(\003B\027B\025UnlockCom" +
      "mandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_UnlockCommand_descriptor,
              new java.lang.String[] { "Key", "LockId", "Preemptive", "RequestId", },
              com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.UnlockCommandProtocol.UnlockCommand.Builder.class);
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

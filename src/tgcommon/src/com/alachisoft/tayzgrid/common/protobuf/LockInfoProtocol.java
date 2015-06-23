// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LockInfo.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class LockInfoProtocol {
  private LockInfoProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class LockInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use LockInfo.newBuilder() to construct.
    private LockInfo() {
      initFields();
    }
    private LockInfo(boolean noInit) {}
    
    private static final LockInfo defaultInstance;
    public static LockInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public LockInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_fieldAccessorTable;
    }
    
    // optional int32 lockAccessType = 1;
    public static final int LOCKACCESSTYPE_FIELD_NUMBER = 1;
    private boolean hasLockAccessType;
    private int lockAccessType_ = 0;
    public boolean hasLockAccessType() { return hasLockAccessType; }
    public int getLockAccessType() { return lockAccessType_; }
    
    // optional string lockId = 2;
    public static final int LOCKID_FIELD_NUMBER = 2;
    private boolean hasLockId;
    private java.lang.String lockId_ = "";
    public boolean hasLockId() { return hasLockId; }
    public java.lang.String getLockId() { return lockId_; }
    
    // optional int64 lockTimeout = 3;
    public static final int LOCKTIMEOUT_FIELD_NUMBER = 3;
    private boolean hasLockTimeout;
    private long lockTimeout_ = 0L;
    public boolean hasLockTimeout() { return hasLockTimeout; }
    public long getLockTimeout() { return lockTimeout_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasLockAccessType()) {
        output.writeInt32(1, getLockAccessType());
      }
      if (hasLockId()) {
        output.writeString(2, getLockId());
      }
      if (hasLockTimeout()) {
        output.writeInt64(3, getLockTimeout());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasLockAccessType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, getLockAccessType());
      }
      if (hasLockId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getLockId());
      }
      if (hasLockTimeout()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, getLockTimeout());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.getDefaultInstance()) return this;
        if (other.hasLockAccessType()) {
          setLockAccessType(other.getLockAccessType());
        }
        if (other.hasLockId()) {
          setLockId(other.getLockId());
        }
        if (other.hasLockTimeout()) {
          setLockTimeout(other.getLockTimeout());
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
              setLockAccessType(input.readInt32());
              break;
            }
            case 18: {
              setLockId(input.readString());
              break;
            }
            case 24: {
              setLockTimeout(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // optional int32 lockAccessType = 1;
      public boolean hasLockAccessType() {
        return result.hasLockAccessType();
      }
      public int getLockAccessType() {
        return result.getLockAccessType();
      }
      public Builder setLockAccessType(int value) {
        result.hasLockAccessType = true;
        result.lockAccessType_ = value;
        return this;
      }
      public Builder clearLockAccessType() {
        result.hasLockAccessType = false;
        result.lockAccessType_ = 0;
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
      
      // optional int64 lockTimeout = 3;
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
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.LockInfo)
    }
    
    static {
      defaultInstance = new LockInfo(true);
      com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.LockInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016LockInfo.proto\022\'com.alachisoft.tayzgri" +
      "d.common.protobuf\"G\n\010LockInfo\022\026\n\016lockAcc" +
      "essType\030\001 \001(\005\022\016\n\006lockId\030\002 \001(\t\022\023\n\013lockTim" +
      "eout\030\003 \001(\003B\022B\020LockInfoProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_LockInfo_descriptor,
              new java.lang.String[] { "LockAccessType", "LockId", "LockTimeout", },
              com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.class,
              com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.Builder.class);
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
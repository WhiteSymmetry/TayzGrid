// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetCommandProtocol {
  private GetCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use GetCommand.newBuilder() to construct.
    private GetCommand() {
      initFields();
    }
    private GetCommand(boolean noInit) {}
    
    private static final GetCommand defaultInstance;
    public static GetCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_fieldAccessorTable;
    }
    
    // optional bytes key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private boolean hasKey;
    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasKey() { return hasKey; }
    public com.google.protobuf.ByteString getKey() { return key_; }
    
    // optional int64 requestId = 2;
    public static final int REQUESTID_FIELD_NUMBER = 2;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional int32 flag = 3;
    public static final int FLAG_FIELD_NUMBER = 3;
    private boolean hasFlag;
    private int flag_ = 0;
    public boolean hasFlag() { return hasFlag; }
    public int getFlag() { return flag_; }
    
    // optional string group = 4;
    public static final int GROUP_FIELD_NUMBER = 4;
    private boolean hasGroup;
    private java.lang.String group_ = "";
    public boolean hasGroup() { return hasGroup; }
    public java.lang.String getGroup() { return group_; }
    
    // optional string subGroup = 5;
    public static final int SUBGROUP_FIELD_NUMBER = 5;
    private boolean hasSubGroup;
    private java.lang.String subGroup_ = "";
    public boolean hasSubGroup() { return hasSubGroup; }
    public java.lang.String getSubGroup() { return subGroup_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.LockInfo lockInfo = 6;
    public static final int LOCKINFO_FIELD_NUMBER = 6;
    private boolean hasLockInfo;
    private com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo lockInfo_;
    public boolean hasLockInfo() { return hasLockInfo; }
    public com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo getLockInfo() { return lockInfo_; }
    
    // optional uint64 version = 7;
    public static final int VERSION_FIELD_NUMBER = 7;
    private boolean hasVersion;
    private long version_ = 0L;
    public boolean hasVersion() { return hasVersion; }
    public long getVersion() { return version_; }
    
    // optional string providerName = 8;
    public static final int PROVIDERNAME_FIELD_NUMBER = 8;
    private boolean hasProviderName;
    private java.lang.String providerName_ = "";
    public boolean hasProviderName() { return hasProviderName; }
    public java.lang.String getProviderName() { return providerName_; }
    
    private void initFields() {
      lockInfo_ = com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.getDefaultInstance();
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
      if (hasRequestId()) {
        output.writeInt64(2, getRequestId());
      }
      if (hasFlag()) {
        output.writeInt32(3, getFlag());
      }
      if (hasGroup()) {
        output.writeString(4, getGroup());
      }
      if (hasSubGroup()) {
        output.writeString(5, getSubGroup());
      }
      if (hasLockInfo()) {
        output.writeMessage(6, getLockInfo());
      }
      if (hasVersion()) {
        output.writeUInt64(7, getVersion());
      }
      if (hasProviderName()) {
        output.writeString(8, getProviderName());
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
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, getRequestId());
      }
      if (hasFlag()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getFlag());
      }
      if (hasGroup()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getGroup());
      }
      if (hasSubGroup()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getSubGroup());
      }
      if (hasLockInfo()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getLockInfo());
      }
      if (hasVersion()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, getVersion());
      }
      if (hasProviderName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(8, getProviderName());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasFlag()) {
          setFlag(other.getFlag());
        }
        if (other.hasGroup()) {
          setGroup(other.getGroup());
        }
        if (other.hasSubGroup()) {
          setSubGroup(other.getSubGroup());
        }
        if (other.hasLockInfo()) {
          mergeLockInfo(other.getLockInfo());
        }
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (other.hasProviderName()) {
          setProviderName(other.getProviderName());
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
              setRequestId(input.readInt64());
              break;
            }
            case 24: {
              setFlag(input.readInt32());
              break;
            }
            case 34: {
              setGroup(input.readString());
              break;
            }
            case 42: {
              setSubGroup(input.readString());
              break;
            }
            case 50: {
              com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.newBuilder();
              if (hasLockInfo()) {
                subBuilder.mergeFrom(getLockInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setLockInfo(subBuilder.buildPartial());
              break;
            }
            case 56: {
              setVersion(input.readUInt64());
              break;
            }
            case 66: {
              setProviderName(input.readString());
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
      
      // optional int64 requestId = 2;
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
      
      // optional int32 flag = 3;
      public boolean hasFlag() {
        return result.hasFlag();
      }
      public int getFlag() {
        return result.getFlag();
      }
      public Builder setFlag(int value) {
        result.hasFlag = true;
        result.flag_ = value;
        return this;
      }
      public Builder clearFlag() {
        result.hasFlag = false;
        result.flag_ = 0;
        return this;
      }
      
      // optional string group = 4;
      public boolean hasGroup() {
        return result.hasGroup();
      }
      public java.lang.String getGroup() {
        return result.getGroup();
      }
      public Builder setGroup(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasGroup = true;
        result.group_ = value;
        return this;
      }
      public Builder clearGroup() {
        result.hasGroup = false;
        result.group_ = getDefaultInstance().getGroup();
        return this;
      }
      
      // optional string subGroup = 5;
      public boolean hasSubGroup() {
        return result.hasSubGroup();
      }
      public java.lang.String getSubGroup() {
        return result.getSubGroup();
      }
      public Builder setSubGroup(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasSubGroup = true;
        result.subGroup_ = value;
        return this;
      }
      public Builder clearSubGroup() {
        result.hasSubGroup = false;
        result.subGroup_ = getDefaultInstance().getSubGroup();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.LockInfo lockInfo = 6;
      public boolean hasLockInfo() {
        return result.hasLockInfo();
      }
      public com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo getLockInfo() {
        return result.getLockInfo();
      }
      public Builder setLockInfo(com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasLockInfo = true;
        result.lockInfo_ = value;
        return this;
      }
      public Builder setLockInfo(com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.Builder builderForValue) {
        result.hasLockInfo = true;
        result.lockInfo_ = builderForValue.build();
        return this;
      }
      public Builder mergeLockInfo(com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo value) {
        if (result.hasLockInfo() &&
            result.lockInfo_ != com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.getDefaultInstance()) {
          result.lockInfo_ =
            com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.newBuilder(result.lockInfo_).mergeFrom(value).buildPartial();
        } else {
          result.lockInfo_ = value;
        }
        result.hasLockInfo = true;
        return this;
      }
      public Builder clearLockInfo() {
        result.hasLockInfo = false;
        result.lockInfo_ = com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.LockInfo.getDefaultInstance();
        return this;
      }
      
      // optional uint64 version = 7;
      public boolean hasVersion() {
        return result.hasVersion();
      }
      public long getVersion() {
        return result.getVersion();
      }
      public Builder setVersion(long value) {
        result.hasVersion = true;
        result.version_ = value;
        return this;
      }
      public Builder clearVersion() {
        result.hasVersion = false;
        result.version_ = 0L;
        return this;
      }
      
      // optional string providerName = 8;
      public boolean hasProviderName() {
        return result.hasProviderName();
      }
      public java.lang.String getProviderName() {
        return result.getProviderName();
      }
      public Builder setProviderName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasProviderName = true;
        result.providerName_ = value;
        return this;
      }
      public Builder clearProviderName() {
        result.hasProviderName = false;
        result.providerName_ = getDefaultInstance().getProviderName();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetCommand)
    }
    
    static {
      defaultInstance = new GetCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020GetCommand.proto\022\'com.alachisoft.tayzg" +
      "rid.common.protobuf\032\016LockInfo.proto\"\307\001\n\n" +
      "GetCommand\022\013\n\003key\030\001 \001(\014\022\021\n\trequestId\030\002 \001" +
      "(\003\022\014\n\004flag\030\003 \001(\005\022\r\n\005group\030\004 \001(\t\022\020\n\010subGr" +
      "oup\030\005 \001(\t\022C\n\010lockInfo\030\006 \001(\01321.com.alachi" +
      "soft.tayzgrid.common.protobuf.LockInfo\022\017" +
      "\n\007version\030\007 \001(\004\022\024\n\014providerName\030\010 \001(\tB\024B" +
      "\022GetCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCommand_descriptor,
              new java.lang.String[] { "Key", "RequestId", "Flag", "Group", "SubGroup", "LockInfo", "Version", "ProviderName", },
              com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.GetCommandProtocol.GetCommand.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.LockInfoProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

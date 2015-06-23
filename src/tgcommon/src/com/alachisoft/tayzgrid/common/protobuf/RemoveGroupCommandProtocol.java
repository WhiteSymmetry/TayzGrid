// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RemoveGroupCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class RemoveGroupCommandProtocol {
  private RemoveGroupCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class RemoveGroupCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use RemoveGroupCommand.newBuilder() to construct.
    private RemoveGroupCommand() {
      initFields();
    }
    private RemoveGroupCommand(boolean noInit) {}
    
    private static final RemoveGroupCommand defaultInstance;
    public static RemoveGroupCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public RemoveGroupCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_fieldAccessorTable;
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional string group = 2;
    public static final int GROUP_FIELD_NUMBER = 2;
    private boolean hasGroup;
    private java.lang.String group_ = "";
    public boolean hasGroup() { return hasGroup; }
    public java.lang.String getGroup() { return group_; }
    
    // optional string subGroup = 3;
    public static final int SUBGROUP_FIELD_NUMBER = 3;
    private boolean hasSubGroup;
    private java.lang.String subGroup_ = "";
    public boolean hasSubGroup() { return hasSubGroup; }
    public java.lang.String getSubGroup() { return subGroup_; }
    
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
      if (hasGroup()) {
        output.writeString(2, getGroup());
      }
      if (hasSubGroup()) {
        output.writeString(3, getSubGroup());
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
      if (hasGroup()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getGroup());
      }
      if (hasSubGroup()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getSubGroup());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasGroup()) {
          setGroup(other.getGroup());
        }
        if (other.hasSubGroup()) {
          setSubGroup(other.getSubGroup());
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
              setGroup(input.readString());
              break;
            }
            case 26: {
              setSubGroup(input.readString());
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
      
      // optional string group = 2;
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
      
      // optional string subGroup = 3;
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
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommand)
    }
    
    static {
      defaultInstance = new RemoveGroupCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RemoveGroupCommand.proto\022\'com.alachiso" +
      "ft.tayzgrid.common.protobuf\"H\n\022RemoveGro" +
      "upCommand\022\021\n\trequestId\030\001 \001(\003\022\r\n\005group\030\002 " +
      "\001(\t\022\020\n\010subGroup\030\003 \001(\tB\034B\032RemoveGroupComm" +
      "andProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_RemoveGroupCommand_descriptor,
              new java.lang.String[] { "RequestId", "Group", "SubGroup", },
              com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.RemoveGroupCommandProtocol.RemoveGroupCommand.Builder.class);
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

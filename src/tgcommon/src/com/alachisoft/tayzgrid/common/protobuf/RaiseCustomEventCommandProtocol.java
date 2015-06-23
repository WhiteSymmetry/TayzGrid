// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaiseCustomEventCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class RaiseCustomEventCommandProtocol {
  private RaiseCustomEventCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class RaiseCustomEventCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use RaiseCustomEventCommand.newBuilder() to construct.
    private RaiseCustomEventCommand() {
      initFields();
    }
    private RaiseCustomEventCommand(boolean noInit) {}
    
    private static final RaiseCustomEventCommand defaultInstance;
    public static RaiseCustomEventCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public RaiseCustomEventCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_fieldAccessorTable;
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional bytes notifIf = 2;
    public static final int NOTIFIF_FIELD_NUMBER = 2;
    private boolean hasNotifIf;
    private com.google.protobuf.ByteString notifIf_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasNotifIf() { return hasNotifIf; }
    public com.google.protobuf.ByteString getNotifIf() { return notifIf_; }
    
    // optional bytes data = 3;
    public static final int DATA_FIELD_NUMBER = 3;
    private boolean hasData;
    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasData() { return hasData; }
    public com.google.protobuf.ByteString getData() { return data_; }
    
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
      if (hasNotifIf()) {
        output.writeBytes(2, getNotifIf());
      }
      if (hasData()) {
        output.writeBytes(3, getData());
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
      if (hasNotifIf()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNotifIf());
      }
      if (hasData()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getData());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasNotifIf()) {
          setNotifIf(other.getNotifIf());
        }
        if (other.hasData()) {
          setData(other.getData());
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
              setNotifIf(input.readBytes());
              break;
            }
            case 26: {
              setData(input.readBytes());
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
      
      // optional bytes notifIf = 2;
      public boolean hasNotifIf() {
        return result.hasNotifIf();
      }
      public com.google.protobuf.ByteString getNotifIf() {
        return result.getNotifIf();
      }
      public Builder setNotifIf(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasNotifIf = true;
        result.notifIf_ = value;
        return this;
      }
      public Builder clearNotifIf() {
        result.hasNotifIf = false;
        result.notifIf_ = getDefaultInstance().getNotifIf();
        return this;
      }
      
      // optional bytes data = 3;
      public boolean hasData() {
        return result.hasData();
      }
      public com.google.protobuf.ByteString getData() {
        return result.getData();
      }
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasData = true;
        result.data_ = value;
        return this;
      }
      public Builder clearData() {
        result.hasData = false;
        result.data_ = getDefaultInstance().getData();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommand)
    }
    
    static {
      defaultInstance = new RaiseCustomEventCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RaiseCustomEventCommand.proto\022\'com.ala" +
      "chisoft.tayzgrid.common.protobuf\"K\n\027Rais" +
      "eCustomEventCommand\022\021\n\trequestId\030\001 \001(\003\022\017" +
      "\n\007notifIf\030\002 \001(\014\022\014\n\004data\030\003 \001(\014B!B\037RaiseCu" +
      "stomEventCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_RaiseCustomEventCommand_descriptor,
              new java.lang.String[] { "RequestId", "NotifIf", "Data", },
              com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.RaiseCustomEventCommandProtocol.RaiseCustomEventCommand.Builder.class);
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

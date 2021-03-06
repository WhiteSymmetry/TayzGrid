// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoggingInfoModifiedEventResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class LoggingInfoModifiedEventResponseProtocol {
  private LoggingInfoModifiedEventResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class LoggingInfoModifiedEventResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use LoggingInfoModifiedEventResponse.newBuilder() to construct.
    private LoggingInfoModifiedEventResponse() {
      initFields();
    }
    private LoggingInfoModifiedEventResponse(boolean noInit) {}
    
    private static final LoggingInfoModifiedEventResponse defaultInstance;
    public static LoggingInfoModifiedEventResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public LoggingInfoModifiedEventResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_fieldAccessorTable;
    }
    
    // optional bool enableErrorsLog = 1;
    public static final int ENABLEERRORSLOG_FIELD_NUMBER = 1;
    private boolean hasEnableErrorsLog;
    private boolean enableErrorsLog_ = false;
    public boolean hasEnableErrorsLog() { return hasEnableErrorsLog; }
    public boolean getEnableErrorsLog() { return enableErrorsLog_; }
    
    // optional bool enableDetailedErrorsLog = 2;
    public static final int ENABLEDETAILEDERRORSLOG_FIELD_NUMBER = 2;
    private boolean hasEnableDetailedErrorsLog;
    private boolean enableDetailedErrorsLog_ = false;
    public boolean hasEnableDetailedErrorsLog() { return hasEnableDetailedErrorsLog; }
    public boolean getEnableDetailedErrorsLog() { return enableDetailedErrorsLog_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasEnableErrorsLog()) {
        output.writeBool(1, getEnableErrorsLog());
      }
      if (hasEnableDetailedErrorsLog()) {
        output.writeBool(2, getEnableDetailedErrorsLog());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasEnableErrorsLog()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, getEnableErrorsLog());
      }
      if (hasEnableDetailedErrorsLog()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, getEnableDetailedErrorsLog());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse.getDefaultInstance()) return this;
        if (other.hasEnableErrorsLog()) {
          setEnableErrorsLog(other.getEnableErrorsLog());
        }
        if (other.hasEnableDetailedErrorsLog()) {
          setEnableDetailedErrorsLog(other.getEnableDetailedErrorsLog());
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
              setEnableErrorsLog(input.readBool());
              break;
            }
            case 16: {
              setEnableDetailedErrorsLog(input.readBool());
              break;
            }
          }
        }
      }
      
      
      // optional bool enableErrorsLog = 1;
      public boolean hasEnableErrorsLog() {
        return result.hasEnableErrorsLog();
      }
      public boolean getEnableErrorsLog() {
        return result.getEnableErrorsLog();
      }
      public Builder setEnableErrorsLog(boolean value) {
        result.hasEnableErrorsLog = true;
        result.enableErrorsLog_ = value;
        return this;
      }
      public Builder clearEnableErrorsLog() {
        result.hasEnableErrorsLog = false;
        result.enableErrorsLog_ = false;
        return this;
      }
      
      // optional bool enableDetailedErrorsLog = 2;
      public boolean hasEnableDetailedErrorsLog() {
        return result.hasEnableDetailedErrorsLog();
      }
      public boolean getEnableDetailedErrorsLog() {
        return result.getEnableDetailedErrorsLog();
      }
      public Builder setEnableDetailedErrorsLog(boolean value) {
        result.hasEnableDetailedErrorsLog = true;
        result.enableDetailedErrorsLog_ = value;
        return this;
      }
      public Builder clearEnableDetailedErrorsLog() {
        result.hasEnableDetailedErrorsLog = false;
        result.enableDetailedErrorsLog_ = false;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponse)
    }
    
    static {
      defaultInstance = new LoggingInfoModifiedEventResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&LoggingInfoModifiedEventResponse.proto" +
      "\022\'com.alachisoft.tayzgrid.common.protobu" +
      "f\"\\\n LoggingInfoModifiedEventResponse\022\027\n" +
      "\017enableErrorsLog\030\001 \001(\010\022\037\n\027enableDetailed" +
      "ErrorsLog\030\002 \001(\010B*B(LoggingInfoModifiedEv" +
      "entResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_LoggingInfoModifiedEventResponse_descriptor,
              new java.lang.String[] { "EnableErrorsLog", "EnableDetailedErrorsLog", },
              com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.LoggingInfoModifiedEventResponseProtocol.LoggingInfoModifiedEventResponse.Builder.class);
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

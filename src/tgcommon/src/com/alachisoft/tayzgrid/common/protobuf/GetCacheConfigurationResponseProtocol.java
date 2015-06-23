// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetCacheConfigurationResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetCacheConfigurationResponseProtocol {
  private GetCacheConfigurationResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetCacheConfigurationResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use GetCacheConfigurationResponse.newBuilder() to construct.
    private GetCacheConfigurationResponse() {
      initFields();
    }
    private GetCacheConfigurationResponse(boolean noInit) {}
    
    private static final GetCacheConfigurationResponse defaultInstance;
    public static GetCacheConfigurationResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetCacheConfigurationResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_fieldAccessorTable;
    }
    
    // optional bool isReadThru = 1 [default = false];
    public static final int ISREADTHRU_FIELD_NUMBER = 1;
    private boolean hasIsReadThru;
    private boolean isReadThru_ = false;
    public boolean hasIsReadThru() { return hasIsReadThru; }
    public boolean getIsReadThru() { return isReadThru_; }
    
    // optional bool isWriteThru = 2 [default = false];
    public static final int ISWRITETHRU_FIELD_NUMBER = 2;
    private boolean hasIsWriteThru;
    private boolean isWriteThru_ = false;
    public boolean hasIsWriteThru() { return hasIsWriteThru; }
    public boolean getIsWriteThru() { return isWriteThru_; }
    
    // optional bool isStasticsEnabled = 3 [default = true];
    public static final int ISSTASTICSENABLED_FIELD_NUMBER = 3;
    private boolean hasIsStasticsEnabled;
    private boolean isStasticsEnabled_ = true;
    public boolean hasIsStasticsEnabled() { return hasIsStasticsEnabled; }
    public boolean getIsStasticsEnabled() { return isStasticsEnabled_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasIsReadThru()) {
        output.writeBool(1, getIsReadThru());
      }
      if (hasIsWriteThru()) {
        output.writeBool(2, getIsWriteThru());
      }
      if (hasIsStasticsEnabled()) {
        output.writeBool(3, getIsStasticsEnabled());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasIsReadThru()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, getIsReadThru());
      }
      if (hasIsWriteThru()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, getIsWriteThru());
      }
      if (hasIsStasticsEnabled()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, getIsStasticsEnabled());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse.getDefaultInstance()) return this;
        if (other.hasIsReadThru()) {
          setIsReadThru(other.getIsReadThru());
        }
        if (other.hasIsWriteThru()) {
          setIsWriteThru(other.getIsWriteThru());
        }
        if (other.hasIsStasticsEnabled()) {
          setIsStasticsEnabled(other.getIsStasticsEnabled());
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
              setIsReadThru(input.readBool());
              break;
            }
            case 16: {
              setIsWriteThru(input.readBool());
              break;
            }
            case 24: {
              setIsStasticsEnabled(input.readBool());
              break;
            }
          }
        }
      }
      
      
      // optional bool isReadThru = 1 [default = false];
      public boolean hasIsReadThru() {
        return result.hasIsReadThru();
      }
      public boolean getIsReadThru() {
        return result.getIsReadThru();
      }
      public Builder setIsReadThru(boolean value) {
        result.hasIsReadThru = true;
        result.isReadThru_ = value;
        return this;
      }
      public Builder clearIsReadThru() {
        result.hasIsReadThru = false;
        result.isReadThru_ = false;
        return this;
      }
      
      // optional bool isWriteThru = 2 [default = false];
      public boolean hasIsWriteThru() {
        return result.hasIsWriteThru();
      }
      public boolean getIsWriteThru() {
        return result.getIsWriteThru();
      }
      public Builder setIsWriteThru(boolean value) {
        result.hasIsWriteThru = true;
        result.isWriteThru_ = value;
        return this;
      }
      public Builder clearIsWriteThru() {
        result.hasIsWriteThru = false;
        result.isWriteThru_ = false;
        return this;
      }
      
      // optional bool isStasticsEnabled = 3 [default = true];
      public boolean hasIsStasticsEnabled() {
        return result.hasIsStasticsEnabled();
      }
      public boolean getIsStasticsEnabled() {
        return result.getIsStasticsEnabled();
      }
      public Builder setIsStasticsEnabled(boolean value) {
        result.hasIsStasticsEnabled = true;
        result.isStasticsEnabled_ = value;
        return this;
      }
      public Builder clearIsStasticsEnabled() {
        result.hasIsStasticsEnabled = false;
        result.isStasticsEnabled_ = true;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponse)
    }
    
    static {
      defaultInstance = new GetCacheConfigurationResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#GetCacheConfigurationResponse.proto\022\'c" +
      "om.alachisoft.tayzgrid.common.protobuf\"w" +
      "\n\035GetCacheConfigurationResponse\022\031\n\nisRea" +
      "dThru\030\001 \001(\010:\005false\022\032\n\013isWriteThru\030\002 \001(\010:" +
      "\005false\022\037\n\021isStasticsEnabled\030\003 \001(\010:\004trueB" +
      "\'B%GetCacheConfigurationResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetCacheConfigurationResponse_descriptor,
              new java.lang.String[] { "IsReadThru", "IsWriteThru", "IsStasticsEnabled", },
              com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.GetCacheConfigurationResponseProtocol.GetCacheConfigurationResponse.Builder.class);
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

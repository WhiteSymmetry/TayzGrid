// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvokeEntryProcessorResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class InvokeEntryProcessorResponseProtocol {
  private InvokeEntryProcessorResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class InvokeEntryProcessorResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use InvokeEntryProcessorResponse.newBuilder() to construct.
    private InvokeEntryProcessorResponse() {
      initFields();
    }
    private InvokeEntryProcessorResponse(boolean noInit) {}
    
    private static final InvokeEntryProcessorResponse defaultInstance;
    public static InvokeEntryProcessorResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public InvokeEntryProcessorResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_fieldAccessorTable;
    }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponse keyValuePackage = 1;
    public static final int KEYVALUEPACKAGE_FIELD_NUMBER = 1;
    private boolean hasKeyValuePackage;
    private com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse keyValuePackage_;
    public boolean hasKeyValuePackage() { return hasKeyValuePackage; }
    public com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse getKeyValuePackage() { return keyValuePackage_; }
    
    private void initFields() {
      keyValuePackage_ = com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasKeyValuePackage()) {
        output.writeMessage(1, getKeyValuePackage());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasKeyValuePackage()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getKeyValuePackage());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse.getDefaultInstance()) return this;
        if (other.hasKeyValuePackage()) {
          mergeKeyValuePackage(other.getKeyValuePackage());
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
              com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.newBuilder();
              if (hasKeyValuePackage()) {
                subBuilder.mergeFrom(getKeyValuePackage());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setKeyValuePackage(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponse keyValuePackage = 1;
      public boolean hasKeyValuePackage() {
        return result.hasKeyValuePackage();
      }
      public com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse getKeyValuePackage() {
        return result.getKeyValuePackage();
      }
      public Builder setKeyValuePackage(com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasKeyValuePackage = true;
        result.keyValuePackage_ = value;
        return this;
      }
      public Builder setKeyValuePackage(com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.Builder builderForValue) {
        result.hasKeyValuePackage = true;
        result.keyValuePackage_ = builderForValue.build();
        return this;
      }
      public Builder mergeKeyValuePackage(com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse value) {
        if (result.hasKeyValuePackage() &&
            result.keyValuePackage_ != com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.getDefaultInstance()) {
          result.keyValuePackage_ =
            com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.newBuilder(result.keyValuePackage_).mergeFrom(value).buildPartial();
        } else {
          result.keyValuePackage_ = value;
        }
        result.hasKeyValuePackage = true;
        return this;
      }
      public Builder clearKeyValuePackage() {
        result.hasKeyValuePackage = false;
        result.keyValuePackage_ = com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.InvokeEPKeyValuePackageResponse.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponse)
    }
    
    static {
      defaultInstance = new InvokeEntryProcessorResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"InvokeEntryProcessorResponse.proto\022\'co" +
      "m.alachisoft.tayzgrid.common.protobuf\032%I" +
      "nvokeEPKeyValuePackageResponse.proto\"\201\001\n" +
      "\034InvokeEntryProcessorResponse\022a\n\017keyValu" +
      "ePackage\030\001 \001(\0132H.com.alachisoft.tayzgrid" +
      ".common.protobuf.InvokeEPKeyValuePackage" +
      "ResponseB&B$InvokeEntryProcessorResponse" +
      "Protocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_InvokeEntryProcessorResponse_descriptor,
              new java.lang.String[] { "KeyValuePackage", },
              com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.InvokeEntryProcessorResponseProtocol.InvokeEntryProcessorResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.InvokeEPKeyValuePackageResponseProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

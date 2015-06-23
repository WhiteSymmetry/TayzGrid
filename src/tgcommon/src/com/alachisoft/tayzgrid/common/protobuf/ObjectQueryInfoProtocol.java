// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ObjectQueryInfo.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class ObjectQueryInfoProtocol {
  private ObjectQueryInfoProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class ObjectQueryInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use ObjectQueryInfo.newBuilder() to construct.
    private ObjectQueryInfo() {
      initFields();
    }
    private ObjectQueryInfo(boolean noInit) {}
    
    private static final ObjectQueryInfo defaultInstance;
    public static ObjectQueryInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public ObjectQueryInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_fieldAccessorTable;
    }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.NamedTagInfo namedTagInfo = 1;
    public static final int NAMEDTAGINFO_FIELD_NUMBER = 1;
    private boolean hasNamedTagInfo;
    private com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo namedTagInfo_;
    public boolean hasNamedTagInfo() { return hasNamedTagInfo; }
    public com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo getNamedTagInfo() { return namedTagInfo_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.TagInfo tagInfo = 2;
    public static final int TAGINFO_FIELD_NUMBER = 2;
    private boolean hasTagInfo;
    private com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo tagInfo_;
    public boolean hasTagInfo() { return hasTagInfo; }
    public com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo getTagInfo() { return tagInfo_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.QueryInfo queryInfo = 3;
    public static final int QUERYINFO_FIELD_NUMBER = 3;
    private boolean hasQueryInfo;
    private com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo queryInfo_;
    public boolean hasQueryInfo() { return hasQueryInfo; }
    public com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo getQueryInfo() { return queryInfo_; }
    
    private void initFields() {
      namedTagInfo_ = com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.getDefaultInstance();
      tagInfo_ = com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.getDefaultInstance();
      queryInfo_ = com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasNamedTagInfo()) {
        output.writeMessage(1, getNamedTagInfo());
      }
      if (hasTagInfo()) {
        output.writeMessage(2, getTagInfo());
      }
      if (hasQueryInfo()) {
        output.writeMessage(3, getQueryInfo());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasNamedTagInfo()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getNamedTagInfo());
      }
      if (hasTagInfo()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getTagInfo());
      }
      if (hasQueryInfo()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getQueryInfo());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo.getDefaultInstance()) return this;
        if (other.hasNamedTagInfo()) {
          mergeNamedTagInfo(other.getNamedTagInfo());
        }
        if (other.hasTagInfo()) {
          mergeTagInfo(other.getTagInfo());
        }
        if (other.hasQueryInfo()) {
          mergeQueryInfo(other.getQueryInfo());
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
              com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.newBuilder();
              if (hasNamedTagInfo()) {
                subBuilder.mergeFrom(getNamedTagInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setNamedTagInfo(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.newBuilder();
              if (hasTagInfo()) {
                subBuilder.mergeFrom(getTagInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTagInfo(subBuilder.buildPartial());
              break;
            }
            case 26: {
              com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.newBuilder();
              if (hasQueryInfo()) {
                subBuilder.mergeFrom(getQueryInfo());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setQueryInfo(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.NamedTagInfo namedTagInfo = 1;
      public boolean hasNamedTagInfo() {
        return result.hasNamedTagInfo();
      }
      public com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo getNamedTagInfo() {
        return result.getNamedTagInfo();
      }
      public Builder setNamedTagInfo(com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasNamedTagInfo = true;
        result.namedTagInfo_ = value;
        return this;
      }
      public Builder setNamedTagInfo(com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.Builder builderForValue) {
        result.hasNamedTagInfo = true;
        result.namedTagInfo_ = builderForValue.build();
        return this;
      }
      public Builder mergeNamedTagInfo(com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo value) {
        if (result.hasNamedTagInfo() &&
            result.namedTagInfo_ != com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.getDefaultInstance()) {
          result.namedTagInfo_ =
            com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.newBuilder(result.namedTagInfo_).mergeFrom(value).buildPartial();
        } else {
          result.namedTagInfo_ = value;
        }
        result.hasNamedTagInfo = true;
        return this;
      }
      public Builder clearNamedTagInfo() {
        result.hasNamedTagInfo = false;
        result.namedTagInfo_ = com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.NamedTagInfo.getDefaultInstance();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.TagInfo tagInfo = 2;
      public boolean hasTagInfo() {
        return result.hasTagInfo();
      }
      public com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo getTagInfo() {
        return result.getTagInfo();
      }
      public Builder setTagInfo(com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasTagInfo = true;
        result.tagInfo_ = value;
        return this;
      }
      public Builder setTagInfo(com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.Builder builderForValue) {
        result.hasTagInfo = true;
        result.tagInfo_ = builderForValue.build();
        return this;
      }
      public Builder mergeTagInfo(com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo value) {
        if (result.hasTagInfo() &&
            result.tagInfo_ != com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.getDefaultInstance()) {
          result.tagInfo_ =
            com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.newBuilder(result.tagInfo_).mergeFrom(value).buildPartial();
        } else {
          result.tagInfo_ = value;
        }
        result.hasTagInfo = true;
        return this;
      }
      public Builder clearTagInfo() {
        result.hasTagInfo = false;
        result.tagInfo_ = com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.TagInfo.getDefaultInstance();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.QueryInfo queryInfo = 3;
      public boolean hasQueryInfo() {
        return result.hasQueryInfo();
      }
      public com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo getQueryInfo() {
        return result.getQueryInfo();
      }
      public Builder setQueryInfo(com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasQueryInfo = true;
        result.queryInfo_ = value;
        return this;
      }
      public Builder setQueryInfo(com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.Builder builderForValue) {
        result.hasQueryInfo = true;
        result.queryInfo_ = builderForValue.build();
        return this;
      }
      public Builder mergeQueryInfo(com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo value) {
        if (result.hasQueryInfo() &&
            result.queryInfo_ != com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.getDefaultInstance()) {
          result.queryInfo_ =
            com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.newBuilder(result.queryInfo_).mergeFrom(value).buildPartial();
        } else {
          result.queryInfo_ = value;
        }
        result.hasQueryInfo = true;
        return this;
      }
      public Builder clearQueryInfo() {
        result.hasQueryInfo = false;
        result.queryInfo_ = com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.QueryInfo.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfo)
    }
    
    static {
      defaultInstance = new ObjectQueryInfo(true);
      com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ObjectQueryInfo.proto\022\'com.alachisoft." +
      "tayzgrid.common.protobuf\032\017QueryInfo.prot" +
      "o\032\rTagInfo.proto\032\022NamedTagInfo.proto\"\350\001\n" +
      "\017ObjectQueryInfo\022K\n\014namedTagInfo\030\001 \001(\01325" +
      ".com.alachisoft.tayzgrid.common.protobuf" +
      ".NamedTagInfo\022A\n\007tagInfo\030\002 \001(\01320.com.ala" +
      "chisoft.tayzgrid.common.protobuf.TagInfo" +
      "\022E\n\tqueryInfo\030\003 \001(\01322.com.alachisoft.tay" +
      "zgrid.common.protobuf.QueryInfoB\031B\027Objec" +
      "tQueryInfoProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_ObjectQueryInfo_descriptor,
              new java.lang.String[] { "NamedTagInfo", "TagInfo", "QueryInfo", },
              com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo.class,
              com.alachisoft.tayzgrid.common.protobuf.ObjectQueryInfoProtocol.ObjectQueryInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.QueryInfoProtocol.getDescriptor(),
          com.alachisoft.tayzgrid.common.protobuf.TagInfoProtocol.getDescriptor(),
          com.alachisoft.tayzgrid.common.protobuf.NamedTagInfoProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NodeChangeInfo.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class NodeChangeInfoProtocol {
  private NodeChangeInfoProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class NodeChangeInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use NodeChangeInfo.newBuilder() to construct.
    private NodeChangeInfo() {
      initFields();
    }
    private NodeChangeInfo(boolean noInit) {}
    
    private static final NodeChangeInfo defaultInstance;
    public static NodeChangeInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public NodeChangeInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_fieldAccessorTable;
    }
    
    // optional string node = 1;
    public static final int NODE_FIELD_NUMBER = 1;
    private boolean hasNode;
    private java.lang.String node_ = "";
    public boolean hasNode() { return hasNode; }
    public java.lang.String getNode() { return node_; }
    
    // repeated string keys = 2;
    public static final int KEYS_FIELD_NUMBER = 2;
    private java.util.List<java.lang.String> keys_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.String> getKeysList() {
      return keys_;
    }
    public int getKeysCount() { return keys_.size(); }
    public java.lang.String getKeys(int index) {
      return keys_.get(index);
    }
    
    // repeated int32 changeType = 3;
    public static final int CHANGETYPE_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> changeType_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.Integer> getChangeTypeList() {
      return changeType_;
    }
    public int getChangeTypeCount() { return changeType_.size(); }
    public int getChangeType(int index) {
      return changeType_.get(index);
    }
    
    // repeated int32 changeIds = 4;
    public static final int CHANGEIDS_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> changeIds_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.Integer> getChangeIdsList() {
      return changeIds_;
    }
    public int getChangeIdsCount() { return changeIds_.size(); }
    public int getChangeIds(int index) {
      return changeIds_.get(index);
    }
    
    // repeated bytes value = 5;
    public static final int VALUE_FIELD_NUMBER = 5;
    private java.util.List<com.google.protobuf.ByteString> value_ =
      java.util.Collections.emptyList();
    public java.util.List<com.google.protobuf.ByteString> getValueList() {
      return value_;
    }
    public int getValueCount() { return value_.size(); }
    public com.google.protobuf.ByteString getValue(int index) {
      return value_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasNode()) {
        output.writeString(1, getNode());
      }
      for (java.lang.String element : getKeysList()) {
        output.writeString(2, element);
      }
      for (int element : getChangeTypeList()) {
        output.writeInt32(3, element);
      }
      for (int element : getChangeIdsList()) {
        output.writeInt32(4, element);
      }
      for (com.google.protobuf.ByteString element : getValueList()) {
        output.writeBytes(5, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasNode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getNode());
      }
      {
        int dataSize = 0;
        for (java.lang.String element : getKeysList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getKeysList().size();
      }
      {
        int dataSize = 0;
        for (int element : getChangeTypeList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getChangeTypeList().size();
      }
      {
        int dataSize = 0;
        for (int element : getChangeIdsList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getChangeIdsList().size();
      }
      {
        int dataSize = 0;
        for (com.google.protobuf.ByteString element : getValueList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getValueList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.keys_ != java.util.Collections.EMPTY_LIST) {
          result.keys_ =
            java.util.Collections.unmodifiableList(result.keys_);
        }
        if (result.changeType_ != java.util.Collections.EMPTY_LIST) {
          result.changeType_ =
            java.util.Collections.unmodifiableList(result.changeType_);
        }
        if (result.changeIds_ != java.util.Collections.EMPTY_LIST) {
          result.changeIds_ =
            java.util.Collections.unmodifiableList(result.changeIds_);
        }
        if (result.value_ != java.util.Collections.EMPTY_LIST) {
          result.value_ =
            java.util.Collections.unmodifiableList(result.value_);
        }
        com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo.getDefaultInstance()) return this;
        if (other.hasNode()) {
          setNode(other.getNode());
        }
        if (!other.keys_.isEmpty()) {
          if (result.keys_.isEmpty()) {
            result.keys_ = new java.util.ArrayList<java.lang.String>();
          }
          result.keys_.addAll(other.keys_);
        }
        if (!other.changeType_.isEmpty()) {
          if (result.changeType_.isEmpty()) {
            result.changeType_ = new java.util.ArrayList<java.lang.Integer>();
          }
          result.changeType_.addAll(other.changeType_);
        }
        if (!other.changeIds_.isEmpty()) {
          if (result.changeIds_.isEmpty()) {
            result.changeIds_ = new java.util.ArrayList<java.lang.Integer>();
          }
          result.changeIds_.addAll(other.changeIds_);
        }
        if (!other.value_.isEmpty()) {
          if (result.value_.isEmpty()) {
            result.value_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
          }
          result.value_.addAll(other.value_);
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
              setNode(input.readString());
              break;
            }
            case 18: {
              addKeys(input.readString());
              break;
            }
            case 24: {
              addChangeType(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addChangeType(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {
              addChangeIds(input.readInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addChangeIds(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 42: {
              addValue(input.readBytes());
              break;
            }
          }
        }
      }
      
      
      // optional string node = 1;
      public boolean hasNode() {
        return result.hasNode();
      }
      public java.lang.String getNode() {
        return result.getNode();
      }
      public Builder setNode(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasNode = true;
        result.node_ = value;
        return this;
      }
      public Builder clearNode() {
        result.hasNode = false;
        result.node_ = getDefaultInstance().getNode();
        return this;
      }
      
      // repeated string keys = 2;
      public java.util.List<java.lang.String> getKeysList() {
        return java.util.Collections.unmodifiableList(result.keys_);
      }
      public int getKeysCount() {
        return result.getKeysCount();
      }
      public java.lang.String getKeys(int index) {
        return result.getKeys(index);
      }
      public Builder setKeys(int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.keys_.set(index, value);
        return this;
      }
      public Builder addKeys(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<java.lang.String>();
        }
        result.keys_.add(value);
        return this;
      }
      public Builder addAllKeys(
          java.lang.Iterable<? extends java.lang.String> values) {
        if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<java.lang.String>();
        }
        super.addAll(values, result.keys_);
        return this;
      }
      public Builder clearKeys() {
        result.keys_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated int32 changeType = 3;
      public java.util.List<java.lang.Integer> getChangeTypeList() {
        return java.util.Collections.unmodifiableList(result.changeType_);
      }
      public int getChangeTypeCount() {
        return result.getChangeTypeCount();
      }
      public int getChangeType(int index) {
        return result.getChangeType(index);
      }
      public Builder setChangeType(int index, int value) {
        result.changeType_.set(index, value);
        return this;
      }
      public Builder addChangeType(int value) {
        if (result.changeType_.isEmpty()) {
          result.changeType_ = new java.util.ArrayList<java.lang.Integer>();
        }
        result.changeType_.add(value);
        return this;
      }
      public Builder addAllChangeType(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        if (result.changeType_.isEmpty()) {
          result.changeType_ = new java.util.ArrayList<java.lang.Integer>();
        }
        super.addAll(values, result.changeType_);
        return this;
      }
      public Builder clearChangeType() {
        result.changeType_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated int32 changeIds = 4;
      public java.util.List<java.lang.Integer> getChangeIdsList() {
        return java.util.Collections.unmodifiableList(result.changeIds_);
      }
      public int getChangeIdsCount() {
        return result.getChangeIdsCount();
      }
      public int getChangeIds(int index) {
        return result.getChangeIds(index);
      }
      public Builder setChangeIds(int index, int value) {
        result.changeIds_.set(index, value);
        return this;
      }
      public Builder addChangeIds(int value) {
        if (result.changeIds_.isEmpty()) {
          result.changeIds_ = new java.util.ArrayList<java.lang.Integer>();
        }
        result.changeIds_.add(value);
        return this;
      }
      public Builder addAllChangeIds(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        if (result.changeIds_.isEmpty()) {
          result.changeIds_ = new java.util.ArrayList<java.lang.Integer>();
        }
        super.addAll(values, result.changeIds_);
        return this;
      }
      public Builder clearChangeIds() {
        result.changeIds_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated bytes value = 5;
      public java.util.List<com.google.protobuf.ByteString> getValueList() {
        return java.util.Collections.unmodifiableList(result.value_);
      }
      public int getValueCount() {
        return result.getValueCount();
      }
      public com.google.protobuf.ByteString getValue(int index) {
        return result.getValue(index);
      }
      public Builder setValue(int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.value_.set(index, value);
        return this;
      }
      public Builder addValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.value_.isEmpty()) {
          result.value_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        result.value_.add(value);
        return this;
      }
      public Builder addAllValue(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        if (result.value_.isEmpty()) {
          result.value_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        super.addAll(values, result.value_);
        return this;
      }
      public Builder clearValue() {
        result.value_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfo)
    }
    
    static {
      defaultInstance = new NodeChangeInfo(true);
      com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024NodeChangeInfo.proto\022\'com.alachisoft.t" +
      "ayzgrid.common.protobuf\"b\n\016NodeChangeInf" +
      "o\022\014\n\004node\030\001 \001(\t\022\014\n\004keys\030\002 \003(\t\022\022\n\nchangeT" +
      "ype\030\003 \003(\005\022\021\n\tchangeIds\030\004 \003(\005\022\r\n\005value\030\005 " +
      "\003(\014B\030B\026NodeChangeInfoProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_NodeChangeInfo_descriptor,
              new java.lang.String[] { "Node", "Keys", "ChangeType", "ChangeIds", "Value", },
              com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo.class,
              com.alachisoft.tayzgrid.common.protobuf.NodeChangeInfoProtocol.NodeChangeInfo.Builder.class);
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

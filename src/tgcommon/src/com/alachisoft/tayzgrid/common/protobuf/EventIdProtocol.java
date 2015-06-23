// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventId.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class EventIdProtocol {
  private EventIdProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class EventId extends
      com.google.protobuf.GeneratedMessage {
    // Use EventId.newBuilder() to construct.
    private EventId() {
      initFields();
    }
    private EventId(boolean noInit) {}
    
    private static final EventId defaultInstance;
    public static EventId getDefaultInstance() {
      return defaultInstance;
    }
    
    public EventId getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_fieldAccessorTable;
    }
    
    // optional string eventUniqueId = 1;
    public static final int EVENTUNIQUEID_FIELD_NUMBER = 1;
    private boolean hasEventUniqueId;
    private java.lang.String eventUniqueId_ = "";
    public boolean hasEventUniqueId() { return hasEventUniqueId; }
    public java.lang.String getEventUniqueId() { return eventUniqueId_; }
    
    // optional int64 operationCounter = 2;
    public static final int OPERATIONCOUNTER_FIELD_NUMBER = 2;
    private boolean hasOperationCounter;
    private long operationCounter_ = 0L;
    public boolean hasOperationCounter() { return hasOperationCounter; }
    public long getOperationCounter() { return operationCounter_; }
    
    // optional int32 eventCounter = 3;
    public static final int EVENTCOUNTER_FIELD_NUMBER = 3;
    private boolean hasEventCounter;
    private int eventCounter_ = 0;
    public boolean hasEventCounter() { return hasEventCounter; }
    public int getEventCounter() { return eventCounter_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.EventCacheItem item = 4;
    public static final int ITEM_FIELD_NUMBER = 4;
    private boolean hasItem;
    private com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem item_;
    public boolean hasItem() { return hasItem; }
    public com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem getItem() { return item_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.EventCacheItem oldItem = 5;
    public static final int OLDITEM_FIELD_NUMBER = 5;
    private boolean hasOldItem;
    private com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem oldItem_;
    public boolean hasOldItem() { return hasOldItem; }
    public com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem getOldItem() { return oldItem_; }
    
    // optional sint32 removeReason = 6;
    public static final int REMOVEREASON_FIELD_NUMBER = 6;
    private boolean hasRemoveReason;
    private int removeReason_ = 0;
    public boolean hasRemoveReason() { return hasRemoveReason; }
    public int getRemoveReason() { return removeReason_; }
    
    private void initFields() {
      item_ = com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.getDefaultInstance();
      oldItem_ = com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasEventUniqueId()) {
        output.writeString(1, getEventUniqueId());
      }
      if (hasOperationCounter()) {
        output.writeInt64(2, getOperationCounter());
      }
      if (hasEventCounter()) {
        output.writeInt32(3, getEventCounter());
      }
      if (hasItem()) {
        output.writeMessage(4, getItem());
      }
      if (hasOldItem()) {
        output.writeMessage(5, getOldItem());
      }
      if (hasRemoveReason()) {
        output.writeSInt32(6, getRemoveReason());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasEventUniqueId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getEventUniqueId());
      }
      if (hasOperationCounter()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, getOperationCounter());
      }
      if (hasEventCounter()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getEventCounter());
      }
      if (hasItem()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getItem());
      }
      if (hasOldItem()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getOldItem());
      }
      if (hasRemoveReason()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(6, getRemoveReason());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance()) return this;
        if (other.hasEventUniqueId()) {
          setEventUniqueId(other.getEventUniqueId());
        }
        if (other.hasOperationCounter()) {
          setOperationCounter(other.getOperationCounter());
        }
        if (other.hasEventCounter()) {
          setEventCounter(other.getEventCounter());
        }
        if (other.hasItem()) {
          mergeItem(other.getItem());
        }
        if (other.hasOldItem()) {
          mergeOldItem(other.getOldItem());
        }
        if (other.hasRemoveReason()) {
          setRemoveReason(other.getRemoveReason());
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
              setEventUniqueId(input.readString());
              break;
            }
            case 16: {
              setOperationCounter(input.readInt64());
              break;
            }
            case 24: {
              setEventCounter(input.readInt32());
              break;
            }
            case 34: {
              com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.newBuilder();
              if (hasItem()) {
                subBuilder.mergeFrom(getItem());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setItem(subBuilder.buildPartial());
              break;
            }
            case 42: {
              com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.newBuilder();
              if (hasOldItem()) {
                subBuilder.mergeFrom(getOldItem());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setOldItem(subBuilder.buildPartial());
              break;
            }
            case 48: {
              setRemoveReason(input.readSInt32());
              break;
            }
          }
        }
      }
      
      
      // optional string eventUniqueId = 1;
      public boolean hasEventUniqueId() {
        return result.hasEventUniqueId();
      }
      public java.lang.String getEventUniqueId() {
        return result.getEventUniqueId();
      }
      public Builder setEventUniqueId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasEventUniqueId = true;
        result.eventUniqueId_ = value;
        return this;
      }
      public Builder clearEventUniqueId() {
        result.hasEventUniqueId = false;
        result.eventUniqueId_ = getDefaultInstance().getEventUniqueId();
        return this;
      }
      
      // optional int64 operationCounter = 2;
      public boolean hasOperationCounter() {
        return result.hasOperationCounter();
      }
      public long getOperationCounter() {
        return result.getOperationCounter();
      }
      public Builder setOperationCounter(long value) {
        result.hasOperationCounter = true;
        result.operationCounter_ = value;
        return this;
      }
      public Builder clearOperationCounter() {
        result.hasOperationCounter = false;
        result.operationCounter_ = 0L;
        return this;
      }
      
      // optional int32 eventCounter = 3;
      public boolean hasEventCounter() {
        return result.hasEventCounter();
      }
      public int getEventCounter() {
        return result.getEventCounter();
      }
      public Builder setEventCounter(int value) {
        result.hasEventCounter = true;
        result.eventCounter_ = value;
        return this;
      }
      public Builder clearEventCounter() {
        result.hasEventCounter = false;
        result.eventCounter_ = 0;
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.EventCacheItem item = 4;
      public boolean hasItem() {
        return result.hasItem();
      }
      public com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem getItem() {
        return result.getItem();
      }
      public Builder setItem(com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasItem = true;
        result.item_ = value;
        return this;
      }
      public Builder setItem(com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.Builder builderForValue) {
        result.hasItem = true;
        result.item_ = builderForValue.build();
        return this;
      }
      public Builder mergeItem(com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem value) {
        if (result.hasItem() &&
            result.item_ != com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.getDefaultInstance()) {
          result.item_ =
            com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.newBuilder(result.item_).mergeFrom(value).buildPartial();
        } else {
          result.item_ = value;
        }
        result.hasItem = true;
        return this;
      }
      public Builder clearItem() {
        result.hasItem = false;
        result.item_ = com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.getDefaultInstance();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.EventCacheItem oldItem = 5;
      public boolean hasOldItem() {
        return result.hasOldItem();
      }
      public com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem getOldItem() {
        return result.getOldItem();
      }
      public Builder setOldItem(com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasOldItem = true;
        result.oldItem_ = value;
        return this;
      }
      public Builder setOldItem(com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.Builder builderForValue) {
        result.hasOldItem = true;
        result.oldItem_ = builderForValue.build();
        return this;
      }
      public Builder mergeOldItem(com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem value) {
        if (result.hasOldItem() &&
            result.oldItem_ != com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.getDefaultInstance()) {
          result.oldItem_ =
            com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.newBuilder(result.oldItem_).mergeFrom(value).buildPartial();
        } else {
          result.oldItem_ = value;
        }
        result.hasOldItem = true;
        return this;
      }
      public Builder clearOldItem() {
        result.hasOldItem = false;
        result.oldItem_ = com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.EventCacheItem.getDefaultInstance();
        return this;
      }
      
      // optional sint32 removeReason = 6;
      public boolean hasRemoveReason() {
        return result.hasRemoveReason();
      }
      public int getRemoveReason() {
        return result.getRemoveReason();
      }
      public Builder setRemoveReason(int value) {
        result.hasRemoveReason = true;
        result.removeReason_ = value;
        return this;
      }
      public Builder clearRemoveReason() {
        result.hasRemoveReason = false;
        result.removeReason_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.EventId)
    }
    
    static {
      defaultInstance = new EventId(true);
      com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.EventId)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rEventId.proto\022\'com.alachisoft.tayzgrid" +
      ".common.protobuf\032\024EventCacheItem.proto\"\367" +
      "\001\n\007EventId\022\025\n\reventUniqueId\030\001 \001(\t\022\030\n\020ope" +
      "rationCounter\030\002 \001(\003\022\024\n\014eventCounter\030\003 \001(" +
      "\005\022E\n\004item\030\004 \001(\01327.com.alachisoft.tayzgri" +
      "d.common.protobuf.EventCacheItem\022H\n\007oldI" +
      "tem\030\005 \001(\01327.com.alachisoft.tayzgrid.comm" +
      "on.protobuf.EventCacheItem\022\024\n\014removeReas" +
      "on\030\006 \001(\021B\021B\017EventIdProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_EventId_descriptor,
              new java.lang.String[] { "EventUniqueId", "OperationCounter", "EventCounter", "Item", "OldItem", "RemoveReason", },
              com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.class,
              com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.EventCacheItemProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

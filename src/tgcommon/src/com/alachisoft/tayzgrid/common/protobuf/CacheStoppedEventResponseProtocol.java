// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CacheStoppedEventResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class CacheStoppedEventResponseProtocol {
  private CacheStoppedEventResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CacheStoppedEventResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use CacheStoppedEventResponse.newBuilder() to construct.
    private CacheStoppedEventResponse() {
      initFields();
    }
    private CacheStoppedEventResponse(boolean noInit) {}
    
    private static final CacheStoppedEventResponse defaultInstance;
    public static CacheStoppedEventResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public CacheStoppedEventResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_fieldAccessorTable;
    }
    
    // optional string cacheId = 1;
    public static final int CACHEID_FIELD_NUMBER = 1;
    private boolean hasCacheId;
    private java.lang.String cacheId_ = "";
    public boolean hasCacheId() { return hasCacheId; }
    public java.lang.String getCacheId() { return cacheId_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.EventId eventId = 2;
    public static final int EVENTID_FIELD_NUMBER = 2;
    private boolean hasEventId;
    private com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId eventId_;
    public boolean hasEventId() { return hasEventId; }
    public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId getEventId() { return eventId_; }
    
    private void initFields() {
      eventId_ = com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasCacheId()) {
        output.writeString(1, getCacheId());
      }
      if (hasEventId()) {
        output.writeMessage(2, getEventId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCacheId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getCacheId());
      }
      if (hasEventId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getEventId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse.getDefaultInstance()) return this;
        if (other.hasCacheId()) {
          setCacheId(other.getCacheId());
        }
        if (other.hasEventId()) {
          mergeEventId(other.getEventId());
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
              setCacheId(input.readString());
              break;
            }
            case 18: {
              com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.newBuilder();
              if (hasEventId()) {
                subBuilder.mergeFrom(getEventId());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setEventId(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional string cacheId = 1;
      public boolean hasCacheId() {
        return result.hasCacheId();
      }
      public java.lang.String getCacheId() {
        return result.getCacheId();
      }
      public Builder setCacheId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCacheId = true;
        result.cacheId_ = value;
        return this;
      }
      public Builder clearCacheId() {
        result.hasCacheId = false;
        result.cacheId_ = getDefaultInstance().getCacheId();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.EventId eventId = 2;
      public boolean hasEventId() {
        return result.hasEventId();
      }
      public com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId getEventId() {
        return result.getEventId();
      }
      public Builder setEventId(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasEventId = true;
        result.eventId_ = value;
        return this;
      }
      public Builder setEventId(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.Builder builderForValue) {
        result.hasEventId = true;
        result.eventId_ = builderForValue.build();
        return this;
      }
      public Builder mergeEventId(com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId value) {
        if (result.hasEventId() &&
            result.eventId_ != com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance()) {
          result.eventId_ =
            com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.newBuilder(result.eventId_).mergeFrom(value).buildPartial();
        } else {
          result.eventId_ = value;
        }
        result.hasEventId = true;
        return this;
      }
      public Builder clearEventId() {
        result.hasEventId = false;
        result.eventId_ = com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.EventId.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponse)
    }
    
    static {
      defaultInstance = new CacheStoppedEventResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CacheStoppedEventResponse.proto\022\'com.a" +
      "lachisoft.tayzgrid.common.protobuf\032\rEven" +
      "tId.proto\"o\n\031CacheStoppedEventResponse\022\017" +
      "\n\007cacheId\030\001 \001(\t\022A\n\007eventId\030\002 \001(\01320.com.a" +
      "lachisoft.tayzgrid.common.protobuf.Event" +
      "IdB#B!CacheStoppedEventResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_CacheStoppedEventResponse_descriptor,
              new java.lang.String[] { "CacheId", "EventId", },
              com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.CacheStoppedEventResponseProtocol.CacheStoppedEventResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.EventIdProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

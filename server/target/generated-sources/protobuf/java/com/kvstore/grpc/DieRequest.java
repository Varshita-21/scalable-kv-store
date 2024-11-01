// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_store.proto

package com.kvstore.grpc;

/**
 * Protobuf type {@code kvstore.DieRequest}
 */
public final class DieRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kvstore.DieRequest)
    DieRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DieRequest.newBuilder() to construct.
  private DieRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DieRequest() {
    serverName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DieRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kvstore.grpc.KVStoreProto.internal_static_kvstore_DieRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kvstore.grpc.KVStoreProto.internal_static_kvstore_DieRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kvstore.grpc.DieRequest.class, com.kvstore.grpc.DieRequest.Builder.class);
  }

  public static final int SERVER_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serverName_;
  /**
   * <code>string server_name = 1;</code>
   * @return The serverName.
   */
  @java.lang.Override
  public java.lang.String getServerName() {
    java.lang.Object ref = serverName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serverName_ = s;
      return s;
    }
  }
  /**
   * <code>string server_name = 1;</code>
   * @return The bytes for serverName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServerNameBytes() {
    java.lang.Object ref = serverName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serverName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLEAN_FIELD_NUMBER = 2;
  private boolean clean_;
  /**
   * <code>bool clean = 2;</code>
   * @return The clean.
   */
  @java.lang.Override
  public boolean getClean() {
    return clean_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serverName_);
    }
    if (clean_ != false) {
      output.writeBool(2, clean_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serverName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serverName_);
    }
    if (clean_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, clean_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.kvstore.grpc.DieRequest)) {
      return super.equals(obj);
    }
    com.kvstore.grpc.DieRequest other = (com.kvstore.grpc.DieRequest) obj;

    if (!getServerName()
        .equals(other.getServerName())) return false;
    if (getClean()
        != other.getClean()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServerName().hashCode();
    hash = (37 * hash) + CLEAN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClean());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kvstore.grpc.DieRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kvstore.grpc.DieRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kvstore.grpc.DieRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kvstore.grpc.DieRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.kvstore.grpc.DieRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code kvstore.DieRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kvstore.DieRequest)
      com.kvstore.grpc.DieRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kvstore.grpc.KVStoreProto.internal_static_kvstore_DieRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kvstore.grpc.KVStoreProto.internal_static_kvstore_DieRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kvstore.grpc.DieRequest.class, com.kvstore.grpc.DieRequest.Builder.class);
    }

    // Construct using com.kvstore.grpc.DieRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      serverName_ = "";

      clean_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kvstore.grpc.KVStoreProto.internal_static_kvstore_DieRequest_descriptor;
    }

    @java.lang.Override
    public com.kvstore.grpc.DieRequest getDefaultInstanceForType() {
      return com.kvstore.grpc.DieRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.kvstore.grpc.DieRequest build() {
      com.kvstore.grpc.DieRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kvstore.grpc.DieRequest buildPartial() {
      com.kvstore.grpc.DieRequest result = new com.kvstore.grpc.DieRequest(this);
      result.serverName_ = serverName_;
      result.clean_ = clean_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kvstore.grpc.DieRequest) {
        return mergeFrom((com.kvstore.grpc.DieRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kvstore.grpc.DieRequest other) {
      if (other == com.kvstore.grpc.DieRequest.getDefaultInstance()) return this;
      if (!other.getServerName().isEmpty()) {
        serverName_ = other.serverName_;
        onChanged();
      }
      if (other.getClean() != false) {
        setClean(other.getClean());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              serverName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              clean_ = input.readBool();

              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object serverName_ = "";
    /**
     * <code>string server_name = 1;</code>
     * @return The serverName.
     */
    public java.lang.String getServerName() {
      java.lang.Object ref = serverName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string server_name = 1;</code>
     * @return The bytes for serverName.
     */
    public com.google.protobuf.ByteString
        getServerNameBytes() {
      java.lang.Object ref = serverName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string server_name = 1;</code>
     * @param value The serverName to set.
     * @return This builder for chaining.
     */
    public Builder setServerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serverName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string server_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerName() {
      
      serverName_ = getDefaultInstance().getServerName();
      onChanged();
      return this;
    }
    /**
     * <code>string server_name = 1;</code>
     * @param value The bytes for serverName to set.
     * @return This builder for chaining.
     */
    public Builder setServerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serverName_ = value;
      onChanged();
      return this;
    }

    private boolean clean_ ;
    /**
     * <code>bool clean = 2;</code>
     * @return The clean.
     */
    @java.lang.Override
    public boolean getClean() {
      return clean_;
    }
    /**
     * <code>bool clean = 2;</code>
     * @param value The clean to set.
     * @return This builder for chaining.
     */
    public Builder setClean(boolean value) {
      
      clean_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool clean = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClean() {
      
      clean_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kvstore.DieRequest)
  }

  // @@protoc_insertion_point(class_scope:kvstore.DieRequest)
  private static final com.kvstore.grpc.DieRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kvstore.grpc.DieRequest();
  }

  public static com.kvstore.grpc.DieRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DieRequest>
      PARSER = new com.google.protobuf.AbstractParser<DieRequest>() {
    @java.lang.Override
    public DieRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DieRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DieRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kvstore.grpc.DieRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft.proto

package com.kvstore.raft;

/**
 * Protobuf type {@code kvstore.raft.RequestVoteRequest}
 */
public final class RequestVoteRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kvstore.raft.RequestVoteRequest)
    RequestVoteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestVoteRequest.newBuilder() to construct.
  private RequestVoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestVoteRequest() {
    candidateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestVoteRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kvstore.raft.RaftProto.internal_static_kvstore_raft_RequestVoteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kvstore.raft.RaftProto.internal_static_kvstore_raft_RequestVoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kvstore.raft.RequestVoteRequest.class, com.kvstore.raft.RequestVoteRequest.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private long term_;
  /**
   * <code>int64 term = 1;</code>
   * @return The term.
   */
  @java.lang.Override
  public long getTerm() {
    return term_;
  }

  public static final int CANDIDATEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object candidateId_;
  /**
   * <code>string candidateId = 2;</code>
   * @return The candidateId.
   */
  @java.lang.Override
  public java.lang.String getCandidateId() {
    java.lang.Object ref = candidateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateId_ = s;
      return s;
    }
  }
  /**
   * <code>string candidateId = 2;</code>
   * @return The bytes for candidateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCandidateIdBytes() {
    java.lang.Object ref = candidateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LASTLOGINDEX_FIELD_NUMBER = 3;
  private long lastLogIndex_;
  /**
   * <code>int64 lastLogIndex = 3;</code>
   * @return The lastLogIndex.
   */
  @java.lang.Override
  public long getLastLogIndex() {
    return lastLogIndex_;
  }

  public static final int LASTLOGTERM_FIELD_NUMBER = 4;
  private long lastLogTerm_;
  /**
   * <code>int64 lastLogTerm = 4;</code>
   * @return The lastLogTerm.
   */
  @java.lang.Override
  public long getLastLogTerm() {
    return lastLogTerm_;
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
    if (term_ != 0L) {
      output.writeInt64(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(candidateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, candidateId_);
    }
    if (lastLogIndex_ != 0L) {
      output.writeInt64(3, lastLogIndex_);
    }
    if (lastLogTerm_ != 0L) {
      output.writeInt64(4, lastLogTerm_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (term_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(candidateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, candidateId_);
    }
    if (lastLogIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, lastLogIndex_);
    }
    if (lastLogTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastLogTerm_);
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
    if (!(obj instanceof com.kvstore.raft.RequestVoteRequest)) {
      return super.equals(obj);
    }
    com.kvstore.raft.RequestVoteRequest other = (com.kvstore.raft.RequestVoteRequest) obj;

    if (getTerm()
        != other.getTerm()) return false;
    if (!getCandidateId()
        .equals(other.getCandidateId())) return false;
    if (getLastLogIndex()
        != other.getLastLogIndex()) return false;
    if (getLastLogTerm()
        != other.getLastLogTerm()) return false;
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTerm());
    hash = (37 * hash) + CANDIDATEID_FIELD_NUMBER;
    hash = (53 * hash) + getCandidateId().hashCode();
    hash = (37 * hash) + LASTLOGINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastLogIndex());
    hash = (37 * hash) + LASTLOGTERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastLogTerm());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kvstore.raft.RequestVoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.kvstore.raft.RequestVoteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kvstore.raft.RequestVoteRequest parseFrom(
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
  public static Builder newBuilder(com.kvstore.raft.RequestVoteRequest prototype) {
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
   * Protobuf type {@code kvstore.raft.RequestVoteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kvstore.raft.RequestVoteRequest)
      com.kvstore.raft.RequestVoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kvstore.raft.RaftProto.internal_static_kvstore_raft_RequestVoteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kvstore.raft.RaftProto.internal_static_kvstore_raft_RequestVoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kvstore.raft.RequestVoteRequest.class, com.kvstore.raft.RequestVoteRequest.Builder.class);
    }

    // Construct using com.kvstore.raft.RequestVoteRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      term_ = 0L;

      candidateId_ = "";

      lastLogIndex_ = 0L;

      lastLogTerm_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kvstore.raft.RaftProto.internal_static_kvstore_raft_RequestVoteRequest_descriptor;
    }

    @java.lang.Override
    public com.kvstore.raft.RequestVoteRequest getDefaultInstanceForType() {
      return com.kvstore.raft.RequestVoteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.kvstore.raft.RequestVoteRequest build() {
      com.kvstore.raft.RequestVoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kvstore.raft.RequestVoteRequest buildPartial() {
      com.kvstore.raft.RequestVoteRequest result = new com.kvstore.raft.RequestVoteRequest(this);
      result.term_ = term_;
      result.candidateId_ = candidateId_;
      result.lastLogIndex_ = lastLogIndex_;
      result.lastLogTerm_ = lastLogTerm_;
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
      if (other instanceof com.kvstore.raft.RequestVoteRequest) {
        return mergeFrom((com.kvstore.raft.RequestVoteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kvstore.raft.RequestVoteRequest other) {
      if (other == com.kvstore.raft.RequestVoteRequest.getDefaultInstance()) return this;
      if (other.getTerm() != 0L) {
        setTerm(other.getTerm());
      }
      if (!other.getCandidateId().isEmpty()) {
        candidateId_ = other.candidateId_;
        onChanged();
      }
      if (other.getLastLogIndex() != 0L) {
        setLastLogIndex(other.getLastLogIndex());
      }
      if (other.getLastLogTerm() != 0L) {
        setLastLogTerm(other.getLastLogTerm());
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
            case 8: {
              term_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              candidateId_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              lastLogIndex_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              lastLogTerm_ = input.readInt64();

              break;
            } // case 32
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

    private long term_ ;
    /**
     * <code>int64 term = 1;</code>
     * @return The term.
     */
    @java.lang.Override
    public long getTerm() {
      return term_;
    }
    /**
     * <code>int64 term = 1;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(long value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 term = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      
      term_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object candidateId_ = "";
    /**
     * <code>string candidateId = 2;</code>
     * @return The candidateId.
     */
    public java.lang.String getCandidateId() {
      java.lang.Object ref = candidateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string candidateId = 2;</code>
     * @return The bytes for candidateId.
     */
    public com.google.protobuf.ByteString
        getCandidateIdBytes() {
      java.lang.Object ref = candidateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string candidateId = 2;</code>
     * @param value The candidateId to set.
     * @return This builder for chaining.
     */
    public Builder setCandidateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string candidateId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandidateId() {
      
      candidateId_ = getDefaultInstance().getCandidateId();
      onChanged();
      return this;
    }
    /**
     * <code>string candidateId = 2;</code>
     * @param value The bytes for candidateId to set.
     * @return This builder for chaining.
     */
    public Builder setCandidateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidateId_ = value;
      onChanged();
      return this;
    }

    private long lastLogIndex_ ;
    /**
     * <code>int64 lastLogIndex = 3;</code>
     * @return The lastLogIndex.
     */
    @java.lang.Override
    public long getLastLogIndex() {
      return lastLogIndex_;
    }
    /**
     * <code>int64 lastLogIndex = 3;</code>
     * @param value The lastLogIndex to set.
     * @return This builder for chaining.
     */
    public Builder setLastLogIndex(long value) {
      
      lastLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lastLogIndex = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLogIndex() {
      
      lastLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private long lastLogTerm_ ;
    /**
     * <code>int64 lastLogTerm = 4;</code>
     * @return The lastLogTerm.
     */
    @java.lang.Override
    public long getLastLogTerm() {
      return lastLogTerm_;
    }
    /**
     * <code>int64 lastLogTerm = 4;</code>
     * @param value The lastLogTerm to set.
     * @return This builder for chaining.
     */
    public Builder setLastLogTerm(long value) {
      
      lastLogTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lastLogTerm = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLogTerm() {
      
      lastLogTerm_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:kvstore.raft.RequestVoteRequest)
  }

  // @@protoc_insertion_point(class_scope:kvstore.raft.RequestVoteRequest)
  private static final com.kvstore.raft.RequestVoteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kvstore.raft.RequestVoteRequest();
  }

  public static com.kvstore.raft.RequestVoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestVoteRequest>
      PARSER = new com.google.protobuf.AbstractParser<RequestVoteRequest>() {
    @java.lang.Override
    public RequestVoteRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestVoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestVoteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kvstore.raft.RequestVoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

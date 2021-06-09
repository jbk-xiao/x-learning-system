// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CommunityWholeService.proto

package com.learning.learning.grpc;

/**
 * Protobuf type {@code com.learning.learning.grpc.CommunityWholeResponse}
 */
public  final class CommunityWholeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.learning.learning.grpc.CommunityWholeResponse)
    CommunityWholeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommunityWholeResponse.newBuilder() to construct.
  private CommunityWholeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommunityWholeResponse() {
    noteList_ = "";
    scoreBoard_ = "";
    question_ = "";
    likeList_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CommunityWholeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommunityWholeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            noteList_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            scoreBoard_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            question_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            likeList_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.learning.learning.grpc.CommunityWholeServiceOuterClass.internal_static_com_learning_learning_grpc_CommunityWholeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.learning.learning.grpc.CommunityWholeServiceOuterClass.internal_static_com_learning_learning_grpc_CommunityWholeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.learning.learning.grpc.CommunityWholeResponse.class, com.learning.learning.grpc.CommunityWholeResponse.Builder.class);
  }

  public static final int NOTELIST_FIELD_NUMBER = 1;
  private volatile java.lang.Object noteList_;
  /**
   * <code>string noteList = 1;</code>
   */
  public java.lang.String getNoteList() {
    java.lang.Object ref = noteList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      noteList_ = s;
      return s;
    }
  }
  /**
   * <code>string noteList = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNoteListBytes() {
    java.lang.Object ref = noteList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      noteList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCOREBOARD_FIELD_NUMBER = 2;
  private volatile java.lang.Object scoreBoard_;
  /**
   * <code>string scoreBoard = 2;</code>
   */
  public java.lang.String getScoreBoard() {
    java.lang.Object ref = scoreBoard_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scoreBoard_ = s;
      return s;
    }
  }
  /**
   * <code>string scoreBoard = 2;</code>
   */
  public com.google.protobuf.ByteString
      getScoreBoardBytes() {
    java.lang.Object ref = scoreBoard_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scoreBoard_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUESTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object question_;
  /**
   * <code>string question = 3;</code>
   */
  public java.lang.String getQuestion() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      question_ = s;
      return s;
    }
  }
  /**
   * <code>string question = 3;</code>
   */
  public com.google.protobuf.ByteString
      getQuestionBytes() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      question_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIKELIST_FIELD_NUMBER = 4;
  private volatile java.lang.Object likeList_;
  /**
   * <code>string likeList = 4;</code>
   */
  public java.lang.String getLikeList() {
    java.lang.Object ref = likeList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      likeList_ = s;
      return s;
    }
  }
  /**
   * <code>string likeList = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLikeListBytes() {
    java.lang.Object ref = likeList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      likeList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getNoteListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, noteList_);
    }
    if (!getScoreBoardBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scoreBoard_);
    }
    if (!getQuestionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, question_);
    }
    if (!getLikeListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, likeList_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNoteListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, noteList_);
    }
    if (!getScoreBoardBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, scoreBoard_);
    }
    if (!getQuestionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, question_);
    }
    if (!getLikeListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, likeList_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.learning.learning.grpc.CommunityWholeResponse)) {
      return super.equals(obj);
    }
    com.learning.learning.grpc.CommunityWholeResponse other = (com.learning.learning.grpc.CommunityWholeResponse) obj;

    if (!getNoteList()
        .equals(other.getNoteList())) return false;
    if (!getScoreBoard()
        .equals(other.getScoreBoard())) return false;
    if (!getQuestion()
        .equals(other.getQuestion())) return false;
    if (!getLikeList()
        .equals(other.getLikeList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NOTELIST_FIELD_NUMBER;
    hash = (53 * hash) + getNoteList().hashCode();
    hash = (37 * hash) + SCOREBOARD_FIELD_NUMBER;
    hash = (53 * hash) + getScoreBoard().hashCode();
    hash = (37 * hash) + QUESTION_FIELD_NUMBER;
    hash = (53 * hash) + getQuestion().hashCode();
    hash = (37 * hash) + LIKELIST_FIELD_NUMBER;
    hash = (53 * hash) + getLikeList().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learning.learning.grpc.CommunityWholeResponse parseFrom(
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
  public static Builder newBuilder(com.learning.learning.grpc.CommunityWholeResponse prototype) {
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
   * Protobuf type {@code com.learning.learning.grpc.CommunityWholeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.learning.learning.grpc.CommunityWholeResponse)
      com.learning.learning.grpc.CommunityWholeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.learning.learning.grpc.CommunityWholeServiceOuterClass.internal_static_com_learning_learning_grpc_CommunityWholeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.learning.learning.grpc.CommunityWholeServiceOuterClass.internal_static_com_learning_learning_grpc_CommunityWholeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.learning.learning.grpc.CommunityWholeResponse.class, com.learning.learning.grpc.CommunityWholeResponse.Builder.class);
    }

    // Construct using com.learning.learning.grpc.CommunityWholeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      noteList_ = "";

      scoreBoard_ = "";

      question_ = "";

      likeList_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.learning.learning.grpc.CommunityWholeServiceOuterClass.internal_static_com_learning_learning_grpc_CommunityWholeResponse_descriptor;
    }

    @java.lang.Override
    public com.learning.learning.grpc.CommunityWholeResponse getDefaultInstanceForType() {
      return com.learning.learning.grpc.CommunityWholeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.learning.learning.grpc.CommunityWholeResponse build() {
      com.learning.learning.grpc.CommunityWholeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.learning.learning.grpc.CommunityWholeResponse buildPartial() {
      com.learning.learning.grpc.CommunityWholeResponse result = new com.learning.learning.grpc.CommunityWholeResponse(this);
      result.noteList_ = noteList_;
      result.scoreBoard_ = scoreBoard_;
      result.question_ = question_;
      result.likeList_ = likeList_;
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
      if (other instanceof com.learning.learning.grpc.CommunityWholeResponse) {
        return mergeFrom((com.learning.learning.grpc.CommunityWholeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.learning.learning.grpc.CommunityWholeResponse other) {
      if (other == com.learning.learning.grpc.CommunityWholeResponse.getDefaultInstance()) return this;
      if (!other.getNoteList().isEmpty()) {
        noteList_ = other.noteList_;
        onChanged();
      }
      if (!other.getScoreBoard().isEmpty()) {
        scoreBoard_ = other.scoreBoard_;
        onChanged();
      }
      if (!other.getQuestion().isEmpty()) {
        question_ = other.question_;
        onChanged();
      }
      if (!other.getLikeList().isEmpty()) {
        likeList_ = other.likeList_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.learning.learning.grpc.CommunityWholeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.learning.learning.grpc.CommunityWholeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object noteList_ = "";
    /**
     * <code>string noteList = 1;</code>
     */
    public java.lang.String getNoteList() {
      java.lang.Object ref = noteList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        noteList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string noteList = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNoteListBytes() {
      java.lang.Object ref = noteList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        noteList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string noteList = 1;</code>
     */
    public Builder setNoteList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      noteList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string noteList = 1;</code>
     */
    public Builder clearNoteList() {
      
      noteList_ = getDefaultInstance().getNoteList();
      onChanged();
      return this;
    }
    /**
     * <code>string noteList = 1;</code>
     */
    public Builder setNoteListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      noteList_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object scoreBoard_ = "";
    /**
     * <code>string scoreBoard = 2;</code>
     */
    public java.lang.String getScoreBoard() {
      java.lang.Object ref = scoreBoard_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scoreBoard_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scoreBoard = 2;</code>
     */
    public com.google.protobuf.ByteString
        getScoreBoardBytes() {
      java.lang.Object ref = scoreBoard_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scoreBoard_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scoreBoard = 2;</code>
     */
    public Builder setScoreBoard(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scoreBoard_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string scoreBoard = 2;</code>
     */
    public Builder clearScoreBoard() {
      
      scoreBoard_ = getDefaultInstance().getScoreBoard();
      onChanged();
      return this;
    }
    /**
     * <code>string scoreBoard = 2;</code>
     */
    public Builder setScoreBoardBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scoreBoard_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object question_ = "";
    /**
     * <code>string question = 3;</code>
     */
    public java.lang.String getQuestion() {
      java.lang.Object ref = question_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        question_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string question = 3;</code>
     */
    public com.google.protobuf.ByteString
        getQuestionBytes() {
      java.lang.Object ref = question_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        question_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string question = 3;</code>
     */
    public Builder setQuestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      question_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string question = 3;</code>
     */
    public Builder clearQuestion() {
      
      question_ = getDefaultInstance().getQuestion();
      onChanged();
      return this;
    }
    /**
     * <code>string question = 3;</code>
     */
    public Builder setQuestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      question_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object likeList_ = "";
    /**
     * <code>string likeList = 4;</code>
     */
    public java.lang.String getLikeList() {
      java.lang.Object ref = likeList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        likeList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string likeList = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLikeListBytes() {
      java.lang.Object ref = likeList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        likeList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string likeList = 4;</code>
     */
    public Builder setLikeList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      likeList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string likeList = 4;</code>
     */
    public Builder clearLikeList() {
      
      likeList_ = getDefaultInstance().getLikeList();
      onChanged();
      return this;
    }
    /**
     * <code>string likeList = 4;</code>
     */
    public Builder setLikeListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      likeList_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.learning.learning.grpc.CommunityWholeResponse)
  }

  // @@protoc_insertion_point(class_scope:com.learning.learning.grpc.CommunityWholeResponse)
  private static final com.learning.learning.grpc.CommunityWholeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.learning.learning.grpc.CommunityWholeResponse();
  }

  public static com.learning.learning.grpc.CommunityWholeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommunityWholeResponse>
      PARSER = new com.google.protobuf.AbstractParser<CommunityWholeResponse>() {
    @java.lang.Override
    public CommunityWholeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommunityWholeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommunityWholeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommunityWholeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.learning.learning.grpc.CommunityWholeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

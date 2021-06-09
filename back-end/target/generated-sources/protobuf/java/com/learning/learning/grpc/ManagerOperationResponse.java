// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ManagerOperationService.proto

package com.learning.learning.grpc;

/**
 * Protobuf type {@code com.learning.learning.grpc.ManagerOperationResponse}
 */
public  final class ManagerOperationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.learning.learning.grpc.ManagerOperationResponse)
    ManagerOperationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManagerOperationResponse.newBuilder() to construct.
  private ManagerOperationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManagerOperationResponse() {
    xUserInfo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManagerOperationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ManagerOperationResponse(
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
          case 8: {

            isCompleted_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            xUserInfo_ = s;
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
    return com.learning.learning.grpc.ManagerOperationServiceOuterClass.internal_static_com_learning_learning_grpc_ManagerOperationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.learning.learning.grpc.ManagerOperationServiceOuterClass.internal_static_com_learning_learning_grpc_ManagerOperationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.learning.learning.grpc.ManagerOperationResponse.class, com.learning.learning.grpc.ManagerOperationResponse.Builder.class);
  }

  public static final int ISCOMPLETED_FIELD_NUMBER = 1;
  private boolean isCompleted_;
  /**
   * <code>bool isCompleted = 1;</code>
   */
  public boolean getIsCompleted() {
    return isCompleted_;
  }

  public static final int XUSERINFO_FIELD_NUMBER = 2;
  private volatile java.lang.Object xUserInfo_;
  /**
   * <code>string xUserInfo = 2;</code>
   */
  public java.lang.String getXUserInfo() {
    java.lang.Object ref = xUserInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      xUserInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string xUserInfo = 2;</code>
   */
  public com.google.protobuf.ByteString
      getXUserInfoBytes() {
    java.lang.Object ref = xUserInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      xUserInfo_ = b;
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
    if (isCompleted_ != false) {
      output.writeBool(1, isCompleted_);
    }
    if (!getXUserInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, xUserInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isCompleted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isCompleted_);
    }
    if (!getXUserInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, xUserInfo_);
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
    if (!(obj instanceof com.learning.learning.grpc.ManagerOperationResponse)) {
      return super.equals(obj);
    }
    com.learning.learning.grpc.ManagerOperationResponse other = (com.learning.learning.grpc.ManagerOperationResponse) obj;

    if (getIsCompleted()
        != other.getIsCompleted()) return false;
    if (!getXUserInfo()
        .equals(other.getXUserInfo())) return false;
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
    hash = (37 * hash) + ISCOMPLETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsCompleted());
    hash = (37 * hash) + XUSERINFO_FIELD_NUMBER;
    hash = (53 * hash) + getXUserInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learning.learning.grpc.ManagerOperationResponse parseFrom(
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
  public static Builder newBuilder(com.learning.learning.grpc.ManagerOperationResponse prototype) {
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
   * Protobuf type {@code com.learning.learning.grpc.ManagerOperationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.learning.learning.grpc.ManagerOperationResponse)
      com.learning.learning.grpc.ManagerOperationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.learning.learning.grpc.ManagerOperationServiceOuterClass.internal_static_com_learning_learning_grpc_ManagerOperationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.learning.learning.grpc.ManagerOperationServiceOuterClass.internal_static_com_learning_learning_grpc_ManagerOperationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.learning.learning.grpc.ManagerOperationResponse.class, com.learning.learning.grpc.ManagerOperationResponse.Builder.class);
    }

    // Construct using com.learning.learning.grpc.ManagerOperationResponse.newBuilder()
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
      isCompleted_ = false;

      xUserInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.learning.learning.grpc.ManagerOperationServiceOuterClass.internal_static_com_learning_learning_grpc_ManagerOperationResponse_descriptor;
    }

    @java.lang.Override
    public com.learning.learning.grpc.ManagerOperationResponse getDefaultInstanceForType() {
      return com.learning.learning.grpc.ManagerOperationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.learning.learning.grpc.ManagerOperationResponse build() {
      com.learning.learning.grpc.ManagerOperationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.learning.learning.grpc.ManagerOperationResponse buildPartial() {
      com.learning.learning.grpc.ManagerOperationResponse result = new com.learning.learning.grpc.ManagerOperationResponse(this);
      result.isCompleted_ = isCompleted_;
      result.xUserInfo_ = xUserInfo_;
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
      if (other instanceof com.learning.learning.grpc.ManagerOperationResponse) {
        return mergeFrom((com.learning.learning.grpc.ManagerOperationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.learning.learning.grpc.ManagerOperationResponse other) {
      if (other == com.learning.learning.grpc.ManagerOperationResponse.getDefaultInstance()) return this;
      if (other.getIsCompleted() != false) {
        setIsCompleted(other.getIsCompleted());
      }
      if (!other.getXUserInfo().isEmpty()) {
        xUserInfo_ = other.xUserInfo_;
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
      com.learning.learning.grpc.ManagerOperationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.learning.learning.grpc.ManagerOperationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isCompleted_ ;
    /**
     * <code>bool isCompleted = 1;</code>
     */
    public boolean getIsCompleted() {
      return isCompleted_;
    }
    /**
     * <code>bool isCompleted = 1;</code>
     */
    public Builder setIsCompleted(boolean value) {
      
      isCompleted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isCompleted = 1;</code>
     */
    public Builder clearIsCompleted() {
      
      isCompleted_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object xUserInfo_ = "";
    /**
     * <code>string xUserInfo = 2;</code>
     */
    public java.lang.String getXUserInfo() {
      java.lang.Object ref = xUserInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        xUserInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string xUserInfo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getXUserInfoBytes() {
      java.lang.Object ref = xUserInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        xUserInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string xUserInfo = 2;</code>
     */
    public Builder setXUserInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      xUserInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string xUserInfo = 2;</code>
     */
    public Builder clearXUserInfo() {
      
      xUserInfo_ = getDefaultInstance().getXUserInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string xUserInfo = 2;</code>
     */
    public Builder setXUserInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      xUserInfo_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.learning.learning.grpc.ManagerOperationResponse)
  }

  // @@protoc_insertion_point(class_scope:com.learning.learning.grpc.ManagerOperationResponse)
  private static final com.learning.learning.grpc.ManagerOperationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.learning.learning.grpc.ManagerOperationResponse();
  }

  public static com.learning.learning.grpc.ManagerOperationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagerOperationResponse>
      PARSER = new com.google.protobuf.AbstractParser<ManagerOperationResponse>() {
    @java.lang.Override
    public ManagerOperationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ManagerOperationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ManagerOperationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagerOperationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.learning.learning.grpc.ManagerOperationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PixKeyWordProto.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.PixEmailKeyWordRequest}
 */
public final class PixEmailKeyWordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.PixEmailKeyWordRequest)
    PixEmailKeyWordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PixEmailKeyWordRequest.newBuilder() to construct.
  private PixEmailKeyWordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PixEmailKeyWordRequest() {
    emailKeyWord_ = "";
    idInternal_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PixEmailKeyWordRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PixEmailKeyWordRequest(
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

            emailKeyWord_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            idInternal_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
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
    return br.com.zup.PixKeyword.internal_static_br_com_zup_PixEmailKeyWordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.PixKeyword.internal_static_br_com_zup_PixEmailKeyWordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.PixEmailKeyWordRequest.class, br.com.zup.PixEmailKeyWordRequest.Builder.class);
  }

  public static final int EMAILKEYWORD_FIELD_NUMBER = 1;
  private volatile java.lang.Object emailKeyWord_;
  /**
   * <code>string emailKeyWord = 1;</code>
   * @return The emailKeyWord.
   */
  @java.lang.Override
  public java.lang.String getEmailKeyWord() {
    java.lang.Object ref = emailKeyWord_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailKeyWord_ = s;
      return s;
    }
  }
  /**
   * <code>string emailKeyWord = 1;</code>
   * @return The bytes for emailKeyWord.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailKeyWordBytes() {
    java.lang.Object ref = emailKeyWord_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailKeyWord_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDINTERNAL_FIELD_NUMBER = 2;
  private volatile java.lang.Object idInternal_;
  /**
   * <code>string idInternal = 2;</code>
   * @return The idInternal.
   */
  @java.lang.Override
  public java.lang.String getIdInternal() {
    java.lang.Object ref = idInternal_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idInternal_ = s;
      return s;
    }
  }
  /**
   * <code>string idInternal = 2;</code>
   * @return The bytes for idInternal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdInternalBytes() {
    java.lang.Object ref = idInternal_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idInternal_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>.br.com.zup.TypeAccount type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.br.com.zup.TypeAccount type = 3;</code>
   * @return The type.
   */
  @java.lang.Override public br.com.zup.TypeAccount getType() {
    @SuppressWarnings("deprecation")
    br.com.zup.TypeAccount result = br.com.zup.TypeAccount.valueOf(type_);
    return result == null ? br.com.zup.TypeAccount.UNRECOGNIZED : result;
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
    if (!getEmailKeyWordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emailKeyWord_);
    }
    if (!getIdInternalBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, idInternal_);
    }
    if (type_ != br.com.zup.TypeAccount.ACCOUNT_CURRENT.getNumber()) {
      output.writeEnum(3, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEmailKeyWordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emailKeyWord_);
    }
    if (!getIdInternalBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, idInternal_);
    }
    if (type_ != br.com.zup.TypeAccount.ACCOUNT_CURRENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
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
    if (!(obj instanceof br.com.zup.PixEmailKeyWordRequest)) {
      return super.equals(obj);
    }
    br.com.zup.PixEmailKeyWordRequest other = (br.com.zup.PixEmailKeyWordRequest) obj;

    if (!getEmailKeyWord()
        .equals(other.getEmailKeyWord())) return false;
    if (!getIdInternal()
        .equals(other.getIdInternal())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + EMAILKEYWORD_FIELD_NUMBER;
    hash = (53 * hash) + getEmailKeyWord().hashCode();
    hash = (37 * hash) + IDINTERNAL_FIELD_NUMBER;
    hash = (53 * hash) + getIdInternal().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.PixEmailKeyWordRequest parseFrom(
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
  public static Builder newBuilder(br.com.zup.PixEmailKeyWordRequest prototype) {
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
   * Protobuf type {@code br.com.zup.PixEmailKeyWordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.PixEmailKeyWordRequest)
      br.com.zup.PixEmailKeyWordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.PixKeyword.internal_static_br_com_zup_PixEmailKeyWordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.PixKeyword.internal_static_br_com_zup_PixEmailKeyWordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.PixEmailKeyWordRequest.class, br.com.zup.PixEmailKeyWordRequest.Builder.class);
    }

    // Construct using br.com.zup.PixEmailKeyWordRequest.newBuilder()
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
      emailKeyWord_ = "";

      idInternal_ = "";

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.PixKeyword.internal_static_br_com_zup_PixEmailKeyWordRequest_descriptor;
    }

    @java.lang.Override
    public br.com.zup.PixEmailKeyWordRequest getDefaultInstanceForType() {
      return br.com.zup.PixEmailKeyWordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.PixEmailKeyWordRequest build() {
      br.com.zup.PixEmailKeyWordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.PixEmailKeyWordRequest buildPartial() {
      br.com.zup.PixEmailKeyWordRequest result = new br.com.zup.PixEmailKeyWordRequest(this);
      result.emailKeyWord_ = emailKeyWord_;
      result.idInternal_ = idInternal_;
      result.type_ = type_;
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
      if (other instanceof br.com.zup.PixEmailKeyWordRequest) {
        return mergeFrom((br.com.zup.PixEmailKeyWordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.PixEmailKeyWordRequest other) {
      if (other == br.com.zup.PixEmailKeyWordRequest.getDefaultInstance()) return this;
      if (!other.getEmailKeyWord().isEmpty()) {
        emailKeyWord_ = other.emailKeyWord_;
        onChanged();
      }
      if (!other.getIdInternal().isEmpty()) {
        idInternal_ = other.idInternal_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      br.com.zup.PixEmailKeyWordRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.PixEmailKeyWordRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object emailKeyWord_ = "";
    /**
     * <code>string emailKeyWord = 1;</code>
     * @return The emailKeyWord.
     */
    public java.lang.String getEmailKeyWord() {
      java.lang.Object ref = emailKeyWord_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailKeyWord_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string emailKeyWord = 1;</code>
     * @return The bytes for emailKeyWord.
     */
    public com.google.protobuf.ByteString
        getEmailKeyWordBytes() {
      java.lang.Object ref = emailKeyWord_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailKeyWord_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string emailKeyWord = 1;</code>
     * @param value The emailKeyWord to set.
     * @return This builder for chaining.
     */
    public Builder setEmailKeyWord(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      emailKeyWord_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string emailKeyWord = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailKeyWord() {
      
      emailKeyWord_ = getDefaultInstance().getEmailKeyWord();
      onChanged();
      return this;
    }
    /**
     * <code>string emailKeyWord = 1;</code>
     * @param value The bytes for emailKeyWord to set.
     * @return This builder for chaining.
     */
    public Builder setEmailKeyWordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      emailKeyWord_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object idInternal_ = "";
    /**
     * <code>string idInternal = 2;</code>
     * @return The idInternal.
     */
    public java.lang.String getIdInternal() {
      java.lang.Object ref = idInternal_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idInternal_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idInternal = 2;</code>
     * @return The bytes for idInternal.
     */
    public com.google.protobuf.ByteString
        getIdInternalBytes() {
      java.lang.Object ref = idInternal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idInternal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idInternal = 2;</code>
     * @param value The idInternal to set.
     * @return This builder for chaining.
     */
    public Builder setIdInternal(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idInternal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idInternal = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdInternal() {
      
      idInternal_ = getDefaultInstance().getIdInternal();
      onChanged();
      return this;
    }
    /**
     * <code>string idInternal = 2;</code>
     * @param value The bytes for idInternal to set.
     * @return This builder for chaining.
     */
    public Builder setIdInternalBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idInternal_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.br.com.zup.TypeAccount type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.br.com.zup.TypeAccount type = 3;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.TypeAccount type = 3;</code>
     * @return The type.
     */
    @java.lang.Override
    public br.com.zup.TypeAccount getType() {
      @SuppressWarnings("deprecation")
      br.com.zup.TypeAccount result = br.com.zup.TypeAccount.valueOf(type_);
      return result == null ? br.com.zup.TypeAccount.UNRECOGNIZED : result;
    }
    /**
     * <code>.br.com.zup.TypeAccount type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(br.com.zup.TypeAccount value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.br.com.zup.TypeAccount type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:br.com.zup.PixEmailKeyWordRequest)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.PixEmailKeyWordRequest)
  private static final br.com.zup.PixEmailKeyWordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.PixEmailKeyWordRequest();
  }

  public static br.com.zup.PixEmailKeyWordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PixEmailKeyWordRequest>
      PARSER = new com.google.protobuf.AbstractParser<PixEmailKeyWordRequest>() {
    @java.lang.Override
    public PixEmailKeyWordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PixEmailKeyWordRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PixEmailKeyWordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PixEmailKeyWordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.PixEmailKeyWordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

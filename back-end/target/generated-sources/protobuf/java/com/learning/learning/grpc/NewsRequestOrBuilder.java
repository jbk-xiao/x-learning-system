// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchService.proto

package com.learning.learning.grpc;

public interface NewsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.learning.learning.grpc.NewsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *按标题查询
   * </pre>
   *
   * <code>string keyword = 1;</code>
   */
  java.lang.String getKeyword();
  /**
   * <pre>
   *按标题查询
   * </pre>
   *
   * <code>string keyword = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeywordBytes();

  /**
   * <pre>
   *类型
   * </pre>
   *
   * <code>string type = 2;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   *类型
   * </pre>
   *
   * <code>string type = 2;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *年份
   * </pre>
   *
   * <code>string year = 3;</code>
   */
  java.lang.String getYear();
  /**
   * <pre>
   *年份
   * </pre>
   *
   * <code>string year = 3;</code>
   */
  com.google.protobuf.ByteString
      getYearBytes();

  /**
   * <pre>
   *分页的页数
   * </pre>
   *
   * <code>string page = 4;</code>
   */
  java.lang.String getPage();
  /**
   * <pre>
   *分页的页数
   * </pre>
   *
   * <code>string page = 4;</code>
   */
  com.google.protobuf.ByteString
      getPageBytes();
}

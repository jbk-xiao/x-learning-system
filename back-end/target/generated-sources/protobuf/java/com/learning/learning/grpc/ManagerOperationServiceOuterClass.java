// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ManagerOperationService.proto

package com.learning.learning.grpc;

public final class ManagerOperationServiceOuterClass {
  private ManagerOperationServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_learning_learning_grpc_ManagerOperationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_learning_learning_grpc_ManagerOperationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_learning_learning_grpc_ManagerOperationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_learning_learning_grpc_ManagerOperationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ManagerOperationService.proto\022\032com.lea" +
      "rning.learning.grpc\"\271\002\n\027ManagerOperation" +
      "Request\022\021\n\tcontentId\030\001 \001(\t\022\021\n\tisChecked\030" +
      "\002 \001(\010\022\022\n\ndeltaScore\030\003 \001(\001\022\016\n\006userId\030\004 \001(" +
      "\t\022Q\n\toperation\030\005 \001(\0162>.com.learning.lear" +
      "ning.grpc.ManagerOperationRequest.Operat" +
      "ions\022\014\n\004name\030\006 \001(\t\022\020\n\010password\030\007 \001(\t\022\017\n\007" +
      "loginId\030\010 \001(\t\022\022\n\nxUsersInfo\030\t \001(\t\"<\n\nOpe" +
      "rations\022\n\n\006INSERT\020\000\022\n\n\006DELETE\020\001\022\n\n\006UPDAT" +
      "E\020\002\022\n\n\006SELECT\020\003\"B\n\030ManagerOperationRespo" +
      "nse\022\023\n\013isCompleted\030\001 \001(\010\022\021\n\txUserInfo\030\002 " +
      "\001(\t2\201\004\n\027ManagerOperationService\022x\n\013putNC" +
      "Status\0223.com.learning.learning.grpc.Mana" +
      "gerOperationRequest\0324.com.learning.learn" +
      "ing.grpc.ManagerOperationResponse\022u\n\010put" +
      "Score\0223.com.learning.learning.grpc.Manag" +
      "erOperationRequest\0324.com.learning.learni" +
      "ng.grpc.ManagerOperationResponse\022y\n\014oper" +
      "ateXUser\0223.com.learning.learning.grpc.Ma" +
      "nagerOperationRequest\0324.com.learning.lea" +
      "rning.grpc.ManagerOperationResponse\022z\n\ro" +
      "perateXUsers\0223.com.learning.learning.grp" +
      "c.ManagerOperationRequest\0324.com.learning" +
      ".learning.grpc.ManagerOperationResponseB" +
      "\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_learning_learning_grpc_ManagerOperationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_learning_learning_grpc_ManagerOperationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_learning_learning_grpc_ManagerOperationRequest_descriptor,
        new java.lang.String[] { "ContentId", "IsChecked", "DeltaScore", "UserId", "Operation", "Name", "Password", "LoginId", "XUsersInfo", });
    internal_static_com_learning_learning_grpc_ManagerOperationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_learning_learning_grpc_ManagerOperationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_learning_learning_grpc_ManagerOperationResponse_descriptor,
        new java.lang.String[] { "IsCompleted", "XUserInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

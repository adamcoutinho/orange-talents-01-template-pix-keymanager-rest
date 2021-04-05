// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PixKeyWordProtoSearch.proto

package br.com.zup;

public final class PixKeywordSearch {
  private PixKeywordSearch() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_PixSearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_PixSearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_PixSearchRequest_FilterPixById_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_PixSearchRequest_FilterPixById_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_PixSearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_PixSearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_PixSearchResponse_AccountBank_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_PixSearchResponse_AccountBank_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PixKeyWordProtoSearch.proto\022\nbr.com.zu" +
      "p\032\037google/protobuf/timestamp.proto\"\236\001\n\020P" +
      "ixSearchRequest\022;\n\005pixId\030\001 \001(\0132*.br.com." +
      "zup.PixSearchRequest.FilterPixByIdH\000\022\021\n\007" +
      "keyword\030\002 \001(\tH\000\0320\n\rFilterPixById\022\020\n\010clie" +
      "ntId\030\001 \001(\t\022\r\n\005pixId\030\002 \001(\tB\010\n\006Filter\"\274\003\n\021" +
      "PixSearchResponse\022:\n\007account\030\001 \001(\0132).br." +
      "com.zup.PixSearchResponse.AccountBank\032\207\002" +
      "\n\013AccountBank\022>\n\013accountType\030\001 \001(\0162).br." +
      "com.zup.PixSearchResponse.AccountType\0226\n" +
      "\007keyType\030\002 \001(\0162%.br.com.zup.PixSearchRes" +
      "ponse.KeyType\022\020\n\010intitute\030\003 \001(\t\022\014\n\004name\030" +
      "\004 \001(\t\022\013\n\003cpf\030\005 \001(\t\022\016\n\006agency\030\006 \001(\t\022\025\n\rnu" +
      "mberAccount\030\007 \001(\t\022,\n\010createAt\030\010 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\" \n\013AccountType\022\007" +
      "\n\003CCA\020\000\022\010\n\004SVGS\020\001\"?\n\007KeyType\022\007\n\003CPF\020\000\022\023\n" +
      "\017CHAVE_ALEATORIA\020\001\022\013\n\007CELULAR\020\002\022\t\n\005EMAIL" +
      "\020\0032\317\002\n\026PixKeyWordSarchService\022J\n\tfindByC" +
      "pf\022\034.br.com.zup.PixSearchRequest\032\035.br.co" +
      "m.zup.PixSearchResponse\"\000\022L\n\013findByEmail" +
      "\022\034.br.com.zup.PixSearchRequest\032\035.br.com." +
      "zup.PixSearchResponse\"\000\022L\n\013findByPhone\022\034" +
      ".br.com.zup.PixSearchRequest\032\035.br.com.zu" +
      "p.PixSearchResponse\"\000\022M\n\014findByRamdom\022\034." +
      "br.com.zup.PixSearchRequest\032\035.br.com.zup" +
      ".PixSearchResponse\"\000B&\n\nbr.com.zupB\020PixK" +
      "eywordSearchP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_br_com_zup_PixSearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_zup_PixSearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_PixSearchRequest_descriptor,
        new java.lang.String[] { "PixId", "Keyword", "Filter", });
    internal_static_br_com_zup_PixSearchRequest_FilterPixById_descriptor =
      internal_static_br_com_zup_PixSearchRequest_descriptor.getNestedTypes().get(0);
    internal_static_br_com_zup_PixSearchRequest_FilterPixById_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_PixSearchRequest_FilterPixById_descriptor,
        new java.lang.String[] { "ClientId", "PixId", });
    internal_static_br_com_zup_PixSearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_zup_PixSearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_PixSearchResponse_descriptor,
        new java.lang.String[] { "Account", });
    internal_static_br_com_zup_PixSearchResponse_AccountBank_descriptor =
      internal_static_br_com_zup_PixSearchResponse_descriptor.getNestedTypes().get(0);
    internal_static_br_com_zup_PixSearchResponse_AccountBank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_PixSearchResponse_AccountBank_descriptor,
        new java.lang.String[] { "AccountType", "KeyType", "Intitute", "Name", "Cpf", "Agency", "NumberAccount", "CreateAt", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

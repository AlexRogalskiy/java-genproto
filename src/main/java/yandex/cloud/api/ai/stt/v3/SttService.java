// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: yandex/cloud/ai/stt/v3/stt_service.proto

package yandex.cloud.api.ai.stt.v3;

public final class SttService {
  private SttService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(yandex/cloud/ai/stt/v3/stt_service.pro" +
      "to\022\020speechkit.stt.v3\032 yandex/cloud/ai/st" +
      "t/v3/stt.proto2q\n\nRecognizer\022c\n\022Recogniz" +
      "eStreaming\022\".speechkit.stt.v3.StreamingR" +
      "equest\032#.speechkit.stt.v3.StreamingRespo" +
      "nse\"\000(\0010\001B\\\n\032yandex.cloud.api.ai.stt.v3Z" +
      ">github.com/yandex-cloud/go-genproto/yan" +
      "dex/cloud/ai/stt/v3;sttb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          yandex.cloud.api.ai.stt.v3.Stt.getDescriptor(),
        });
    yandex.cloud.api.ai.stt.v3.Stt.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

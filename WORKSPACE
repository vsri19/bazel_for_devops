load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")


RULES_JVM_EXTERNAL_TAG = "5.3"
RULES_JVM_EXTERNAL_SHA = "6cc8444b20307113a62b676846c29ff018402fd4c7097fcd6d0a0fd5f2e86429"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    urls = ["https://github.com/bazelbuild/rules_jvm_external/archive/refs/tags/%s.zip" % RULES_JVM_EXTERNAL_TAG],
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.apache.commons:commons-lang3:3.12.0"
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ]
)


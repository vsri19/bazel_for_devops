
java_binary (
    name = "BazelApp",
    srcs = glob(["src/main/java/com/demo/*.java"]),
    main_class = "com.demo.BazelApp",
    deps = ["//bazelgreeting:greeter", "@maven//:org_apache_commons_commons_lang3"]
)

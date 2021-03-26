load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "bc-uber-jar-lib",
    srcs = glob(["src/main/java/com/sqshq/example/*.java"]),
    deps = ["@maven//:com_google_guava_guava", "bouncycastle"],
)

java_library(
    name = "bouncycastle",
    exports = ["@maven//:org_bouncycastle_bc_fips"],
    runtime_deps = ["@maven//:org_bouncycastle_bc_fips"],
)

java_binary(
    name = "bc-uber-jar",
    main_class = "com.sqshq.example.App",
    runtime_deps = [":bc-uber-jar-lib"],
)

java_test(
    name = "tests",
    srcs = glob(["src/test/java/com/sqshq/example/*.java"]),
    test_class = "com.sqshq.example.TestApp",
    deps = [
        ":bc-uber-jar-lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)

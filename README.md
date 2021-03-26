### Build uber jar (bc excluded)

`bazel build bc-uber-jar_deploy.jar`

### Run with -cp option

`java -cp ~/.m2/repository/org/bouncycastle/bc-fips/1.0.2/bc-fips-1.0.2.jar:<path>/bc-uber-jar/bazel-bin/bc-uber-jar_deploy.jar com.sqshq.example.App`

 
lazy val root = project
  .in(file("."))
  .settings(
    name := "GreenTea Worksheet",
    version := "3.0.0-SNAPSHOT",
    scalaVersion := "3.1.3",
    resolvers := Resolver.sonatypeOssRepos("snapshots"),
    libraryDependencies += "cloud.greentea" %% "greentea" % "3.0.0-SNAPSHOT"
)
console / initialCommands := """import cloud.greentea.{*,given}"""

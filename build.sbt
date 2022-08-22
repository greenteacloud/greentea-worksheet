
lazy val root = project
  .in(file("."))
  .settings(
    name := "GreenTeaWorksheet",
    organization := "cloud.greentea",
    description := "A Scala console augmented by GreenTea",
    licenses += ("AGPL", new URL("https://www.gnu.org/licenses/agpl-3.0.en.html")),
    version := "3.0.0-DEMO",
    resolvers := Resolver.sonatypeOssRepos("snapshots"),
    libraryDependencies += "cloud.greentea" %% "greentea" % "3.0.0-SNAPSHOT",
    scalaVersion := "3.1.3"
)
Global / onChangedBuildSource := ReloadOnSourceChanges
console / initialCommands := """import cloud.greentea.{*,given}"""



lazy val root = project.in(file("."))
  .enablePlugins(PlayScala)
  .settings(commonSettings:_*)

lazy val commonSettings = Seq(
  organization := "com.emenogu",
  version := "1.0-SNAPSHOT",
  name :="endy",
  scalaVersion := "2.11.6"
)

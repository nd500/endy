
val rootProjName = "endy"

herokuAppName in Compile := "dry-retreat-6382"

//root
lazy val root = project.in(file("."))
  .settings(commonSettings:_*)
  .aggregate(server)

//common settings
lazy val commonSettings = Seq(
  organization := "com.emenogu",
  version := "1.0-SNAPSHOT",
  name := rootProjName,
  scalaVersion := "2.11.6"

)

//define the server project
lazy val server = project.in(file("server"))
  .settings(serverSettings:_*)
  .enablePlugins(PlayScala)

//define server-specific settings
lazy val serverSettings = commonSettings ++ Seq(
  name := s"$rootProjName-server",
  libraryDependencies ++= Seq(
    //dependencies are outlined here
  )
)
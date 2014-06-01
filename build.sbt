name := "play-messages"

version := "2.3.0-SNAPSHOT"

organization := "de.corux"

scalaVersion := "2.11.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  //javaJdbc,
  cache,
  "commons-io" % "commons-io" % "2.4"
)

TwirlKeys.templateImports += "controllers.playmessages.routes"
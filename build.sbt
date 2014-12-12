name := "simple-service"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-netty-server" % "0.8.0",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "ch.qos.logback" % "logback-classic" % "1.1.2"
)

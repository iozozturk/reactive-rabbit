name := "reactive-rabbit"

version := "1.0-SNAPSHOT"

organization := "io.logchip"

startYear := Some(2015)

licenses := Seq("Apache License 2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

homepage := Some(url("https://github.com/iozozturk/reactive-rabbit"))

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings", "-target:jvm-1.7")

libraryDependencies ++= Seq(
  "org.reactivestreams"      %  "reactive-streams"         % "1.0.0",
  "com.rabbitmq"             %  "amqp-client"              % "3.5.1",
  "org.scala-stm"            %% "scala-stm"                % "0.7",
  "com.typesafe"             %  "config"                   % "1.2.1",              // Configuration
  "joda-time"                %  "joda-time"                % "2.7",                // for DateTime
  "org.joda"                 %  "joda-convert"             % "1.7",
  "com.typesafe.akka"        %% "akka-actor"               % "2.3.10",             // for ByteString
  "com.google.guava"         %  "guava"                    % "18.0",               // for MediaType
  "com.google.code.findbugs" %  "jsr305"                   % "3.0.0",
  "org.scalatest"            %% "scalatest"                % "2.2.4"     % "test", // for TCK
  "com.google.inject"        %  "guice"                    % "3.0"       % "test", // to make sbt happy
  "org.reactivestreams"      %  "reactive-streams-tck"     % "1.0.0"     % "test",
  "com.typesafe.akka"        %% "akka-stream-experimental" % "1.0-RC2"   % "test"
)
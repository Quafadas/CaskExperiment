name := """cask"""
organization := "test"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.2" // use latest

lazy val cask = (project in file(".")) 
.settings(
    name := "cask",
)

libraryDependencies += "com.lihaoyi" %% "cask" % "0.6.7"
libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.32.3"
libraryDependencies += "io.getquill" %% "quill-jdbc" % "3.5.1"
libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.9.1"
libraryDependencies += "com.lihaoyi" %% "utest" % "0.7.4" % Test
// https://mvnrepository.com/artifact/com.lihaoyi/requests
libraryDependencies += "com.lihaoyi" %% "requests" % "0.6.2"


testFrameworks += new TestFramework("utest.runner.Framework")
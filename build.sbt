name := """cask"""
organization := "test"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.2" // use latest

lazy val root = (project in file(".")) 
.settings(
    name := "cask",
    libraryDependencies ++= Seq("com.lihaoyi" %% "cask" % "0.6.7")
)


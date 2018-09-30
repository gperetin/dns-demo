ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "com.dns"

lazy val hello = (project in file("."))
  .settings(
    name := "DNS-Scala",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )


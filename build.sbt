lazy val root = (project in file("."))
  .settings(
    name := "Chat.Binding",
    scalaVersion := "2.12.2",
    organization := "com.github.notyy",
    version := "0.1.0-SNAPSHOT",
    scalaJSUseMainModuleInitializer := true
  )

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "com.thoughtworks.binding" %%% "dom" % "latest.release"
)

enablePlugins(ScalaJSPlugin)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
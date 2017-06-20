
lazy val root = (project in file("."))
  .settings(
    name := "Chat.Binding",
    scalaVersion := "2.11.7",
    organization := "com.github.notyy",
    version := "0.1.0-SNAPSHOT",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.1"
    )
  )
  .enablePlugins(ScalaJSPlugin)
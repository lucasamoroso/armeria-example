import com.lightbend.sbt.javaagent.JavaAgent.JavaAgentKeys.javaAgents

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .enablePlugins(JavaAgent)
  .settings(
    name := "armeria-example",
    libraryDependencies ++= Seq(
      "com.linecorp.armeria" % "armeria" % "1.14.1",

      "ch.qos.logback" % "logback-classic" % "1.2.3",

      "io.kamon" %% "kamon-bundle" % "2.1.5+68-e314c7d5+20201122-1026",

      "io.kamon" %% "kamon-prometheus" % "2.1.5+68-e314c7d5+20201122-1026",

      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.1",

    ),
    javacOptions ++= Seq("-parameters"),
    javaAgents += "io.kamon" % "kanela-agent" % "1.0.12" % "compile;runtime;test"
  )

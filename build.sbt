name := "telegrambot4s"

version := "1.1.5-SNAPSHOT"

scalaVersion := "2.11.8"

organization := "info.mukel"

val akkaV = "2.4.6"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "3.3.0",
  "org.json4s" %% "json4s-ext" % "3.3.0",
  "com.typesafe.akka" %% "akka-http-core" % akkaV,
  "com.typesafe.akka" %% "akka-http-experimental" % akkaV,
  "com.typesafe.akka" %% "akka-stream" % akkaV
)

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>https://github.com/mukel/telegrambot4s</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:mukel/telegrambot4s.git</url>
    <connection>scm:git:git@github.com:mukel/telegrambot4s.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mukel</id>
      <name>Alfonso2 Peterssen</name>
      <url>http://mukel.info</url>
    </developer>
  </developers>
)

name := "play-2.5-sdn-4.1"

organization := "info.unterstein"

version := "1.0-SNAPSHOT"

resolvers ++= Seq(
  "Spring milestones" at "http://repo.spring.io/milestone",
  "Spring Snapshots" at "http://maven.springframework.org/snapshot",
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
)


lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.springframework.data" % "spring-data-neo4j" % "4.1.0.M1",
  "org.springframework.guice" % "spring-guice" % "1.0.0.BUILD-SNAPSHOT"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

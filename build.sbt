name := "play-2.5-sdn-4.1"

organization := "info.unterstein"

version := "1.0-SNAPSHOT"

resolvers ++= Seq(
  "local maven" at "file://" + Path.userHome.absolutePath + "/.m2/repository",
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  "spring snapshots" at "http://repo.spring.io/snapshot",
  "spring milestones" at "http://repo.spring.io/milestone",
  "neo snapshots" at "http://m2.neo4j.org/content/repositories/snapshots"
)


lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.springframework.data" % "spring-data-neo4j" % "4.1.0.BUILD-SNAPSHOT" changing(),
  "org.neo4j" % "neo4j-ogm-core" % "2.0.0-SNAPSHOT" changing(),
  "org.springframework.guice" % "spring-guice" % "1.0.0.BUILD-SNAPSHOT"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

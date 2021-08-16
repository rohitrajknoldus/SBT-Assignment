name := "SBT_Assign"
version := "0.1"
scalaVersion := "2.13.6"
lazy val actor = project.in(file("actor"))

  .settings(
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.15",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence-typed" % "2.6.15",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit" % "2.6.15" % "Test",
    libraryDependencies += "com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.15" % "Test"
  )
lazy val persistence = project.in(file("persistence"))
  .settings(
    libraryDependencies += "com.typesafe.slick" %% "slick" % "3.3.3",
    libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.16",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test",
    libraryDependencies += "com.h2database" % "h2" % "1.4.193" % "test"
  )
lazy val root = project.in(file(".")).aggregate(actor, persistence)

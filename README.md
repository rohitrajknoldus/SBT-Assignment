# SBT-Assignment
Created a module namely, actor.

- Added library dependencies for akka-actor-typed, akka-persistence-typed and scalactic

- In the same module, added test dependencies for scalatest, akka-actor-testkit-typed and akka-persistence-testkit.

- Added another module namely, persistence.

- In the persistence module, added library dependency for slick and mysql database.

- Added test dependency for scalatest and h2 database.

- Added plugins to the project- codesquad-sbt-plugin and scalastyle-sbt-plugin

- Finally added one last module "root" and aggregate all other modules in this root module

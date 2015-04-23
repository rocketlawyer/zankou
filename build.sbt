
name := "zankou"

organization := "com.rocketlawyer.common"

rlRepo(Github,"zankou")

libraryDependencies ++= Seq(
  slf4jApi,
  guava,
  javaxInject,
  springContext,
  "org.springframework.data" % "spring-data-mongodb" % "1.1.1.RELEASE",
  logback % Provided,
  springTest % Provided,
  junit % Provided,
  dbunit % Provided
)

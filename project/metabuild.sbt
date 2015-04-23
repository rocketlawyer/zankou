
resolvers ++= Seq(
  Resolver.mavenLocal,
  "Rocketlawyer Snapshots" at "http://f1tst-linbld100/nexus/content/repositories/snapshots",
  "Rocketlawyer Releases" at "http://f1tst-linbld100/nexus/content/repositories/releases"
)

addSbtPlugin("com.rocketlawyer" % "sbt-core" % "2.2.18")  

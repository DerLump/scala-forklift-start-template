// uncomment this to enable snapshot versions
//resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= List(
  "com.liyaos" %% "scala-forklift-slick" % "0.2.0-ALPHA"
  ,"com.liyaos" %% "scala-forklift-git-tools" % "0.2.0-ALPHA"
  ,"com.typesafe" % "config" % "1.3.0"
  ,"org.eclipse.jgit" % "org.eclipse.jgit" % "4.0.1.201506240215-r"
)

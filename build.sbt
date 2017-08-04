enablePlugins(JavaAppPackaging)

scalaVersion := "2.11.11"

libraryDependencies := Seq(
  ("org.scala-lang" % "scala-library" % scalaVersion.value).excludeAll(ExclusionRule(organization="org.scala-lang.modules")),
  "org.scala-lang.modules" %% "scala-xml" % "1.0.7-SNAPSHOT"
)



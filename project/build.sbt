resolvers ++= Seq(
  "socrata releases" at "https://repository-socrata-oss.forge.cloudbees.com/release"
)

addSbtPlugin("com.socrata" % "socrata-cloudbees-sbt" % "1.4.1")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.1.12")

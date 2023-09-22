javacOptions ++= Seq(
  "-Xlint:preview",
  "--enable-preview",
  "--release",
  scala.util.Properties.javaSpecVersion
)

scalaVersion := "2.13.12"

organization := Settings.Organization
name         := "std-macro-illtyped"
version      := Settings.Version
licenses     += ("MIT", url("http://opensource.org/licenses/MIT"))

addCompilerPlugin(Dependencies.Plugin.macroParadise214)

libraryDependencies ++= List(
  Dependencies.macroCompat,
  scalaOrganization.value % "scala-compiler" % scalaVersion.value % Provided
)

Settings.standalone := true
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
publishM2Configuration    := publishM2Configuration.value.withOverwrite(true)

scalacOptions ++= List(
  "-deprecation",
  "-encoding", "UTF-8",
  "-explaintypes",
  "-Yrangepos",
  "-feature",
  "-Xfuture",
  "-Ypartial-unification",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Yno-adapted-args",
  "-opt-warnings",
  "-Xlint:_,-type-parameter-shadow",
  "-Xsource:2.13",
  "-Ywarn-dead-code",
  "-Ywarn-extra-implicit",
  "-Ywarn-inaccessible",
  "-Ywarn-infer-any",
  "-Ywarn-nullary-override",
  "-Ywarn-nullary-unit",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused:_,-imports",
  "-Ywarn-value-discard",
  "-opt:l:inline",
  "-opt-inline-from:<source>")
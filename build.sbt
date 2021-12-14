name := "PrintSequenceMain"

version := "0.1"

scalaVersion := "2.13.6"

//mainClass in assembly := Some("com.domain.Main")

libraryDependencies += "javax.jms" % "jms" % "1.1"
libraryDependencies += "org.apache.activemq" % "activemq-all" % "5.13.1"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"

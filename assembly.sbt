import AssemblyKeys._

assemblySettings

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
{
  case PathList("META-INF", "io.netty.versions.properties") => MergeStrategy.discard
  case PathList("ch/qos/logback/classic/boolex/EvaluatorTemplate.groovy") => MergeStrategy.discard
  case x => old(x)
}
}

mainClass in assembly := Some("com.williamson.Server")
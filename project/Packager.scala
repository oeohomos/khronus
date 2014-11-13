import sbt._
import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._


object Packager {

	lazy val packagerSettings = packageArchetype.java_application ++ Seq(Keys.mainClass in (Compile) := Some("com.despegar.metrik.util.Metrik"))

}

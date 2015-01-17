name := "sbt-reproduced-752"

organization := "com.joescii"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.4"

// Uncommenting here allows the range-revisioned projects to all resolve
//resolvers += "rubygems-release" at "http://rubygems-proxy.torquebox.org/releases"

libraryDependencies ++= Seq(
  "rubygems" % "middleman" % "3.3.7" % "provided"
)

// Uncomment this one if you want to convince yourself that my repo indeed has all of these available
//libraryDependencies ++= Seq(
//  "rubygems" % "CFPropertyList" % "2.2.8" % "provided" force(),
//  "rubygems" % "activesupport" % "4.1.7" % "provided" force(),
//  "rubygems" % "addressable" % "2.3.6" % "provided" force(),
//  "rubygems" % "autoprefixer-rails" % "4.0.0.1" % "provided" force(),
//  "rubygems" % "builder" % "3.2.2" % "provided" force(),
//  "rubygems" % "bundler" % "1.7.6" % "provided" force(),
//  "rubygems" % "celluloid" % "0.16.0" % "provided" force(),
//  "rubygems" % "chunky_png" % "1.3.2" % "provided" force(),
//  "rubygems" % "coderay" % "1.1.0" % "provided" force(),
//  "rubygems" % "coffee-script" % "2.3.0" % "provided" force(),
//  "rubygems" % "coffee-script-source" % "1.8.0" % "provided" force(),
//  "rubygems" % "colorize" % "0.7.3" % "provided" force(),
//  "rubygems" % "compass" % "1.0.1" % "provided" force(),
//  "rubygems" % "compass-core" % "1.0.1" % "provided" force(),
//  "rubygems" % "compass-import-once" % "1.0.5" % "provided" force(),
//  "rubygems" % "dotenv" % "1.0.2" % "provided" force(),
//  "rubygems" % "erubis" % "2.7.0" % "provided" force(),
//  "rubygems" % "excon" % "0.41.0" % "provided" force(),
//  "rubygems" % "execjs" % "2.2.2" % "provided" force(),
//  "rubygems" % "ffi" % "1.9.3" % "provided" force(),
//  "rubygems" % "fission" % "0.5.0" % "provided" force(),
//  "rubygems" % "fog" % "1.25.0" % "provided" force(),
//  "rubygems" % "fog-brightbox" % "0.6.1" % "provided" force(),
//  "rubygems" % "fog-core" % "1.25.0" % "provided" force(),
//  "rubygems" % "fog-json" % "1.0.0" % "provided" force(),
//  "rubygems" % "fog-profitbricks" % "0.0.1" % "provided" force(),
//  "rubygems" % "fog-radosgw" % "0.0.3" % "provided" force(),
//  "rubygems" % "fog-sakuracloud" % "0.1.1" % "provided" force(),
//  "rubygems" % "fog-softlayer" % "0.3.24" % "provided" force(),
//  "rubygems" % "fog-terremark" % "0.0.2" % "provided" force(),
//  "rubygems" % "fog-vmfusion" % "0.0.1" % "provided" force(),
//  "rubygems" % "fog-voxel" % "0.0.1" % "provided" force(),
//  "rubygems" % "fog-xml" % "0.1.1" % "provided" force(),
//  "rubygems" % "formatador" % "0.2.5" % "provided" force(),
//  "rubygems" % "haml" % "4.0.5" % "provided" force(),
//  "rubygems" % "hike" % "1.2.3" % "provided" force(),
//  "rubygems" % "hitimes" % "1.2.2" % "provided" force(),
//  "rubygems" % "hooks" % "0.4.0" % "provided" force(),
//  "rubygems" % "i18n" % "0.6.11" % "provided" force(),
//  "rubygems" % "inflecto" % "0.0.2" % "provided" force(),
//  "rubygems" % "ipaddress" % "0.8.0" % "provided" force(),
//  "rubygems" % "jquery-middleman" % "3.0.4" % "provided" force(),
//  "rubygems" % "jruby-pageant" % "1.1.1" % "provided" force(),
//  "rubygems" % "json" % "1.8.1" % "provided" force(),
//  "rubygems" % "kramdown" % "1.5.0" % "provided" force(),
//  "rubygems" % "listen" % "2.8.0" % "provided" force(),
//  "rubygems" % "map" % "6.5.5" % "provided" force(),
//  "rubygems" % "method_source" % "0.8.2" % "provided" force(),
//  "rubygems" % "middleman" % "3.3.7" % "provided" force(),
//  "rubygems" % "middleman-autoprefixer" % "2.3.0" % "provided" force(),
//  "rubygems" % "middleman-blog" % "3.5.3" % "provided" force(),
//  "rubygems" % "middleman-cloudfront" % "0.1.0" % "provided" force(),
//  "rubygems" % "middleman-core" % "3.3.7" % "provided" force(),
//  "rubygems" % "middleman-s3_redirect" % "3.0.5" % "provided" force(),
//  "rubygems" % "middleman-s3_sync" % "3.0.35" % "provided" force(),
//  "rubygems" % "middleman-sprockets" % "3.3.10" % "provided" force(),
//  "rubygems" % "mime-types" % "2.4.3" % "provided" force(),
//  "rubygems" % "minitest" % "5.4.3" % "provided" force(),
//  "rubygems" % "multi_json" % "1.10.1" % "provided" force(),
//  "rubygems" % "net-scp" % "1.2.1" % "provided" force(),
//  "rubygems" % "net-ssh" % "2.9.1" % "provided" force(),
//  "rubygems" % "nokogiri" % "1.6.4.1" % "provided" force(),
//  "rubygems" % "opennebula" % "4.10.0" % "provided" force(),
//  "rubygems" % "padrino-helpers" % "0.12.4" % "provided" force(),
//  "rubygems" % "padrino-support" % "0.12.4" % "provided" force(),
//  "rubygems" % "parallel" % "1.3.3" % "provided" force(),
//  "rubygems" % "pmap" % "1.0.1" % "provided" force(),
//  "rubygems" % "pry" % "0.10.1" % "provided" force(),
//  "rubygems" % "rack" % "1.5.2" % "provided" force(),
//  "rubygems" % "rack-test" % "0.6.2" % "provided" force(),
//  "rubygems" % "rb-fsevent" % "0.9.4" % "provided" force(),
//  "rubygems" % "rb-inotify" % "0.9.5" % "provided" force(),
//  "rubygems" % "ruby-progressbar" % "1.7.0" % "provided" force(),
//  "rubygems" % "sass" % "3.4.6" % "provided" force(),
//  "rubygems" % "slop" % "3.6.0" % "provided" force(),
//  "rubygems" % "spoon" % "0.0.4" % "provided" force(),
//  "rubygems" % "sprockets" % "2.12.3" % "provided" force(),
//  "rubygems" % "sprockets-helpers" % "1.1.0" % "provided" force(),
//  "rubygems" % "sprockets-sass" % "1.2.0" % "provided" force(),
//  "rubygems" % "therubyrhino" % "2.0.4" % "provided" force(),
//  "rubygems" % "therubyrhino_jar" % "1.7.4" % "provided" force(),
//  "rubygems" % "thor" % "0.19.1" % "provided" force(),
//  "rubygems" % "thread_safe" % "0.3.4" % "provided" force(),
//  "rubygems" % "tilt" % "1.4.1" % "provided" force(),
//  "rubygems" % "tilt" % "2.0.1" % "provided" force(),
//  "rubygems" % "timers" % "4.0.1" % "provided" force(),
//  "rubygems" % "tzinfo" % "1.2.2" % "provided" force(),
//  "rubygems" % "uber" % "0.0.11" % "provided" force(),
//  "rubygems" % "uglifier" % "2.5.3" % "provided" force(),
//  "rubygems" % "unf" % "0.1.4" % "provided" force()
//)

scalacOptions <<= scalaVersion map { v: String =>
  val opts = "-deprecation" :: "-unchecked" :: Nil
  if (v.startsWith("2.9.")) opts else opts ++ ("-feature" :: "-language:postfixOps" :: Nil)
}


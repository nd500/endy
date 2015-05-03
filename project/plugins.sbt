resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url("heroku-sbt-plugin-releases", url("http://dl.bintray.com/heroku/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

addSbtPlugin("com.heroku" % "sbt-heroku" % "0.3.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.4")
# sbt-reproduced

This branch reproduces [Range-versioned dependencies are not correctly found with overridden repos configuration #752](https://github.com/sbt/sbt/issues/752).

In the root of this project, run the included `sbt` script to update:

```text
> ./sbt/bin/sbt update
```

You will find 10 dependencies which do not resolve...

```text
[error] (*:update) sbt.ResolveException: unresolved dependency: rubygems#middleman-core;[3.3.7,3.3.7.0.0.0.0.1): not found
[error] unresolved dependency: rubygems#middleman-sprockets;[3.1.2,): not found
[error] unresolved dependency: rubygems#haml;[4.0.5,): not found
[error] unresolved dependency: rubygems#sass;[3.4.0,4.0): not found
[error] unresolved dependency: rubygems#compass-import-once;[1.0.5,1.0.5.0.0.0.0.1): not found
[error] unresolved dependency: rubygems#compass;[1.0.0,2.0.0): not found
[error] unresolved dependency: rubygems#uglifier;[2.5,2.99999]: not found
[error] unresolved dependency: rubygems#coffee-script;[2.2,2.99999]: not found
[error] unresolved dependency: rubygems#execjs;[2.0,2.99999]: not found
[error] unresolved dependency: rubygems#kramdown;[1.2,1.99999]: not found
[error] Total time: 7 s, completed Jan 16, 2015 9:42:36 PM
```

...even though the rubygems repo has been checked for each:

```text
  [info] Resolving rubygems#middleman-core;[3.3.7,3.3.7.0.0.0.0.1) ...
  [info] Resolving rubygems#middleman-core;[3.3.7,3.3.7.0.0.0.0.1) ...
[warn]  module not found: rubygems#middleman-core;[3.3.7,3.3.7.0.0.0.0.1)
[warn] ==== local: tried
[warn]   C:\Users\jbarnes\.ivy2\local\rubygems\middleman-core\[revision]\ivys\ivy.xml
[warn] ==== typesafe-releases: tried
[warn]   http://repo.typesafe.com/typesafe/ivy-releases/rubygems/middleman-core/[revision]/ivys/ivy.xml
[warn] ==== sbt-plugin-releases: tried
[warn]   http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/rubygems/middleman-core/[revision]/ivys/ivy.xml
[warn] ==== rubygems-release: tried
[warn]   http://rubygems-proxy.torquebox.org/releases/
[warn]   [working@rubygems-release]
[warn] ==== maven-central-releases: tried
[warn]   http://repo1.maven.org/maven2/rubygems/middleman-core/[revision]/middleman-core-[revision].pom
```

If we reconfigure the project and sbt to specify rubygems as a resolver in `build.sbt` rather than overriding the repos, we see that it works fine.

1. Uncomment [line 10 in `build.sbt`](https://github.com/joescii/sbt-reproduced/blob/issue-752/build.sbt#L10)
2. Comment [line 197 in `sbt-launch-lib.bash`](https://github.com/joescii/sbt-reproduced/blob/issue-752/sbt/bin/sbt-launch-lib.bash#L197)
3. And if you're really being thorough and checking this on Windows, comment [line 27 in `sbt.bat`](https://github.com/joescii/sbt-reproduced/blob/issue-752/sbt/bin/sbt.bat#L27)

Now the dependencies being resolving.

```text
> ./sbt/bin/sbt update
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
[info] Loading global plugins from C:\Users\jbarnes\.sbt\0.13\plugins
[info] Loading project definition from C:\Users\jbarnes\code\sbt-reproduced\project
[info] Set current project to sbt-reproduced-752 (in build file:/C:/Users/jbarnes/code/sbt-reproduced/)
[info] Updating {file:/C:/Users/jbarnes/code/sbt-reproduced/}sbt-reproduced...
[info] Resolving org.scala-lang#scala-library;2.11.4 ...
  [info] Resolving rubygems#middleman;3.3.7 ...
  [info] Resolving rubygems#middleman-core;[3.3.7,3.3.7.0.0.0.0.1) ...
  [info] Resolving rubygems#middleman-core;[3.3.7,3.3.7.0.0.0.0.1) ...
  [info] Resolving rubygems#bundler;[1.1,1.99999] ...
  [info] Resolving rubygems#bundler;[1.1,1.99999] ...
```

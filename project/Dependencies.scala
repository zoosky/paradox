/*
 * Copyright Lightbend, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import sbt._

object Version {
  val foundation = "6.2.3"
  val jtidy      = "r938"
  val pegdown    = "1.6.0"
  val prettify   = "4-Mar-2013"
  val sbtWeb     = "1.1.1"
  val scalatest  = "3.0.3"
  val st4        = "4.0.8"
}

object Library {
  val foundation = "org.webjars"       % "foundation" % Version.foundation
  val jtidy      = "net.sf.jtidy"      % "jtidy"      % Version.jtidy
  val pegdown    = "org.pegdown"       % "pegdown"    % Version.pegdown
  val prettify   = "org.webjars"       % "prettify"   % Version.prettify
  val sbtWeb     = "com.typesafe.sbt"  % "sbt-web"    % Version.sbtWeb
  val scalatest  = "org.scalatest"    %% "scalatest"  % Version.scalatest
  val st4        = "org.antlr"         % "ST4"        % Version.st4
}

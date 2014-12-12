package com.williamson

import org.slf4j.LoggerFactory
import unfiltered.netty.Http
import unfiltered.netty.async.Planify
import unfiltered.request._
import unfiltered.response._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.util.Random

object Server extends App {

  val log = LoggerFactory.getLogger(getClass)

  var server = Planify {
    case req@GET(Path("/")) => req.respond(ResponseString("Hello World"))
  }

  val port = if(System.getenv("PORT") != null) System.getenv("PORT").toInt else 9000
  Http(port).plan(server).run()

}
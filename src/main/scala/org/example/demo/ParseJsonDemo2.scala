package org.example.demo


import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods

import scala.io.Source



object ParseJsonDemo2 extends App {

  val jsonString: String = Source.fromResource("properties-dev.json").mkString

  implicit val formats: DefaultFormats.type = DefaultFormats
  val storageDetails = JsonMethods.parse(jsonString).extract[StorageDetails]

  val scope: String = storageDetails.connections.map(x => x.scope).mkString

  val name = storageDetails.connections.map(x => x.connectionProperties.map(y => y.name))

  val tenantId = name.map(a => a)


  val finals = for {
    w <- name

  } yield w

  println(finals)

}
package org.example.demo

import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods._

import scala.io.Source


object ParseJsonDemo extends App {

  val jsonString: String = Source.fromResource("properties-dev.json").mkString

  implicit val formats: DefaultFormats.type = DefaultFormats
  val storageDetails = parse(jsonString).extract[StorageDetails]

  val scope: String = storageDetails.connections.map(x => x.scope).mkString

  val name = storageDetails.connections.map(x => x.connectionProperties.map(y => y.name)).mkString


 val finals =  for {
    w <- storageDetails.connections
    x <- w.connectionProperties
    y <- x.name.map(z => z)

  } yield y

  println(name)

}
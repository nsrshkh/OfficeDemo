

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util

object JustTryScalaObject extends App {

  import System.out.{println => p}
  import java.util.{Random => _}

  printMessage("Hello")


  def printMessage(hello1: String): Unit = {
    val hello: String = hello1
    p(hello)
  }

  val a = new util.ArrayList
  p(a)
  //  val r = new Random

  import java.lang.Math._

  val b = sin(1)

  p(b)
  val c = cos(PI)
  p(c)

  import java.awt.Color._

  println(RED)


  val myMap = Map("1" -> "A", "2" -> "B")

  println(myMap.mapValues(f => f + 10))
println(myMap.hashCode())
  def maxElements(max: Int): Unit = {
    var v = Vector[Int]()
    for (i <- 1 to max) {
      v = v :+ i
    }
    println(v.max)
  }

  val startTime = LocalDateTime.now()
  println(s"startTime: $startTime")
  maxElements(15000)

  val endTime = LocalDateTime.now()
  println(s"endTime: $endTime")
  println(s"time difference: ${ChronoUnit.SECONDS.between(startTime, endTime)}")


  val x = (1 to 100).view.map { e =>
    Thread.sleep(10)
    e * 2
  }
println(x.max)
}

import scala.language.postfixOps


val a = 'a'
val b = {
  a.isValidChar
}

0.1 + 0.1
val b = 0.1 + 0.2
val a = 0.3
a == b
val r = 1 to 10
println(r)
val r = 1 to 10 by 2

for (i <- 1 until 5) println(i)

val x = 1 to 10 toArray

1.to(10)
val formatter = java.text.NumberFormat.getIntegerInstance
formatter.format(10000)
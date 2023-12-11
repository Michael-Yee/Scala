package com.basics

/**
  * Funtional programming example
  */

object FuntionalProgramming extends App {

val simpleIncrementer1 = new Function1[Int, Unit] {
    override def apply(x: Int): Unit = println(s"${x + 1}")
}
simpleIncrementer1(42)

val simpleIncrementer2: Int => Unit = (x: Int) => println(s"${x + 1}")
simpleIncrementer2(42)

val simpleIncrementer3 = (x: Int) => println(s"${x + 1}")
simpleIncrementer3(42)

// Higher order functions
val aMappedList1 = List(1, 2, 3).map(x => x + 1)
println(aMappedList1)

val aMappedList2 = List(1, 2, 3).map {
  x => x + 1
}
println(aMappedList2)

val aList = List(1, 2, 3, 4, 5)
println(aList(3))

val aSequence: Seq[Int] = Seq(1,2,3)
val anExtendedSequence= 0 +: aSequence :+ 4
println(anExtendedSequence)

val aGuardedLoop = for {
    i <- 1 to 5
    if i % 2 == 0
  } {
    println(i)
  }

}

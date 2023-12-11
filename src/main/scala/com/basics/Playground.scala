package com.basics

/**
  * My Hello World App
  */
object Playground extends App {
  for {
    i <- 1 to 15
  }
  {
    if (i % 5 == 0 && i % 3 == 0)
      println("fizzbuz")
    else if (i % 5 == 0)
      println("fizz")
    else if (i % 3 == 0)
      println("buzz")
    else
      println(i)
  }
}

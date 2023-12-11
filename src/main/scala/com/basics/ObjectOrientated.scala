package com.basics

/**
  * This is my Class application.
  */

object ObjectOrientated extends App {
  class Car {
    val wheels: Int = 4

    def engineNoise() = println("Vroom Vroom!")
  }

  class Toyota(val hornNoise: String) extends Car

  val aToyotaType = new Toyota("Beep Beep")

  println(s"A Toyota has ${aToyotaType.wheels} wheels")
  println(s"A Toyota horn make the sound: ${aToyotaType.hornNoise}")

}

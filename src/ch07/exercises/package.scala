package ch07.exercises.random

/**
  * Created by zhaowq on 2017/8/21.
  */
package object random {
  var seed: Int = _
  val a = BigDecimal(1664535)
  val b = BigDecimal(1013904223)
  val n = 32

  def nextInt(): Int = {
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    seed
  }

  def nextDouble(): Double = {
    val temp = (seed * a + b) % BigDecimal(2).pow(n)
    seed = temp.toInt
    temp.toDouble
  }

}

package test {


  import ch07.exercises


  object Test extends App {
    random.seed = 4
    println(random.nextDouble())
    println(random.nextDouble())
    println(random.nextDouble())
    println(random.nextDouble())
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextInt())
    println(random.nextInt())
  }
}

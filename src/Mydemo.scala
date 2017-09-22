import java.io.File
import java.util.Scanner

import scala.collection.JavaConversions.{mapAsScalaMap, propertiesAsScalaMap}

/**
  * Created by zhaowq on 2017/7/10.
  */
object Mydemo {
  def main(args: Array[String]): Unit = {
    //  println("hello world!".)
    //  println("crazy"*3)
    //  println(10 max 2)
    //  println(BigInt(2).pow(1024))
    //   BigInt.probablePrime(100, util.Random)
    //  func8(Array(-1, 7, -4, 6, 7, -5)).foreach(println)
    //   deleteUnFirstF(Array(-1, 7, -4, 6, 7, -5)).foreach(println)
    //println(qte(Array(3,4,5,5,6,7,3,2,3), 4))

  }

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def func() = {
    val map:scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
    val in = new Scanner(new File("src/1.txt"))
    while(in.hasNext()){
      val word = in.next()
      map += (word -> (map.getOrElse(word, 0)+1))
    }
    map.foreach(println)
  }

  def func7()={
    val props:scala.collection.Map[String, String] = System.getProperties
    val keys=props.keySet
    val keyLengths = for(key <- keys) yield key.length()
    val max = keyLengths.max
    for(key <- keys){
      print(key)
      print(" "*(max-key.length))
      print(" | ")
      println(props(key))
    }
  }
  def qte(values:Array[Int], v:Int) = {
    (values.count(_ < v),values.count(_ == v), values.count(_ > v))
  }
}

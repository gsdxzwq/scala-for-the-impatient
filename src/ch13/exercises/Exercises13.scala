package ch13.exercises

import scala.collection.mutable.{Map, HashMap, SortedSet}

/**
  * Created by zhaowq on 2017/9/19.
  */
object Exercises13 extends App {
  def indexes(str: String): Map[Char, SortedSet[Int]] = {
    var map = new HashMap[Char, SortedSet[Int]]();
    var i = 0;

    str.foreach {
      c =>
        map.get(c) match {
          case Some(result) => map(c) = result + 1
          case None => map += (c -> SortedSet {
            i
          })
        }
        i += 1
    }
    map
  }

  println(indexes("Mississippi"))
}

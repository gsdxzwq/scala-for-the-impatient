package ch08.exercises

import scala.collection.mutable.ArrayBuffer

/**
  * Created by zhaowq on 2017/8/22.
  */
abstract class Item {
  def price():Double

  def description():String
}

class SimpleItem(val price:Double, val description:String) extends Item{

}

class Bundle extends Item{
  var items = new ArrayBuffer[Item]()

  def addItem(item: Item): Unit ={
    items += item
  }

  override def price(): Double = {
    var total = 0d
    items.foreach(total+=_.price)
    total
  }

  override def description(): String = {
    items.mkString(" ")
  }
}

package ch08.exercises

/**
  * Created by zhaowq on 2017/8/22.
  */
abstract class Shape {
  def centerPoint()
}

class Rectangle(startX: Int, endX: Int, startY: Int, endY: Int) extends Shape {
  override def centerPoint(): Unit = {

  }
}

class Circle(X: Int, Y: Int, radius: Double) extends Shape {
  override def centerPoint(): Unit = {

  }
}

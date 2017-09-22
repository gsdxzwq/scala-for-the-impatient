package ch06.exercises

/**
  * Created by zhaowq on 2017/8/21.
  */
class Point(x: Int, y: Int) {
  override def toString: String = super.toString
}

object Point extends App {
  def apply(x: Int, y: Int): Point = new Point(x, y)
}

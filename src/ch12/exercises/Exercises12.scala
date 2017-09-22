package ch12.exercises

/**
  * Created by zhaowq on 2017/9/16.
  */
object Exercises12 extends App {
  //1
  def values(fun: (Int) => Int, low: Int, high: Int) = {
    var arr = List[(Int, Int)]()
    low to high foreach {
      num =>
        arr = (num, fun(num)) :: arr
    }
    arr
  }

  // println(values(x => x * x, -5, 5).mkString)

  //2
  // println((1 to 9).reduceLeft((a, b) => if (a < b) b else a))

  //3
  def jiecheng(n: Int) = {
    (1 to n).reduceLeft(_ * _)
  }

  println(jiecheng(6))

  //4
  println((1 to -6).foldLeft(1)(_ * _))

  //5
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    val s = inputs.reduceLeft((a, b) => if (fun(a) > fun(b)) a else b)
    fun(s)
  }

  println(largest(x => 10 * x - x * x, 1 to 10))

  //7
  var list = List[Int]()

  def adjustToPair(fun:(Int,Int)=>Int)(tup:(Int, Int))={
    list = fun(tup._1,tup._2) :: list
    this
  }

  def map(fun:(Int,Int)=>Int):Int={
    list.reduceLeft(fun)
  }

  val pairs = (1 to 10) zip (11 to 20)
  for ((a,b) <- pairs){
    adjustToPair(_ * _)((a,b))
  }
  println(map(_ + _))

}

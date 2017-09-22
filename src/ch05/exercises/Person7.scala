package ch05.exercises

/**
  * Created by zhaowq on 2017/8/2.
  */
class Person7(val name: String) {
  val firstName = name.split(" ")(0)
  val lastName = name.split(" ")(1)
}

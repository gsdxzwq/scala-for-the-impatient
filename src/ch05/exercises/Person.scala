package ch05.exercises

/**
  * Created by zhaowq on 2017/8/2.
  */
class Person(var age: Int) {
 age = if (age < 0) 0 else age
}

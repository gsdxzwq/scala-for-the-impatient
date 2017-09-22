package ch05.exercises

/**
  * Created by zhaowq on 2017/8/2.
  */
class Counter {
  private var value = Int.MaxValue

  def increment() {
    if (value < Int.MaxValue) value + 1 else value
  }

  def current = value
}

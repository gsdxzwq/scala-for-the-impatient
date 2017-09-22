package ch05.exercises

/**
  * Created by zhaowq on 2017/8/2.
  */
class Time(val minutes: Int, val hours: Int) {

  def before(other: Time): Boolean = {
    other.hours < hours || (other.hours == hours && other.minutes < minutes)
  }
}

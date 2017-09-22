package ch05.exercises

import scala.beans.BeanProperty

/**
  * Created by zhaowq on 2017/8/2.
  */
class Student {
  @BeanProperty var name: String = ""
  @BeanProperty var id: Long = 0
}

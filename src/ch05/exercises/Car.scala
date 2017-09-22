package ch05.exercises

/**
  * Created by zhaowq on 2017/8/2.
  */
class Car(val manufacturer: String, val modelName: String, val modelYear: Int, var licensePlate: String) {
  def this(manufacturer: String, modelName: String) = {
    this(manufacturer, modelName, -1, "")
  }

  def this(manufacturer: String, modelName: String, modelYear: Int) = {
    this(manufacturer, modelName, modelYear, "")
  }

  def this(manufacturer: String, modelName: String, licensePlate: String) = {
    this(manufacturer, modelName, -1, licensePlate)
  }
}

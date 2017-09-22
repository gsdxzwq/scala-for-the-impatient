package ch06.exercises

/**
  * Created by zhaowq on 2017/8/21.
  */
object Card extends Enumeration with App{
  val spade = Value("♠")
  val heart = Value("♥")
  val club = Value("♣")
  val diamond = Value("♦")

  println(Card.spade)
}

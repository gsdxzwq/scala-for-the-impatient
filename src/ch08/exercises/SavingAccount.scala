package ch08.exercises

/**
  * Created by zhaowq on 2017/8/22.
  */
class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private var num: Int = _

  def earnMonthlyInterest(): Unit = {
    num = 3
    //假设利息为1
    super.deposit(1)
  }

  override def deposit(amount: Double): Double = {
    num -= 1
    if (num < 0) super.deposit(amount - 1) else super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    num -= 1
    if (num < 0) super.withdraw(amount + 1) else super.withdraw(amount)
  }

}

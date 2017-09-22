package ch08.exercises

/**
  * Created by zhaowq on 2017/8/22.
  */
class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private var balance = initialBalance;

  override def deposit(amount: Double): Double = {
    balance += amount
    balance = balance - 1
    balance
  }

  override def withdraw(amount: Double): Double = {
    balance -= amount
    balance = balance - 1
    balance
  }
}

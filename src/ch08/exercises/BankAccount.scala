package ch08.exercises

/**
  * Created by zhaowq on 2017/8/22.
  */
class BankAccount(initialBalance: Double) {
  private var balance = initialBalance;

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}

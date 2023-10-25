package chapter04

object test_TraitOverLying {
  def main(args: Array[String]): Unit = {
    val student15 = new Student15
    student15.dancing()
    student15.increase()
  }
}
trait Knowledge15{
  var amount: Int = 0
  def increase(): Unit = {
    println("knowlege increase")
  }
}
trait Talents15{
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = {
    println("talents increase")
  }
}

// 特征的叠加顺序从后往前
class Student15 extends Person13 with Talents15 with Knowledge15{
  override def dancing(): Unit = println("dancing")

  override def singing(): Unit = println("singing")

  override def increase(): Unit = {
    super.increase()
  }
}
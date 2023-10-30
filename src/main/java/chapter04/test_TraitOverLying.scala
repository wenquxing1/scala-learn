package chapter04

object test_TraitOverLying {
  def main(args: Array[String]): Unit = {
    val student15 = new Student15
    student15.dancing()
    student15.increase()

    // 钻石问题特征叠加
    val myball = new MyBasketball
    println(myball.describe())
  }
}

trait Ball{
  def describe(): String = "ball"
}
trait ColorBall extends Ball{
  val color:String = "Red"
  override def describe(): String = color + "--" + super.describe()
}
trait CatagoryBall extends Ball{
  val catagory: String = "basketball"

  override def describe(): String = catagory + "--" + super.describe()
}
class MyBasketball extends CatagoryBall with ColorBall{
  override def describe(): String = "my ball is a " + super[CatagoryBall].describe()
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
package chapter04

object test_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student14 = new Student14
    student14.study()
    student14.increase()
    student14.play()
    student14.increase()
    student14.dating()
    student14.increase()

    // 动态混入
    val studentWithTalent = new Student14 with Talents {
      override def singing(): Unit = println("student is good at singing")

      override def dancing(): Unit = println("student is good at dacing")
    }
    studentWithTalent.play()
    studentWithTalent.study()
    studentWithTalent.sayHello()
    studentWithTalent.dating()
  }
}
trait Knowledge{
  var amount: Int = 0
  def increase(): Unit
}
trait Talents{
  def singing(): Unit
  def dancing(): Unit
}
class Student14 extends Person13 with Young with Knowledge {
  // 重写冲突的属性
  override val name: String = "jia"
  override def dating(): Unit = {
    println(s"${name} is dating")
  }
  def study(): Unit = {
    println(s"${name} is studying")
  }

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from ${name}")
  }

  override def increase(): Unit = {
    amount += 1
    println(s"studnet ${name} knowledge increase: ${amount}")
  }
}
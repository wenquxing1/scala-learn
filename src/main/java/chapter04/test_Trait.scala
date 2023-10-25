package chapter04

object test_Trait {
  def main(args: Array[String]): Unit = {
    val student13 = new Student13
    student13.sayHello()
    student13.study()
    student13.dating()
    student13.play()
  }
}
class Person13{
  val name: String = "person"
  var age: Int = 20
  def sayHello(): Unit = {
    println(s"hiii ${name}")
  }
}
trait Young{
  var age: Int
  val name: String = "young"
  def play(): Unit = {
    println("young people is playing")
  }
  def dating(): Unit
}

class Student13 extends Person13 with Young{
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
}

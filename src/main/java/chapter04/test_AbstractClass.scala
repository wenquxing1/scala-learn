package chapter04

object test_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student9 = new Student9
    student9.eat()
    student9.sleep
    println(student9.name)
  }
}

abstract class Person9{
  var name: String = "jia"
  var age: Int

  def eat(): Unit = {
    println("99")
  }
  def sleep(): Unit
}
class Student9 extends Person9{
  var age = 19
  def sleep(): Unit = {
    println("studnet sleeping")
  }

  name = "wen"
  override def eat(): Unit = {
    println("student eat")
  }
}

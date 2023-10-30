package chapter04

object test_Extends {
  def main(args: Array[String]): Unit = {
    val student17 = new Student17("jia",10)
    student17.study()
    student17.sayHi()
  }
}

class Person17(val name: String, val age: Int){
  def sayHi(): Unit = {
    println(s"hi from person ${name}")
  }
}

class Student17(name: String, age: Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println(s"hi from student ${name}")
  }
  def study(): Unit = {
    println(s"student ${name} study")
  }
}

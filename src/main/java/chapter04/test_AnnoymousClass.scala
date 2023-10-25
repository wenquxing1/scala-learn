package chapter04

object test_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    val person1: Person8 = new Person8 {
      override var name: String = "wqx"

      override def eat(): Unit = {
        println("person eating")
      }
    }
    println(person1.name)
    person1.eat()
  }
}
abstract class Person8{
  var name: String
  def eat(): Unit

}

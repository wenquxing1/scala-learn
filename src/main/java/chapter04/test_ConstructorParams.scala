package chapter04

object test_ConstructorParams {
  def main(args: Array[String]): Unit = {
//    val student11 = new Student11("jia", 12)
//    student11.printInfo()
    val student11 = Student11.newstudent("jia", 20)
    student11.printInfo()

    val student112 = Student11.apply("hao", 23)
    student112.printInfo()

    val student111 = Student11("wen", 21)
    student111.printInfo()
  }
}

class Student11 private(val name:String, val age: Int){
  def printInfo(): Unit = {
    println(s"stduent-name: ${name}, s-age: ${age}, s-schoole: ${Student11.school}")
  }
}
object Student11{
  val school: String = "hubst"

  def newstudent(name: String, age: Int): Student11 = new Student11(name, age)
  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
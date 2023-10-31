package chapter04

object test_Extends {
  def main(args: Array[String]): Unit = {
    val student17: Student17 = new Student17("jia",10)
    student17.study()
    student17.sayHi()

    val person17: Person17 = new Student17("wen", 20)

    println("student17 is student + " + student17.isInstanceOf[Student17])
    println("student17 is person + " + student17.isInstanceOf[Person17])
    println("person17 is student + " + person17.isInstanceOf[Student17])
    println("person17 is person + " + person17.isInstanceOf[Person17])

    val person172: Person17 = new Person17("hao", 22)
    println("person172 is student: " + person172.isInstanceOf[Student17])

    if(person17.isInstanceOf[Student17]){
      val newStudent = person17.asInstanceOf[Student17]
      newStudent.study()
    }
    println(classOf[Student17])
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

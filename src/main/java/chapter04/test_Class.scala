package chapter04

object test_Class {
  def main(args: Array[String]): Unit = {
    val student1 = new Student
    println(s"${student1.name} + ${student1.age}")
    student1.name = "bo"
    student1.age = 18
    println(s"${student1.name} + ${student1.age}")

    val student2 = new Student2("jia",20)
    println(s"${student2.name} __ ${student2.age}")

    val student3 = new Student3("wen", 21)
//    println(s"${student3.name + student3.age}")
  }
}

class Student{
  var name:String = _
  var age: Int = _
}

// 有修饰符val或var才相当于类中的属性
class Student2(var name: String, var age: Int)

// 没有修饰符的话就是形参
class Student3(name: String, age: Int)
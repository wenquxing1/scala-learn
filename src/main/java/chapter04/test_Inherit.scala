package chapter04

object test_Inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student10("ali",19)
    val student2 = new Student10("bob",20,"wqx")
  }
}
class Person10(){ // 空参的主构造器
  var name: String = _
  var age: Int = _
  println("1.父类的主构造器调用")
  // 传入参数修改属性值需要有辅助构造器
  def this(name: String, age: Int) = {
    this()
    println("2.父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printlnInfo(): Unit = {
    println(s"person: ${name} + ${age}")
  }

}

class Student10(name: String, age: Int) extends Person10{
  var stdNo: String = _
  println("3.子类的主构造器调用")
  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4.子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printlnInfo(): Unit = {
    println(s"student: $name $age $stdNo")
  }
}

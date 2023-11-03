package chapter08

object test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student1 = Student1("ji", 22)
    val result = student1 match{
      case Student1("ji", 22) => "ji, 20"
      case _ => "else"
    }
    println(result)
  }
}

//定义样例类
case class Student1(name: String, age: Int)

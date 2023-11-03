package chapter08

object test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("hi", 10)
    //针对对象实例内容进行匹配
    val result = student match {
      case Student("hi", 10) => "hi, 10"
      case _ => "else"
    }
    println(result)
  }
}

class Student(val name:String, val age:Int){

}

object Student{
  def apply(name: String, age: Int): Student = new Student(name, age)
  def unapply(student: Student): Option[(String, Int)] = {
    if(student == null){
      None
    }else{
      Some((student.name, student.age))
    }
  }
}
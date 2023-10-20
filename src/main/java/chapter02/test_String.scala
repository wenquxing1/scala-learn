package chapter02

object test_String {
  def main(args: Array[String]): Unit = {
    val age = 18
    val name = "jia"
    //字符串模板
    println(s"${name} 今年 ${age} 了")
    val num: Double = 12.2367
    println(f"${name} 今天 ${num}%8.2f")
    //三引号保持多行字符串的原格式输出
    val sql: String =
      s"""
         |select *
         |from
         |  student
         |where student.age >= 20 and student.name = ${name}
         |""".stripMargin

    println(sql)
  }
}

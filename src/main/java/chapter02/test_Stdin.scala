package chapter02

import scala.io.StdIn

object test_Stdin {
  def main(args: Array[String]): Unit = {
    val name: String = StdIn.readLine("请输入您的名字：")
    val age: String = StdIn.readLine("您的年龄")
    println(s"姓名：${name} 年龄：${age}")
  }
}

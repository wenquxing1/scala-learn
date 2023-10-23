package chapter03

object test_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val res: Int = sum(10, 20)
    println("1, 调用")
    println("2, res= " + res)
    println("4, res= " + res)
  }
  def sum(a: Int, b: Int): Int = {
    println("3, 调用")
    a + b
  }
}

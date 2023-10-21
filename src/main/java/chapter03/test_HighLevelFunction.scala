package chapter03

object test_HighLevelFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f被调用")
      n + 1
    }



    val res: Int = f(5)
    println(res)

  }
}

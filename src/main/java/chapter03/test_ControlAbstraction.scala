package chapter03

object test_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 传值参数
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
//    f0(0)
    def f1(): Int = {
      println("f1f1f1")
      10
    }
    f0(f1())

    println("==========")
    // 传名参数，传递代码块
    def f2(a: => Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
//    f2(23)
    f2(f1())
    f2({
      println("woshi")
      200
    })
  }
}

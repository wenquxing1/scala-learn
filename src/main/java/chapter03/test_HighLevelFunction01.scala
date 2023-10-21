package chapter03

object test_HighLevelFunction01 {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f被调用")
      n + 1
    }
    //函数作为值进行传递
    val f1 = f _
    val f2: Int => Int = f
//    println(f1)
//    println(f1(10))
//    println(f2(5))

    //函数作为参数进行传递
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int ={
      op (a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add,1,2))
    println(dualEval((a, b) => a + b, 10, 11))
    println(dualEval(_ + _ , 10, 20))
    //函数作为函数的返回值进行返回
    def f5(): Int=>Unit = {
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      f6
    }
    println(f5())
    val f7 = f5()
    println(f7)
    println(f7(11))

    println(f5()(10))
  }
}

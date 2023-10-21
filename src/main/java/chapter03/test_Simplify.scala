package chapter03

import scala.Console.println

object test_Simplify {
  def main(args: Array[String]): Unit = {
    //匿名函数,lambda表达式
//    (name: String) => {println(name)}

    //定义一个二元运算函数，只能操作1和2两个数，具体运算通过参数传入
    def dualFunction(fun: (Int, Int)=>Int): Int = {
      fun(1,2)
    }
    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b:Int) => a - b

    println(dualFunction(add))
    println(dualFunction(minus))
    //匿名函数简化
    println(dualFunction((a: Int, b: Int) => a + b))
    println(dualFunction((a, b) => a + b))
    println(dualFunction(_ + _))


  }
}

package chapter03

object test_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    //将固定参数作为“第一层参数传入”，闭包
    def addByFour(): Int=>Int ={
      val a = 3
      def add(b: Int): Int = {
        a + b
      }
      add
    }
    println(addByFour()(1))

    def addByFour2(a: Int): Int=>Int = {
      def add1(b: Int): Int = {
        a + b
      }
      add1
    }
    println(addByFour2(1)(2))
    println("===========")
    val addByFive = addByFour2(5)
    println(addByFive(5))

    //lambda表达式简写
    def addBy(a: Int): Int=>Int = {
      (b: Int) => {
        a + b
      }
    }
    def addBy1(a: Int): Int=>Int = {
      b => a + b
    }
    def addBy2(a: Int): Int=>Int = {
      a + _
    }
    def addBy3(a: Int): Int=>Int = a + _

    println(addBy2(1)(20))

    //函数的柯里化
    def addCurring(a:Int)(b:Int): Int = {
      a + b
    }
    println(addCurring(10)(100))

  }
}

package chapter03

object test_myWhile {
  def main(args: Array[String]): Unit = {
    // 用闭包实现一个函数，将代码块作为参数传入，递归调用
    def myWhile(condition: => Boolean): (=>Unit)=>Unit = {
      def doLoop(op: => Unit): Unit = {
        if(condition){
          op
          myWhile(condition)(op)
        }
      }
      doLoop _
    }
    var n = 10
    myWhile(n >= 1){
      println(n)
      n -= 1
    }

    // 用匿名函数简化
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {
      op => {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }
    }

    // 用柯里化实现
    def myWhile3(condition: => Boolean)(op: => Unit): Unit = {
      if(condition){
        op
        myWhile3(condition)(op)
      }
    }

  }
}

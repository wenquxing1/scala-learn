package chapter03

object test_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
  }
  def fact(n: Int): Int = {
    if(n == 0) return 1
    fact(n - 1) * n
  }
  //尾递归实现
  def tailfact(n: Int): Int = {
    def loop(n: Int, curRes: Int): Int = {
      if(n == 0) return curRes
      loop(n - 1, curRes)
    }
    loop(n, 1)
  }
}

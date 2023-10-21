package chapter03

object test_Function {
  def main(args: Array[String]): Unit = {
    def sayHi(name: String): Unit = {
      println("hi! " + name)
    }
    sayHi("jia")
    test_Function.sayHi("bob")
    val re: String = test_Function.sayHello("taylor")
    println(re)
  }
  def sayHi(name: String): Unit = {
    println("hiiii " + name)
  }
  def sayHello(name: String): String = {
    println("hellooo " + name)
    "hello"
  }
}

package chapter08

object test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    def describeConst(x: Any):String = x match{
      case 1 => "Int 1"
      case "hello" => "String hello"
      case '+' => "Char +"
      case _ => ""
    }

    println(describeConst('+'))
    println(describeConst(1))

    def describeType(x: Any): String = x match {
      case i: Int => "Int" + i
      case s: String => "String" + s
      case c: Char => "Char" + c
      case list: List[String] => "List " + list
      case a => "something else" + a
    }

    println(describeType(2))
    println(describeType("ji"))
    describeType(List("jia", "ji"))
    println(describeType(List(1, 2)))
    println(describeType(("jia" -> 1)))
    //匹配数组
    for(arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0,1,0),
      Array(1,1,0),
      Array(1,1,0,1),
      Array("hi", 90)
    )){
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "," + y
        case Array(0, _*) => "head with 0"
        case _ => "something else"
      }
      println("res: " + result)
    }
    println("------------------")
    //匹配列表
    for(list <- List(
      List(0),
      List(1,0),
      List(0,0,0),
      List(0,1),
      List(1,1,0),
      List(88),
      List("hi")
    )){
      val result = list match{
        case List(0) => "0"
        case List(x,y) => "List(x,y): " + x + "," + y
        case List(0, _*) => "List(0,.....)"
        case List(a) => "List(a): " + a
        case _ => "something else"
      }
      println(result)
    }
    //匹配列表2
    val list = List(1,2,3,6,7)
    list match {
      case first :: second :: rest => println(s"first: $first, second: $second, rest: $rest")
      case _ => println("something")
    }
    println("------------------")
    //匹配元组
    for(tuple <- List(
      (0, 1),
      (0,0),
      (0,1,0),
      (0,1,1),
      (1,20,21),
      ("hi",true,0.2)
    )){
      val result = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "(0, _)"
        case (a, 1, _) => "(a, 1, _) " + a
        case (x,y,z) => "(x,y,z):" + x +" " + y + " " + z
        case _ => "smoething else"
      }
      println(result)
    }

  }
}

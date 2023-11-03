package chapter08

object test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    val (x, y) = (10, "hi")
    println(s"x: $x, y: $y")

    val List(first, second, _*) = List(12, 5, 3, 48)
    println(s"first: $first, second: $second")

    val fir :: sec :: rest = List(10, 12, 23, 45)
    println(s"first: $fir, second: $sec, rest: $rest")

    val list = List(("a",1), ("b",2), ("c",3), ("a",10))
    for(elem <- list){
      println(elem._1 + " " +  elem._2)
    }
    println("----------")
    for((word, count) <- list){
      println(word + " " + count)
    }
    for((word, _) <- list){
      println(word)
    }
    println("===========")
    for(("a", count) <- list){
      println(count)
    }
  }
}

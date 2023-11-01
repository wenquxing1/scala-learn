package chapter07

object test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val set = Set(6,7,8,9)
    println(list)
    println(list.size)
    println(list.length)
    println(set.size)
    println("------------")
    for(elem <- list)
      println(elem)
    println("------")
    set.foreach(println)
    println("============")
    for(elem <- list.iterator) println(elem)
    println(list)
    println(set)
    println(list.mkString("-"))

    println(list.contains(10))
    println(set.contains(7))
  }
}

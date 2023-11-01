package chapter07

object test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(3, 9, 1, 10, 20)
    val list2 = List(("a",1), ("b", 10), ("c", 20))
    println(list.sum)
    println(list.product)
    println(list.max)
    println(list.min)
    println("---------------")
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))
    println(list2.minBy(_._2))
    //排序
    val sortList = list.sorted
    println(sortList)
    val sortList1 = list.sorted(Ordering[Int].reverse)
    println(sortList1)
    println("------------")
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))
    //自定义排序规则
    println(list.sortWith((a: Int, b:Int) => a < b))
    println(list.sortWith(_ > _))
  }
}

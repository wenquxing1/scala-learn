package chapter07

object test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4)
    val list2 = List(1,2,10,20,30)
    println(list1.head)
    println(list1.tail)   // 集合的尾（不包含第一个）
    println(list1.last)
    println(list1.init)   //集合的初始数据（不包含最后一个）
    println(list1.reverse)
    //取前（后）n个元素
    println(list1.take(2))
    println(list1.takeRight(2))
    //去掉前（后）n个元素
    println(list2.drop(1))
    println(list2.dropRight(2))
    println("============")
    val union = list1.union(list2)
    println(union)
    //set取并集会去重
    val set1 = Set(1,2,30)
    val set2 = Set(2,10)
    println(set1.union(set2))
    //交集
    val intersection = list1.intersect(list2)
    println(intersection)
    //差集
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)
    //拉链
    println("zip1: " + list1.zip(list2))
    println("zip2: " + list2.zip(list1))
    println("_______")
    //滑窗
    for(elem <- list2.sliding(3)){
      println(elem)
    }
    for(elem <- list2.sliding(2, 2)){
      println(elem)
    }
  }
}

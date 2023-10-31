package chapter07

import scala.collection.mutable

object test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 创建
    val set1: mutable.Set[Int] = mutable.Set(5,7,4)
    println(set1)
    println("-------")
    // 添加元素
    val set2 = set1 + 10
    println(set1)
    println(set2)

    set1 += 10
    println(set1)
    println("------")

    val flag1 = set1.add(20)
    println(flag1)
    println(set1)
    val flag2 = set1.add(20)
    println(flag2)
    println(set1)
    println("---------------")
    // 删除元素
    set1 -= 10
    println(set1)
    println("------")

    val flag3 = set1.remove(20)
    println(flag3)
    println(set1)
    val flag4 = set1.remove(20)
    println(flag4)
    println(set1)
    println("=======")
    // 合并set
    val set3 = mutable.Set(1,5,9)
    set1 ++= set3
    println(set1)
    println(set3)
  }
}

package chapter07

import scala.collection.mutable.ListBuffer

object test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(10,11,12,13)
    println(list1)
    println(list2)
    //添加元素
    list1.append(1,4,5)
    list2.prepend(9)
    list1.insert(1,2,3)
    println(list1)
    println(list2)
    println("--------")
    7 +=: 8 +=:  list2 += 14 += 15
    println(list2)
    println("---------")
    // 合并列表 ++=   ++=:
    list1 ++=: list2
    println(list1)
    println(list2)
    println("----------")
    // 修改元素
    list2(5) = 6
    println(list2)
    list2.update(0,100)
    println(list2)
    // 移除元素
    list2.remove(0)
    println(list2)
    list2 -= 11
    println(list2)
  }
}

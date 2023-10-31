package chapter07

import scala.collection.mutable

object test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 10, "b" -> 20, "c" -> 30)
    println(map1)
    println(map1.getClass)
    println("-------")
    //添加元素
    map1.put("d", 40)
    map1.put("e", 50)
    println(map1)
    map1 += ("f" -> 60)
    println(map1)
    //删除元素
    println(map1("a"))
    map1.remove("a")
    println(map1.getOrElse("a", 0))
    map1 -= "f"
    println(map1)
    map1.update("l" , 90)
    println(map1)
    println("============")
    //合并
    val map2: Map[String, Int] = Map("aa" -> 1, "bb" -> 2, "cc" -> 3)
    map1 ++= map2
    println(map1)

  }
}

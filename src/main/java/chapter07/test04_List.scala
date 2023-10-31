package chapter07

object test04_List {
  def main(args: Array[String]): Unit = {
    //创建一个List
    val list1 = List(1,2,3)
    println(list1)
    //访问和遍历元素
    println(list1(1))
    list1.foreach(println)
    //添加元素
    val list2 = 10 +: list1
    val list3 = list1 :+ 20
    println(list2)
    println(list3)
    val list4 = 12 :: 13 :: 14 :: Nil
    println(list4)
    val list5 = list3 :: list4
    println(list5)
    // ++  :::
    val list6 = list4 ::: list3
    println(list6)
    val list7 = list3 ++ list4
    println(list7)
  }
}

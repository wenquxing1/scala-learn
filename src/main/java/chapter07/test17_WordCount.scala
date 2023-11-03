package chapter07

object test17_WordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List("hello scala", "hello java", "hello hadoop", "hello scala")
    val wordList1: List[Array[String]] = stringList.map(_.split(" "))
    for (elem <- wordList1) {
      println(elem.mkString("-"))
    }
    val wordList2 = wordList1.flatten  // ( ("hello", "scala"),(""),())
    println(wordList1)
    println(wordList2)
    println("===========")
    val wordList3 = stringList.flatMap(_.split(" "))
    println(wordList3)
    val groupMap: Map[String, List[String]] = wordList3.groupBy(word => word)
    println(groupMap)
    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
    val sortList: List[(String, Int)] = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(sortList)
  }
}

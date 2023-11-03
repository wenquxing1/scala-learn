package chapter07

object test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList = List(("hello scala", 2), ("hello spark", 2), ("hello java", 3))
    val newStringList: List[String] = tupleList.map(kv => {
      (kv._1.trim + " ") * kv._2
    })
    println(newStringList)

    val wordCountList: List[(String, Int)] = newStringList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.size))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(wordCountList)

    //基于预处理的结果进行转换
    //将字符串打散为单词并结合个数成为元组
    val preCountList: List[(String, Int)] = tupleList.flatMap(
      tuple => {
        val strings: Array[String] = tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }
    )
    println(preCountList)
    val preCountMap = preCountList.groupBy(_._1)
    println(preCountMap)
    println("==============")
    val countMap: Map[String, Int] = preCountMap.mapValues(
      tupleList1 => tupleList1.map(_._2).sum
    )
    println(countMap)
    val countList = countMap.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    println(countList)
  }
}

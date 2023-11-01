package chapter07

object test14_HighLevelFunction {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    //过滤
    val evenList = list.filter( (elem: Int) => {elem % 2 == 0})
    println(evenList)
    println(list.filter(_ % 2 == 1))
    //map
    println(list.map(_ * 2))
    println(list.map(x => x * x))
    //扁平化
    val nestedList: List[List[Int]] = List(List(1,2,3), List(4,5,6))
    val flatList = nestedList(0) ::: nestedList(1)
    println(flatList)
    val flatlist2 = nestedList.flatten
    println(flatlist2)
    //扁平映射
    val strings: List[String] = List("hello world", "hello scala", "hello hadoop","hello world")
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    val flattenList = splitList.flatten
    println(flattenList)
    println("----------")
    val flatmapList = strings.flatMap(_.split(" "))
    println(flatmapList)
    //分组
    val groupMap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupMap2: Map[String, List[Int]] = list.groupBy(data => if (data % 2 == 0) "偶数" else "奇数")
    println(groupMap)
    println(groupMap2)
    println("-------------")
    val wordList = List("word", "jia", "aa", "wen")
    println(wordList.groupBy(_.charAt(0)))
  }
}

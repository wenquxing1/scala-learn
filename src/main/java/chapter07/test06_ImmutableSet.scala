package chapter07

object test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 创建set
    val set1 = Set(1,2,4,5,3,2)
    println(set1)
    println("--------")
    // 添加元素
    val set2 = set1.+(10)
    println(set1)
    println(set2)
    println("-------")
    // 合并集合
    val set3 = Set(1,4,3,59)
    val set4 = set2 ++ set3
    println(set3)
    println(set4)
    println("-------")
  }
}

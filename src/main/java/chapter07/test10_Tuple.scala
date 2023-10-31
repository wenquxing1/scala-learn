package chapter07

object test10_Tuple {
  def main(args: Array[String]): Unit = {
    //创建元组
    val tuple1: (String, Int, Char, Boolean) = ("hi", 10, 'a', true)
    println(tuple1)
    //访问数据
    println(tuple1._1)
    println(tuple1._4)
    println("===========")
    for(elem <- tuple1.productIterator)
      println(elem)
  }
}

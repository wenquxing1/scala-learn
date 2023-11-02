package chapter07

object test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    //reduce
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))
    println("================")
    val list2 = List(2,4,6,10)
    println(list2.reduce(_ - _))
    println(list2.reduceRight(_ - _))  // 2-(4-(6-10))
    println("=================")
    //fold
    println(list.fold(10)(_ + _))
    println(list.foldLeft(10)(_ - _))
    println(list.foldRight(10)(_ - _))  // 1-(2-(3-(4-10)))
  }
}

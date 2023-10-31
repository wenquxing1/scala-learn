package chapter07

object test03_MulArray {
  def main(args: Array[String]): Unit = {
    // 创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)
    // 访问元素
    array(0)(2) = 10
    array(1)(0) = 11

    for(i <- array.indices; j <- array(i).indices){
      print(array(i)(j) + "\t")
      if(j == array(i).length - 1) println()
    }
    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))
  }
}

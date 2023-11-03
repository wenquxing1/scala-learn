package chapter07

object test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](5)
    val arr1 =  Array(1,2,3)
    println(arr1)

    println(arr(4))
    println(arr1(2))

    arr(0) = 10
    arr(4) = 40
    println(arr(0))
    println(arr(4))
    println("========")
    for(i <- 0 until arr.length){
      println(arr(i))
    }
    for(i <- arr.indices) println(arr(i))
    for(elem <- arr1) println(elem)
    println("-------")
    // 通过迭代器
    val iter = arr1.iterator
    while (iter.hasNext){
      println(iter.next())
    }
    println("-------------")
    // 调用foreach方法
    arr1.foreach((elem1: Int) => println(elem1))
    arr.foreach(println)

    println(arr1.mkString("-"))
    println("-----------")
    // 添加元素
    val newArr = arr1.:+(50)
    println(arr1.mkString("="))
    println(newArr.mkString("-"))

    val newArr1 = newArr.+:(5)
    println(newArr1.mkString("="))

    val newArr2 = newArr1 :+ 3
    val newArr3 = 1 +: 2 +: newArr2 :+ 100 :+ 200
    println(newArr3.mkString(","))
  }
}

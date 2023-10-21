package chapter03

object test_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1,2,3,4)
    def arrayOperation(array: Array[Int], op: Int=>Int): Array[Int] = {
      for(elem <- array) yield op(elem)
    }
    def addOne(elem: Int): Int = {
      elem + 1
    }
    val newArray: Array[Int] = arrayOperation(arr, addOne)
    println(newArray.mkString(","))

    val newArray2 = arrayOperation(arr, _ * 3)
    println(newArray2.mkString("-"))
  }
}

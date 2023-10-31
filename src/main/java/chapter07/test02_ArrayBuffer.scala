package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr1 = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(2,4,6)

    println(arr1)
    println(arr2)

    println(arr2(1))
    println("----------")
    //增加元素
    val newArr1 = arr1 :+ 10
    println(arr1)
    println(newArr1)
    println("=========")
    arr1.append(100)
    println(arr1)
    arr1.insertAll(1, arr2)
    println(arr1)
    arr1.prependAll(arr2)
    println(arr1)
    //删除元素
    arr1.remove(3)
    println(arr1)
    arr1.remove(1,3)
    println(arr1)
    arr1 -= 4
    println(arr1)
    // 数组类型的转换    可变 -> 不可变
    val arr: ArrayBuffer[Int] = ArrayBuffer(10,20,30)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString("-"))
    println(arr)
    // 不可变 -> 可变
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)
  }
}

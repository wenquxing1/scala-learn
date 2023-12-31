package chapter07

import scala.collection.convert.ImplicitConversions.`map AsJavaMap`
import scala.collection.mutable

object test16_MapMerge {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)
    println(map1 ++ map2)
    println("-------------")
    val map3 = map1.foldLeft(map2)(
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value
        mergedMap
      }
    )
    println(map3)
  }
}

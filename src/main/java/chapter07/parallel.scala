package chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

object parallel {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread().getId
    )
    println(result)
    //并行
    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread().getId
    )
    println(result2)
  }
}

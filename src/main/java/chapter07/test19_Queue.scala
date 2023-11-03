package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

object test19_Queue {
  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[String]()
    queue.enqueue("a", "b", "c")
    println(queue)
    println(queue.dequeue())
    println(queue)
    //不可变队列
    val queue2 = Queue("d", "e", "f")
    queue2.enqueue("g")
    println(queue2)
    val queue3 = queue2.enqueue("k")
    println(queue3)
  }
}

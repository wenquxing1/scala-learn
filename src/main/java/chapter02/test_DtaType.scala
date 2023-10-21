package chapter02

object test_DtaType {
  def main(args: Array[String]): Unit = {
    //(byte, short) 和char之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
    val c3: Byte = b3.toByte
    println(c3)
  }
}

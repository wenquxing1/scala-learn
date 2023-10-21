package chapter02

object test_DataType_problem {
  def main(args: Array[String]): Unit = {
    val a: Int = 130
    val b: Byte = a.toByte
    println(b)

    var s1 = "abc"
    var s2 = new String("abc")
    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2))
  }
}

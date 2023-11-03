package chapter08

object test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    val x: Int = 6
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case 4 => "four"
      case _ => "hhh"
    }
    println(y)

    val a: Int = 10
    val b: Int = 3
    def matchDual(op: Char) = op match {
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case '+' => a + b
      case '-' => a - b
      case _ => -1
    }

    println(matchDual('+'))
    println(matchDual('*'))
    println(matchDual('\\'))
    //模式守卫
    def abs(num: Int): Int = {
      num match{
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(-2))
    println(abs(100))
  }
}

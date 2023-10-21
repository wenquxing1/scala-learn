package chapter03

object test_Funvtion_Parameter {
  def main(args: Array[String]): Unit = {
//    def f1(str: String*): Unit = {
//      println(str)
//    }
//    f1("jia")
//    f1("jia","wen","qu")
    def f2(str1: String, str2: String*): Unit = {
      println("s1:" + str1 + "s2:" + str2)
    }
//    f2("jia","wen", "hao")
    def f3(str3: String = "jia"): Unit = {
      println("my name is:"+str3)
    }
    f3("wenquxing")
    f3()
  }
}

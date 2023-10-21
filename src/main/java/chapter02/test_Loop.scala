package chapter02

import scala.util.control.Breaks

object test_Loop {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10){
//      println(i)
//    }
//    for(i <- 1.to(5)){
//      println(s"${i} jj")
//    }
//    for(i <- 1 to 3){
//      printf("jia is %d\n",i)
//    }
//    for(i <- new Range(1,5,1)){
//      println(i)
//    }
//    for(i <- Range(1,3)){
//      println(i)
//    }
//    for(i <- 1 until 6){
//      printf("jia is %d\n", i)
//    }
//    for(i <- Array(12,2,3)){
//      println(i)
//    }
//    for(i <- List(1,"AD",23)){
//      println(i)
//    }
//    for(i <- Set("as","ads",1)){
//      println(i)
//    }
//    for(i <- 1 to 6 if i != 2){
//      printf("%d %d\n",i,i)
//    }
//    for(i <- 1 until 8 by 2){
//      println(s"${i} hh")
//    }
//    for(i <- 20 to 10 by -3){
//      println(i)
//    }
//    for(i <- 10 to 1 reverse){
//      println(i)
//    }
//    for(i <- 1 to 5 reverse){
//      println(i)
//    }
//    for(data <- 1.0 to 5.0 by 0.3){
//      println((data))
//    }
//    for(i <- 1 to 3; j <- 1 to 2){
//      println("i="+i, "j="+j)
////    }
//    for(i <- 1 to 9){
//      for(j <- 1 to i){
//        print(s"${j} * ${i} = ${j * i}\t")
//      }
//      println()
//    }
//

//    for(i <- 1 to 9){
//      val stars = 2 * i - 1
//      val spaces = 9 - i
//      println(" " * spaces + "*" * stars)
//    }
//    val b = for(i <- 1 to 6) yield i
//    println(b)

//    Breaks.breakable(
//      for(i <- 1 to 5){
//        println(i)
//        if(i == 3) Breaks.break()
//      }
//    )
    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(s"${j} * ${i} = ${j * i}\t")
      }
      println()
    }


  }
}

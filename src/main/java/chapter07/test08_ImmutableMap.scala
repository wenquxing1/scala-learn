package chapter07

object test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    //创建map
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 2, "hello" -> 3)
    println(map1)
    println(map1.getClass)
    //遍历元素
    map1.foreach(println)
    map1.foreach( (kv: (String, Int)) => println(kv))
    println("==========")
    //获取map中所有的key或value
    for(key <- map1.keys){
      println(s"key -- ${map1.get(key)}")
    }
    //访问某一个key的value
    println(map1.get("a").get)
    println(map1.get("c"))
    println(s"c: ${map1.getOrElse("c", 0)}")
  }
}

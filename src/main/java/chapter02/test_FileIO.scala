package chapter02

import java.io.{File, PrintWriter}
import scala.io.{BufferedSource, Source}

object test_FileIO {
  def main(args: Array[String]): Unit = {
    Source.fromFile("src/main/resources/input.txt").foreach(print)

    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("helloooooo")
    writer.close()

  }
}

package cn.demo.advance.implic

import java.io.File

import scala.io.Source

/**
  * @author y15079
  * @create 2018-03-04 13:41
  * @desc
  **/

class RichFile(val f: File){
    def read() = Source.fromFile(f).mkString
}

object RichFile {
  def main(args: Array[String]): Unit = {
    val f = new File("D:\\IDEA\\ScalaDemo\\src\\main\\resources\\words.txt")
    //装饰，显示的增强
    //val contents = new RichFile(f).read()
    import MyPredef.fileToRichFile
    val contexts = f.read()
    println(contexts)
  }
}

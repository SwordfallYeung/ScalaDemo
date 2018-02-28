package cn.itcast.demo.classObjectInherit06.Class

import scala.io.Source

/**
  * @author y15079
  * @create 2018-02-28 13:13
  * @desc
  **/
class MissRight {
//在new的时候主构造器里面的内容会被执行
  val name = "abc"

  println(name)

  def sayHi : Unit = { //里面的内容不会执行，方法只会被加载，只有调用才执行
    println("hi ")
  }

  println(123)

  //读取文件
   try {
     val contents = Source.fromFile("D:\\IDEA\\ScalaDemo\\.gitignore").mkString
     println(contents)
   } catch {
     case e:Exception => e.printStackTrace()
   } finally {
     println("finally")
   }
}

object MissRight{
  def main(args: Array[String]): Unit = {
    val m = new MissRight
    m.sayHi
  }
}

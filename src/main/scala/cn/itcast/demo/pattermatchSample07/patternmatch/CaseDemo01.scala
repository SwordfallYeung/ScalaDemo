package cn.itcast.demo.pattermatchSample07.patternmatch

import scala.util.Random

/**
  * @author y15079
  * @create 2018-02-28 16:41
  * @desc
  **/
object CaseDemo01 extends App {
  val arr = Array("YoshizawaAkiho","Yuihatano","AoiSola")
  val name = arr(Random.nextInt(arr.length))
  println(name)
  name match { //_为其它
    case "YoshizawaAkiho" => println("hello")
    case "Yuihatano" => println("world")
    case _ => println("hello world")
  }
}

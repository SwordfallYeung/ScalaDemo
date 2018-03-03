package cn.demo.basic.pattermatchSample07.patternmatch

import scala.util.Random

/**
  * @author y15079
  * @create 2018-02-28 16:51
  * @desc 根据类型匹配
  **/
object CaseDemo02 extends App {

  val arr = Array("hello", 1, -2.0, CaseDemo02)
  val elem = arr(Random.nextInt(arr.length))

  println(elem)

  elem match {
    case x: Int => println("Int " + x)
    case y: Double if(y >= 0) => println("Double " + y)
    case z: String => println("String " + z)
    case _ => throw new Exception("not match exception")
  }
}

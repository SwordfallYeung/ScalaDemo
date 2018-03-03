package cn.demo.basic.pattermatchSample07.patternmatch

/**
  * @author y15079
  * @create 2018-02-28 16:57
  * @desc 数组匹配，集合匹配，元组匹配
  **/
object CaseDemo03 extends App {

  //数组匹配
  /*val arr = Array(0, 1, 5)
  arr match {
    case Array(1, x, y) => println(x + " " + y)
    case Array(0, 1, 5) => println("only 0")
    case Array(0, _*) => println("0.....")
    case _ => println("something else")
  }*/

  //List匹配 Nil为空
  /*val lst = List(0, 3, 111)
  //val lst = List(0, 3)
  lst match {
    case 0 :: Nil => println("only 0")
    case x :: y :: Nil => println(s"x: $x , y: $y")
    case 0 :: a => println(s"0.... $a")
    case _ => println("something else")
  }*/

  //元组匹配
  val tup = (1, 3, 5)
  //val tup = (6, 3, 5)
  tup match {
    case (1, x, y) => println(s"hello 123 $x $y")
    case (_, z, 5) => println(z)
    case _ => println("else")
  }
}

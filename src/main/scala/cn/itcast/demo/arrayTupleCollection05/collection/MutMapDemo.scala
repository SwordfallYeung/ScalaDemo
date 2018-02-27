package cn.itcast.demo.arrayTupleCollection05.collection

import scala.collection.mutable

/**
  * @author y15079
  * @create 2018-02-27 16:02
  * @desc 可变的map
  **/
object MutMapDemo extends App {
  val map1 = new mutable.HashMap[String, Int]()
  //向map中添加数据
  map1("spark") = 1
  map1 += (("hadoop", 2)) //添加元组
  map1.put("storm", 3)

  //从map中移除元素
  map1 -= "spark"
  map1.remove("hadoop")
  println(map1)
}

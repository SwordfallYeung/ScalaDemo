package cn.demo.basic.arrayTupleCollection05.collection

import scala.collection.immutable.HashSet

/**
  * @author y15079
  * @create 2018-02-27 15:51
  * @desc 不可变set
  **/
object ImmutSetDemo extends App {
  val set1 = new HashSet[Int]()
  //将元素和set合并生成一个新的set，原有set不变
  val set2 = set1 + 4
  //set中元素不能重复
  val set3 = set1 ++ Set(5,6,7)
  val set0 = Set(1,3,4) ++ set1
  println(set0.getClass)
}

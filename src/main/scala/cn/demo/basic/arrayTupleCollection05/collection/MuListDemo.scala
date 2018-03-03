package cn.demo.basic.arrayTupleCollection05.collection

import scala.collection.mutable.ListBuffer

/**
  * @author y15079
  * @create 2018-02-27 15:41
  * @desc 可变序列List
  **/
object MuListDemo {
  def main(args: Array[String]): Unit = {
     //构建一个可变列表，初始有3个元素1，2，3
    val list0 = ListBuffer[Int](1,2,3)
    //创建一个空的可变列表
    val list1 = new ListBuffer[Int]
    //向list1中追加元素，注意：没有生成新的集合
    list1 += 4
    list1.apply(5)

    //将list1中的元素添加到list0中，注意：没有生成新的集合
    list0 ++= list1

    //将list0和list1合并成一个新的ListBuffer 注意：生成了一个新的集合
    val list2 = list0 ++ list1

    //将元素追加到list0的后面生成一个新的集合
    val list3 = list0 :+ 5
  }
}

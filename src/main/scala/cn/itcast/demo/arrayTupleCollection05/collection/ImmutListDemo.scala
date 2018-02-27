package cn.itcast.demo.arrayTupleCollection05.collection

/**
  * @author y15079
  * @create 2018-02-27 15:17
  * @desc 序列List
  *      ::操作符是将给定的头和尾创建一个新的列表
  *      ::操作符是右结合的如  9::5::2::Nil 相当于 9::(5::(2::Nil))
  **/
object ImmutListDemo {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的集合
    val list1 = List(1,2,3)
    //将0插入到list1的前面生成一个新的List
    val list2 = 0 :: list1
    val list3 = list1.::(0) //::这时为方法

    val list4 = 0 +: list1
    val list5 = list1.+:(0)

    //将一个元素添加到list1的后面产生一个新的集合
    val list6 = list1 :+ 3

    val list0 = List(4,5,6)
    //将2个list合并成一个新的List
    val list7 = list1 ++ list0
    //将list1插入到list0前面生成一个新的集合
    val list8 = list1 ++: list0

    //将list0插入到list1前面生成一个新的集合
    val list9 = list1.::(list0)

    println(list9)

    //创建一个List
    val lst0 = List(1,7,9,8,0,3,5,4,6,2)
    //将lst0中每个元素乘以10后生成一个新的集合
    val lst1 = lst0.map( x => x * 10)
    //将lst2中的偶数取出来生成一个新的集合
    val lst2 = lst0.filter(x => x % 2 == 0)
    //将lst0排序后生成一个新的集合
    val lst3 = lst0.sorted
    val lst4 = lst0.sortBy(x => x)
    val lst5 = lst0.sortWith((x,y) => x < y)
    //反转顺序
    val lst6 = lst3.reverse
    //将lst0中的元素4个一组，类型为Iterator[List[Int]]
    val it = lst0.grouped(4)
    //将Iterator转换成List
    val lst7 = it.toList
    //将多个List压扁成一个List
    val lst8 = lst7.flatten

    //先按空格切分，再压平
    val a = Array("a b c", "d e f", "h i j")
    a.flatMap(_.split(" "))
  }
}

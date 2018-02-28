package cn.itcast.demo.classObjectInherit06.Object

/**
  * @author y15079
  * @create 2018-02-28 13:26
  * @desc 单例对象
  **/
object SingletonDemo {
  def main(args: Array[String]): Unit = {
    val s = SingletonDemo

    println(s)

    val b = SingletonDemo

    println(b)
  }
}

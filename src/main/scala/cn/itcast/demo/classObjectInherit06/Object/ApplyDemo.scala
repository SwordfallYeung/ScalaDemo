package cn.itcast.demo.classObjectInherit06.Object

/**
  * @author y15079
  * @create 2018-02-27 17:24
  * @desc 在类的伴生对象中定义apply方法，当遇到类名(参数1,...参数n)时，apply方法会被调用
  **/
class ApplyDemo{

}

object ApplyDemo {

  //调用了Array伴生对象的apply方法
  def apply (): Unit = {
    println("apply invoked")
  }

  def apply (test:Int): ApplyDemo = {
    //println("apply invoked")
    new ApplyDemo
  }

  def apply (name : String): Unit = {
    println(name)
  }

  def main(args: Array[String]): Unit = {

    val a = ApplyDemo()
    println(a)

    val a1 = ApplyDemo("123")

    //仿照val arr1 = Array(5) 在apply方法里面new Array
    val a2 = ApplyDemo(2)
    val a3 = ApplyDemo(2)
    println(a2)
    println(a3)
  }

}

package cn.demo.basic.classObjectInherit06.Class

/**
  * @author y15079
  * @create 2018-02-28 16:02
  * @desc 重载构造器
  **/
class Cat {

  var name: String = "123123"

  def this(name: String){
    //println("123") 会报错，必须第一时间第一行调用主构造器
    this()
    this.name = name
  }
}

object Cat{
  def main(args: Array[String]): Unit = {
    val c = new Cat("it")
    println(c.name)
  }
}

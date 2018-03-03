package cn.demo.basic.classObjectInherit06.Object

/**
  * @author y15079
  * @create 2018-02-27 17:13
  * @desc 伴生对象
  *
  *      在Scala中，与类名相同的对象叫做伴生对象，类和伴生对象之间可以相互访问私有的方法和属性
  **/
class Dog {
   val id = 1
  private var name = "itcast"

  def printName() : Unit ={
    //在Dog类中可以访问伴生对象Dog的私有属性
    println(Dog.CONSTANT + name)
  }
}

/**
  * 伴生对象
  */
object Dog{

  //伴生对象中的私有属性
  private val CONSTANT = "汪汪汪 : "

  def main(args: Array[String]): Unit = {
    val p = new Dog
    //访问私有的字段name
    p.name = "123"
    p.printName()
  }
}
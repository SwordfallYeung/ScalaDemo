package cn.itcast.demo.classObjectInherit06.Inherit

/**
  * @author y15079
  * @create 2018-02-27 18:46
  * @desc 继承中的抽象与接口，抽象是模板样式，接口是行为规范，都没有方法体，抽象和接口里面的方法都需要重写，但是接口的方法重写需要加override
  **/
object ClazzDemo {
  def main(args: Array[String]): Unit = {
    val h = new Human
    println(h.fight())
  }
}

//接口
trait Flyable{
  def fly(): Unit = {
    println("I can fly")
  }

  def fight(): String
}

//抽象类
abstract class Animal{
  def run(): Int
  val name: String
}

class Human extends Animal with Flyable{
  val name = "abc"

  //打印几次"ABC"？
  val t1,t2,(a,b,c) = {
    println("ABC")
    (1,2,3)
  }

  println(a)
  println(t1._1)

  //在Scala中重写一个非抽象方法必须用override修饰
  override def fight(): String = {
    "fight with monster"
  }

  //在子类中重写超类的抽象方法时，不需要使用override关键字，写了也可以
  def run(): Int = {
    1
  }
}
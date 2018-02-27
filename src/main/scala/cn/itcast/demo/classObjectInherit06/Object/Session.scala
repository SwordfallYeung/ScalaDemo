package cn.itcast.demo.classObjectInherit06.Object

import scala.collection.mutable.ArrayBuffer

/**
  * @author y15079
  * @create 2018-02-27 17:03
  * @desc 单例对象
  *
  *      在Scala中没有静态方法和静态字段，但是可以使用object这个语法结构来达到同样的目的
  *      1.存放工具方法和常量
  *      2.高效共享单个不可变的实例
  *      3.单例模式
  **/
class Session {

}

object SessionFactory {
  //该部分相当于java中的静态块
  var counts = 5
  val sessions = new ArrayBuffer[Session]()
  while (counts > 0 ){
    sessions += new Session
    counts -= 1
  }

  //在object中的方法相当于java中的静态方法
  def getSession(): Session = {
    sessions.remove(0)
  }
}

object SingletoDemo {
  def main(args: Array[String]): Unit = {
    //单例对象，不需要new，用【类名.方法】调用对象中的方法
    val session = SessionFactory.getSession()
    println(session)
  }
}



package cn.demo.advance.func

/**
  * @author y15079
  * @create 2018-03-03 22:27
  * @desc
  **/
object Highfunc {

  //函数第一种写法
  val func1: Int => Int = {x => x * x}

  //函数第二种写法, 比较像柯理化，但是没有def
  val fun2 = (x: Int) => {x * x}

  //方法
  def multiply(x: Int): Int = x * x

  //柯理化第一种写法
  def m1(x: Int)(y: Int) = x * y
  //柯理化第二种写法
  def m2(x: Int) = (y: Int) => x * y

  //柯理化
  def multi = (x: Int) => {x * x}

  //multi等同于下面
 /* def multi() = (x: Int) => {
    x * x
  }*/

  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5)

    val a1 = arr.map(multi)

    println(a1.toBuffer)
  }
}

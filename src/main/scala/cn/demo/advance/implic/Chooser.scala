package cn.demo.advance.implic

/**
  * @author y15079
  * @create 2018-03-04 17:11
  * @desc
  **/
//视图界定
//view bound 他必须传进去一个隐式转换的函数
/*class Chooser[T <% Ordered[T]] {

  def choose(first: T, second: T) : T = {
    if (first > second) first else second
  }
}*/

//上下文界定
//他必须传进去一个隐式转换的值
class Chooser[T : Ordering] {

  def choose(first: T, second: T) : T = {
    val ord = implicitly[Ordering[T]]
    if (ord.gt(first, second)) first else second
  }
}

object Chooser{
  def main(args: Array[String]): Unit = {
      import MyPredef._
      val c = new Chooser[Girl]
      val g1 = new Girl("anglebaby", 90)
      val g2 = new Girl("hatano", 999)

      val g = c.choose(g1, g2)
       println(g.name)
  }
}
package cn.itcast.demo.pattermatchSample07.sample

/**
  * @author y15079
  * @create 2018-02-28 21:57
  * @desc 被包在花括号内没有match的一组case语句是一个偏函数，
  *      它是PartialFunction[A,B]的一个实例，A代表参数类型，B代表返回类型，常用作输入模式匹配
  **/
object PartialFunction {
  def func1: PartialFunction[String ,Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  //偏函数简写为以下

  def func2(num: String) : Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(func1("one"))
    println(func2("one"))
  }
}

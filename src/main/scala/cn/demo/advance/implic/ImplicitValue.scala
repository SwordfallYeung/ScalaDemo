package cn.demo.advance.implic

/**
  * @author y15079
  * @create 2018-03-04 13:25
  * @desc
  **/
//所有的隐式值和隐式方法必须放到object
object Context {
  implicit val a = "laozhao"
  implicit val i = 1
}

object ImplicitValue {

  def sayHi()(implicit name:String = "landuan"): Unit = {
    println(s"hi $name")
  }

  def main(args: Array[String]): Unit = {
    import Context._
    sayHi()
    sayHi()("123")
  }
}

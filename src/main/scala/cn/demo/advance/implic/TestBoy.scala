package cn.demo.advance.implic

/**
  * @author y15079
  * @create 2018-03-04 17:06
  * @desc
  **/
object TestBoy {
  def main(args: Array[String]): Unit = {
    val b1 = new Boy("laoduan", 99)
    val b2 = new Boy("laozhao", 999)

    val arr = Array(b1, b2)
    val sorted = arr.sortBy(x => x).reverse
    for (b <- sorted){
      println(b.name)
    }
  }
}

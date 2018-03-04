package cn.demo.advance.implic

/**
  * @author y15079
  * @create 2018-03-04 14:51
  * @desc
  **/
class Pair[T<: Comparable[T]] {
  def bigger(first: T,second: T): T = {
    if (first.compareTo(second) > 0) first else second
  }
}

object Pair {
  def main(args: Array[String]): Unit = {
    val p = new Pair[String]
    println(p.bigger("hadoop","spark"))

    val b = new Pair[Integer]
    println(b.bigger(1,2))
  }
}

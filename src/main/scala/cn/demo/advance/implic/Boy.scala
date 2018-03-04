package cn.demo.advance.implic

/**
  * @author y15079
  * @create 2018-03-04 17:04
  * @desc
  **/
class Boy(val name:String, var faceValue:Int)extends Comparable[Boy]{
  override def compareTo(o: Boy): Int = {
    this.faceValue - o.faceValue
  }
}

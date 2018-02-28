package cn.itcast.demo.classObjectInherit06.Class

/**
  * @author y15079
  * @create 2018-02-28 13:05
  * @desc gender: String : private[this]
  **/
class People(val id: String, var name: String, gender: String, var age: Int = 18){

}

object People{
  def main(args: Array[String]): Unit = {
    val p = new People("123", "babc", "f", 20)

    println(p.id)
    p.name = "itcast"
    println(p.name)
    //println(p.gender) 获取不到gender为private[this]类型
  }
}

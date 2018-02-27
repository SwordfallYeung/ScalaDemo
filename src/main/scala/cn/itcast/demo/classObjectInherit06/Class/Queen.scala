package cn.itcast.demo.classObjectInherit06.Class

/**
  * @author y15079
  * @create 2018-02-27 16:40
  * @desc 构造参数可以不带val或var, 如果不带val或var的参数至少被一个方法所使用，
  *      那么它将会被提升为字段
  *      在类名后面加private就变成了私有的
  **/
class Queen private(val name: String , prop: Array[String], private var age: Int = 18){
  println(prop.size)

  //prop被下面的方法使用后，prop就变成了不可变得对象私有字段，等同于private[this] val prop
  //如果没有被方法使用该参数将不被保存为字段，仅仅是一个可以被主构造器中的代码访问的普通参数
  def description = name +" is " + age + " years old with " + prop.toBuffer
}

object Queen{
  def main(args: Array[String]): Unit = {
    //私有的构造器，只有在其半生对象中使用
    val q = new Queen("hadoop", Array("蜡烛", "皮鞭"), 20)
    println(q.description)
  }
}

package cn.itcast.demo.classObjectInherit06.Class

/**
  * @author y15079
  * @create 2018-02-27 16:24
  * @desc 在Scala中，类并不用声明为public
  *      Scala源文件中可以包含多个类，所有这些类都具有公有可见性
  **/
class Person {
  //用val修饰的变量是只读属性，有getter没有setter
  //（相当与Java中用final修饰的变量）
  val id = "9527"

  //用var修饰的变量既有getter又有setter
  var age: Int = 18

  var gender = "0"

  //类私有字段，只能在类的内部使用
  private var name: String = "华安"

  //对象私有字段，访问权限更加严格的，Person类的方法只能访问到当前对象的字段
  private[this] val pet = "小强"

  private[this] var pop: String = _ //_没有被初始化 不能用于伴生对象和外部对象，只能在当前类中的方法中使用

  def printPop : Unit ={
    println(pop)
  }

}

//伴生对象，里面定义一些静态方法和常量
object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.id + " " + p.name)
    p.name  = "小白"
    println(p.id + " " + p.name)

    println(p.gender)
    p.gender = "男"
    println(p.gender)

    println(p.printPop)
  }
}

//private[itcast] 只能在包itcast中使用 private为私有构造器，不能被外部使用，可以用于伴生对象
/*private[itcast] class Cat private{

}*/

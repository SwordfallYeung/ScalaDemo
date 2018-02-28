package cn.itcast.demo.classObjectInherit06.Inherit

/**
  * @author y15079
  * @create 2018-02-28 16:09
  * @desc
  **/
class Chinese extends Mankind with Creature with Monkey {
  override def run(): Unit = {
    println("run")
  }
}

object Chinese{
  def main(args: Array[String]): Unit = {
    val c = new Chinese
    c.run()
  }
}


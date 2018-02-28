package cn.itcast.demo.classObjectInherit06.Inherit

/**
  * @author y15079
  * @create 2018-02-28 16:07
  * @desc trait相当于java中的接口interface
  **/
trait Creature {
    def run(): Unit = {
        println("Animal run")
    }
}

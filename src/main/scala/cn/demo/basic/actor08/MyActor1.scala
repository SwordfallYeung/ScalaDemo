package cn.demo.basic.actor08

import scala.actors.Actor

/**
  * @author y15079
  * @create 2018-02-28 22:36
  * @desc Scala Actor多线程并发编程
  *      Actor相当于Java中的Thread
  *      Actor已被遗弃，被Akka取代，但是还是有必要学习的
  **/
object MyActor1 extends Actor{
  //重写act方法，相当于java中的runnable
  override def act(): Unit = {
    for (i <- 1 to 10){
      println("actor-1 " + i)
      Thread.sleep(1000)
    }
  }
}

object MyActor2 extends Actor{
  //重写act方法，相当于java中的runnable
  override def act(): Unit = {
    for (i <- 1 to 10){
      println("actor-2 " + i)
      Thread.sleep(1000)
    }
  }
}

object ActorTest extends App {
  //启动Actor
  MyActor1.start()
  MyActor2.start()
  println("main")
}

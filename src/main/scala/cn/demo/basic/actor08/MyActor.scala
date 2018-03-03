package cn.demo.basic.actor08

import scala.actors.Actor

/**
  * @author y15079
  * @create 2018-02-28 23:14
  * @desc 可以不断地接收消息
  **/
class MyActor extends Actor{
  override def act(): Unit = {
    while (true){
      receive { //receive是一个偏函数
        case "start" => {
          println("starting ...")
          Thread.sleep(1000)
          println(Thread.currentThread().getName)
          println("started")
        }
        case "stop" => {
          println("stopping ...")
          Thread.sleep(2000)
          println(Thread.currentThread().getName)
          println("stopped")
        }
      }
    }
  }
}

class YourActor extends Actor{
  override def act(): Unit = {
    loop{ //相当于while(true)，不断复用线程
      react{ //react相当于receiver
        case "start" => {
          println("starting ...")
          Thread.sleep(5000)
          println(Thread.currentThread().getName)
          println("started")
        }
        case "stop" => {
          println("stopping ...")
          Thread.sleep(8000)
          println(Thread.currentThread().getName)
          println("stopped ...")
        }
        case "exit" => {
          println("exiting ...")
          println(Thread.currentThread().getName)
          exit()
          println("exited")
        }
      }
    }
  }
}

object Boot{
  def main(args: Array[String]): Unit = {
//    val actor = new MyActor
//    actor.start()
//    actor ! "start" //!为方法 等同于actor.!("start")
//    actor ! "stop"
//    println("消息发送完成")

    val a3 = new YourActor
    a3.start()
    a3 ! "start"
    a3 ! "stop"
    Thread.sleep(10000)
    a3 ! "exit"
  }
}

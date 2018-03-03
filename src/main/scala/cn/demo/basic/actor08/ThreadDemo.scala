package cn.demo.basic.actor08

import java.util.concurrent.{Callable, Executors, Future}

/**
  * @author y15079
  * @create 2018-03-01 15:16
  * @desc
  **/
object ThreadDemo {
  def main(args: Array[String]): Unit = {
    val pool = Executors.newFixedThreadPool(5) //一共创建5个线程，当6时，出现没有线程可用，会等待一段时间，重用以前的线程。
    for (i <- 1 to 10){
      pool.execute(new Runnable {
        override def run(): Unit = {
          println(Thread.currentThread().getName)
          Thread.sleep(1000)
        }
      })
    }

    val f:Future[Int] = pool.submit(new Callable[Int] {
      override def call(): Int = {
        Thread.sleep(3000)
        100
      }
    })
    var status = f.isDone
    println(s"task status $status")

    Thread.sleep(10000)

    status = f.isDone
    println(s"task status $status")

    if (status){
      println(f.get())
    }
  }
}

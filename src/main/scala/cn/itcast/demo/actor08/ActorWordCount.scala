package cn.itcast.demo.actor08

import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * @author y15079
  * @create 2018-03-01 0:06
  * @desc Actor多线程并发运行，单机版wordcounts
  **/
class Task extends Actor{
  override def act(): Unit = {
    loop{
      react{
        case SubmitTask(filename) => {
          val result = Source.fromFile(filename).getLines().flatMap(_.split(" ")).map((_, 1)).toList.groupBy(_._1).mapValues(_.size)
          sender ! ResultTask(result)
        }
        case StopTask => {
          exit()
        }
      }
    }
  }
}

case class SubmitTask(filename: String)

case class ResultTask(result: Map[String, Int])

case object StopTask

object ActorWordCount {
  def main(args: Array[String]): Unit = {

    val replySet = new mutable.HashSet[Future[Any]]()
    val resultList = new ListBuffer[ResultTask]

    val files = Array[String]("D:\\IDEA\\ScalaDemo\\src\\main\\resources\\words.txt","D:\\IDEA\\ScalaDemo\\src\\main\\resources\\words.log")

    for (f <- files){
      val actor = new Task
      /*actor.start()
      actor !! SubmitTask(f)*/
      val reply = actor.start() !! SubmitTask(f) //或者
      replySet += reply
    }

    while (replySet.size > 0){
      val toCompute = replySet.filter(_.isSet)
      for (f <- toCompute){
        val result = f.apply().asInstanceOf[ResultTask]
        resultList += result
        replySet -= f
      }
      Thread.sleep(100)
    }

    //汇总的功能 reduce
    //List((hello, 5), (tom, 3), (hello, 2), (jerry, 2))
    val fr = resultList.flatMap(_.result).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
    println(fr)
  }
}

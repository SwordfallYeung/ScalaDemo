package cn.itcast.demo

/**
  * @author y15079
  * @create 2018-02-28 0:49
  * @desc 在Scala Shell上实现单机版的wordCount示例
  *
  *      foldLeft和foldRight直接翻译来向左折叠（向左相加，如 “(((1+2)+3)+4）”），向右折叠（向右相加，“(1+(2+(3+4)))”）。
  *
  *      fold支持par平行计算
  *      val a = Array(1,2,3)
  *      a.par.fold(10)(_+_) 并行计算（有4个线程，则加4次10） a.fold(10)(_+_)
  **/
object SingletonWordCount {
  val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
  lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
  lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse
}

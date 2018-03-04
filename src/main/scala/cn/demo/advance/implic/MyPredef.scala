package cn.demo.advance.implic

import java.io.File

/**
  * @author y15079
  * @create 2018-03-04 17:15
  * @desc
  **/
object MyPredef {
  implicit def fileToRichFile(f: File) = new RichFile(f)

  implicit def girl2Ordered(g: Girl) = new Ordered[Girl] {
    override def compare(that: Girl): Int = {
      g.faceValue - that.faceValue
    }
  }

  implicit val girl2Ordered = (g: Girl) => new Ordered[Girl] {
    override def compare(that: Girl): Int = {
      g.faceValue - that.faceValue
    }
  }

  //上下文界定的隐式转换的值 一种写法
  implicit val girl2Ordering = new Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }

  //上下文界定的隐式转换的值 另一种写法
  trait girl2Ordering extends Ordering[Girl] {
    override def compare(x: Girl, y: Girl): Int = {
      x.faceValue - y.faceValue
    }
  }

  implicit object Girl extends girl2Ordering
}
# ScalaDemo
一些关于Scala编程的基本学习知识

Scala是一种多范式的编程语言，其设计的初衷是要集成面向对象编程和函数式编程的各种特性。而Java是面向对象编程的。注意：还有种面向过程编程，注意区分！！！

Scala有Scala Shell，可以直接在上面写scala，而Java没有。

采用记事本的形式编写Scala程序，需要在该scala文件目录下将该scala文件编译为.class文件，例如，“使用命令编译scalac HelloScala.scala，然后使用命令运行scala HelloScala”，这与Java编写并运行Java文件类型类似。

Scala和Java一样，有7种数值类型Byte、Char、Short、Int、Long、Float和Double（无包装类型）和一个Boolean类型。

Scala中的+-/%等操作符的作用与Java一样，位操作符 &|^>><<也一样。只是有点不同，这些操作符实际上是方法。如a+b <=> a.+(b)

Scala中的方法和函数是不一样的，而Java中两者是一样的。

用def定义的都是方法且直接带有方法名，可以不带有传参参数，":"后面为返回值类型可写可不写（递归得写），用=引出方法体；如方法：def m1 ( x:Int，y:Int ): Int = x * y

而函数不直接带有函数名，必须带有传参参数，"=>"后面为返回值（得写，可以是表达式），也是用=引出函数体，函数可以作为参数传递；函数有两种写法，①传参参数带有变量名可以直接在返回值上（即=>后）写函数体的内容，如函数体：val func = (x: Int, y: Double) => (y, x)；②传参参数不带有变量名则需要写出完整的函数体。如函数体：val func1: Int => String = { x => x.toString }， val func2:(Int, Double) => (Double, Int) = {(x,y) => (y, x)}

方法可以通过下划线 _ 转换成函数。

yield关键字将原始的数组进行转换会产生一个新的数组，原始的数组不变

在Scala中，数组有常用的统计方法，如数组arr.sum，arr.max，arr.sorted等等

在Scala中，集合有三大类，序列List、集Set、映射Map，所有的集合都扩展Iterable特质。在Scala中集合有可变（mutable）和不可变（immutable）两种类型，immutable类型的集合初始化后就不能改变了

在Scala中创建Map的方式有两种，一种用箭头，一种用元组，如Map("tom"->85,"jerry"->99)，Map(("tom",85),("jerry",99))

Scala Actor并发编程: Actor在旧版本已被废弃，转而采用Akka。Scala中的Actor能够实现并行编程的强大功能，它是基于事件模型的并发机制，Scala是运用消息（message）的发送、接收来实现多线程的。相比Java的线程模型，Scala actor模型没有共享数据和锁，不会出现死锁问题，Actor方法执行顺序：首先调用start()，调用start()方法后其act()方法会被执行，最后向Actor发送消息。

Spark的RPC是通过Akka类库实现的，Akka用Scala语言开发，基于Actor并发模型实现。Akka具有高可靠、高性能、可扩展等特点，使用Akka可以轻松实现分布式RPC功能。

RPC 简单理解，不同Java进程间的通讯，可以理解为不同服务器间的通讯。

柯里化指的是将原来接受两个参数的方法变成新的接受一个参数的方法的过程，柯理化既有函数又有方法特点，柯理化有两种写法：①第一种比较奇怪，传入的参数可以写在两个地方，在"="的左边或右边都可以，"=>"后面为函数体，如：def m(x: Int) = (y: Int) => x * y；②传入的参数都在"="的左边，每个参数一个括号，独立开来，"="后面为函数体，如：def m(x: Int)(y: Int) = x * y。

# Scala异常检测
方法异常与局部异常<br/>
https://www.cnblogs.com/xinfang520/p/7728869.html

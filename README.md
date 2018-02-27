# ScalaDemo
一些关于Scala编程的基本学习知识

Scala是一种多范式的编程语言，其设计的初衷是要集成面向对象编程和函数式编程的各种特性。而Java是面向对象编程的。注意：还有种面向过程编程，注意区分！！！

Scala有Scala Shell，可以直接在上面写scala，而Java没有。

采用记事本的形式编写Scala程序，需要在该scala文件目录下将该scala文件编译为.class文件，例如，“使用命令编译scalac HelloScala.scala，然后使用命令运行scala HelloScala”，这与Java编写并运行Java文件类型类似。

Scala和Java一样，有7种数值类型Byte、Char、Short、Int、Long、Float和Double（无包装类型）和一个Boolean类型。

Scala中的+-/%等操作符的作用与Java一样，位操作符 &|^>><<也一样。只是有点不同，这些操作符实际上是方法。如a+b <<=>> a.+(b)

Scala中的方法和函数是不一样的，而Java中两者是一样的。用def定义的都是方法且直接带有方法名，可以不带有传参参数，用=引出方法体；而函数不直接带有函数名，必须带有传参参数，用=>引出函数体，函数可以作为参数传递。方法可以通过下划线 _ 转换成函数。

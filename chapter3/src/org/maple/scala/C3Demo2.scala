package org.maple.scala

/**
  * + - * /
  */
object C3Demo2 {

    def main(args: Array[String]): Unit = {

        /**
          * scala 没有传统上的操作符，类似 + - * / 这样的字符都被用作方法
          * 1 + 2 实际上是 调用了 Int 对象 1 上名为 + 的方法，将 2 作为参数传入
          * 所有 1 + 2 有如下写法
          */
        val i = 1.+(2)
        println(i)


    }
}

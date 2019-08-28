package org.maple.scala

/**
  * Tuple 元组
  * 不可变，可以装多个数据类型，Java需要通过 JavaBean来存储
  * 通过 () 来包起来
  */
object C3Demo5 {

    def main(args: Array[String]): Unit = {
        val pair = (99, "Adidas")

        /**
          * 下标从1开始，通过下划线+数字
          */
        println(pair._1)
        println(pair._2)
    }
}

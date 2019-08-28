package org.maple.scala

/**
  * method
  */
object C2Demo2 {

    def max(x: Int, y: Int): Int = {
        if (x > y) x
        else y
    }

    def max2(x: Int, y: Int): Int = if (x > y) x else y

    // Unit 表示函数并不返回任何有实际意义的结果
    def greet(): Unit = println("Hello world!")

    def main(args: Array[String]): Unit = {
        println(max(1, 2))
        println(max(2,3))
        greet()
    }
}

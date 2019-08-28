package org.maple.scala

/**
  * variable
  */
object C2Demo1 {

    def main(args: Array[String]): Unit = {

        // 定义不可变变量
        val finalMsg = "hello scala"
        println(finalMsg)

        // 改变 val 的值 , idea 编译通不过
//        finalMsg = "hello val"

        // 定义可变变量
        var mutableMsg = "hello scala"
        mutableMsg = "hello world"
        println(mutableMsg)
    }
}

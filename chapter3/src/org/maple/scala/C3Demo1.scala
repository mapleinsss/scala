package org.maple.scala

/**
  * 参数化（实例化）
  * 数组
  */
object C3Demo1 {

    def main(args: Array[String]): Unit = {

        /* ------定义 java 数据类型------ */
        val decimal = new java.math.BigDecimal("12345")

        /* ------定义一个数组------ */
        val greetStrings = new Array[String](3)
        //        val greetStrings: Array[String] = new Array[String](3)

        // java 中是 [] ，此处的的类型声明在 [] 中
        greetStrings(0) = "hello"
        greetStrings(1) = " "
        greetStrings(2) = "world!"
        for (i <- 0 to 2) {
            print(greetStrings(i))
        }

        /**
          * 此处注意 val 的一个概念：
          *     val 定义变量时，变量本身不能被重新赋值，但是它指向的那个对象是可能发生改变的
          *     对于 greetStrings，永远指向初始化相同的 Array[String]实例，但是可以改变元素的值，因此数组本身是可变的 (mutable)
          */

        /**
          * greetStrings(0) ：对变量进行赋值，编译器会将代码转换成 greetStrings.update(0,"Hello")
          */

        /* ------定义一个数组------ */
        val numNames = Array("zero","one","two")
        val numNames2 = Array.apply("zero","one","two")
    }
}

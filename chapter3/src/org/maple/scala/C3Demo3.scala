package org.maple.scala

/**
  * List
  */
object C3Demo3 {

    def main(args: Array[String]): Unit = {

        /**
          * 该 list 是不可变的，当调用某个方法时，看上去像是改变了，但是返回的实际是一个新的列表
          * 例如 ::: (读作 cons) 类似 Java 中的 String + String
          */
        val oneTwo = List(1, 2)
        val threeFour = List(3, 4)
        val oneTwoThreeFour = oneTwo ::: threeFour
        println(oneTwo + " and " + threeFour + " were not mutated.")
        println("Thus, " + oneTwoThreeFour + " is a new List")


        /**
          * 方法默认都是左操作元  例如： a * b 即 a 调用 * 方法，传入 b
          * 如果方法名以 (:) 结尾，方法调用发生在右操作元上  如下：方法的调用方为 twoThree
          */
        val twoThree = List(2, 3)
        val oneTwoThree = 1 :: twoThree
        println(oneTwoThree)

        /* ------Nil 空列表------ */
        val fiveSixSeven = 5 :: 6 :: 7 :: Nil
        println(fiveSixSeven)


        /**
          * 为什么不在末尾添加元素？
          * List 类提供了头部添加元素：使用 +，但是很少用，因为添加时间成线性增加，而使用 :: 在前面添加只需要常量时间，再调用 reverse
          * 也可以使用 ListBuffer，是可变列表，支持追加操作，完成后调用 toList();
          */
    }

}

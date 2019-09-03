package org.maple.scala

/**
  * @author Mapleins
  * @date 2019-09-03 14:48
  * @description 不可变 map 不能增删改
  */
object C3Demo8 {

    def main(args: Array[String]): Unit = {

        /* ------定义不可变 map------ */
        // 1.定义
        val immutableMap1 = Map(1 -> "Allen", 2 -> "Bob", 3 -> "Cindy")
        // 2.利用元组创建
        val immutableMap2 = Map((1, "Allen"), (2, "Bob"), (3, "Cindy"))

        /* ------遍历不可变 map------ */
        // .keys 展示所有 key
        println(immutableMap1.keys)
        // 通过 key 获取 value
        println(immutableMap1(1))
        // 通过 key 获取 ，有则返回，无则返回 null
        println(immutableMap1.getOrElse(4,null))

    }
}

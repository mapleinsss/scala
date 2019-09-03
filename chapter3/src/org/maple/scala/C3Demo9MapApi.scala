package org.maple.scala

/**
  * @author Mapleins
  * @date 2019-09-03 15:20
  * @description 可变 map
  */
object C3Demo9MapApi {

    def main(args: Array[String]): Unit = {

        import scala.collection.mutable
        val mutableMap = mutable.LinkedHashMap(1 -> "Allen", 2 -> "Bob", 3 -> "Cindy")

        // add
        mutableMap += (4 -> "Derby")
        println("add ->" + mutableMap)

        // add 多个
        mutableMap += (5 -> "Ella", 6 -> "Ferrari")
        println("add ->" + mutableMap)

        // keys 获取所有 key
        println(mutableMap.keys)

        // keySet  获取所有 key
        println(mutableMap.keySet)

        // 获取值
        println(mutableMap(1))

        // getOrElse
        println(mutableMap.getOrElse(1, "Zero"))
        println(mutableMap.getOrElse(26, "Zero"))

        // 更新一个
        mutableMap(1) = "Ak47"
        println(mutableMap)

        // 更新多个
        mutableMap += (1 -> "Ace", 2 -> "B51")
        println(mutableMap)

        // 删除
        mutableMap -= 2
        mutableMap.remove(1)
        println(mutableMap)

        // 遍历
        for (key <- mutableMap.keySet) println(key + "->" + mutableMap(key))

        // 遍历方式二 ，模式匹配
        for ((x, y) <- mutableMap) println(x + "->" + y)

        // 遍历方式3 , foreach
        mutableMap.foreach { case (x, y) => println(x + "->" + y) }
    }
}

package org.maple.scala

object C3Demo4ListAPI {

    def main(args: Array[String]): Unit = {

        /* ------List() 或 Nil：创建空列表------ */
        val empty1 = List()
        val empty2 = Nil

        /* ------初始化一个不可变 List： ::  只所以使用 Nil 是因为 :: 定义在 List 中的方法，Nil 是方法调用方------ */
        val oneTwoThree = "1" :: "2" :: "3" :: Nil

        /* ------将两个 List 拼接起来 ::: ------ */
        val compose = List("a", "b") ::: List("c", "d")

        /* ------返回列表 index 的元素 (index),从 0 开始------ */
        println("获取第三个元素：" + compose(2))

        /* ------count 函数式------ */
        val names = "Allen" :: "Bob" :: "Cindy" :: "Dickey" :: Nil
        val count = names.count(name => name.length > 3)
        println("count :" + count)

        /* ------drop(数量) 左------ */
        println("drop(2):" + names.drop(2))

        /* ------dropRight(数量) 右------ */
        println("dropRight(2):" + names.dropRight(2))

        /* ------dropWhile(函数) 函数式drop------ */
        //        println("dropWhile:" + names.dropWhile(x => x.eq("Bob")))

        /* ------exists 判断是否存在------ */
        println("exist:" + names.exists(x => x == "Bob"))

        /* ------filter 过滤------ */
        println("filter:" + names.filter(x => x.length == 5))

        /* ------filterNot 不过滤------ */
        println("filterNot " + names.filterNot(x => x.length > 3))

        /* ------forall 判断所有------ */
        println("forall: " + names.forall(x => x.endsWith("y")))

        /* ------foreach 遍历------ */
        names.foreach(print)

        /* ------head 返回第一个元素------ */
        println("head: " + names.head)

        /* ------last 返回最后一个元素------ */
        println("last: " + names.last)

        /* ------tail 返回除了第一个元素的所有元素------ */
        println("tail: " + names.tail)

        /* ------init 返回除了最后一个元素------ */
        println("init: " + names.init)

        /* ------isEmpty------ */
        println("isEmpty: " + names.isEmpty)

        /* ------length 元素个数------ */
        println("length: " + names.length)

        /* ------map  对每个元素做操作------ */
        println("map: " + names.map(x => x + "~~~"))

        /* ------mkString(符号) 用符号组成一个字符串------ */
        println("mkString: " + names.mkString(","))

        /* ------reverse 反转------ */
        println("reverse: " + names.reverse)

        /* ------sort 排序------ */
        println("sort " + names.sortBy(x => x.charAt(1)))


    }

}

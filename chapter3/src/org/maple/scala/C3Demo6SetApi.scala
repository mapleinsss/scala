package org.maple.scala

/**
  * @author Mapleins
  * @date 2019-09-03 15:35
  * @description TODO
  */
object C3Demo6SetApi {

    def main(args: Array[String]): Unit = {

        /* -------不可变 set------- */
        val immutableSet = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)

        // size
        println(immutableSet.size)

        // min
        println(immutableSet.min)

        // max
        println(immutableSet.max)

        // 对不可变set + 值，原 set 不变，生成一个新的 set
        val newSet = immutableSet + 10
        println(immutableSet)
        println(newSet)

        val minSet = Set(1, 2, 3, 12)

        // & 交集
        println(immutableSet & minSet)

        // ++ 并集 (去掉了重复元素)
        println(immutableSet ++ minSet)

        // 在前一个 set 去掉后一个 set 中的元素
        println(immutableSet -- minSet)

        // &~ 差集
        println(immutableSet &~ minSet)

        // 返回第一个不同于第二个的元素
        println(immutableSet.diff(minSet))

        // count
        println(immutableSet.count(x => x > 5))

        // slice 包头不包尾
        println(immutableSet.slice(0, 2))

        // 遍历
        immutableSet.foreach(x => println(x))

        // 取指定个数 ?
//        immutableSet.subsets(2).foreach(x => println(x))



        /* -------可变 set------- */
        import scala.collection.mutable
        val mutableSet = mutable.Set(1,2,3)

        // add
        mutableSet.add(4)
        println(mutableSet)

        // add 多个
        mutableSet ++= Set(5,6,7)
        println(mutableSet)

        // delete
        mutableSet -= 7
        println(mutableSet)

        mutableSet.remove(6)
        println(mutableSet)


    }
}

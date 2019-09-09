package org.maple.scala

/**
  * @author Mapleins
  * @date 2019-09-04 10:02
  * @description TODO
  */
class CheckSumAccumulator {

    private var sum = 0

    /**
      *
      * @param b 参数 b 是一个 val 的值，不能重新赋值
      *          副作用是给 sum 重新赋值，因为其副作用而执行的方法称为过程(procedure)
      */
    def add(b: Byte): Unit = sum += b

    def checksum(): Int = ~(sum & 0xFF) + 1


}

import scala.collection.mutable

object CheckSumAccumulator {
    private val cache = mutable.Map.empty[String, Int]

    def calculate(s: String): Int =
        if (cache.contains(s))
            cache(s)
        else {
            val acc = new CheckSumAccumulator
            for (c <- s)
                acc.add(c.toByte)
            val cs = acc.checksum()
            cache += (s -> cs)
            cs
        }
}

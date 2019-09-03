package org.maple.scala

/**
  * 可变 / 不可变 Set
  */
object C3Demo6 {

    def main(args: Array[String]): Unit = {

        /* ------默认不可变 Set ------ */
        // 创建的是一个不可变的 set scala.collection.immutable.Set
        var jetSet = Set("Boeing", "Airbus")
        println(jetSet.getClass) // class scala.collection.immutable.Set$Set2
        /**
          * 不可变集提供的 += 实质是 jetSet = jetSet + "Lear" 返回的是一个新的集合
          */
        jetSet += "Lear"
        println(jetSet.getClass) //class scala.collection.immutable.Set$Set3


        /* ------可变Set 创建------ */
        import scala.collection.mutable

        val movieSet = mutable.Set("Hitch", "Poltergeist")
        println(movieSet.getClass) //class scala.collection.mutable.HashSet
        movieSet += "Shrek"
        println(movieSet.getClass) //class scala.collection.mutable.HashSet
    }


}

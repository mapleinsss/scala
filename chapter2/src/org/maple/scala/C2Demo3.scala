package org.maple.scala

/**
  * 循环
  */
object C2Demo3 {

    def main(args: Array[String]): Unit = {

        /* ------while------ */
        var i = 0
        while (i < 5) {
            println(i)
            i += 1
        }


        val nums: List[Int] = List(1, 2, 3, 4)

        /* ------for------ */
        // 1
        for (num <- nums) {
            println(num)
        }
        // 2
        for (i <- 1 to 4) {
            println(i)
        }

        /* ------foreach------ */
        // 1
        nums.foreach(num => println(num))
        // 2
        nums.foreach(println)


    }

}

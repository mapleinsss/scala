package org.maple.scala

import scala.io.Source

/**
  * @author Mapleins
  * @date 2019-09-04 9:30
  * @description io
  */
object C3Demo10 {

    def main(args: Array[String]): Unit = {
        printFile("G:\\1.txt")
        printFileToList("G:\\1.txt")
    }

    /**
      * 逐行打印文件内容
      *
      * @param args 文件路径
      */
    def printFile(args: String): Unit = {
        if (args.length > 0) {
            for (line <- Source.fromFile(args).getLines()) {
                println(line.length + " " + line)
            }
        } else {
            Console.err.println("Please enter right path")
        }
    }

    /**
      * 逐行转换为 List 集合
      *
      * @param args 文件路径
      */
    def printFileToList(args: String): Unit = {
        println(Source.fromFile(args).getLines().toList)
    }

    def widthOfLength(s: String): Int = s.length.toString.length

}

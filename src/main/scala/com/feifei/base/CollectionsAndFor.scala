package com.feifei.base

import scala.collection.mutable
import scala.util.control.Breaks._

object CollectionsAndFor {
  def main(args: Array[String]): Unit = {
    val list = List(1, 5, 2, 3, 9, 6)

    //在Scala中实现break的操作
    breakable(
      for (elem <- list if elem < 5) {
        if (elem == 2) {
          println(elem)
          break()
        }
        println(elem)
      }
    )

    list.foreach(println)
    println("*************************************")


    val listBuffer = new mutable.ListBuffer[Int]()
    listBuffer.+=(22)
    listBuffer.foreach(println)


  }


}

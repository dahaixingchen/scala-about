package com.feifei.base

import scala.collection.mutable
import scala.util.control.Breaks._

object CollectionsAndFor {
  def main(args: Array[String]): Unit = {

    /**
      * Scala中的List，Array，Set都是一样的操作方式都是类似的
      *
     */
    val list = List(1, 5, 2, 3, 9, 6)
    val list1 = List(11, 55, 22, 33, 99, 66)

    println("******list++list1：把两个集合的集合合并成一个新的集合******")
    val towList: List[Int] = list ++ list1
    towList.foreach(println)
    println("*****55::list：往list集合的头部插入一个数据，形成一个新的集合*****")
    val ist: List[Int] = 55 :: list
    ist.foreach(println)
    println("******list:::list1：把两个集合的集合合并成一个新的集合*****")
    val towList2: List[Int] = list ::: list1
    towList2.foreach(println)

    println("******list:+88：在集合末尾添加元素成为新的集合*****")
    val addListLast: List[Int] = list :+ 88
    list :+ list1
    addListLast.foreach(println)

    println("******88 +: list：在集合开头添加元素成为新的集合*****")
    val addListFirst: List[Int] = 88 +: list
    list +: list1
    addListFirst.foreach(println)

    println("******var ints:List[int]，ints ++= ints2操作，左边的ints变长了，右边的不变*****")
    var ints = List(55, 66, 88)
    var ints2 = List(555, 666, 888)
    ints ++= ints2
    ints.foreach(println)
    ints2.foreach(println)

    println("******var ints3:List[int]，ints3 ++:= ints4操作，左边的ints变长了，右边的不变*****")
    var ints3 = List(1, 2, 3)
    var ints4 = List(11, 22, 33)
    ints3 ++:= ints4
    ints3.foreach(println)
    ints4.foreach(println)


    println("******for循环中的 后面跟着if的操作,这种操作等于把if语句写在for里面也是一样的*****")
    for (elem <- 1 to 10 if elem % 2 == 0) {
      println(elem)
    }

    println("******for循环中的 brake 操作*****")
    //在Scala中实现break的操作
    breakable {
      for (elem <- 1 to 10) {
        if (elem == 8) {
          println(elem)
          break()
        }
        println(elem)
      }
    }

    println("******for循环中的 continue 操作：可以使用if条件的方式把数据过滤掉*****")
    for (elem <- 1 to 10) {
      if (elem != 2 && elem != 6) {
        println(elem)
      }
    }
    println("*****mutable.ListBuffer：可以添加元素的集合*****")
    val listBuffer = new mutable.ListBuffer[Int]()
    listBuffer.+=(22)
    //    listBuffer.++ list
    listBuffer.foreach(println)

    println("*****集合中的遍历方式：利用函数式编程的方式*****")
    val listStr = List(
      "hello world",
      "hello msb",
      "good idea"
    )
    listStr.flatMap(_.split(" ")).map((_,1)).foreach(println)

    println("*****集合中的遍历方式：利用迭代器的方式，这样没有数据的复制*****")
    listStr.iterator.flatMap(_.split(" ")).map((_,1)).foreach(println)
  }

}

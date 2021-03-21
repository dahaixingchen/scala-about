package com.feifei.base

/**
 * @todo: 半生类可以使用类中的private成员属性，但是不能使用构造函数中的参数变量
 * @return
 * @date: 2021/3/20 14:33
 */
object ObjectAndFunctions {
  def main(args: Array[String]): Unit = {
    val a = new ObjectAndFunctions(155585903)
    a.name
  }

}
class ObjectAndFunctions(age: Int){
  private val name = "zhansan"

  def this(iphone:String){
    //必须要调用默认的构造函数
    this(iphone.toInt)
  }

}

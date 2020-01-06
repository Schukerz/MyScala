package com.atguigu.bigdata.scala.chapter07

object Scala21_Method6 {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,5)
    println(list.scan(0)(_ - _))
    println(list.scanLeft(0)(_ - _))
    println(list.scanRight(10)(_ - _))

  }

}

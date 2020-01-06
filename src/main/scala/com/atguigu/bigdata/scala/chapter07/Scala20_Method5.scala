package com.atguigu.bigdata.scala.chapter07

object Scala20_Method5 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(list.fold(0)(_ -_))
    println(list.foldLeft(0)(_ - _))
    println(list.foldRight(0)(_ - _))
    println(list.foldLeft("")(_ + _))
  }
}

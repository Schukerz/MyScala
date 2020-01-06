package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala13_Method1 {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer(1,2,3,4,5,5,4)
    println(list.sum)
    println(list.max)
    println(list.min)
    println(list.product)

    println(list.contains(2))
    println(list.take(2))
    println(list.reverse)
    println(list.takeRight(2))
    println(list.distinct)

  }

}

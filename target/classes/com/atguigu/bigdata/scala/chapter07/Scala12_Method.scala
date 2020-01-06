package com.atguigu.bigdata.scala.chapter07

object Scala12_Method {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(list.head)
    println(list.tail)
    println(list.last)
    println(list.init)

    println("_________________________")

    list.productIterator
    list.iterator
    list.foreach(println)
    list.mkString(",")
  }

}

package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala_Seq_mutable {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer(1,2,3,4)
    list.append(5)
    list.insert(0,6)
    list.update(0,1)
    list.remove(0)
    list.remove(0,1)
//    list.

    println(list)
    list.foreach(println)
    println(list.mkString(","))
  }

}

package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala23_Method9 {
  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[String]()
    que.enqueue("a","b","c")
    println(que)
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
  }
}

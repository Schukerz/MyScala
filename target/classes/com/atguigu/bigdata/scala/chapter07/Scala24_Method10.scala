package com.atguigu.bigdata.scala.chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

object Scala24_Method10 {
  def main(args: Array[String]): Unit = {

    val result1: immutable.IndexedSeq[String] = (0 to 100).map {
      case _ => Thread.currentThread.getName
    }
    val result2: ParSeq[String] = (0 to 100).par.map {
      case _ => Thread.currentThread().getName
    }
    println(result1)
    println(result2)

  }
}

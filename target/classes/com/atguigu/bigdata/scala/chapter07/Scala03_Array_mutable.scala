package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala03_Array_mutable {
  def main(args: Array[String]): Unit = {

    val buffer = new ArrayBuffer[String]()
    buffer.append("a","n")
    buffer += "e" += "f"

    buffer.insert(0,"aa")

    buffer.update(0,"hello")

    buffer.remove(1)
    buffer.remove(1,2)

    val buffer2 = buffer.drop(1)
    println(buffer==buffer2)

    println(buffer.mkString(","))
    println(buffer2.mkString(","))



  }

}


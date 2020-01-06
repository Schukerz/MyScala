package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala11_Tuple1 {
  def main(args: Array[String]): Unit = {
    val tuple = ("a",1)
    val t2 = "n"->2
    println(t2)

    val map = mutable.Map(("a",1),("b",2))
    println(map)
    for(kv <- map){
      println("k " + kv._1)
      println("v " + kv._2)
    }


  }
}

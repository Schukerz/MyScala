package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala08_Map {

  def main(args: Array[String]): Unit = {

    val map = Map( "a"->1,"b"->2)
    val map2 = mutable.Map("a"->1,"b"->2,"c"->3)

    map2.put("d",4)
    map2.remove("d")

    println(map2)
    map2.foreach(println)
    println(map2.mkString(","))
  }

}

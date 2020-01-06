package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala09_Map1 {
  def main(args: Array[String]): Unit = {
    val wordToCount = mutable.Map("a"->1,"b"->2,"c"->3)
    val v1 = wordToCount.get("a")
    val v2 = wordToCount.get("d")
    println(v1)
    println(v2)

    println(v1.get)
//    println(v2.get)

    val v3 = wordToCount.getOrElse("h",0)
    println(v3)
    println("------------")
    val keys:Iterable[String] = wordToCount.keys
    for(k <- keys){
      println(k)
    }
    val values = wordToCount.values
    for(v <- values){
      println(v)


    }
    println("-------------")
    val iterator = wordToCount.iterator
    for(i <- iterator){
      println(i)
    }
    val iterator2 = wordToCount.keysIterator
    for(i <- iterator2){
      println(i)
    }




  }

}

package com.atguigu.bigdata.scala.chapter07

object Scala10_Tuple {

  def main(args: Array[String]): Unit = {
    val tuple = (1,"d",3,"ccc",66)
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
    println(tuple._5)
    println("----------------")
    val iterator = tuple.productIterator
//    for(i <- iterator){
//      println(i)
//    }
    while(iterator.hasNext){
      println(iterator.next())
    }
    println(tuple.productElement(0))
  }
}

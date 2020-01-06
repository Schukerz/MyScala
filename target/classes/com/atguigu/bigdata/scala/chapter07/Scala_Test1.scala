package com.atguigu.bigdata.scala.chapter07

object Scala_Test1 {
  def main(args: Array[String]): Unit = {

    val tupleList = List(("Hello Scala Spark World ", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
//    val result: List[(String, Int)] = tupleList.flatMap(t=>(t._1.split(" ")).map((_,t._2))).groupBy(_._1).map(t=>(t._1,t._2.map(_._2).sum)).toList.sortWith(_._2>_._2).take(3)
//    println(result)
//    val result2: List[(String, Int)] = tupleList.map(t=>(t._1+" ")*t._2).flatMap(_.split(" ")).groupBy(s=>s).map(t=>(t._1,t._2.size)).toList.sortWith((_._2>_._2)).take(3)
//    println(result2)

    val result: List[(String, Int)] = tupleList.flatMap(t=>((t._1.split(" ").map((_,t._2))))).groupBy(s=>s._1).map(t=>(t._1,t._2.map(_._2).sum)).toList.sortWith((_._2>_._2)).take(3)
    println(result)

  }

}

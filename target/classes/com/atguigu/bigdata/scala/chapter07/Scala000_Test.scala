package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala000_Test {

  def main(args: Array[String]): Unit = {

    val list = List(
      ("Hello Hadoop Hive Kafka", 4),
      ("Hello Hadoop Hive", 3),
      ("Hello Hadoop ", 2),
      ("Hello", 1)
    )

    //方式一
    //t

//    val strings = buffer.flatMap(
//      t => {
//        (t._1 * t._2).split(" ")
//      }
//    )
//    strings

    //------------------
    val buffer: List[String] = list.flatMap(
      t => {
        var nil: List[String] = Nil
        for (i <- 0 until t._2) {
          nil=t._1 :: nil;
        }
        nil
      }

    )
//    val buffer = ListBuffer[String]()
//    for(i <- 0 until buffer.length){
//      for(j <- 0 until buffer(i)._2){
//        buffer.append(buffer(i)._1)
//      }
//    }
    val words = buffer.flatMap(s => s.split(" "))
    val wordToMap = words.groupBy(s => s)
    val wordToCount = wordToMap.map(kv => {
      (kv._1, kv._2.length)
    })
    val result = wordToCount.toList.sortWith(
      (left, right) => {
        if (left._2 > right._2) {
          true
        } else {
          false
        }
      }
    ).take(3)
    println(result)




  }
}

package com.atguigu.bigdata.scala.chapter07

object Scala16_WordCount1 {

  def main(args: Array[String]): Unit = {
    val tList = List(("Hello Scala Hive Spark", 4)
      , ("Hello Scala Hive", 3)
      , ("Hello Scala", 2)
      , ("Hello", 1)
    )


    val tuples = tList.map(t=>((t._1+" ")*t._2)).flatMap(_.split(" ")).groupBy(s=>s).map(kv=>(kv._1,kv._2.length)).toList.sortWith(_._2>_._2).take(3)
    println(tuples)

    val list = tList.flatMap(
      kv => {
        val strings = kv._1.split(" ")
        strings.map((_, kv._2))
      }
    )
    val stringToTuples: Map[String, List[(String, Int)]] = list.groupBy(_._1)

    val wordToMap: Map[String, Int] = stringToTuples.map(k => {
      val ints = k._2.map(_._2).sum
      (k._1, ints)
    })
   val tuples1: List[(String, Int)] = wordToMap.toList.sortWith(_._2>_._2).take(3)
    println(tuples1)
    val ints :List[Int] = List(1,2,3,6,4)
    val sss: List[Int] = ints.sortBy(i=>i)
    println(sss)

  }
}

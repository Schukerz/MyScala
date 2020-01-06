package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala_Method7 {
  def main(args: Array[String]): Unit = {
    val map1: mutable.Map[String, Int] = mutable.Map(("a",1),("b",2),("c",3))
    val map2: mutable.Map[String, Int] = mutable.Map(("a",2),("d",2),("c",4))

    val result: mutable.Map[String, Int] = map2.foldLeft(map1)(

      (map, kv) => {
        map.update(kv._1, map.getOrElse(kv._1, 0) + kv._2)
        map
      }
    )
    println(result)

  }
}

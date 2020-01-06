package com.atguigu.bigdata.scala.chapter07

object Scala19_Method4 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    val result: Int = list.reduce(
      (x, y) => x + y
    )
    println(result)
    println(list.reduce(_ - _))
    println(list.reduceLeft(_ - _))
    println(list.reduceRight(_ -_))


  }
}

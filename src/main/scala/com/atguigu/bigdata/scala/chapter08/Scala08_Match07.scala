package com.atguigu.bigdata.scala.chapter08

object Scala08_Match07 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,"test")
//    val res: List[Any] = list.filter(_.isInstanceOf[Int])
//    val res2: List[Int] = res.map(s => s.asInstanceOf[Int]+1)
//    println(res2)

    val list1: List[Any] = list.map {
      case i: Int => i + 1
      case s => s
    }
    val list2: List[Any] = list1.filter(_.isInstanceOf[Int])
    println(list2)

    val ints: List[Int] = list.collect {
      case num: Int => num + 1
    }
    println(ints)
  }
}


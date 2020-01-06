package com.atguigu.bigdata.scala.chapter07

object Scala18_Method3 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,"",3,4)
    val list2 = List(4,5,6,7)
    val list3 = List(1,2,3,4,5,6,7,8)

//    val list4: List[Int] = list1.union(list2)
//    println(list4)
//    val list5: List[Int] = list1.intersect(list2)
//    println(list5)
    println(list1.diff(list2))
    println(list1.zip(list2))
    val iterator: Iterator[List[Int]] = list3.sliding(3,2)
    while(iterator.hasNext){
      println(iterator.next())
    }

  }
}

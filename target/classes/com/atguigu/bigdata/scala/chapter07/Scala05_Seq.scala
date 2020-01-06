package com.atguigu.bigdata.scala.chapter07

object Scala05_Seq {

  def main(args: Array[String]): Unit = {
//    val list = new List()
    val list = List(1,2,3,4)
    val list2 = 5+:list

    println(list2)
    val list1= 1::2::3::4::Nil
    println(list1)
    val list3 = 5 :: list1 :: Nil
    println("list3:" + list3)

    val list4 = list.++:(list3)
    println(list4)

    val list5 = list.+:(1)
    println(list5)
    val list6 = list.+:(list3)
    println(list6)

//    println(list)
//    println(list2)

  }
}

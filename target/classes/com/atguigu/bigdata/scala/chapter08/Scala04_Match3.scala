package com.atguigu.bigdata.scala.chapter08

object Scala04_Match3 {

  def main(args: Array[String]): Unit = {
    val list = List((1,"zhangsan",30),(2,"lisi",40),(1,"wangwu",32))
    for((1,_,age) <- list){
      println(age)
    }
    val map: Map[String, Int] = Map(("a",1),("b",2),("c",3))
    for((word,count)<- map){
      println(word + "= "+ count * 2)
    }
  }
}

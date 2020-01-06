package com.atguigu.bigdata.scala.chapter01

object TestFor {

  def main(args: Array[String]): Unit = {
    for(i<- 1 to 3){
      println(i+"")
    }
    println("-------------------")
    for( i <- 1 until 3){
      println(i+"")
    }
    println("++++++++++++++++++++++")

    for(i <- 1 to 3 if i != 2){
      println(i + "")
    }
    println("-----------------------")

    for(i <- 1 to 10 by 2){
      println(i+"")
    }
    println("________________________________")
    for(i <- 1 to 9;j <- 1 to 9){
      print(i*j + " ")
    }
    println("_________________________________")
    for{
      i <- 1 to 3;
      j=4-i
    }{
      println("i:"+i+" j:"+j)
    }

    var res = for(i <- 1 to 3) yield 1
    println(res)
  }

}

package com.atguigu.bigdata.scala.chapter07

object Scala02_Array {

  def main(args: Array[String]): Unit = {

    val strings = new Array[String](3)
    val array2 = Array("aa","bb","cc")
    println(array2(0))
    println(array2(1))
    println(array2(2))

    val array3 : Array[String]=array2 :+ "dd"
    println(array3(0))
    println(array3(1))
    println(array3(2))
    println(array3(3))
    println(array2==array3)

    val array4 : Array[String] = "ee" +: array2
    array4.foreach(println)
    for (s <- array4){
      println(s)
    }
    println(array4.mkString(","))

    val array = Array.ofDim[Int](2,3)
    for(i <- 0 until array.length){
      println(i)
      for(j <- 0 until array(i).length){
        println(j)
       array(i)(j)=(i+j)*10
      }
    }
    for(i <- array){
      for(j <- i){
        println(j)
      }
    }
  }
}


package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala04_Array_Transform {
  def main(args: Array[String]): Unit = {

    val arr1 = Array(1,2,3)
    val arr2 = ArrayBuffer(1,2,3)
    val buffer = arr1.toBuffer
    println(buffer == arr2)
    val array = arr2.toArray
    println(array== arr1)
    val value = Array.ofDim[Int](3,4)
    value(1)(1)=33
    for(i <- 0 until value.length){
      for(j <- 0 until value(i).length){
        print(value(i)(j)+",")
      }
      println(" ")
    }
  }
}

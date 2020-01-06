package com.atguigu.bigdata.scala.chapter01

import scala.io.StdIn

object TestIf {

  def main(args: Array[String]): Unit = {
    println("input: age:")
    var age:Int = StdIn.readInt()
    if(age > 18){
      println("old")
    }else{
      println("young")
    }

    var ref:String = if(age>18){
      "old"
    }else{
      "young"
    }
    println("ref:"+ref)

    var ref2 : Any =  if(age>18){
      "old"
    }else if(age > 14){
      "young"
    }else{
      100
    }
    println(ref2)
  }



}

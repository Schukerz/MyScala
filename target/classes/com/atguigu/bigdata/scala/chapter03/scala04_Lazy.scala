package com.atguigu.bigdata.scala.chapter03

object scala04_Lazy {

  def main(args: Array[String]): Unit = {
    lazy val res = sum(10,20)
    println("main....")
    println(res)

  }

  def sum(a:Int,b:Int):Int={
    println("sum...")
    a+b
  }

}

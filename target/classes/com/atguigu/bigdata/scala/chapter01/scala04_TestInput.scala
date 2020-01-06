package com.atguigu.bigdata.scala.chapter01

import scala.io.StdIn

object scala04_TestInput {

  def main(args: Array[String]): Unit = {
    println("input:name:")
    var name = StdIn.readLine()

    println("input:age:")
    var age = StdIn.readInt()

    println("input:sal:")
    var sal = StdIn.readDouble()
    println("name:" + name)
    println("age:"+age)
    println("sal:"+sal)
  }

}

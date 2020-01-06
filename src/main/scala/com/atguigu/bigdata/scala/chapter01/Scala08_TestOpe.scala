package com.atguigu.bigdata.scala.chapter01

object Scala08_TestOpe {
  def main(args: Array[String]): Unit = {

    val s1= "abc"
    val s2 = new String("abc")
    println(s1==s2)
    println(s1.eq(s2))

    var s3 = 1
    var s4 = 3
    println(s3 ^ s4)
    println(~s3)

    println(1 toString)
    println(1.toString())
    println(1 toString())
    //println(dd)
  }
}

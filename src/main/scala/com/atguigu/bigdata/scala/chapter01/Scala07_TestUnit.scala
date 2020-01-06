package com.atguigu.bigdata.scala.chapter01

object Scala07_TestUnit {

  def main(args: Array[String]): Unit = {

    def sayOk():Unit={
      println("hello")
    }
    println(sayOk)

    var cat =new Cat()
    cat = null

    var n1: Int =11
   // n1 = null
    println("n1: " + n1)

    def test():Nothing={
      throw new Exception()
    }
    test
  }
}

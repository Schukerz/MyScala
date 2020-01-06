package com.atguigu.bigdata.scala.chapter04

object scala06_test {
  def main(args: Array[String]): Unit = {
    def f(op: Unit):Unit={
         println("f")
    }
    def say():Unit={
      println("say")
    }
    val s = say()
    println(s)
  }

}

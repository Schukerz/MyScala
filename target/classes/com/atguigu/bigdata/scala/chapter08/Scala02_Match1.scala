package com.atguigu.bigdata.scala.chapter08

object Scala02_Match1 {
  def main(args: Array[String]): Unit = {
    def abs(x:Int)={
      x match{
        case i : Int if i > 0 => i
        case j : Int if j < 0 => -j
        case _ => 0
      }
    }

    println(abs(0))
  }
}

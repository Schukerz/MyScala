package com.atguigu.bigdata.scala.chapter08

object Scala01_Match {
  def main(args: Array[String]): Unit = {
    var a:Int = 10
    var b : Int = 20
    var operator: Char = 'd'

    val result = operator match {
      case '-' => a - b
      case '+' => a + b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }
}

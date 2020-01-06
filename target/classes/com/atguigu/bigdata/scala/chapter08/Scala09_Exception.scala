package com.atguigu.bigdata.scala.chapter08

object Scala09_Exception {

  def main(args: Array[String]): Unit = {
    var i : Int = 0
    try{
    var j = 10 /i
    }catch{
      case e : ArithmeticException => println("除数是0")
      case ee: Exception => println("其他异常")
    }finally{
      println("wc")
    }


  }
}

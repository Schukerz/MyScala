package com.atguigu.bigdata.scala.chapter01

object TestWhile {

  def main(args: Array[String]): Unit = {
//    var a : Int = 0
    //    ////    while(a < 10){
    //    ////      println(a)
    //    ////      a = a+1
    //    ////    }
    try {
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) {
          throw new RuntimeException
        }
      }
    }catch{
      case e =>
    }
  }
}

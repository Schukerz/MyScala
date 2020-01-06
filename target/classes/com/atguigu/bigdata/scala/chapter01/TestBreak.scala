package com.atguigu.bigdata.scala.chapter01

import scala.util.control.Breaks._

object TestBreak {

  def main(args: Array[String]): Unit = {
//    Breaks.breakable(
//      for(i <- 1 to 19){
//        println(i)
//        if(i == 5){
//          Breaks.break()
//        }
//      }
//    )

    breakable {
      for (i <- 1 to 19) {
        println(i)
        if (i == 5) {
          break
        }
      }
    }
  }
}

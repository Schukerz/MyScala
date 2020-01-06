package com.atguigu.bigdata.scala.chapter07

object Scala22_Method8 {

  def main(args: Array[String]): Unit = {
//
//    def test(num : Long):Long={
//      if(num <= 1){
//        1
//      }else{
//        num* test(num-1)
//      }
//    }

    def test(num:Long,res:Long):Long={
      if(num<=1){
        res
      }else{
        test(num-1,num * res)
      }
    }
    println(test(5,1))
  }
}

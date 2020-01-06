package com.atguigu.bigdata.scala.chapter03

object scala01_curry {

  def main(args: Array[String]): Unit = {
//    val a:Int = 10
//    def f(b:Int):Int={
//      a+b
//    }
//    val res = f(3)
//    println(res)
//
//    def f3()(b:Int) ={
//      a+b
//    }
//    println(f3()(3))

    def f(i:Int)={
      def f1(j:Int)={
        def f2(f3:(Int,Int)=>Int)={
          f3(i,j)
        }
        f2 _

      }
      f1 _
    }
    println(f(10)(20)(_+_))
  }
}

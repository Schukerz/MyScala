package com.atguigu.bigdata.scala.chapter03

object scala05_Test {

//  def main(args: Array[String]): Unit = {
//
//    def f(f1:(Int,Int)=>Int):Int={
//
//      f1(10,20)
//
//    }
//    //完整版
//    def f1(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f(f1))
//
//    //简化版
//    println(f((x:Int,y:Int)=>{x+y}))
//    println(f((x,y)=>{x+y}))
//    println(f((x,y)=>x+y))
//    println(f(_+_))

//    def test()={
//      def f1():Unit={
//        println("...")
//      }
//      f1 _
//    }
//    test()()

//    def f(i : Int)={
//      def f1(j:Int)={
//        def f2(f3:(Int,Int)=>Int) ={
//          f3(i,j)
//        }
//        f2 _
//      }
//      f1 _
//    }
//
//    println(f(10)(20)(_ + _))
//    def f4(i:Int)(j:Int)(f:(Int,Int)=>Int)={
//      f(i,j)
//    }
//    println(f4(10)(2)(_+_))
//    def test(n:Int):Int={
//      if(n==1){
//        1
//      }else{
//        n*test(n-1)
//      }
//}
//    println(test(5))

//    foo({
  ////      println("aaa")
  ////    })
  ////  }
  ////  def foo(a: =>Unit)={
  ////    println(a)
  ////    println(a)
  ////  }
//  def main(args:Array[String]):Unit={
//    def f = () =>{
//      println("...")
//      10
//    }
//
//    foo(f())
//
//
//  }
//
//  def foo(a: Int):Unit={
//    println(a)
//    println(a)
//  }
  def main(args:Array[String]):Unit={
//    mywhile(true){
//      println("hello")
//    }
//  }
//  def mywhile(condition: =>Boolean)(op: =>Unit):Unit={
//    if(condition){
//      op
//      mywhile(condition)(op)
//    }else{
//
//    }
    val res= f()
    println("hello")
    println(res)


  }
  def f()={
    println("...")
    10
  }

}


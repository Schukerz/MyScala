package com.atguigu.bigdata.scala.chapter03

object scala03_abstractControl {

  def main(args: Array[String]): Unit = {

//    def f = () => {
//      println("f...")
//      10
//    }
//    foo(f())
//  }
//    def foo(a: =>Int):Unit={
//      println(a)
//      println(a)
//
//    }
    myWhile(true){
      println("hi")
    }


  }
//  def myWhile(condition: =>Boolean)(op: =>Unit):Unit={
//    if(condition){
//      op
//      myWhile(condition)(op)
//    }
//  }

  def myWhile(condition: =>Boolean)(op: =>Unit):Unit={
    if(condition){
      op
      myWhile(condition)(op)
    }
  }


}

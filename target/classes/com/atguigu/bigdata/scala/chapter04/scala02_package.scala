package com.atguigu.bigdata.scala.chapter04

import com.atguigu.bigdata.scala.chapter04.xxxx.Test4

package xxxx{

  class Test4{
    private var name :String  = "zhangsan"
    def sayHello():Unit={
      println(name)
    }
    private [xxxx] var age : Int = 20
    protected var hair:String = "black"

  }

  package yyy{
    object scala02_package {
      private [yyy] var height : Int = 170
      def main(args: Array[String]): Unit = {
        new Test4().sayHello()
        new Test4().age
//        new Test4().


      }

    }
    class Emp{

    }
  }
}

class ff extends Test4 {
  //new Test4().hair

}


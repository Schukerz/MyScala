package com.atguigu.bigdata.scala.chapter03

object scala02_recursion {

  def main(args: Array[String]): Unit = {

    def test(n:Int):Int={
      if(n == 1){
        1
      }else{
        n*test(n-1)
      }
    }
    println(test(5))
  }

}

package com.atguigu.bigdata.scala.chapter02

object Scala02_Nightware {
  def main(args: Array[String]): Unit = {

    def f1():String={
      "zhangsan"
    }
    def f2()={
      val flg=true
      if(flg){
        12
      }else{
        "zhangsan"
      }
    }

    def f3():Unit=println("hello")
    f3()

    def f33()="zhangsan"
    println(f33())


    def f4="zhangsan"
    println(f4)

    def f5(){
      "zhangsan"
    }
    println(f5())

   val a =  ()=>{println("hello")}
    a()
  }
}

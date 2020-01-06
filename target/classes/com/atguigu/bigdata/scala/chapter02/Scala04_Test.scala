package com.atguigu.bigdata.scala.chapter02

object Scala04_Test {


  /*
    val s ="zhangsan"
    println(f(xxxx))=Z
   */
  def main(args: Array[String]): Unit = {



    def f(f2: (String)=>String):String={
      f2("zhangsan")
    }

    //不简写
    def f2(s:String):String={
      if(s=="" || s==null){
        ""
      }else{
        s.substring(0,1).toUpperCase()
      }
    }
    println(f(f2))

    //简写
    println(f(_.substring(0,1).toUpperCase))

  }

}

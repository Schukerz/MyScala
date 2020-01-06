package com.atguigu.bigdata.scala.chapter02

object Scala01_Normal {

  def main(args: Array[String]): Unit = {

    def f1(name: String): String = {
      return "result: " + name
    }

    println(f1("zhangsan"))


    def f2(name: String): Unit = {
      println(name)
    }

    f2("f2")

    def f3(): String = {
      return "f3"
    }

    println(f3())

    def f4(): Unit = {
      println("f4")
    }

    f4()

    def f5(i1:Int,i2:Int):Int={
      return i1 + i2
    }

    println(f5(1,2))

    def f6(flag:Boolean):Any={
      if(flag){
        return 1
      }else
        return null
    }
    println(f6(true))

    def f7(i:Int*):Unit={
      println(i)
    }
    f7(1,2,3,4,5,6,4)

    def f77(j:Int, i:Int*): Unit ={
      println(j)
      println(i)
    }
    f77(1,2,3,4,5)

    def f8(name:String="zhangsan"):Unit={
      println(name)
    }
    f8()

    def f9(name:String="zhangsan",age:Int): Unit ={
      println("name: "+name+" age:"+age)
    }
    f9(age=18)

  }
}

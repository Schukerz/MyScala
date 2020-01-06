package com.atguigu.bigdata.scala.chapter07

object TestPrivate {
  def main(args: Array[String]): Unit = {
    val user = new Usert()
    println(user.name)
  }
}

class Usert{
  private var age:Int = _
 private[chapter07] var name: String = _


}
package x{
  package y{

    import com.atguigu.bigdata.scala.chapter07.x.y.x.X

    object TestX2 extends App{
      private val x = new X()
//      x.name //不存在
    }
    package yy{
      object TestX4 extends App{
        private val x = new X()
        println(x.name)
        println(x)
      }
    }
    package x{
      class X{
        private[y] var name : String = "zhangsan"
      }
      object TestX extends App{
        private val x = new X()
        println(x.name)
        println(x)
      }

      package xx{
        object TestX3 extends App{
          private val x = new X()
          println(x.name)
          println(x)
        }
      }
    }
  }
}
package com.atguigu.bigdata.scala.chapter06

object scala25_object11_enum {

  def main(args: Array[String]): Unit = {
    println(Color.RED)
    type S =String
    var v:S = "zhangsan"
    def test():S={"hello"}

    println(v)
    println(test())
  }
}
object Color extends Enumeration{
  val RED = Value(1,"red")
  val BLUE = Value(2,"blue")
  val YELLOW = Value(3,"yellow")
}
object Test25 extends App{
  println("xxx")
}
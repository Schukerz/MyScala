package com.atguigu.bigdata.scala.chapter04

object scala04_class {

  def main(args: Array[String]): Unit = {
    println(new C1().age)
  }
}
class C1 extends C{


  var age : Int = _
  val height : Int = 130
}
class C{
  val color : String = "blue"
}

package com.atguigu.bigdata.scala.chapter06

object scala12_object07 {
  def main(args: Array[String]): Unit = {

    new User12("hello")
  }

}
class Parent12(){
  println("111111")
  def this(name:String){
    this()
    println("2222")
  }

}
class User12(name:String) extends Parent12{

  println("3333")
  def this(){
    this("zhangsan")

    println("444434")

  }
}
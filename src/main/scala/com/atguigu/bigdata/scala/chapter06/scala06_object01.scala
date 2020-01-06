package com.atguigu.bigdata.scala.chapter06

object  class06_object01 {

  def main(args: Array[String]): Unit = {
    val user0 = new User06
    println(user0.name)
    user0.login()
  }
}
class User06{

  var name:String = "zhangsan"
  def login()={
    println("login")
  }
}

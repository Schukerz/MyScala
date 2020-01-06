package com.atguigu.bigdata.scala.chapter06

object scala01_object01 {

  def main(args: Array[String]): Unit = {

    //TODO 面向对象

    var user = new User()
    println(user.name)
    println(user.login())
  }

}
class User{

  var name:String = "zhangsan"
  def login():Boolean={
    true
  }
}

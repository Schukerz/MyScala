package com.atguigu.bigdata.scala.chapter06

object scala15_object08 {
  def main(args:Array[String]):Unit={

    //val user:User15.type=User15
    new User15()
    //User15 u = new User15()
    //println(user)
  }
}
object User15{


}
class User15{

    private  def test():Unit={
    println("test")
  }
}

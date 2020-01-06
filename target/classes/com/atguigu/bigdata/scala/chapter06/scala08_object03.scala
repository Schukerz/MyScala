package com.atguigu.bigdata.scala.chapter06

object scala08_object03 {

  def main(args: Array[String]): Unit = {

    val user = new User08()
    new User08("zhangsan")
  }
}
class User08{

  var name :String = "zhangsan"
  def this(name:String){
    this()
  }
  def this(name:String,age:Int){
    this(name)
  }
}

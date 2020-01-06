package com.atguigu.bigdata.scala.chapter06

object scala10_object05 {
  def main(args: Array[String]): Unit = {

//    val user1 = new User10()
    val user = User10.newInstance()
    println(user.name)
  }


}

class User10 private(){
  var name:String = _
}
object User10{
  def newInstance():User10={
    new User10()
  }
}
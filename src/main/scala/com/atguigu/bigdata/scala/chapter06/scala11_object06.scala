package com.atguigu.bigdata.scala.chapter06

object scala11_object06 {
  def main(args: Array[String]): Unit = {
    new User11("zhangsan")
  }

}
class Parent11(name:String){
  println(name)
}
class User11(name:String) extends Parent11(name){
println("user")
}

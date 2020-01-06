package com.atguigu.bigdata.scala.chapter08

object Scala06_Match5 {
  def main(args: Array[String]): Unit = {
    val user = new User06("zhangsan",20)
    val result: String = user match {
      case User06("zhangsan", 20) => "yes" //为什么不能使用new User06("zhangsan",20)?
      case _ => "no"
    }
    println(result)
  }
}
class User06(val name :String,val age:Int)
object User06{
  def apply(name:String,age : Int)={
    new User06(name,age)
  }
  def unapply(user:User06)={
    if(user==null){
      None
    }else{
      Some(user.name,user.age)
    }
  }
}

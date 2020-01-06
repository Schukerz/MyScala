package com.atguigu.bigdata.scala.chapter08

object Scala07_Match6 {
  def main(args: Array[String]): Unit = {
    val user = User07("zhangsan",20)
    val result: String = user match {
      case User07("zhangsan", 20) => "yes"
      case _ => "no"
    }
    println(result)
  }
}
case class User07(val name:String,val age : Int){

}W
package com.atguigu.bigdata.scala.chapter08

object Scala05_Match4 {
  def main(args: Array[String]): Unit = {
    println(new User05("zhangsan"))
    new User05("lisi").name = "hello"
  }
}
case class User05(var name : String ){
//  def apply(name : String) :User05 = new User05()
//  def apply(): User05 = new User05()

}

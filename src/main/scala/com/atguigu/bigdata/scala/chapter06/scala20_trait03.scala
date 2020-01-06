package com.atguigu.bigdata.scala.chapter06

object scala20_trait03 {

  def main(args: Array[String]): Unit = {
    var user = new User20 with MyTrait20
    user.insert()
    user.update()
  }
}
class User20{
  def insert():Unit={
    println("insert..")
  }
}
trait MyTrait20{
  def update():Unit={
    println("update...")
  }
}
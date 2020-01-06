package com.atguigu.bigdata.scala.chapter06

object scala19_trait02 {

  def main(args: Array[String]): Unit = {
    val userExt = new User199(new User19())
    userExt.insert()
    userExt.update()
  }
}
class User19{
  def insert():Unit={
    println("insert...")
  }
}
class User199(user:User19){
  def insert():Unit={
    user.insert()
  }
  def update():Unit={
    println("update..")
  }
}
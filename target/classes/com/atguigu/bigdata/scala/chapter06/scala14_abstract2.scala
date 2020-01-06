package com.atguigu.bigdata.scala.chapter06

object scala14_abstract2 {
  def main(args: Array[String]): Unit = {
    val user1 = new User14()
    user1.test2()
    user1.test()
  }

}
abstract class Parent14{
  //声明普通方法
  def test()={
    println("普通方法")
  }
  //声明抽象方法
  def test2():Unit
}
class User14 extends Parent14{
  def test2():Unit={
    println("test2")
  }

   override def test()={
    println("override test")
  }

}

package com.atguigu.bigdata.scala.chapter06

object scala18_trait {
  def main(args: Array[String]): Unit = {
    val emp = new Emp18()
    println(emp.pname)
  }
}
class Parent18{
  var pname:String = "zhangsan"
}
trait MyTrait18 extends Parent18{
  var name:Int= _
  def test():Unit
  def test2():Unit={
    println("xxxx")
  }
}
class  Emp18 extends MyTrait18{
  def test():Unit={

  }
}
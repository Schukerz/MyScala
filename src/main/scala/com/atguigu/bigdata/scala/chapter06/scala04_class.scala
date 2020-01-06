package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object scala04_class {

  def main(args: Array[String]): Unit = {

    val emp = new Emp()
    println(emp.id)
    println(emp.name)
    println(emp)

  }
}
class Emp{
  var id : Int  = _
  @BeanProperty
  var name:String = _
  private var email:String = _
}
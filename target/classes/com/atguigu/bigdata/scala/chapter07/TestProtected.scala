package com.atguigu.bigdata.scala.chapter07

object TestProtected {

  def main(args: Array[String]): Unit = {
    val c = new UserC()
    c.test()

    val p = new UserP()
    p.address

  }

}
class UserP{
  private var age:Int = _
  protected var name :String = _
  var address : String = _


}
class UserC extends UserP{

  def test():Unit={
    println(name)
  }

}

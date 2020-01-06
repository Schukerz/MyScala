package com.atguigu.bigdata.scala.chapter06

object scala13_abstract1 {

  def main(args: Array[String]): Unit = {

    new User13().test()
    println(new User13().name)
    println(new User13().age)
    println(new Parent13() {
      var age: Int = 3
    }.age)

    val user:User13 = new User13()
    val p :Parent13 = user
    p.test()
    user.t2()
    println(p.getClass)
  }

}
abstract class Parent13{
  val name:String = " xxxxx"
  var age:Int
  def test()={
//    name = "laowang"
  println("hello")
  }
}

class User13 extends Parent13{
  var age : Int = 33
  override def test()={
    println("hhhh")
  }
  def t2()={
    println("t2")
  }
}

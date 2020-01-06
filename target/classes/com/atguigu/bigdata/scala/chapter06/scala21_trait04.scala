package com.atguigu.bigdata.scala.chapter06

object scala21_trait04 {
  def main(args: Array[String]): Unit = {
    new User21()
  }
}
trait trait211{
  println("trait211...")
}
trait trait21 extends trait211{
  println("trait21..")
}
class User211 extends trait211{
  println("user211..")
}
class User21 extends User211 with trait21{
  println("user21..")
}

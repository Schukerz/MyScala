package com.atguigu.bigdata.scala.chapter06

object scala17_trait01 {
  def main(args: Array[String]): Unit = {
    new User17
  }
}

class User17 extends Emp17 with MyTrait17{}
class Emp17 extends MyTrait17{

}
trait  MyTrait17{

}

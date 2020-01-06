package com.atguigu.bigdata.scala.chapter06

object scala22_trait05 {
  def main(args: Array[String]): Unit = {
    new User22()
  }
}
trait Trait22{
  println("trait22")
}
trait Trait222 extends Trait22{
  println("trait222")
}
trait Trait2222 extends Trait22{
  println("trait2222")
}
class User22 extends Trait2222 with Trait222{
  println("user22")
}


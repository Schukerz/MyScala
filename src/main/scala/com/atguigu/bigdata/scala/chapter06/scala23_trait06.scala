package com.atguigu.bigdata.scala.chapter06

object scala23_trait06 {
  def main(args: Array[String]): Unit = {
    val mysql = new MySql()
    mysql.operate
  }
}
trait Operate{
  def operate:Unit= {


    println("Operate...")
  }
}
trait File extends Operate{
  override def operate={
    println("File..")
    super[Operate].operate
    //super.operate


  }

}
trait Memory extends Operate{
  override def operate={
    println("Memory...")
    super.operate
  }

}
class MySql extends Memory with File{

}

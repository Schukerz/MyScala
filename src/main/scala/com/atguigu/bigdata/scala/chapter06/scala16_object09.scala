package com.atguigu.bigdata.scala.chapter06

object scala16_object09 {
  def main(args: Array[String]): Unit = {

    var u : User16 = User16.apply()
    var u2 : User16 = User16()
    var u3 = User16("2019-12-12")
    println(u3)


  }

}
class User16(age:Int=20){
  println(age)
}
object User16{
  //def apply():User16=new User16()
  def apply():User16 = new User16(21)
  import _root_.java.text.SimpleDateFormat
  def apply(date:String)={
   val sdf = new SimpleDateFormat("yyyy-MM-dd")
    sdf.parse(date)

  }
}
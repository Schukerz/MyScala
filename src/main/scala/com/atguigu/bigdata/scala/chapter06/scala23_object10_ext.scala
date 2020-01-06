package com.atguigu.bigdata.scala.chapter06

object scala23_object10_ext {

  def main(args: Array[String]): Unit = {
    val u1 = new User24()
    u1.id = 1
    val u2 = new User24()
    u2.id = 2
    println(u1.equals(u2))
  }

}
class User24{
  var id : Int = _
  override def equals(o:Any):Boolean={
    if(o.isInstanceOf[User24]){
        val other:User24 = o.asInstanceOf[User24]
        other.id == this.id
    }else{
      false
    }
  }
}

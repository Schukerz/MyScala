package com.atguigu.bigdata.scala.chapter01

object Scala_TestTypeTransfer {
  def main(args: Array[String]): Unit = {
    var n1 : Byte = 1
    var n2 : Int = n1
    println(n2)

   // var n3 : Char = n1

    var num : Int = 2.7.toInt
    println(num)

    var n3 : Byte = n2.toByte
    println(n3)

    var n4 : String = true + ""
    var n5 : String = 4.5 + ""
    var n6 :String = 200+ ""

    var n7 : Boolean = n4.toBoolean
    var n8 : Double = n5.toDouble
    var n9 : Int = n6.toInt

    println(n7)
    println(n8)
    println(n9)

    var n10 : Double = 10.0/3
    println(n10)
    println("n10:" + n10.formatted("%.2f"))
  }


}

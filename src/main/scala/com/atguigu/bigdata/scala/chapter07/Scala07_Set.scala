package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala07_Set {
  def main(args: Array[String]): Unit = {
    val set = Set(1,2,3,4,5,4,5)
    println(set)

    val mSet = mutable.Set(1,2,2,3,4,5,6)
    mSet.add(8)
    mSet.update(0,true)
    mSet.update(3,false)
    mSet.update(9,false)

    mSet.remove(8)
    println(mSet)
    mSet.foreach((i:Int)=>{println(i)})
    println(mSet.mkString(","))


  }

}

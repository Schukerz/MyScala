package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks. _
import java.util.{HashMap,ArrayList}
//import java.sql.{Array=> _,Date=> _,_}
object scala03_import {
  def main(args: Array[String]): Unit = {
//    import java.util. _
//    Date d = new Date()
//    breakable{}
   println(new _root_.java.util.HashMap())
    import java.util.{HashMap => JavaHashMap}
    println(new JavaHashMap())
  }


}

//package java{
//  package util{
//   class HashMap{
//
//   }
//  }
//}

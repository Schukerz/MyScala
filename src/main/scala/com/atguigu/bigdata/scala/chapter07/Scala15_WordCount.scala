package com.atguigu.bigdata.scala.chapter07

object Scala15_WordCount {
  def main(args: Array[String]): Unit = {
    val list = List("Hello World","Hello Scala","Hello Scala","Hello Hadoop")
    //拆分
//    println(list.map(_.split(" ")).flatten)

    val words = list.flatMap(_.split(" "))

    //分组
    val wordToMap = words.groupBy(s=>s)
    //计数
    val wordToCount = wordToMap.map((kv) => {
      (kv._1, kv._2.length)
    })
    //排序并获取前三名
    val result = wordToCount.toList.sortWith(
      (left,right)=>{
        if(left._2 > right._2) true else false
      }
    ).take(3)
    println(result)
  }

}

package com.atguigu.bigdata.scala.chapter01

object scala03_TestCharType {

  def main(args: Array[String]): Unit = {
    var name : String = "zhangsan"
    var age : Int = 20
    println(name + " " + age)
    printf("name=%s age=%d \n",name,age)

    val s =
      """
        |select
        | name,
        | age
        |from
        |user
        |where name = "zhangsan"
        """.stripMargin
    println(s)

    val s1=
      s"""
        |select
        | name,
        | age
        |from user
        |where name="$name" and age=  ${ age + 2}
        """.stripMargin
    println(s1)

    val s2 = s"name=$name"
    println(s2)






  }
}

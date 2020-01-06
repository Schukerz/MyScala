package com.atguigu.bigdata.scala.chapter08

object Scala03_Match2 {
  def main(args: Array[String]): Unit = {
     def describe(x : Any):Any = x match {
       case 4 => "Int four"
       case "hello" => "hello"
       case '+' => "plus"
       case true => "true"
       case _ => "xxxx"

     }
//
//    println(describe(4))
//    println(describe(true))
//    println(describe(222))

    def describe2(x:Any)= x match{
      case i:Int =>"Int"
      case s:String => "String"
      case b:Boolean =>"Boolean"
      case c:Char =>"Char"
      case m:Array[Int] => "array"
      case l:List[String] => "List"
      case _ => "default"
    }

//    println(describe2(22))
//    println(describe2("hello"))
    val list = List("a","n","d",1)
    println(describe2(list))
    println(describe2(Array("1", 2, 3, 4)))

    for (arr <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1),
      Array("hello", 90))) { // 对一个数组集合进行遍历
      val result2: String = arr match {
        case Array(0) => "0"
        case Array(1, _) => "1"
        case Array(0, _*) => "2"
        case Array(x, y) => "3"
        case _ =>"hello"
      }
      println(result2)

      println("000000000000000000000000000")
      for (list <- Array(
        List(0),
        List(1, 0),
        List(0, 0, 0),
        List(1, 0, 0),
        List(88))) {

        val result3: String = list match {
          case List(0) => "a"
          case List(x, y) => x + "," + y
          case List(1, _*) => "b"
          case _ => "something"

        }
        println(result3)

        val list2 = List(1,2,3,4,5)
        list2 match{
          case first::second::res => println(first + "-" + second + "-" + res)
          case _ => println("something else")
        }

        for (tuple <- Array(
          (0, 1),
          (1, 0),
          (1, 1),
          (1, 0, 2))) {
          val result6: String = tuple match {
            case (0, _) => "一次就好"
            case (y, 0) => "你说天长,我就递酒"
            case (a, b) => a + "," + b
            case _ => "想看你笑"
          }
          println(result6)

        }
      }
      }
  }
}

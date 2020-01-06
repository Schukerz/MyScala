package com.atguigu.bigdata.scala.chapter07

object Scala14_Method2 {
  def main(args: Array[String]): Unit = {

//    val list1 = List(1,2,3,4)
//    val list2 = List(5,6,7,8)
//    val list3=List(list1,list2)
//    val list4 = List(list3,list1)
//
//    def transform(i:Int):String ={
//      "unit=" + i
//    }
//
//    println(list1.map(transform))
//    println(list1.map(_ + 1))
//
////    println(list3)
//
////    println(list3.flatten)
////    println(list4)
////    println(list4.flatten)
//
//    println(list3.map(list => list.map(_ * 2)).flatten)
//    println(list3.flatMap(_.map(_*2)))
//
//    val list5 = List("Hadoop","Scala","Spark")
//    println(list1.filter(num => num % 2 == 0))
//    println(list5.groupBy(s => s.substring(0,1)))
//
//    //sortBy
//    println(list1.sortBy(num => num))
//    println(list1.sortBy(num => num)(Ordering.Int.reverse))
//
//    val list6 = List("11","2","4","33","3","1")
//    println(list6.sortBy(s => s.toInt))

    val book1 = new Book()
    val book2 = new Book()
    book1.id = 1
    book1.name = "zhangsan"

    book2.id = 1
    book2.name="lisi"

    val books = List(book1,book2)
    println(books.sortWith((b1, b2) => {
      if (b1.id < b2.id) {
        true
      } else if (b1.id == b2.id) {
        b1.name < b2.name
      }
      else {
        false
      }
    }))



  }


}

class Book{
  var id : Int = _
  var name:String = _
  override def toString = s"Book($id, $name)"
}

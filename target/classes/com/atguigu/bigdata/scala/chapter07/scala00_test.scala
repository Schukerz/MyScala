package com.atguigu.bigdata.scala.chapter07

object scala00_test {
  def main(args: Array[String]): Unit = {
    val stu1 = new Student
    stu1.id = 1
    stu1.name="zhangsan"

    val stu2 = new Student
    stu2.id = 1
    stu2.name="lisi"

    val students = List(stu1,stu2)
    students.sortWith(
      (left,right)=>{
        if(left.id<right.id) {
          true
        }else if(left.id==right.id){
          left.name < right.name
        }else{
          false
        }
      }
    )
    println(students)
  }

}
class Student{
  var id:Int = _
  var name:String = _

  override def toString: String =
    this.id+"--" +this.name

}
package com.atguigu.bigdata.scala.chapter02

object Scala03_Hell {

  def main(args: Array[String]): Unit = {

    def f1(): Unit ={
      println("f1...")
    }

    f1
    val f = f1
    println(f)



//    def f2(f:(Int,Int)=>Int):Int={
//      f(20,40)
//    }
//    def f22(x:Int,y:Int):Int={
//      return x+y
//    }
//    println(f2(f22))
//
//    def f2(f:(Int,Int)=>Int):Int={
//      f(20,40)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2(f22))
//
//    def f2(f:(Int,Int)=>Int):Int={
//      f(20,30)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2(f22))

//    def f2(f:(Int,Int)=>Int):Int={

//      f(20,30)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2(f22))

//    def f2(f:(Int,Int)=>Int):Int={
//      f(20,10)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2(f22))

//    def f2(f:(Int,Int)=>Int):Int={
//      f(3,1)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2(f22))
//
//    def f2(f:(Int,Int)=>Int):Int={
//      f(20,30)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
////    println(f2(f22))
//
//    def f2(f:(Int,Int)=>Int):Int={
//      f(2,1)
//    }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2(f22))

 def f2(f:(Int,Int)=>Int):Int={
     f(20,30)
   }
//    def f22(x:Int,y:Int):Int={
//      x+y
//    }
//    println(f2((x:Int,y:Int)=>{x+y}))
    ////    println(f2((x:Int,y:Int)=>x+y))
    ////    println(f2((x,y)=>x+y))





    println(f2(_+_))
/*
    (x,y)=>{x+y}
    (x:Int,y:Int)=>{x+y}
    f(x:Int,y:Int):Int={
      x+y
    }
 */




  }

}

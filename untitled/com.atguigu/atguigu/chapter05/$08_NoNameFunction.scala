package com.atguigu.chapter05

object $08_NoNameFunction {

  /**
    * 匿名函数: 没有函数名的函数称之为匿名函数
    * 匿名函数一般用于给高阶函数传值使用
    *
    */
  def main(args: Array[String]): Unit = {

    val func = (x:Int,y:Int) => x+y

    println(func(10, 20))

    //println(((x: Int, y: Int) => x + y)(10, 20))

    //TODO 匿名函数一般用于给高阶函数传值使用
    m1(10,20,(x:Int,y:Int) => x+y )
  }

  def m1(x:Int,y:Int, func: (Int,Int)=>Int) = {
    func(x,y)
  }


}

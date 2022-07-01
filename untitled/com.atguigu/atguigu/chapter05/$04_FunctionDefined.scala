package com.atguigu.chapter05

object $04_FunctionDefined {

  /**
    * 函数的定义语法:  val/var 函数名[:类型] = ( 参数名:类型,...) => { 函数体 }
    * 函数的简化: 如果函数体中只有一行语句,{}可以省略
    * 方法就是函数,函数也是对象[匿名子类对象]
    * 函数的类型: (参数类型,参数类型,...) => 返回值类型
    *
    *
    */
  def main(args: Array[String]): Unit = {

    //TODO 函数是对象, add是对象的引用,可以调用对象的apply方法
    //TODO scala中apply方法名可以省略
    println(add.apply(10, 20))

    //TODO func是对象的引用,对象没有调用方法,打印的是内存地址
    println(func)

    println(add2(10, 20))

    //TODO 函数是对象,func其实就是对象的引用
    //TODO f与func指向同一个对象
    val f = func

    f()

  }

  //定义一个函数,函数有两个Int类型参数,函数的返回值为Int类型
  val add = (x:Int, y:Int) => x+y

  val func = () => println("hello....")

  val add2 = new Function2[Int,Int,Int]{
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }
}

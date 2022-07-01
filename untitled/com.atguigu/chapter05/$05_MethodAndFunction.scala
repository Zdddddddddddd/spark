package com.atguigu.chapter05

object $05_MethodAndFunction {

  /**
    * 方法和函数的区别
    *     1、方法如果定义在class/object中可以重载,函数是对象,函数名就是变量名,同一个作用域不允许有同名变量,函数不可以重载
    *     2、方法存储在方法区中,函数是对象保存在堆中
    * 方法和函数的联系
    *     1、方法如果定义在方法中,其实就是函数,此时不可以重载的
    *     2、方法可以手动转成函数, 使用 方法名 _ 转换
    *
    */
  def main(args: Array[String]): Unit = {

    def m2(x:Int) = x * 10
    //def m2(x:Int,y:Int) = x * y

    //println(m2(10))

    val f = m2 _
    println(f(20))
  }

  //TODO 函数是对象,函数名就是变量名,同一个作用域不允许有同名变量,函数不可以重载
  val func = (x:Int) => x * x
  //val func = (x:Int,y:Int) => x * y

  //TODO 方法如果定义在class/object中可以重载
  //方法重载
  def m1(x:Int):Int = x * x

  def m1(x:Int,y:Int):Int = x * y
}

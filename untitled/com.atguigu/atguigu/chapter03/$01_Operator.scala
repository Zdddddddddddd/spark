package com.atguigu.chapter03

import com.atguigu.chapter01.HelloWordTest

object $01_Operator {

  /**
    * java运算符
    *     算术运算符: + - * / % ++ --
    *     逻辑运算符: && | !
    *     比较运算符: > < >= <= == !=
    *     位运算符: << >>> >> ^
    *     赋值运算符: += -= *= /= %=
    *     三元运算符: 布尔表达式? true的逻辑: false的逻辑
    * java的==是用于判断值是否相等/对象地址是否相等。
    *
    *
    * scala的运算符中没有++、 --、 三元运算符
    * scala运算符
    *     算术运算符: + - * / %
    *     逻辑运算符: && | !
    *     比较运算符: > < >= <= == !=
    *     位运算符: << >>> >> ^
    *     赋值运算符: += -= *= /= %=
    *scala的==是用于判断值是否相等
    *scala的运算符是一个个的方法。
    *scala的调用方式:
    *     1、对象.方法名(参数值,...)
    *     2、对象 方法名 (参数值,...) [如果方法只有一个参数,（）可以省略]
    */
  def main(args: Array[String]): Unit = {

    val a = 10
    val b = 10
    println(a == b)

    val s1 = new String("lisi")
    val s2 = new String("lisi")

    //TODO 判断值是否相等
    println(s1 == s2)

    //TODO 判断对象是否相同
    println(s1.eq(s2))

    //TODO 2、对象 方法名 (参数值,...) [如果方法只有一个参数,（）可以省略]
    println(1+(2) )
    println(1+2 )

    val obj = new HelloWordTest()
    //TODO 1、对象.方法名(参数值,...)
    obj.main(null)

    //TODO 2、对象 方法名 (参数值,...) [如果方法只有一个参数,（）可以省略]
    obj main null
  }
}

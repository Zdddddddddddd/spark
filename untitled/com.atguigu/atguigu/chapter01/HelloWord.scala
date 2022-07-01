package com.atguigu.chapter01

import com.atguigu.chapter06.Student

/**
  * scala object中所有属性和方法都是类似java static修饰的,可以通过 类名.属性名/类名.方法名 方式调用
  * scala class中所有属性和方法都是类似java 非static修饰的,可以通过 对象.属性名/对象.方法名 方式调用
  *
  * java中main的语法: public static void main(String[] args){....}
  *
  * scala中没有public关键字,默认就是public效果的
  * scala程序入口的main方法必须定义在object中,只有object中才是静态的.
  * scala Unit就相当于java的void
  * def是defined的缩写,def就是相当于方法的标识符。
  * Array是代表数组
  * Array[String]代表字符串数组
  *
  * command execute failed错误: 将settings -> maven->runner -> 第一个勾勾去掉
  *
  */
object HelloWord {

  def main(args: Array[String]): Unit = {


    //TODO scala静态调用与java静态调用语法一样: 类名.属性名/类名.方法名
    System.out.println("hello....")

    println("hello........")

    val obj = new HelloWordTest()
    obj.main(null)

    val student = new Student
    //student.admin
  }

}

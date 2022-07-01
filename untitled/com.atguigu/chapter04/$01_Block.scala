package com.atguigu.chapter04

object $01_Block {

  /**
    * java的流程控制语句: 分支判断[if语句、switch]、for循环、while循环、do-while循环
    *
    * scala中没有switch语句。
    *
    * 块表达式: 由{}包裹的一段代码称之为块表达式,块表达式有返回值,返回值是{}中最后一个语句的结果值
    */
  def main(args: Array[String]): Unit = {

    val b = {
      val a = 10
      val b =20
      a+b
      println("hello.....")
    }

    println(b)
    20
  }

}

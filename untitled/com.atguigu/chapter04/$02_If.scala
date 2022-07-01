package com.atguigu.chapter04

object $02_If {

  /**
    * java中if分支判断语法:
    *       1、单分支: if(布尔表达式) { .... }
    *       2、双分支: if(布尔表达式) { .... }  else {....}
    *       3、多分支: if(布尔表达式) { .... } else if(...){...} .... else {....}
    *
    * scala中if分支判断语法:
    *       1、单分支: if(布尔表达式) { .... }
    *       2、双分支: if(布尔表达式) { .... }  else {....}
    *       3、多分支: if(布尔表达式) { .... } else if(...){...} .... else {....}
    * scala if分支判断有返回值,返回值是符合条件的分支的块表达式的结果值。
    */
  def main(args: Array[String]): Unit = {

    val a = 10

    val r = if(a%3==0){
      println("a是3的倍数")
      "hello"
    }else if(a%4==0){
      println("a是4的倍数")
      20
    }else{
      println("其他....")
      30
    }

    println(r)

  }
}

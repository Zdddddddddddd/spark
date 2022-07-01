package com.atguigu.chapter05

object $11_Recursive {

  /**
    * 递归: 自己调用自己
    *     scala递归的前提:
    *           1、必须要有退出条件,不能死循环
    *           2、递归方法必须要定义返回值类型
    */
  def main(args: Array[String]): Unit = {


    def m1(n:Int):Int = {

      if(n==1) 1
      else n * m1(n-1)
    }

    println(m1(5))
  }
}

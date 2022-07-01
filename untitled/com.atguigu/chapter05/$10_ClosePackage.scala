package com.atguigu.chapter05

object $10_ClosePackage {

  /**
    * 闭包: 在函数体中使用了外部变量的函数就是闭包
    */
  def main(args: Array[String]): Unit = {

    val y = 10

    //TODO 闭包函数【函数体中使用了外部变量y】
    val func = (x:Int) => {
      x + y
    }
  }
}

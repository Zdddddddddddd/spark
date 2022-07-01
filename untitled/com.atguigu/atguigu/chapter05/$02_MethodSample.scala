package com.atguigu.chapter05

object $02_MethodSample {

  /**
    *方法的简化原则
    *     1、如果方法体中只有一行语句,方法体的{}可以省略
    *     2、如果要将方法体块表达式的结果值作为方法的返回值,方法的返回值类型可以省略,scala会自动根据方法体块表达式自动推断类型
    *         注意: 如果方法体中有return关键字,此时返回值类型必须指定
    *     3、如果方法不需要参数,参数列表的()可以省略
    *         注意:
    *             1、如果定义方法的时候省略了参数列表的(),在调用方法的时候不能带上()
    *             2、如果定义方法的时候没有省略参数列表的(),在调用方法的时候()可有可无
    *     4、如果方法不需要返回值,=可以省略[ = 与{}不能同时省略 ]
    *
    */
  def main(args: Array[String]): Unit = {

    println(add2(10, 20))


    //TODO 1、如果定义方法的时候省略了参数列表的(),在调用方法的时候不能带上()
    printHello2

    //TODO 2、如果定义方法的时候没有省略参数列表的(),在调用方法的时候()可有可无
    printHello
  }

  /**
    * 方法标准定义形式
    * @param x
    * @param y
    * @return
    */
  def add( x:Int, y:Int ):Int = {
    x+y
  }

  /**
    * 方法标准定义形式
    */
  def printHello():Unit = {

    println("hello......")
  }

  //TODO 1、如果方法体中只有一行语句,方法体的{}可以省略
  def add2(x:Int,y:Int):Int = x+y

  //TODO 2、如果要将方法体块表达式的结果值作为方法的返回值,方法的返回值类型可以省略,scala会自动根据方法体块表达式自动推断类型
  def add3(x:Int,y:Int) = x+y

  //TODO 如果方法体中有return关键字,此时返回值类型必须指定
  def add4(x:Int,y:Int):Int = {

    if(y==0)
      return -1
    x+y
  }

  //TODO 如果方法不需要参数,参数列表的()可以省略
  def printHello2 =  println("hello.....")

  //TODO 4、如果方法不需要返回值,=可以省略[ = 与{}不能同时省略 ]
  def printHello3 {
    println("hello.....")
  }
}


package com.atguigu.chapter02

object $01_ParamDefined {

  /**
    * 变量/常量的定义语法: val/var 变量名:类型 = 值
    *     val与var的区别:
    *         val修饰的是常量,类似java final修饰的,不能修改值
    *         var修饰的是变量,类似java非final修饰的,可以修改值
    *     定义变量/常量的时候,类型可以省略,省略之后scala会根据值自动推断类型
    *     scala在定义变量/常量的时候必须要初始化
    *
    *     scala如果一行只写一个语句,此时分号可以省略
    */
  def main(args: Array[String]): Unit = {

    val name:String = "lisi"

    //TODO val修饰的是常量,类似java final修饰的,不能修改值
    //name = "zhagnsan"
    var age:Int = 20

    //TODO var修饰的是变量,类似java非final修饰的,可以修改值
    age = 100
    println(name)
    println(age)

    //TODO 定义变量/常量的时候,类型可以省略,省略之后scala会根据值自动推断类型
    val sex = "man"
    println(sex)

    //TODO scala在定义变量/常量的时候必须要初始化
    //val address:String
  }
}

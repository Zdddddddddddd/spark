package com.atguigu.chapter06

object $02_FieldsAndMethod {

  class Person{

    val name = "lisi"

    var age = 20
    //TODO scala的修饰符默认是public
    private val sex = "man"

    //TODO private[包名] 修饰符代表只能在指定包中使用,其他包无法使用
    private[chapter06] val admin = "role"

    //TODO scala中var修饰的属性可以使用_赋予初始值,使用_赋予初始值的时候必须指定属性的类型。
    var address:Boolean = _


    private def m1(x:Int,y:Int) = x + y

    def m2(x:Int,y:Int) = x * y


  }


  /**
    * java定义属性: [访问修饰符] 类型 属性名[ = 值]
    *
    *
    * scala定义属性: [访问修饰符] val/var 属性名:类型 = 值
    *   scala中var修饰的属性可以使用_赋予初始值,使用_赋予初始值的时候必须指定属性的类型。
    * scala的访问修饰符: protect、private,默认就是public
    *
    * scala定义方法: [访问修饰符] def 方法名(参数名:类型,...):返回值类型 = {方法体}
    */
  def main(args: Array[String]): Unit = {

    val person = new Person

    println(person.name)
    //person.name = "zhangsan"
    println(person.age)

    person.age = 22

    println(person.age)

    println(person.address)

    //person.sex

    //var a:Int = _

    println(person.m2(10, 20))
  }
}


class Student{

  val name = "lisi"

  var age = 20
  //TODO scala的修饰符默认是public
  private val sex = "man"

  //TODO private[包名] 修饰符代表只能在指定包中使用,其他包无法使用
  private[chapter06] val admin = "role"

  //TODO scala中var修饰的属性可以使用_赋予初始值,使用_赋予初始值的时候必须指定属性的类型。
  var address:Boolean = _


  private def m1(x:Int,y:Int) = x + y

  def m2(x:Int,y:Int) = x * y


}
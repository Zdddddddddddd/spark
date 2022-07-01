package com.atguigu.chapter06



object $06_ObjectClass {

  /**
    * 伴生类[class]与伴生对象[object]
    *     1、class与object名称必须一样
    *     2、class与object必须在同一个.scala源文件中
    *
    * 伴生类和伴生对象可以互相访问对方的private修饰的成员
    *
    * apply方法: 必须定义在object中,主要用于简化对象的创建
    * 有了apply方法之后,可以使用 object名称.apply(..) / object名称(...)  创建class的对象
    */
  def main(args: Array[String]): Unit = {

    println(Animal.age)

    println(new Animal().name)

    println(new Animal().getSex())

    println(Animal.getColor())

    //TODO 有了apply方法之后,可以使用 object名称.apply(..) / object名称(...)  创建class的对象
    val animal = Animal()
    println(animal.name)
  }
}

class Animal{

  val name = "lisi"

  private val color = "red"

  def getSex() = {
    //TODO 伴生类调用伴生对象的私有成员
    Animal.sex
  }
}

object Animal {

  val age = 20

  private val sex = "man"

  def getColor() = {
    //TODO 伴生对象调用伴生类的私有成员
    new Animal().color
  }

  def apply() = new Animal()
}
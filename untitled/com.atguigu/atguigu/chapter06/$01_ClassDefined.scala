package com.atguigu.chapter06

object $01_ClassDefined {

  class Person

  /**
    * java定义类: [访问修饰符] class 类名{....}
    * java中创建对象: new 类名(...)
    *
    * scala定义类: [访问修饰符] class 类名{...}
    * scala中创建对象: new 类名(...)
    */
  def main(args: Array[String]): Unit = {

    val person = new Person
    println(person)

    val student = new Student
    println(student.admin)
  }
}



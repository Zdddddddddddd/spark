package com.atguigu.chapter02

object $04_DatatType {

  /**
    * java数据类型
    *     1、基本数据类型
    *         byte、short、int、long、float、double、char、boolean
    *     2、引用类型
    *         String、数组、集合、java class
    *
    * scala是完全面向对象
    * Any: 所有类的父类
    *    AnyVal: 值类型
    *       Byte、Short、Int、Long、Float、Double、Char、Boolean
    *       Unit: 相当于java的void，有一个实例()
    *       Stringops: 是对java补充的一些列的统称
    *    AnyRef: 引用类型
    *       String、java数组、java集合、scala数组/集合、java class、scala class
    *           Null: 是所有引用类型的子类,有一个null, null一般用于给引用类型变量赋予初始值,但是在赋予初始值的时候必须指定变量的类型。
    * Nothing: 所用类型的子类,是scala内部使用。
    */
  def main(args: Array[String]): Unit = {

    val a: Unit = ()
    //TODO null一般用于给引用类型变量赋予初始值,但是在赋予初始值的时候必须指定变量的类型。
    //var name = null
    //name = "lisi"
    var name:String = null
    name = "lisi"

    //var b:Int = null
    //println(b)

    /*val xx = {
      throw new Exception
    }*/
  }
}

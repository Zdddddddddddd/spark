package com.atguigu.chapter06

object $05_Object {

  val name  ="lisi"
  /**
    * object修饰的就是单例
    * 获取object单例的对象: object名称
    *
    * object中所有的属性和方法都是类似java static修饰的,可以通过 object名称.成员名 的方式调用
    * class中所有的属性和方法都是类似java 非static修饰的,可以通过 对象.成员名 的方式调用
    */
  def main(args: Array[String]): Unit = {

    //TODO object修饰的就是单例
    //TODO  获取object单例的对象: object名称
    println( $05_Object )
    println( $05_Object )
    println( $05_Object )
    println( $05_Object )

    //TODO object中所有的属性和方法都是类似java static修饰的,可以通过 object名称.成员名 的方式调用
    println($05_Object.name)
  }
}

package com.atguigu.chapter02

object $05_Cover {

  /**
    * java中数字与数字的转换
    *     1、低精度转高精度[int->long]: 自动转换
    *     2、高精度转低精度[long->int]: 强转
    * java中数字与字符串的转换
    *     1、字符串转数字: parseXXX、valueOf
    *     2、数字转字符串: 与空字符串拼接
    *
    * scala中数字与数字的转换
    *     1、低精度转高精度[int->long]: 自动转换
    *     2、高精度转低精度[long->int]: toXXX方法
    * java中数字与字符串的转换
    *     1、字符串转数字: toXXX方法
    *     2、数字转字符串: 拼接、toString
    */
  def main(args: Array[String]): Unit = {

    //TODO 1、低精度转高精度[int->long]: 自动转换
    val a:Int = 10
    val b:Long = a
    println(b)

    //TODO 2、高精度转低精度[long->int]: 强转
    val c:Short = b.toShort
    println(c)

    //TODO 1、字符串转数字: toXXX方法
    val s = "10"
    val d:Int = s.toInt
    val d1:Int = Integer.valueOf(s)
    println(d1)
    //println(d)

    //TODO 2、数字转字符串: 与空字符串拼接
    val s2:String = a+""
    val s3:String = s"${a}"
    val s4:String = a.toString
    println(s2)
    println(s3)
    println(s4)
  }
}

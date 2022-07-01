package com.atguigu.chapter05

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object $03_MethodParams {

  /**
    * scala方法参数
    *     1、默认值参数: 在定义方法的时候给方法的参数指定默认值, 方法参数指定默认值之后,后续调用的时候就可以不用传值。
    *           语法: def 方法名(参数名:类型 = 默认值,... ):返回值类型 = { 方法体 }
    *           注意: 默认值参数一般放在参数列表的最后
    *    2、带名参数: 在调用方法的时候指定将值传递给哪个参数
    *    3、可变参数: 在定义方法的时候指定参数为可变参数, 后续调用方法的时候可以给可变参数传递任意多个类型的值。
    *         语法: def 方法名(参数名:类型,... ,参数名:类型*):返回值类型 = { 方法体 }
    *         注意:
    *             1、可变参数必须放在参数列表的最后面
    *             2、可变参数不能与默认值参数一起使用
    *             3、可变参数不能直接传递数组/集合,如果想要将数组/集合的元素传递给可变参数,必须通过 数组名:_* 的方式传递
    */
  def main(args: Array[String]): Unit = {

    println(add(10, 20))

    println(add2())

    println(add3(500))

    //TODO 带名参数: 在调用方法的时候指定将值传递给哪个参数
    println(add4(y = 600, x=10))

    println(sum(10, 20, 40, 50, 60, 70))

    val arr = Array(1,3,2,4,5,6,7)
    //sum(10,20,arr)

    val paths = getPaths("/user/hive/warehouse/user_log",6)

    //
    readPaths(paths:_*)
  }

  def add(x:Int,y:Int):Int = x+y
  //TODO 1、默认值参数: 在定义方法的时候给方法的参数指定默认值, 方法参数指定默认值之后,后续调用的时候就可以不用传值。
  def add2(x:Int=100,y:Int=200):Int = x+y

  //TODO 注意: 默认值参数一般放在参数列表的最后
  def add3(y:Int,x:Int=100):Int = x+y


  def add4(x:Int=100,y:Int):Int = x+y

  //TODO 可变参数: 在定义方法的时候指定参数为可变参数, 后续调用方法的时候可以给可变参数传递任意多个类型的值。
  def sum(x:Int,y:Int,z:Int*) = x + y + z.sum


  // /user/hive/warehouse/user_log/2022-05-30
  // /user/hive/warehouse/user_log/2022-05-29
  // /user/hive/warehouse/user_log/2022-05-28
  // /user/hive/warehouse/user_log/2022-05-27
  // /user/hive/warehouse/user_log/2022-05-26
  // /user/hive/warehouse/user_log/2022-05-25
  // /user/hive/warehouse/user_log/2022-05-24
  // 统计最近7天用户注册数
  /**
    *
    * @param pathPrefix 目录前缀 【/user/hive/warehouse/user_log】
    * @param n 前N天 【5】
    */
  def getPaths( pathPrefix:String, n:Int ) = {

    //获取当前日期
    val currentDate = LocalDateTime.now()
    //遍历拼接
    for( i<- 1 to n ) yield{
      //日期加减法
      val time = currentDate.plusDays(-i)

      //格式化日期
      val timestr = time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

      s"${pathPrefix}/${timestr}"
    }
  }


  def readPaths(path:String*): Unit = {
    //模拟读取所有目录数据
    println(path)
  }
}

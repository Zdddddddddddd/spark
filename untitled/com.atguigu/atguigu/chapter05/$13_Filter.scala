package com.atguigu.chapter05

object $13_Filter {

  /**
    * 2、按照指定的规则对集合数据进行过滤
    * 数据: Array(1,4,3,6,7,9,10)
    * 规则: 保留偶数[动态]
    * 结果: Array(4,6,10)
    */
  def main(args: Array[String]): Unit = {

    val arr = Array(1,4,3,6,7,9,10)

    val func = (x:Int) => x %2 == 0
    val func2 = (x:Int) => x %2 != 0
    println(filter(arr,func2).toList)
    //TODO 直接传递函数值
    println(filter(arr,(x:Int) => x %2 != 0 ).toList)
    //TODO 省略函数参数类型
    println(filter(arr,(x) => x %2 != 0 ).toList)
    //TODO 函数只有一个参数,参数列表的()可以省略
    println(filter(arr,x => x %2 != 0 ).toList)
    //TODO 函数的参数在函数体中只使用了一次可以用_简化
    println(filter(arr,_ %2 != 0 ).toList)
  }

  def filter(arr:Array[Int],func: Int => Boolean) = {

    for( element<- arr if( func(element) ) ) yield{
      element
    }
  }
}

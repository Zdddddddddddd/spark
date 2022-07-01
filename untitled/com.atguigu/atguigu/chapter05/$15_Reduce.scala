package com.atguigu.chapter05

object $15_Reduce {

  /**
    * 4、按照指定规则对集合所有元素进行聚合
    * 数据: Array(10,30,20,50)
    * 规则: 求和[动态]
    * 结果: 110
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val arr = Array(10,30,20,50)

    val func = (x:Int,y:Int) => x * y
    println(reduce(arr,func))
    //TODO 直接传递函数值
    println(reduce(arr,(x:Int,y:Int) => x * y ))
    //TODO 省略参数类型
    println(reduce(arr,(x,y) => x + y ))
    //TODO 用_简化
    println(reduce(arr,_+_ ))
  }


  def reduce(arr:Array[Int],func: (Int,Int) => Int) = {

    var tmp = arr(0)
    for( i <- 1 until arr.length ) {

      tmp = func(tmp,arr(i))
    }

    tmp

  }
}

package com.atguigu.chapter05

object $12_Map {

  /**
    * 1、按照指定的规则获取集合中每个元素操作之后返回结果
    * 数据: Array("hello","hadoop","flume","spark","kafka")
    * 规则: 获取每个元素的长度[动态]
    * 结果: Array(5,6,5,5,5)
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val arr = Array("hello","hadoop","flume","spark","kafka")

    val func = (x:String) => x.length
    val func2 = (x:String) => x.charAt(0)
    println( map(arr,func).toList )
    println( map(arr,func2).toList )
    //TODO 直接传递函数值
    println( map(arr,(x:String) => x.charAt(0) ).toList )
    //TODO 省略函数参数类型
    println( map(arr,(x) => x.charAt(0) ).toList )
    //TODO 函数只有一个参数,参数列表的()可以省略
    println( map(arr,x => x.charAt(0) ).toList )
    //TODO 函数的参数在函数体中只使用了一次可以用_简化
    println( map(arr,_.charAt(0) ).toList )
  }

  def map( arr:Array[String],func: String => Any ) = {

    for( element<- arr ) yield{
      //element.length
      //element.charAt(0)
      func(element)
    }
  }
}

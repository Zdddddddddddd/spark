package com.atguigu.chapter05

object $16_MaxBy {

  /**
    * 5、按照指定规则获取集合中最大元素
    * 数据: Array("zhangsan 20 4500","lisi 33 6800","hanmeimei 18 10000")
    * 规则: 获取年龄最大的人
    * 结果: "lisi 33 6800"
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val arr = Array("zhangsan 20 4500","lisi 33 6800","hanmeimei 18 10000")

    val func = (x:String) => x.split(" ")(2).toInt
    println(maxBy(arr,func))
    //TODO 直接传递函数值
    println(maxBy(arr,(x:String) => x.split(" ")(2).toInt ))
    //TODO 省略参数类型
    println(maxBy(arr,(x) => x.split(" ")(2).toInt ))
    //TODO 省略参数列表的()
    println(maxBy(arr,x => x.split(" ")(2).toInt ))
    //TODO 用_简化
    println(maxBy(arr,_.split(" ")(2).toInt ))
  }

  def maxBy(arr:Array[String],func: String => Int) ={

    var tmp = func(arr(0))
    var tmpElement = arr(0)
    for( element<- arr ){

      val age = func(element)

      if(age>tmp){
        tmp = age
        tmpElement = element
      }

    }

    tmpElement
  }
}

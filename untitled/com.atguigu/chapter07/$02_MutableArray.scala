package com.atguigu.chapter07

import scala.collection.mutable.ArrayBuffer


object $02_MutableArray {

  def main(args: Array[String]): Unit = {

    //TODO 可变数组的创建方式1: new ArrayBuffer[元素类型]()
      val arr1 = new ArrayBuffer[Int]()
    //TODO 可变数组的创建方式2: ArrayBuffer[元素类型](初始元素,...)
      val arr2 = ArrayBuffer[Int](1,4,3)

    println(arr1)
    println(arr2)

    //TODO 添加元素
    val arr3 = arr2.+:(10)
    println(arr3)

    val arr4 = arr2.:+(20)
    println(arr4)

    arr2.+=(30)
    println(arr2)

    arr2.+=:(40)
    println(arr2)

    val arr5 = arr2.++( Array(11,22,33) )
    println(arr5)

    val arr6 = arr2.++:(Array(55,66,77))
    println(arr6)

    arr2.++=(Array(111,222,111))
    println(arr2)

    arr2.++=:(Array(666,777,888))
    println(arr2)

    //TODO 删除元素
    val arr7 = arr2.-(111)
    println(arr7)

    arr2.-=(666)
    println(arr2)

    val arr8 = arr2.--(Array(4,1,3,111,111,222))
    println(arr8)

    arr2.--=(Array(777,888))
    println(arr2)

    //TODO 获取角标元素
    println(arr2(0))

    //TODO 修改角标的值
    arr2(0)=4000
    println(arr2)

    //TODO 遍历
    for( i<- arr2){
      println(i)
    }

    //TODO 可变转不可变
    val arr10 = arr2.toArray
  }
}

package com.atguigu.chapter07

object $01_ImmutaleArray {


  /**
    * 集合通用的添加、删除元素方法的区别
    *     带+与带-方法的区别:
    *         带+是添加元素
    *         带-是删除元素
    *     一个+/-与两个+/-的区别:
    *         一个+/-是添加/删除单个元素
    *         两个+/-是添加/删除一个集合所有元素
    *    冒号在前、冒号在后以及不带冒号的区别
    *       冒号在前、不带冒号是将元素添加在集合最后面
    *       冒号在后是将元素添加在集合最前面
    *    带=与不带=的方法区别
    *       不带=是添加、删除元素的时候,原集合不变,生成新集合
    *       带=是向原集合中添加、删除元素
    *
    */
  def main(args: Array[String]): Unit = {

    //TODO 创建数组方式1: new Array[元素类型](长度)
    val arr = new Array[Int](5)
    println(arr.toList)
    //TODO 创建数组方式2[使用apply方法创建]: Array[元素类型](初始元素,.....) [常用]
    val arr2 = Array[Int](1,4,3,2)
    println(arr2.toList)

    //TODO 添加元素
    val arr3 = arr.+:(10)
    println(arr3.toList)
    println(arr.toList)

    val arr4 = arr.:+(20)
    println(arr4.toList)

    val arr5 = arr.++( Array(11,22,33,44) )
    println(arr5.toList)
    println(arr.toList)

    val arr6 = arr.++:(Array(66,77,88,99))
    println(arr6.toList)

    //TODO 删除元素

    //TODO 获取指定角标元素: 数组名(角标)
    println(arr6(0))

    //TODO 修改指定角标元素值
    arr6(0)=666
    println(arr6.toList)


    //TODO 不可变转可变
    println(arr6.toBuffer)

    //TODO 创建多维数组
    val arr10 = Array.ofDim[Int]( 4,3 )

    println(arr10.length)
    println(arr10(0).length)

  }
}

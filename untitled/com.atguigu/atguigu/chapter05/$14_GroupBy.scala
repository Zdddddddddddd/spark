package com.atguigu.chapter05

import java.util

object $14_GroupBy {

  /**
    * 3、按照指定的规则对集合元素进行分组
    * 数据: Array("zhangsan man beijing","lisi woman shanghai","zhaoliu man beijing","hanmeimei woman shenzhen")
    * 规则: 按照性别分组[动态]
    * 结果: Map( man -> List( "zhangsan man beijing", "zhaoliu man beijing" ) , woman -> List( "lisi woman shanghai" ,"hanmeimei woman shenzhen" ) )
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val arr = Array("zhangsan man beijing","lisi woman shanghai","zhaoliu man beijing","hanmeimei woman shenzhen")

    val func = (x:String) => x.split(" ")(1)
    println(groupBy(arr,func))
  }

  def groupBy(arr:Array[String],func: String => String)= {

    val resultMap = new util.HashMap[String,util.List[String]]()

    for(element<- arr){

      //val key = element.split(" ")(1)
      val key = func(element)

      if(resultMap.containsKey(key)){

        val list = resultMap.get(key)
        list.add(element)
      }else{

        val list = new util.ArrayList[String]()
        list.add(element)

        resultMap.put(key,list)
      }
    }

    resultMap
  }
}

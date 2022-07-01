package com.atguigu.chapter04

object $03_For {

  /**
    * for循环的两个方法
    *     to方法
    *         用法: start.to(end) / start to end
    *         to方法生成是左右闭合的集合
    *     until方法
    *         用法: start.until(end) / start until end
    *         until方法生成的左闭右开的集合
    *
    *
    * for循环基本语法: for( 变量 <- 集合/数组/表达式 ) {.....}
    * for循环守卫: for( 变量 <- 集合/数组/表达式 if(布尔表达式) ) {.....}  【此时每次循环的时候,都会使用守卫if判断是否满足条件,如果满足条件才会执行循环体】
    * for循环yield表达式:
    *     for循环的循环体的块表达式默认是没有返回值,如果想要for循环的块表达式有结果值需要使用yield关键字
    *     语法:  for( 变量 <- 集合/数组/表达式 ) yield{.....}
    */
  def main(args: Array[String]): Unit = {

    //val ra = 1.to(10).by(3)
    val ra = 1 to 10 by 3
    println(ra.toList)

    val ra2 = 1.until(10)
    println(ra2.toList)


    //TODO for循环基本语法: for( 变量 <- 集合/数组/表达式 ) {.....}
    for(i<- 1 to 10) {
      println(s"i=${i}")
    }

    //TODO for循环嵌套分支判断
    for( j  <- 1 to 10 ){
      //println(s"j1=${j}")
      if(j %2==0 ){
        println(s"j=${j}")
      }
    }

    //TODO 守卫
    for( k <- 1 to 10 if(k%2==0)){
      println(s"k=${k}")
      k
    }

    //TODO for循环yield表达式
    val r = for( k <- 1 to 10 if(k%2==0)) yield{
      println(s"k=${k}")
      k * 10
    }

    println(r)
  }
}

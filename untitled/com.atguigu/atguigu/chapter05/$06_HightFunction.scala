package com.atguigu.chapter05

object $06_HightFunction {

  /**
    * 高阶函数: 以函数作为参数/返回值的方法或者函数称之为高阶函数
    * 高阶函数的简化:
    *     1、可以直接传递函数值
    *     2、可以省略函数的参数类型
    *     3、函数如果只有一个参数,参数列表的()可以省略
    *     4、函数的参数如果在函数体中只使用了一次可以用_代替
    *          以下三种情况不能用_简化:
    *             1、针对函数有多个参数的情况: 函数的参数的使用顺序与定义顺序如果不一致,不能用_简化
    *             2、针对函数体中有()并且函数的参数在函数体中的()中以表达式形式存在,不能用_简化
    *             3、针对函数只有一个参数并且在函数体中直接返回函数的参数,不能用_简化
    */
  def main(args: Array[String]): Unit = {

/*    val func = new Function2[Int,Int,Int] {
      override def apply(v1: Int, v2: Int): Int = v1+v2
    }*/

    val func = (x:Int,y:Int) => x+y

    println(add(10, 20, func))
    //TODO 1、可以直接传递函数值
    println(add(10, 20, (x:Int,y:Int) => x+y ))
    //TODO 2、可以省略函数的参数类型
    println(add(10, 20, (x,y) => x+y ))
    //TODO 4、函数的参数如果在函数体中只使用了一次可以用_代替
    println(add(10, 20, _+_ ))


    //TODO 4.1、针对函数有多个参数的情况: 函数的参数的使用顺序与定义顺序如果不一致,不能用_简化[第N个下划线代表函数第N个参数]
    println(add(10, 20, (x,y) => y-x ))
    //println(add(10, 20, _-_ ))

    //TODO 4.2、针对函数体中有()的情况并且函数的参数在函数体中的()中以表达式形式存在,不能用_简化
    println(add(10,20, (x,y)=> (x+1)*y ))
   // println(add(10,20, (_+1)*_ ))
      //Error:(39, 30) missing parameter type for expanded function ( (b) => ( (x) => x.$plus(1)) .$times(b) )
    //println(20.$times(10))

    val fc = (x:String) => println(s"hello:${x}")
    sayHello("zhangsan",fc )
    ////TODO 1、可以直接传递函数值
    sayHello("zhangsan", (x:String) => println(s"hello:${x}")  )
    // TODO 2、可以省略函数的参数类型
    sayHello("zhangsan", (x) => println(s"hello:${x}")  )
    // TODO 3、函数如果只有一个参数,参数列表的()可以省略
    sayHello("zhangsan", x => println(s"hello:${x}")  )

    //TODO 4.3、针对函数只有一个参数并且在函数体中没有任何操作直接返回函数的参数,不能用_简化
    sayHello("zhangsan", x => x  )
    //sayHello("zhangsan", _  )
  }

  /**
    * 高阶函数
    * @param x
    * @param y
    * @param func
    * @return
    */
  //def add( x:Int ,y:Int , func: Function2[Int,Int,Int] )
  def add( x:Int ,y:Int , func: (Int,Int)=>Int ) = {
    func(x,y)
  }

  /**
    * 高阶函数
    * @param msg
    * @param func
    */
  def sayHello(msg:String, func: (String)=>Unit ) = {
    func(msg)
  }
}

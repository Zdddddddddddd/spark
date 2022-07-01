package com.atguigu.chapter05

object $09_Currie {

  /**
    * 柯里化: 有多个参数列表的方法就称之为柯里化
    */
  def main(args: Array[String]): Unit = {

    println( sum(10, 20)(30)(40) )

    val func = sum2(10,20)
    val func2 = func(30)
    val r = func2(40)
    println(r)

    println(sum2(10, 20)(30)(40))
  }

  /**
    * 柯里化
    * @param x
    * @param y
    * @param z
    * @param a
    * @return
    */
  def sum(x:Int,y:Int)(z:Int)(a:Int):Int = x+y+z+a


  def add(x:Int,y:Int,z:Int,a:Int) = x+y+z+a


  /**
    * 柯里化演变过程
    * @param x
    * @param y
    * @return
    */
  def sum2(x:Int,y:Int) = {

    val func = (z:Int) => {

      val f = (a:Int) => {
        x+y+z+a
      }

      f

    }

    func
  }
}

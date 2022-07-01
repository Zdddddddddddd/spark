package com.atguigu.chapter04
import scala.util.control.Breaks._
object $05_BreakAndContinue {

  /**
    * break: 终止循环
    * continue: 结束本次循环,开始下一次循环
    *
    * scala没有break与continue关键字
    * scala实现break与continue
    *     1、导入包: import scala.util.control.Breaks._
    *     2、使用breakable与break方法实现
    */
  def main(args: Array[String]): Unit = {

    //自己实现break
    var a = 0

    breakable({
      while(a<=10){
        if(a==5) break()
        println(s"a=${a}")
        a+=1
      }
    })

    /*try{
      while(a<=10){
        if(a==5)
          throw new Exception("抛出异常....")
        println(s"a=${a}")
        a+=1
      }
    }catch {
      case e:Exception =>
        println("捕获到异常了....")
    }*/

    //自己实现continue
    a = 0

    while(a<=10) {
      breakable({
        if (a == 5) {
          a+=1
          break()
        }
        println(s"a1=${a}")
        a += 1
      })
    }
    /*while(a<=10){
      try{
        if(a==5) throw new Exception("抛出异常....")
        println(s"a1=${a}")
        a+=1
      }catch {
        case e:Exception =>
          println("捕获到异常了....")
          a+=1
      }


    }*/
  }
}

package com.atguigu.chapter02

object $02_Operator {

  /**
    * java标识符的定义规范: 必须是字母、数字、下划线、 $ 组成,首字母不能是数字
    * scala标识符的定义规范: 必须是字母、数字、下划线、 $ 、特殊符号 组成,首字母不能是数字
    *     在工作中定义标识符依然采用驼峰原则、见名知意原则,不要使用特殊符号,特殊符号是scala内部自己使用的。
    */
  def main(args: Array[String]): Unit = {

    val ! = 10
    println(!)
  }
}

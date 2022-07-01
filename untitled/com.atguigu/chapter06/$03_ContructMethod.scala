package com.atguigu.chapter06

object $03_ContructMethod {

  class Person(val name:String = "lisi",var age:Int, address:String, private val sex:String){

    var color:String = _

    def this( color:String ) {

      //TODO 辅助构造器第一行必须要调用其他的辅助构造器或者主构造器
      this(age=100,address="北京",sex="woman")

      this.color = color
    }
    def getAddress() = this.address
  }


  /**
    * scala的构造方法分为两种
    *       主构造器
    *           定义位置: 定义在类名后面
    *           语法: class 类名( [访问修饰符] [val/var] 属性名:类型[ = 默认值] ,....) {....}
    *                 主构造器中属性使用val/var修饰与不使用val/var修饰的区别:
    *                     val/var修饰的非private的属性可以在class内部外部都可以访问
    *                     不使用val/var修饰的属性默认其实就是private,只能在class内部访问
    *       辅助构造器
    *           定义位置: 定义class内部
    *           语法:
    *               def this(参数名:类型,....){
    *                   //辅助构造器第一行必须要调用其他的辅助构造器或者主构造器
    *                   this(...)
    *               }
    */
  def main(args: Array[String]): Unit = {

    val person = new Person( age = 20 , sex="man", address = "beijing")

    println(person.name)
    println(person.age)
    //println(person.address)
    println(person.getAddress())

    val person2 = new Person("red")
    println(person2.color)
    println(person2.age)
  }
}

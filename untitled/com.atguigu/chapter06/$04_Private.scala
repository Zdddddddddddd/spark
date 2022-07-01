package com.atguigu.chapter06

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializeFilter

import scala.beans.BeanProperty

object $04_Private {

  class Person{
    @BeanProperty
    /*private*/ var name:String = "lisi"

    @BeanProperty
    /*private*/ var age:Int = 20

    //def getName() = this.name
//
    //def getAge() = this.age
//
    //def setName(name:String) = this.name = name
//
    //def setAge(age:Int) = this.age = age
  }
  /**
    * scala是可以兼容java api,java 很多api底层都需要java的get/set方法
    * scala为了兼容java,提供了一个注解@BeanProperty注解,该注解能够自动生成java的set/get方法。
    * @BeanProperty注解不能用于private修饰的属性上
    */
  def main(args: Array[String]): Unit = {

    val person = new Person
    //person.setName("lisi")
    //person.setAge(20)
//
    //println(person.getAge())

    //对象转json字符串
    val json = JSON.toJSONString(person, null.asInstanceOf[Array[SerializeFilter]])
    println(json)

    //json转对象
    val js = """{"name":"xxx","age":200}"""
    val person2 = JSON.parseObject(js,classOf[Person])
    println(person2.name)


    //person2.name_=("yyyy")
    //println(person2.name)
  }
}

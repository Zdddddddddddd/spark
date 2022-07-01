package com.atguigu.chapter06

import scala.util.Random

object $07_TypeCheck {

  class Animal


  class Dog extends Animal{

    val color = "red"
  }

  class Pig extends Animal{
    val weight = 20
  }


  def getAnimal() = {

    val index = Random.nextInt(10)

    if(index%2==0){
      new Pig
    }else{
      new Dog
    }
  }

  /**
    * java中判断对象是否属于某个类型: 对象 instanceof 类型
    * java中将对象强制转换成某个类型: (类型)对象
    * java中获取对象的class形式: 对象.getClass
    * java中获取类的class形式: 类名.class
    *
    * scala中判断对象是否属于某个类型: 对象.isInstanceOf[类型]
    * scala中将对象强制转换成某个类型: 对象.asInstanceOf[类型]
    * scala中获取对象的class形式: 对象.getClass
    * scala中获取类的class形式: classOf[类名]
    */
  def main(args: Array[String]): Unit = {

    val animal: Animal = getAnimal()

    println(classOf[Pig])
    println(classOf[Dog])
    println(animal.getClass)

    if(animal.isInstanceOf[Pig]) {
      val pig = animal.asInstanceOf[Pig]
      println(pig.weight)
    }else{
      val dog = animal.asInstanceOf[Dog]
      println(dog.color)
    }
  }
}

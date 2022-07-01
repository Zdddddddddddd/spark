package com.atguigu.chapter02

object $03_String {

  /**
    * java中获取字符串方式:
    *     1、使用双引号: String name = "lisi"
    *     2、使用new的方式: String name = new String("lisi")
    *     3、一些方法: toString、subString.....
    *     4、拼接: "hello" + "lisi"
    *
    * scala获取字符串方式
    *     1、使用双引号: val name = "lisi"
    *     2、使用new的方式: val name = new String("lisi")
    *     3、一些方法: toString、subString.....
    *     4、拼接
    *       1、通过+拼接:  "hello" + "lisi"
    *       2、通过插值表达式拼接: s"hello ${变量名/表达式/值} ....${....}"
    *      5、三引号: """.....""" [一般用于写sql语句]
    */
  def main(args: Array[String]): Unit = {

    //1、使用双引号: val name = "lisi"
    var name: String = "lisi"

    //2、使用new的方式: val name = new String("lisi")
    val name2 = new String("lisi")

    //3、一些方法: toString、subString.....
    val sub = "hello java".substring(3)
    println(name)
    println(name2)
    println(sub)

    //4.1、通过+拼接:
    val x = "hello" + name
    println(x)

    //4.2、通过插值表达式拼接: s"hello ${变量名/表达式/值} ....${....}"
    //${}的{}是用来隔离
    val y = s"hello ${name}_1 $sub"
    println(y)

    val sql = "select " +
      "id," +
      "name," +
      "age " +
      "from person a left join (select " +
      " id," +
      "name," +
      "sex " +
      "from student where age>25) b " +
      "on a.id = b.id"
    //5、使用三引号
    val sql2 =
      s"""
        |select
        |   id,
        |   name,
        |   age,
        |   ${name}
        |from person a left join (
        |       select
        |           id,
        |           name,
        |           sex
        |       from student
        |       where age>25) b
        |on a.id = b.id
      """.stripMargin

    println(sql2)
  }
}

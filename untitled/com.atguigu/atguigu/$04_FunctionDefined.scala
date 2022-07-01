object $04_FunctionDefined {

  /**
    * 函数的定义语法:  val/var 函数名[:类型] = ( 参数名:类型,...) => { 函数体 }
    * 函数的简化: 如果函数体中只有一行语句,{}可以省略
    * 方法就是函数,函数也是对象[匿名子类对象]
    * 函数的类型: (参数类型,参数类型,...) => 返回值类型
    *
    *
    */
  def main(args: Array[String]): Unit = {

    println(add.apply(10, 20))

    println(func)

    println(add2(10, 20))

    val f = func

    f()

  }

  //定义一个函数,函数有两个Int类型参数,函数的返回值为Int类型
  val add = (x:Int, y:Int) => x+y

  val func = () => println("hello....")

  val add2 = new Function2[Int,Int,Int]{
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }
}

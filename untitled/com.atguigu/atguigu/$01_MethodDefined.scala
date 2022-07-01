object $01_MethodDefined {

  /**
    * scala 方法定义语法:  def 方法名( 参数名:类型,... ): 返回值类型 = { 方法体 }
    *
    */
  def main(args: Array[String]): Unit = {

    println(add(10, 20))
  }

  /**
    * 定义一个方法,方法两个Int类型的参数,返回值类型为Int
    */
  def add( x:Int, y:Int ):Int = {
    x+y
  }
}

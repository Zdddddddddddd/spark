object Tuple {
  def main(args: Array[String]): Unit = {
    val list = List("张三", 20, "李四")
    println(list)
    val strings = List("张三 20 北京", "王五 30 上海")
    val a=for (elem <- strings) yield{
      val name = elem.split(" ")(0)
      val age: String = elem.split(" ")(1)
      val adrees = elem.split(" ")(2)
      (adrees,age)
    }
    println(a)
  }

}

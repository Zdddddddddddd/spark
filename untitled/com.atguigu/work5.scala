object work5 {
  def main(args: Array[String]): Unit = {
    val array = Array("zhangsan 20 4500", "lisi 33 6800", "hanmeimei 18 10000")
    println(Method1(array).toString)
  }
  def Method1(array: Array[String])= {

    var int = array(0).split(" ")(2).toInt
    var str = array(0)
    for (elem <- 1.to(array.length-1)) yield {
      val int1 = array(elem).split(" ")(2).toInt
      if (int < int1) {
        int = int1
        str = array(elem)
      }
    }
 s"${int}:${str}" }
}

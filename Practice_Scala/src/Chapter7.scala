object Chapter7 {
  def main(args: Array[String]): Unit = {
    val ints = new Array[Int](5)
    val ints1 = ints.:+(1)
    println(ints1.toList)
    val ints2 = ints.+:(2)
    println(ints2.toList)
    val array = ints.++:(Array(1, 2, 3, 4))
    println(array.toList)
    val buffer = array.toBuffer
  }
}

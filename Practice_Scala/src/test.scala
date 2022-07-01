object test {
  def main(args: Array[String]): Unit = {
    val strings = List[Int](1,2,3,4,5)
    val list = strings.::(1, 2, 3)
    println(list)
  }
}

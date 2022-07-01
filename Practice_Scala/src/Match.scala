import scala.util.Random

object Match {
  def main(args: Array[String]): Unit = {
    val list = List(1,10,3.3,"hello",false,true,"spark")
    val i = Random.nextInt(list.length)
    val a=list(i) match {
      case 1 =>println("1....")
      case 10 =>println("10....")
      case 3.3=>println("3.3....")
      case x=>println(s"${x}")
    }
    println(a)
  }
}

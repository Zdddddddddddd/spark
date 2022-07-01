object Match2 {
  def main(args: Array[String]): Unit = {
    val t = ("lisi",20,"深圳")
    val a=t match {
      case (x:String,_,z:String) =>
        (x,z)
    }
    println(a)
    val list4 = List(
      ("宝安区",("宝安中学", ("王者峡谷班",("安其拉",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("甄姬",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("妲己",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("王昭君",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("扁鹊",18)))))
    val strings = list4.map(x => {
      x match {
        case (x, (y, (z, (name, age)))) => name
      }
    })
    println(strings)
  }


}

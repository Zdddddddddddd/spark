
object Match3 {
  case class Person(val name: String, var age: Int, val sex: String)

  def main(args: Array[String]): Unit = {
    val person = new Person("张三", 10, "男")
    person match {
      case Person(x, y, z) =>
        println(x)
        println(y)
        println(z)
    }
    val zsz = new Student("zsz", 25, "男")
//    zsz match {
//      //case Student(z, y) =>
//    }
  }

  class Student(name: String, age: Int, sex: String)

  object Student {
    def apply(name: String, age: Int, sex: String) = {
      new Student(name, age, sex)
    }

  }
}


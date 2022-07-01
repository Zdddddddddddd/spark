object $5_function {
  def main(args: Array[String]): Unit = {
    println(function1(10, 5))
    println(Method1(1, 10, 15, 20))
    println(add2.apply(10, 53))
    println(function2(3, 2))
  }
  def Method1(x: Int,y:Int*)={
    x+y.sum
  }
  val function1=(x:Int,y:Int)=>{
    x+y
  }
  val add2 =new Function2[Int,Int,Int] {
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }
  val function2=(x:Int,y:Int)=>{
    if(x%2==0){
      x+y
    }else{
      x/y
    }
  }

}

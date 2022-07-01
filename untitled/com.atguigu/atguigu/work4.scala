//4、按照指定规则对集合所有元素进行聚合
//	数据: Array(10,30,20,50)
//	规则: 求和[动态]
//	结果: 110
object work4 {
  def main(args: Array[String]): Unit = {
    val array = Array(10, 30, 20, 50)
    println(Method1(array))
  }
  def Method1(arr:Array[Int])={
    var i = arr(0)
    for (elem <- 1.to(arr.length-1))yield{
        i=func(i,arr(elem))
    }
  i}
  val func=(a:Int,b:Int)=> a+b

}

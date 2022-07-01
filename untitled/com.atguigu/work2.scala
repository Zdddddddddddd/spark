import scala.runtime.Nothing$

//2、按照指定的规则对集合数据进行过滤
//	数据: Array(1,4,3,6,7,9,10)
//	规则: 保留偶数[动态]
//	结果: Array(4,6,10)
object work2 {
  def main(args: Array[String]): Unit = {
    val list = Array(1, 4, 3, 6, 7, 9, 10)

    println(Methon(list).toList)
  }
  def Methon(arr:Array[Int])={
   for (i<-arr if (i%2==0))yield{
          i
   }
  }
//  val function1=(x:Int)=>{
//        if(x%2==0 i){
//            x
//        }
//    }
 }

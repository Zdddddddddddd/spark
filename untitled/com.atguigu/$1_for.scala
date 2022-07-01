object $1_for {
  def main(args: Array[String]): Unit = {
    //普通for循环使用to语句(左闭右闭)
    for (i<-1.to(10)){
      println(s"i=$i")
    }
    //普通for循环使用until语句(左闭右开)
//不加yield无法返回值,返回unix
    var c=for( b<-0.to(10) if(b%2==0)) {
          b
    }
    println(c)
  }
  //加上yield,重新获得返回值
  var c=for( b<-0.to(10) if(b%2==0)) yield{
    b
  }
  println(c)
  //while循环不能使用yield关键字和代码块
  var a =0;
   while (a<=10)//yield
   {
    println(s"a=${a}")
    a+=1
  }
 //do while循环同样不能使用yield语句
  var f =0
  do{
    println(s"f=${f}")
    f+=1
  } while (f<=10)

}

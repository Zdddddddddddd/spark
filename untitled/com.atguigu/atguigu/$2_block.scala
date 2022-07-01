object $2_block {
  def main(args: Array[String]): Unit = {
    //只返回block里面最后一个值（必须为值不能为赋值、运算等必须为变量或者常量才返回值，否则返回unix，也可以为for循环）
    var a ={
      var b =3
      var c =4
      2
      1
    }
    println(a)
    //代码块可以使用于for循环
    var d =for(i<-1.to(10)) yield{
      println(s"i=${i}")
      i
    }
    println(d)
  }
}

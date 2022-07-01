//1、按照指定的规则获取集合中每个元素操作之后返回结果
//数据: Array("hello","hadoop","flume","spark","kafka")
//规则: 获取每个元素的长度[动态]
//结果: Array(5,6,5,5,5)
object work1 {
  def main(args: Array[String]): Unit = {
    val arr = Array("hello", "hadoop", "flume", "spark", "kafka")
    println(Method(arr,func1).toList)
    println(Method(arr,(x:String)=>{x.charAt(0)}).toList)
  }
  def Method(arr:Array[String],function:String=>Any)={
    for (elem <- arr) yield{
      function(elem)
    }
  }
  val func=(x:String)=>{
    x.charAt(0)
  }
  val func1=(x:String)=>{
    x.size
  }
}

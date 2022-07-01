import java.util

//3、按照指定的规则对集合元素进行分组
//	数据: Array("zhangsan man beijing","lisi woman shanghai","zhaoliu man beijing","hanmeimei woman shenzhen")
//	规则: 按照性别分组[动态]
//	结果: Map( man -> List( "zhangsan man beijing", "zhaoliu man beijing" ) , woman -> List( "lisi woman shanghai" ,"hanmeimei woman shenzhen" ) )
object work3 {
  def main(args: Array[String]): Unit = {
    val arr = Array("zhangsan man beijing", "lisi woman shanghai", "zhaoliu man beijing", "hanmeimei woman shenzhen")
    println(Method(arr))
  }
  def Method(array: Array[String]): Any = {
    val map = new util.HashMap[String, util.List[String]]()
    for (elem <- array) yield {
      val strings = elem.split(' ')
      if (map.containsKey(strings(1))){
        val list = map.get(strings(1))
        list.add(elem)
      }else{
        val strings1 = new util.ArrayList[String]()
        strings1.add(elem)
          map.put(strings(1),strings1)
      }
      }
   map }
  }


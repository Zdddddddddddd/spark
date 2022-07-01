import scala.collection.immutable
import scala.io.Source

object work {
  def main(args: Array[String]): Unit = {
    val list = Source.fromFile("D:/Ideaproject/Practice_Scala/src/product.txt").getLines().toList
    val list2 = Source.fromFile("D:/Ideaproject/Practice_Scala/src/allprovince.txt").getLines().toList
    println(test1(list, list2))
    val tuples = test2(list)
    println(tuples)
    val tupleToTuples = test3(list)
    println(tupleToTuples)
    val tupleToTuples1 = test4(list)
    println(tupleToTuples1)
  }
  //1、获取没有农贸市场的省份
  def test1(list: List[String],list1:List[String])={
    //1、是否需要过滤[过滤脏数据]
    val strings = list.filter(x => x.split("\t").size == 6)
    //2、是否需要列裁剪[省份]
    val tuples = strings.map(x => {
      val strings1 = x.split("\t")
      (strings1(4))
    })
    //3、是否需要去重[去重]
    val distinct = tuples.distinct
    //4、全国所有省份与有农贸市场的省份求差集
    val tuples1 = list1.diff(distinct)
    tuples1
  }
 //2、统计菜的种类数最多的三个省份
  def test2(list: List[String])={
      //1、是否需要过滤[过滤脏数据]
      val list1 = list.filter(x => x.split("\t").size == 6)
      //2、是否需要列裁剪[菜名、省份]
      //List( (湖北省,西蓝花),(湖北省,西蓝花),(湖北省,大白菜),(湖北省,上海青),(湖南省,鲫鱼),..... )
      val tuples = list1.map(x => {
        val strings = x.split("\t")
        (strings(4), strings.head)
      })
      //3、去重
      val distinct = tuples.distinct
      //List( (湖北省,西蓝花),(湖北省,大白菜),(湖北省,上海青),(湖南省,鲫鱼),..... )

      //4、按照省份分组
      val stringToTuples = distinct.groupBy(x => {
        x._1
      })
      //Map(
      //    湖北省 -> List( (湖北省,西蓝花),(湖北省,大白菜),(湖北省,上海青),... )
      //    湖南省 -> List( (湖南省,鲫鱼),... )
      //    ....
      // )

      //5、统计每个省份的菜的种类数
      val stringToInt = stringToTuples.map(x => {
        (x._1, x._2.size)
      })
      //Map(湖北省->23,湖南省->33,山西省->85,....)

      //6、按照菜的种类数排序取前三
      val tuples1 = stringToInt.toList.sortBy(x=>x._2).reverse.take(3)
      //7、结果打印
      tuples1
    }
    //3、统计每个省份菜的种类数最多的三个农贸市场
  def test3(list: List[String])={
    //1.过滤
    val strings = list.filter(x => x.split("\t").size == 6)
    //2.列裁剪
    val tuples = strings.map(x => {
      val strings1 = x.split("\t")
      ((strings1(4), strings1(3)), strings1(0))
    })
    //3.去重
    val distinct = tuples.distinct
    //4.分组
    val tupleToTuples = distinct.groupBy(x => {x._1})
    //5.统计个数
    val tuples1 = tupleToTuples.toList.map(x => (x._1, x._2.size))
    //5.再分组添加省份
    val tupleToTuples1 = tuples1.groupBy(x => {
      (x._1._1)
    })
    val iterable = tupleToTuples1.map(x => {
      val tuples2 = x._2.toList.sortBy(x => {
        x._2
      }).reverse.take(3)
      tuples2
    })
 }
  def test4(list: List[String])= {
    //1、过滤
    val strings = list.filter(x => x.split("\t").size == 6)
    //2、列剪裁
    val tuples = strings.map(x => {
      val arr = x.split("\t")
      (arr(4), arr(3), arr(0))
    })
    //3、去重
    val distinct = tuples.distinct
    //4、分组
    val tupleToTuples = distinct.groupBy(x => {
      (x._1, x._2)
    })
    //5、统计
    val tupleToInt = tupleToTuples.map(x => (x._1, x._2.size))
    //6、再分组
    val stringToTupleToInt = tupleToInt.groupBy(x => x._1._1)
    //7、排序
    val iterable: immutable.Iterable[List[((String, String), Int)]] = stringToTupleToInt.map(x => {
      val tuples1 = x._2.toList.sortBy(x => x._2).reverse.take(3)
      tuples1
    })
    iterable.foreach(println)
        val tuples1 = iterable.flatten.map(x => {
          (x._1._2,x._2)
        })
        tuples1.foreach(println)
      }
  }



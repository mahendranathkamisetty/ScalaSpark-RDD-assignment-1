import org.apache.spark.SparkContext

object pairRDD13 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalaSpark-PairRDD1")
    val data = Array((101,"John"),(102,"Alice"),(103,"Bob"),(104,"David"))
    val pairRdd = sc.parallelize(data)
    pairRdd.collect().foreach(println)
  }

}

import org.apache.spark.SparkContext

object sortByKeyEmpId16 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkPairRDD16")
    val data = Array((105,"Eve"),(101,"Alice"),(103,"Bob"),(104,"David"))
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.sortByKey()
    rdd1.collect().foreach(println)

  }

}

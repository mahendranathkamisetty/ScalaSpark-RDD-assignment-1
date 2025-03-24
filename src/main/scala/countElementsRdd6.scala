import org.apache.spark.SparkContext

object countElementsRdd6 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDD6")
    val data = List("Scala","Spark","Hadoop","Hive","Scala","Spark")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.count()
    print(rdd1)
  }

}

import org.apache.spark.SparkContext

object cartesianproduct23 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDcartesianProduct23")
    val data1 = List(1,2,3)
    val data2 = List("A","B")
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val rdd3 = rdd1.cartesian(rdd2)
    rdd3.collect().foreach(println)
  }

}

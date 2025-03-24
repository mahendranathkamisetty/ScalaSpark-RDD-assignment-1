import org.apache.spark.SparkContext

object intersection21 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDintersection21")
    val data1 = List(1,2,3,4,5)
    val data2 = List(3,4,5,6,7)
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val rdd3 = rdd1.intersection(rdd2)
    rdd3.collect().foreach(println)
  }

}

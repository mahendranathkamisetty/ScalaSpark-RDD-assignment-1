import org.apache.spark.SparkContext

object filterEven4 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalaSparkRDD4")
    val data = List(3,6,9,12,15,18,21,24)
    val rdd1 = sc.parallelize(data)
    val rdd2 = rdd1.filter(x=>x%2 == 0)
    rdd2.collect().foreach(println)



  }

}

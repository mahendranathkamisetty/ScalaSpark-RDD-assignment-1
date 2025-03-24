import org.apache.spark.SparkContext

object subtraction22 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDsubtract22")
    val data1 = List(10,20,10,30,40,50)
    val data2 = List(30,40,50)
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val rdd3 = rdd1.subtract(rdd2)
    val rdd4 = rdd3.distinct()
    rdd4.collect().foreach(println)
  }

}

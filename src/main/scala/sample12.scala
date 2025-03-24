import org.apache.spark.SparkContext

object sample12 {
  def main(args:Array[String]): Unit = {


    val sc = new SparkContext("local[*]","ScalaSparkRDD12")
    val data = List(100,200,300,400,500,600,700)
    val rdd = sc.parallelize(data)

  }

}

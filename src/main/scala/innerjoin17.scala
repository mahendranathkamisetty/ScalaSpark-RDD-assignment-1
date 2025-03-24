import org.apache.spark.SparkContext

object innerjoin17 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkInnerjoinRDD")
    val data1 = Array((1,"Laptop"),(2,"Mobile"),(3,"Tablet"))
    val data2 = Array((1,50000),(2,20000),(4,15000))
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    val rdd3 = rdd1.join(rdd2)
    rdd3.collect().foreach(println)


  }


}

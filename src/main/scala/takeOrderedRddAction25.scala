import org.apache.spark.SparkContext

object takeOrderedRddAction25 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalaSparkTakeOrderedRddAction25")
    val data = Array(55,20,75,10,90,5,30)
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.takeOrdered(5)
    rdd1.foreach(println)

  }

}

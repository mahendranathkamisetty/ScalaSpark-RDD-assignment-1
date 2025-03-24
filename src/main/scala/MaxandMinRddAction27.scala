import org.apache.spark.SparkContext

object MaxandMinRddAction27 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalaSparkRddMaxandMin27")
    val data = Array(500,1000,200,50,700,900)
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.max()
    val rdd2 = rdd.min()
    println("Max element:" +rdd1)
    println("Min element:" +rdd2)
  }

}

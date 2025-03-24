import org.apache.spark.SparkContext

object filterPrimeNum9 {
  def main(args:Array[String]): Unit = {

    val sc =new SparkContext("local[*]","scalasparkRdd8")
    val data = Array(2,3,4,5,6,7,8,9,10,11,12,13)
    val rdd = sc.parallelize(data)

  }

}

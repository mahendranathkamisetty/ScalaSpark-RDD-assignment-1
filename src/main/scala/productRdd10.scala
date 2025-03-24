import org.apache.spark.SparkContext

object productRdd10 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDTransf9")
    val data = List(1,2,3,4,5,6)
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.reduce((x,y) => x*y)
    println(rdd1)
  }

}

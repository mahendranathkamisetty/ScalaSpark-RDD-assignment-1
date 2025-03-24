import org.apache.spark.SparkContext

object union20 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDunion20")
    val data1 = List(1,2,3,4)
    val data2 = List(3,4,5,6)
    val rdd1 = sc.parallelize(data1)
    val rdd2 = sc.parallelize(data2)
    var rdd3 = rdd1.union(rdd2)
    rdd3.collect().foreach(println)

  }

}

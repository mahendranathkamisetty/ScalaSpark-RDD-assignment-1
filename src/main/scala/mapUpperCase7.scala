import org.apache.spark.SparkContext

object mapUpperCase7 {
  def main(args:Array[String]): Unit = {

    val sc =new SparkContext("local[*]","scalaSparkRDDTransf")
    val data = List("hello","world","scala","spark")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.map(x=>x.toUpperCase)
    val rdd2 = rdd1.collect()
    rdd2.foreach(println)
  }

}

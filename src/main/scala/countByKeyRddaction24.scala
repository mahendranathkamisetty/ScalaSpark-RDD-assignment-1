import org.apache.spark.SparkContext

object countByKeyRddaction24 {
  def main(args:Array[String]): Unit = {


    val sc = new SparkContext("local[*]","scalaSparkRDDcountByKey24")
    val data = List(("New York",3),("London",2),("New York",5),("Paris",1))
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.countByKey()
    rdd1.foreach(println)
  }

}

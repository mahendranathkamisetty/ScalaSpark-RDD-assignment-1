import org.apache.spark.SparkContext

object foreachPrintParallel26 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalasparkRDDforeach26")
    val data = List("Spark","Scala","Hadoop","Kafka")
    val rdd = sc.parallelize(data)
    rdd.foreach(println)

  }

}

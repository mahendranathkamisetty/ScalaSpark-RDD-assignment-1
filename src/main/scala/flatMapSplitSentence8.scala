import org.apache.spark.SparkContext

object flatMapSplitSentence8 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDTrans7")
    val data = List("Big data is powerful","Spark makes processing faster")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.flatMap(x=>x.split(" "))
    val rdd2 = rdd1.collect()
    rdd2.foreach(println)

  }

}

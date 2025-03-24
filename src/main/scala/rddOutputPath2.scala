import org.apache.spark.SparkContext


object rddOutputPath2 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDD2")
    val data = Array(1,2,3,4,5,6,7,8,9,10)
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.saveAsTextFile("D:/Users/r/Desktop/output.txt")


  }

}

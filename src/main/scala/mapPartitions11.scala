import org.apache.spark.SparkContext

object mapPartitions11 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalasparkrdd11")
    val data = Array(10,20,30,40,50,60,70,80,90)
    val rdd = sc.parallelize(data)

  }

}

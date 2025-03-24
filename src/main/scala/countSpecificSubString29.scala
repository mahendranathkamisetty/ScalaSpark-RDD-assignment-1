import org.apache.spark.SparkContext

object countSpecificSubString29 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkCountSubString29")
    val data = List("analytics","data","spark","databricks","database")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.filter(x=>x.contains("ata")).count()
    print(rdd1)
  }

}

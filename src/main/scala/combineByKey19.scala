import org.apache.spark.SparkContext

object combineByKey19 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDcombineByKey19")
    val data = Array(("IT",70000),("IT",80000),("HR",60000),("HR",50000),("Finance",90000))
    val rdd = sc.parallelize(data)

  }

}

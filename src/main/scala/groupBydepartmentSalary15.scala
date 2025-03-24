import org.apache.spark.SparkContext

object groupBydepartmentSalary15 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkPairRDD15")
    val data = Array(("IT",60000),("HR",50000),("IT",70000),("HR",45000),("Finance",80000))
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.groupByKey()
    rdd1.collect().foreach(println)

  }

}

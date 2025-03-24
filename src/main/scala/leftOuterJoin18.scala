import org.apache.spark.SparkContext

object leftOuterJoin18 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","ScalaSparkRDDleftouterjoin18")
    val employees = Array((1,"John"),(2,"Alice"),(3,"Bob"))
    val departments = Array((1,"IT"),(2,"HR"))
    val rdd1 = sc.parallelize(employees)
    val rdd2 = sc.parallelize(departments)
    val rdd3 = rdd1.leftOuterJoin(rdd2)
    rdd3.collect().foreach(println)
  }


}

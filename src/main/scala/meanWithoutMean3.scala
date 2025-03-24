import org.apache.spark.SparkContext

object meanWithoutMean3 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","scalaSparkRDD3")
    val data = Array(5,10,15,20,25)
    val rdd = sc.parallelize(data)
    println("By using Mean function:",rdd.mean())

    println("Without Using Mean function:")
    val sum = rdd.reduce((x,y)=>(x+y))
    val count = rdd.count()
    val avg = sum/count
    println(avg)

  }
}

import org.apache.spark.SparkContext

object wordCount14 {
  def main(args:Array[String]): Unit = {

    val sc = new SparkContext("local[*]","wordCountPairRDD")
    val data = Array("apple","banana","apple","orange","banana","apple")
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.map(x=>(x,1))
    //rdd1.collect().foreach(println)
    val rdd2 = rdd1.reduceByKey((x,y)=>x+y)
    rdd2.collect().foreach(println)
  }

}

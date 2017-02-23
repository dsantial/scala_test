import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by 390767 on 17-2-8.
  */
object begin {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("first").setMaster("local")
    val sc = new SparkContext(conf)

    val a = sc.parallelize(Array(1,2,3,4,3,4,5))

    println(a)
  }







}

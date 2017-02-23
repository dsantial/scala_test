package test

/**
  * Created by 390767 on 17-2-22.
  */
class IncreaseData {
  def dataSource:(Option[String],Option[String])={
    val t1= "hello_t1"
    val t2 ="hello_t2"

    (Option(t1),Option(t2))
  }

}

object IncreaseData {
  val data1 = (new IncreaseData).dataSource


  def getData:(Option[String],Option[String])={
    val d1= data1._1.get
    val d2 = data1._2.get

    (Option(d1),Option(d2))
  }
}

object Begin {

  def main(args: Array[String]): Unit = {
 //test
    val main1 = IncreaseData.getData._1
    val main2 =IncreaseData.getData._2

    println("The value in main is :"+main1 + main2)

  }




}
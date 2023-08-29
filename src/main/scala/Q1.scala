object Q1 extends App{

  def calculateAverage(celList: List[Int]): Double = {
    val farList = celList.map(_ * 9 / 5.0 + 32)
    val tot = farList.reduce(_ + _)
    val avg = tot / farList.length.toDouble
    avg
  }

  val input = List(0, 10, 20, 30)
  println ("Average Fahrenheit temperature: "+ calculateAverage(input))
}

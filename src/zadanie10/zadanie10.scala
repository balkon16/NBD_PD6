package zadanie10

object zadanie10 {
  def main(args: Array[String]) {
    val realValues = List(10.1, -3.1415, 1.41, -5.14, 101.123456, 0.01, 2.015, 11.9999999999)
    println(filterAndMap(realValues))
  }

  def filterAndMap(list: List[Double]) : List[Double] = {
    val newList = list filter (_ >= -5 ) filter (_ <= 12) map (_ abs)
    newList
  }
}
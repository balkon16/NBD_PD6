package zadanie08

object zadanie8 {
  def main(args: Array[String]) {
    val values = List(0, 1, 10, 0, 5, -5, -10, 0)
    println(filterZeros(values))
  }

  def filterZeros(list: List[Int]) : List[Int] = {
    val newList = list filter (_ != 0)
    newList
  }
}
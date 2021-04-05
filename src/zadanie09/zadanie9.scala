package zadanie09

object zadanie9 {
  def main(args: Array[String]) {
    val values = List(0, 1, 10, 0, 5, -5, -10, 0)
    println(addOne(values))
  }

  def addOne(list: List[Int]) : List[Int] = {
    val newList = list map (_ + 1)
    newList
  }
}
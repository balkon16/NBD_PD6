package zadanie01

object Zadanie1d {
  def main(args: Array[String]) {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    var index : Int = 0
    while (index <= 6) {
      println(daysOfWeek(index))
      index += 1
    }
  }
}


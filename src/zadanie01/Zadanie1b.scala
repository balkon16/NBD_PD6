package zadanie01

object Zadanie1b {
  def main(args: Array[String]) {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    for (day <- daysOfWeek) {
      if (day.startsWith("P")) println(day)
    }
  }
}


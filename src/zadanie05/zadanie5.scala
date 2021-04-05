package zadanie05

object zadanie5 {
  def main(args: Array[String]): Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    for (day <- daysOfWeek) println(categorizeDays(day))
    println(categorizeDays("Montag"))
  }

  def categorizeDays(day: String): String = day match {
    case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}
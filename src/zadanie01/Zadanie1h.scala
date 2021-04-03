package zadanie01

object Zadanie1h {
  def main(args: Array[String]) {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    daysOfWeek.foldLeft("")((a, b) => CustomPrinter.printWithFoldLeft(a, b))
  }
}

object CustomPrinter {
  def printWithFoldLeft(a:String, b:String): String ={
    if (b.startsWith("P")) println(b)
    b
  }
}
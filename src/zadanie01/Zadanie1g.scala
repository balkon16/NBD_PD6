package zadanie01

object Zadanie1g {
  def main(args: Array[String]) {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    println("FoldLeft:")
    daysOfWeek.foldLeft("")((a, b) => Printer.printWithFoldLeft(a, b))
    println("FoldRight:")
    val reversedDaysOfWeek = daysOfWeek.reverse
    reversedDaysOfWeek.foldRight("")((a, b) => Printer.printWithFoldRight(a, b))
  }
}

object Printer {
  def printWithFoldLeft(a:String, b:String): String ={
    println(b)
    b
  }

  def printWithFoldRight(a:String, b:String): String = {
    println(a)
    a
  }
}
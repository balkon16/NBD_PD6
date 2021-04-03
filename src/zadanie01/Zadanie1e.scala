package zadanie01

object Zadanie1e {
  def main(args: Array[String]) {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    ListPrinter.printList(daysOfWeek)
  }
}

object ListPrinter {
  def printList(aList : List[Any]): Unit = {
    if (aList.nonEmpty) {
      println(aList.head)
      printList(aList.tail)
    }
  }
}


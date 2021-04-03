package zadanie01

object Zadanie1f {
  def main(args: Array[String]) {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
    ReverseListPrinter.printReversedList(daysOfWeek)
  }
}

object ReverseListPrinter {
  def printReversedList(aList : List[Any]): Unit = {
    val reversedList = aList.reverse
    printList(reversedList)
  }

  def printList(aList : List[Any]): Unit = {
    if (aList.nonEmpty) {
      println(aList.head)
      printList(aList.tail)
    }
  }
}


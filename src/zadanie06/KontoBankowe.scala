package zadanie06

class KontoBankowe(poczatkowyStan : Double = 0) {

  private var _stanKonta: Double = poczatkowyStan
  def stanKonta: Double = _stanKonta

  def wyplata(kwota: Double): Unit = {
    if (kwota <= _stanKonta) {
      _stanKonta -= kwota
      println("Wypłata " + kwota + " zrealizowana.")
    } else dajOstrzezenie()
  }

  def wplata(kwota : Double): Unit = {
    _stanKonta += kwota
    println("Zrealizowano wpłatę " + kwota + '.')
  }

  private def dajOstrzezenie(): Unit = println("UWAGA: brakuje środków do wykonania operacji.")

}
package zadanie07

case class Osoba(imie: String, nazwisko: String)

object zadanie7 {
  def main(args: Array[String]): Unit = {
    val pawel_nowak = Osoba("Paweł", "Nowak")
    val piotr_lonca = Osoba("Piotr", "Lonca")
    val anna_kowalska = Osoba("Anna", "Kowalska")
    val jan_kowalski = Osoba("Jan", "Kowalski")
    println(getGreeting(pawel_nowak))
    println(getGreeting(piotr_lonca))
    println(getGreeting(anna_kowalska))
    println(getGreeting(jan_kowalski))
  }

  def getGreeting(person: Osoba): String = {
    person match {
      case Osoba("Paweł", _) => "Przywitanie dla Pawłów!"
      case Osoba(_, "Lonca") => "Niech żyją Loncowie!"
      case Osoba("Anna", "Kowalska") => s"Witaj! Nazywasz się ${person.imie} ${person.nazwisko}."
      case _ => s"Ogólne przywitanie. Witaj, ${person.imie}!"
    }
  }



}




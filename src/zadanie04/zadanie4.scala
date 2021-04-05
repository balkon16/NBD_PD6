package zadanie04

object zadanie4 {
  def main(args: Array[String]): Unit = {
    val productPriceMap = Map("jajka" -> 6.99, "chleb" -> 3.5, "sok" -> 4.99, "jabłka" -> 3.05, "gruszki" -> 4.99, "ser" -> 23.99)
    println(showValue(productPriceMap.get("bułki")))
    println(showValue(productPriceMap.get("jajka")))
  }

  def showValue(x : Option[Double]): String = x match {
    case Some(s) => "Cena to " + s + '.'
    case None => "Cena nieznana."
  }
}

package zadanie02

object zadanie2 {
  def main(args: Array[String]) {
    val productPriceMap = Map("jajka" -> 6.99, "chleb" -> 3.5, "sok" -> 4.99, "jabłka" -> 3.05, "gruszki" -> 4.99, "ser" -> 23.99)
    val newProductPriceMap = productPriceMap map (t => decreasePrice(t._1, t._2))
    println(newProductPriceMap)
  }

  def decreasePrice(product: String, price: Double): (String, Double) = {
    val newPrice = "%.2f".format(price*0.9).toDouble
    product -> newPrice
  }
}
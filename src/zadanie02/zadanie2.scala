package zadanie02

object zadanie2 {
  def main(args: Array[String]) {
    val productPriceMap = Map("jajka" -> 6.99, "chleb" -> 3.5, "sok" -> 4.99, "jabłka" -> 3.05, "gruszki" -> 4.99, "ser" -> 23.99)
    productPriceMap map((product, price) => PriceEditor.decreaseProductPrice(product, price))
  }
}

object PriceEditor {
  def decreaseProductPrice((product: String, price: Double)): (String, Double) ={
    return (product, price*0.9)
  }
}
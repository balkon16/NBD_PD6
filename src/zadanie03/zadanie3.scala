package zadanie03

object zadanie3 {
  def main(args: Array[String]): Unit = {
    val testTuple = TupleHandler.createTuple("abc", 1, 1.0)
    TupleHandler.printTupleElements(testTuple)
  }
}

object TupleHandler {
  def createTuple(arg1: Any, arg2: Any, arg3: Any): (Any, Any, Any) = {
    val t = Tuple3(arg1, arg2, arg3)
    t
  }

  def printTupleElements(tuple: (Any, Any, Any)): Unit ={
    println("Element nr 1: " + tuple._1)
    println("Element nr 2: " + tuple._2)
    println("Element nr 3: " + tuple._3)
  }
}

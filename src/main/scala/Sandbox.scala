object Sandbox {
  def main(args: Array[String]): Unit = {
    val arrOne = 1 to 10
    val name:String = "Wojtek"

    for(int <- arrOne)
      println(int)

    println(name)

    case class SomeClass(arg1: String)

    val instanceOne: Object = SomeClass("Hi!").arg1
    println(instanceOne)

    // Tuples
    val tupleOne: (String, Int, Double) = ("Sashimi", 2, 0.5)
//    val bento: (Sushi, Sushi) = ("Sashimi", "Onigiti")

    println(tupleOne)
    println(tupleOne._1)
    println(tupleOne._2)

    // unpacking tuple
    var (first, second, third) = tupleOne
    println("" + first + " " + second)

//    var listOne = tupleOne.toString.split(",")
//    for(item <- listOne)
//      println("Tuple2List item: " + item)
  }
}

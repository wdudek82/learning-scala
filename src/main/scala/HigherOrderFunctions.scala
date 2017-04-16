import scala.math._

object HigherOrderFunctions {
  def main(args: Array[String]): Unit = {
    val log10Func = log10 _

    println(log10Func(1000))

    List(1000.0, 10000.0).map(log10Func).foreach(println)

    List(1, 2, 3, 4, 5).map((x: Int) => x * 50).foreach(println)

    List(1, 2, 3, 4, 5).filter(_ % 2 == 0).foreach(println)

    println(List(1, 2, 3, 4).reduce(_ * _))
    println(List(1, 2, 3, 4).product)

    println(List(1, 2, 3, 4, 5).reduce(_ + _))
    println(List(1, 2, 3, 4, 5).sum)

    def times3(num: Int) = num * 3
    def times4(num: Int) = num * 4

    def multiplyIt(func: (Int) => Double, num: Int) = {
      func(num)
    }

    printf("3 * 100 = %.1f\n", multiplyIt(times3, 100))
    printf("3 * 100 = %.1f\n", multiplyIt(times4, 100))

    // Closure
    val divisorVal: Double = 5.0
    val divisor5 = (num: Double) => num / divisorVal
    println("5 / 5 = %.1f".format(divisor5(100)))
  }
}

object Exceptions {
  def main(args: Array[String]): Unit = {

    def divideNums(num1: Int, num2: Int) = try {
      num1 / num2
    } catch {
      case ex: java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // clean up after exception
    }

    println("15 / 3 = " + divideNums(15, 3))
    println("2 / 0 = " + divideNums(2, 0))

  }
}

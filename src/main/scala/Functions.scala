object Functions {
  def main(args: Array[String]): Unit = {

    def getSum(num1: Int = 1, num2: Int = 1): Int = {
      println(f"\nnum1: $num1, num2: $num2")
      num1 + num2 // return is redundant
    }

    println("[no args]: " + getSum())
    println("3 + 5: " + getSum(3, 5))
    println("3 + default (1): " + getSum(3))
    println("3 + 5 = " + getSum(num2=5, num1=3))

    def sayHi(): Unit = {
      println("Hi how are you?:)")
    }

    sayHi

    def getSumTwo(args: Int*): Int = {
      args.sum
//      var sum: Int = 0
//      for(num <- args)
//        sum += num
//      sum
    }
    println(getSumTwo(1, 2, 3, 4, 5, 6))

    val listOne = List(1 to 10)

    def factorial(num: BigInt): BigInt = {
      if(num <= 1
        1
      else
        num * factorial(num - 1)
    }

    println(factorial(100))

    def fibonacci(num: Int): Int = {
      if(num <= 2)
        1
//      else if(num == 1)
//        1
      else
        fibonacci(num - 1) + fibonacci(num - 2)
    }

    for(i <- 1 to 10)
      println(fibonacci(i))
  }
}

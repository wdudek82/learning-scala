import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
  def main(args: Array[String]): Unit = {

    // iteration
    var i: Int = 0
    while(i <= 10) {
      println(i)
      i += 1
    }

    i = 0
    do {
      println(i)
      i += 1
    } while(i <= 20)

    i = 0
    for(i <- 1 to 10)
      print(i + " ")

    val randLetters = "ABCDEFGHIJKLMNOPQRSTUWXYZ"
    println
    for(letter <- randLetters)
      print(letter + " ")
    println

    i = 0
    for(i <- 0 until randLetters.length)
      println("Letter " + i + ": " + randLetters(i))

    val aList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
    val aListTwo = 1 to 100
    for(num <- aListTwo)
      if(num % 15 == 0)
        println("FizzBuzz")
      else if(num % 5 == 0)
        println("Fiz")
      else if(num % 3 == 0)
        println("Buz")
      else
        println("-")

    println(aListTwo.length)
    println(aListTwo.size)
    println(aListTwo.last)
    println(aListTwo(aListTwo.size - 2))
    println(aListTwo.reverse(1))

    var evenList = for {i <- 1 to 20 if i % 2 == 0 } yield i

    println(evenList.toString)

    for(i <- 1 to 5; j <- 6 to 10)
      println("i = " + i + " and j = " + j)

    def printPrimes(): Unit ={
      val primeList = List(1, 2, 3, 5, 7, 11)
      for(i <- primeList){
        if(i == 11){
          println("EOL")
          return
        }
        println(i)
      }
    }

    printPrimes

    var numberGuess = 0
    do {
      print("Guess a number ")
      numberGuess = readLine.toInt
    } while(numberGuess != 15)

    printf("You guessed the secret number (%d)\n", 15)

    val name = "Derek"
    val age = 39
    val weight = 175.5

    println(f"Hello $name. You are ${age + 1} years old and weight $weight%.2f")

    // text positioning
    printf("'%5d'\n", 5)
    printf("'%-5d'\n", 5)
    printf("'%05d'\n", 5)
    printf("'%.5f'\n", 3.14)

    var randSent = "I saw a dragon fly by"
    println(randSent.indexOf("dragon"))

    for(letter <- randSent)
      println(letter)

    var randSentArray = randSent.toArray
    println(randSentArray.toString)

    for(item <- randSentArray)
      println(item)
  }
}

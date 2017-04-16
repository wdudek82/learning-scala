import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object Arrays {
  def main(args: Array[String]): Unit = {

    def fill2DIntArray(arr: Array[Array[Int]]): Unit = {
      for(row <- arr.indices; col <- arr(row).indices)
        arr(row)(col) = row * col
    }

    def pprint2DArray(arr: Array[Array[Int]]): Unit = {
      println
      for(row <- arr.indices) {
        for(col <- arr.indices) {
          printf("%02d ", arr(row)(col))
        }
        println
      }
    }

    // Array
    val favNums = new Array[Int](20)

    for(num <- favNums.indices)
      favNums(num) = num - 10

    for(num <- favNums)
      println(num)

    println("Sum of favNums: " + favNums.sum)
    println("Max of favNums: " + favNums.max)
    println("Min of favNums: " + favNums.min)

    val sortedNums = favNums.sortWith(abs(_) < abs(_))
    print("\n" + sortedNums.deep.mkString(", ") + "\n")

    val favNumsTimes2 = for(num <- favNums) yield 2 * num

    println
    favNumsTimes2.foreach(item => print("| " + item + " "))
    println

    println("Divisible by 4:")
    val favNumsDiv4 = for(num <- favNums if num % 4 == 0 && num != 0) yield num
    favNumsDiv4.foreach(println)

    var multTable = Array.ofDim[Int](10, 10)

//    for(row <- 0 to 9; col <- 0 to 9)
//      multTable(row)(col) = row * col
    fill2DIntArray(multTable)

//    for(row <- 0 to 9) {
//      println
//      for(col <- 0 to 9) {
//        printf("%02d ", multTable(row)(col))
//      }
//    }
    pprint2DArray(multTable)
    println


    // string array
    val friends = Array("Bob", "Tom")

    friends(0) = "Sue"

    for(friend <- friends)
      println("Best friends: " + friend)

    // ArrayBuffer - used when size of array isn't fixed
    val friends2 = ArrayBuffer[String]()

    // adding elements to ArrayBuffer
    friends2.insert(0, "Phil")

    // or..
    friends2 += "Mark"

    // adding multiple elements at once
    friends2 ++= ArrayBuffer("Susy", "Paul")

    // insertions
    friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")

    // remove at index, n elements
    friends2.remove(1, 2)

    for(friend <- friends2)
      println("Freind2: " + friend)

    // can also print whole ArrayBuffer
    println(friends2)
  }
}
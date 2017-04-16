import java.io.PrintWriter
import scala.io.Source

object FileIO {
  def main(args: Array[String]): Unit = {

    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nSome more random text.")
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "utf-8")
    val lineIterator = textFromFile.getLines

    for(line <- lineIterator)
      println(line)

    textFromFile.close()
  }
}

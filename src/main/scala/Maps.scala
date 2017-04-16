
object Maps {
  def main(args: Array[String]): Unit = {

    // immutable map
    val employees = Map(
      "Manager" -> "Bob Smith",
      "Secretary" -> "Sue Brown"
    )

    if(employees.contains("Manager"))
      println("Manager: " + employees("Manager"))


    // mutable map
    val customers = collection.mutable.Map(
      100 -> "Paul Smith",
      101 -> "Sally Smith"
    )

    printf("Custome 1: %s\n", customers(100))

    customers(100) = "Tom Marks"
    customers(102) = "Mega Swift"

    for((k,v) <- customers)
      printf("%d: %s\n", k, v)
  }
}

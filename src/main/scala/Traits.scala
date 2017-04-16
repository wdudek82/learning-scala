object Traits {
  def main(args: Array[String]): Unit = {
    val superman = new Superhero("Superman")

    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
  }
}

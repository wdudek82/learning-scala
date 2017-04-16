/**
  * Created by neevor on 16.04.17.
  */
object Classes {
  def main(args: Array[String]): Unit = {

    val rover: Animal = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers: Animal = new Animal("Whiskers", "Meow")
    printf("%s says %s\n", whiskers.getName, whiskers.getSound)
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")

    println(whiskers.toString)


    val spike: Dog = new Dog("Spike", "Woof", "Grrr")
    spike.setName("Max")
    println(spike.toString)  // Why U No Work Scala??
    println(spike.getName)

    val fang: Wolf = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println("Fang: " + fang.move)

  } // END OF MAIN

  // If class is "final", no other class can inherit from it
  // final class Animal(var name: String, var sound: String) {
  class Animal(var name: String, var sound: String) {
    this.setName(name)

    val id: Int = Animal.newIdNum

    // Or I could set default name like this
    // protected var name = "No name"

    def getName: String = name
    def getSound: String = sound

    def setName(name: String): Unit = {
      if(!name.matches(".*\\d+.*"))
        this.name = name
      else
        this.name = "No Name"
    }

    def setSound(sound: String): Unit = {
      this.sound = sound
    }

    // Alternative constructors
    // this stands for class' main constructor
    def this(name: String) {
      this("No Name", "No Sound")
      this.setName(name)
    }

    def this() {
      this("No Name", "No Sound")
    }

    // method overriding
    override def toString: String = {
      "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }
  } // END OF Animal

  // Companion Objects / Static
  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber}
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String) {
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this(name: String) {
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this() {
      this("No Name", "No Sound", "No Growl")
    }

    override def toString: String = {
      "%s with the is %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }

  } // END OF Dog

  abstract class Mammal(val name: String) {
    var moveSpeed: Double

    def move: String
  }

  class Wolf(name: String) extends Mammal(name) {
    var moveSpeed = 35.0

    override def move: String = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
  }

} // END OF Classes

trait Flayable {
  def fly: String
}

trait BulletProof {
  def hitByBullet: String

  def ricochet(startSpeed: Double): String = {
    "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
  }
}

class Superhero(var name: String) extends Flayable with BulletProof {
  override def fly: String = "%s flys through the air".format(this.name)

  override def hitByBullet: String = "The bullet bounces off %s".format(this.name)

  override def ricochet(startSpeed: Double): String = super.ricochet(startSpeed)
}

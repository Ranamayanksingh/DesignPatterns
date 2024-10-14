package factoryKit

trait Weapon{
  val damagePower = 0
  var name = ""
  def setWeaponName(weaponName:String): Unit ={
    this.name = weaponName
  }
}

class Axe extends Weapon {
  override def toString: String = "Axe"
  override val damagePower = 100
}

class Sword extends Weapon {
  override def toString: String = "Sword"
  override val damagePower = 50
}

class Bow extends Weapon {
  override def toString: String = "Bow"
  override val damagePower = 200
}

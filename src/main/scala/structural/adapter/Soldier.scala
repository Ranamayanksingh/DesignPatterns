package structural.adapter

class Soldier {
def fightWith(weapon:Weapon):String = {
  weapon.fire()
}
}

package structural.adapter

trait Weapon {
  def fire():String
}

class AK47 extends Weapon {
  override def fire(): String = {
    "dudududud fire with AK47"
  }
}

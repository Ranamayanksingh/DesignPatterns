package prototype

trait Prototype extends Cloneable {
  override def clone(): AnyRef = super.clone()
}

class Virus(var name:String,var character:String) extends Prototype {
  override def clone():Virus = new Virus(name,character)
}

case class Bacteria(name:String,character:String)


package behavioral.visitor
import behavioral.visitor.Animal.Operation

trait Animal {
  def accept(operation:Animal.Operation)
}

class Monkey extends Animal {
  override def accept(operation: Operation): Unit  = {
    operation(this)
  }
}

class Lion extends Animal {
  override def accept(operation: Operation): Unit = {
    operation(this)
  }
}

class Dolphin extends Animal {
  override def accept(operation: Operation): Unit = {
    operation(this)
  }
}


object Animal{
  type Operation = Animal => Unit
}
package structural.composite

trait Action {
def act():Unit
}

class TurnRight extends Action {
  override def act(): Unit = println("turn right")
}

class TurnLeft extends Action {
  override def act(): Unit = println("turn left")
}

class Fordward extends Action {
  override def act(): Unit = println("go forward")
}

class CompositeAction(action: Action*) extends Action {
  override def act(): Unit = {
    action.foreach(a => a.act())
  }
}

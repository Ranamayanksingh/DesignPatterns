package structural.composite

object Main extends App{
  val action = new CompositeAction(new Fordward,new TurnLeft,new TurnRight)
  action.act()
}

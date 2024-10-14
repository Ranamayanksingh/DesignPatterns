package behavioral.visitor

object Main extends App {
  val zoo = new Zoo(new Monkey , new Lion , new Dolphin)
  zoo.accept(AnimalOperation.speak)
  zoo.accept(AnimalOperation.swim)
}

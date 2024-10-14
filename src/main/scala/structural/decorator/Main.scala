package structural.decorator

object Main extends App {
 val coffee = new SimpleCoffee with MilkAdded with SugarAdded
 println(coffee.getCost)
  println(coffee.getDescription)
}

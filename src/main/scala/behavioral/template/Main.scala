package behavioral.template

object Main extends App {
  val vegan = new Vegan
  vegan.goToRestaurant()

  val meatEater = new NonVegetarian
  meatEater.goToRestaurant()

}

package behavioral.template

abstract class Customer {

  def goToRestaurant():Unit = {
    val orders = order()
    println(s"I am eating $orders.")
    println(s"the $orders is ${comments}")
  }

  protected def order():String
  protected def comments():String
}

class Vegan extends Customer {
  override protected def order(): String = "vegetable"

  override protected def comments(): String = "yummy"
}

class NonVegetarian extends Customer {
  override protected def order(): String = "steak"

  override protected def comments(): String = "chewy"
}

package structural.decorator

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class DecoratorSpec extends FlatSpec with Matchers{

  it should "cost $18 for coffee with milk and sugar" in {
    val coffee = new SimpleCoffee with MilkAdded with SugarAdded
    coffee.getCost should be (18)
  }
}

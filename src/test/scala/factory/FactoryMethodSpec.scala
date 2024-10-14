package factory

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class FactoryMethodSpec extends FlatSpec with Matchers {
  it should "make Thai flavour noodle" in  {
    val chef = new ThaiChef
    chef.makeNoodle().isInstanceOf[PadThai] should be (true)
  }

  it should "make Italian noodles" in {
    val chef = new ItalianChef
    chef.makeNoodle().isInstanceOf[Spaghetti] should be (true)
  }
}

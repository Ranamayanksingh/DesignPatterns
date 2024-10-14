package builderPattern

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class BuilderSpec extends FlatSpec with Matchers {

  it should "build car" in {
    val car = new DIYCarBuilder().setEngine("V6").setWheels(5).setColor("Red").build()
    car should be (Car("V6",5,"Red"))
  }
}

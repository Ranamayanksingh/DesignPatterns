package cake

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class CakeSpec extends FlatSpec with Matchers {
 it should "Create audi car" in {
   val car = new Car with AudiCarComponentRegistry
   car.engine.isInstanceOf[EngineComponent#V6Engine] should be (true)
 }

  it should "create BMW car" in {
    val car = new Car  with BMWCarComponentRegisty
    car.brand.isInstanceOf[BrandComponent#BMWBrand] should be (true)
  }
}

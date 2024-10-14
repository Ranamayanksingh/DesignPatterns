package abstractFactoryPattern


import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class AbstractFactorySpec extends FlatSpec with  Matchers {
  it should "create Audi car " in {
    val car = new Car(AudiCarFactory)
    car.engine.isInstanceOf[V6Engine] should be (true)
  }

  it should "create BMW car" in {
    val car = new Car(BMWCarFactory)
    car.engine.isInstanceOf[V8Engine] should be (true)
  }
}

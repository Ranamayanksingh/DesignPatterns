package simpleFactory

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class SimpleFactorySpec extends FlatSpec with Matchers{

  it should "create AddOperation" in {
    val op = Operation("+")
    op.getResult(1,2) should be (3)
  }

  it should "create SubOperation" in {
    val op = Operation("-")
    op.getResult(9,2) should be (7)
  }

  it should "create MulOperation" in {
    val op = Operation("*")
    op.getResult(9,3) should be (27)
  }

  it should "create DivOperation" in {
    val op = Operation("/")
    op.getResult(72,9) should be (8)
  }

}

package structural.facade

import org.scalatest.flatspec.FlatSpec
import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

import java.io.ByteArrayOutputStream

class FacadeSpec extends FlatSpec with Matchers {

  it should "simplify the power-on operation on computer system" in {
    val buffer = new ByteArrayOutputStream()
    Console.withOut(buffer) {
      val computer = new ComputerFacade()
      computer.powerOn()
    }
    buffer.toString() should be("CPU is powered on.\nFan is running.\nLight is flashing.\n")
  }
}
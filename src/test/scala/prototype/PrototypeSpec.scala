package prototype

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class PrototypeSpec extends FlatSpec with Matchers{
 it should "clone itself" in {
   val virus = new Virus("HIV","BAD")
   virus.name should be (virus.clone().name)

   val bacteria = Bacteria("LAB","GOOD")
   bacteria should be (bacteria.copy())
 }
}

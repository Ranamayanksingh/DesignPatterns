package factoryKit

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class FactoryKitSpec extends FlatSpec with Matchers{

  it should "create objects using local factory kit" in {
    val factory = WeaponFactoryKit.factory{ builder =>
      builder.put("axe1",() => new Axe())
      builder.put("bow1",() => new Bow())
      builder.put("swordSharp1",() => new Sword())
    }

    val axe1 = factory.create("axe1")
    val bowOfMahadev = factory.create("bow1")

    axe1.toString should be ("Axe")
  }

}

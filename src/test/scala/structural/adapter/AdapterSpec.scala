package structural.adapter

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class AdapterSpec extends FlatSpec with Matchers{
   it should "adapt knife to Weapon" in  {
     val soldier = new Soldier()
     soldier.fightWith(new AK47) should be ("dudududud fire with AK47")
     soldier.fightWith(new Knife) should be ("stab stab with knifee~~~~")
   }

}

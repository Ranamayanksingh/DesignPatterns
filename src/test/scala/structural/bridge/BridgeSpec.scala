package structural.bridge

import org.scalatest.flatspec.FlatSpec
import org.scalatest.matchers.should.Matchers

class BridgeSpec extends FlatSpec with Matchers{
   it should "cretes about-page with different theme" in {
     new AboutPage(new DarkTheme).getContent should be ("About page in Dark Theme")
     new AboutPage(new LightTheme).getContent should be ("About page in Off White")
   }

  it should "change help-pages theme" in {
    val help = new HelpPage(new DarkTheme)
    help.getContent should be ("Help page in Dark Theme")
    help.changeTheme(new LightTheme)
    help.getContent should be ("Help page in Off White")
  }

}

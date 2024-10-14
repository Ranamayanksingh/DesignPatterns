package structural.bridge

trait Theme {
def getColor:String
}

class DarkTheme extends Theme {
  override def getColor: String = "Dark Theme"
}

class LightTheme extends Theme {
  override def getColor: String = "Off White"
}

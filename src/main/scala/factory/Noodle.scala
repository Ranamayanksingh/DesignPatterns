package factory


trait Noodle {
def flavour():String
}

class PadThai extends Noodle {
  override def flavour(): String = "Thai flavour"
}

class Spaghetti extends Noodle {
  override def flavour(): String = "Italian flavour"
}

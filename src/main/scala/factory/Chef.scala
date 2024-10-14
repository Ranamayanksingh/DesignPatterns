package factory

trait Chef {
  def makeNoodle():Noodle

  def cook():Unit = {
    val noodle = makeNoodle()
    println(s"The noodle is ${noodle.flavour} . Yummy!!")
  }
}

class ThaiChef extends Chef {
  override def makeNoodle(): Noodle = new PadThai()
}

class ItalianChef extends Chef {
  override def makeNoodle(): Noodle = new Spaghetti()
}

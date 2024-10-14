package structural.typeClasses

trait Animal

class Monkey extends Animal

class Lion extends Animal

object Animal {
  implicit object SpeakableMonkey extends Speakable[Monkey] {
    override def say(): String = "I'm monkey. Ooh oo aa aa!"
  }

  implicit object SpeakableLion extends Speakable[Lion] {
    override def say(): String = "I'm Lion. Roaaar!!"
  }
}

package behavioral.visitor

object AnimalOperation {
  def speak(animal:Animal):Unit = animal match {
    case monkey: Monkey => println("Monkey Speak : Ooh oo aa aa!!")
    case lion: Lion => println("Lion Speak : Rooarrr!!")
    case dolphin: Dolphin => println("Dolphin Speak:Tuut tuttu tuuuttt!!")
    case _ => // do nothing
  }

  def swim(animal: Animal):Unit = animal match {
    case dolphin: Dolphin => println("Dolphin Swim :Sweee swim fast!")
    case _ => //do nothing
  }
}

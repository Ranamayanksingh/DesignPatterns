package behavioral.visitor

class Zoo(animal: Animal*){
  def accept(operation: Animal.Operation):Unit = {
    animal.foreach(
      _.accept(operation)
    )
  }

}

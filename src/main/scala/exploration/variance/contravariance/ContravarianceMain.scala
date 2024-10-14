package exploration.variance.contravariance

object ContravarianceMain {
  def main(args:Array[String]):Unit = {
    val animalSerializer:Serializer[Animal] = new Serializer[Animal] {
      override def serialize(animal: Animal): String = s"""{ "name" : "${animal.name}" }"""
    }
    val catSerializer:Serializer[Cat] = animalSerializer
    println(catSerializer.serialize(Cat("Felix")))
  }
}

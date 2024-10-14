package exploration.variance.convariance

object CovarianceMain {
  def main(args:Array[String]) = {
    val catBox = new Box[Cat](Cat("Felix"))
    val animalBox : Box[Animal] = catBox /** This starts to compile , which was not getting compiled in invariance definition */
    println(animalBox.content)

  }
}

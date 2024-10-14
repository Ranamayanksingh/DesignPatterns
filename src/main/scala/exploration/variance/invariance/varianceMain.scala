package exploration.variance.invariance

object varianceMain {
  def main(array: Array[String]) = {
    val myCatBox: Box[Cat] = new Box[Cat](Cat("Felix"))
    //    val myAnimalBox:Box[Animal] = myCatBox /**This doesn't compile */
    val myAnimal: Animal = myCatBox.content
    println(myAnimal)

    /** Understanding :
     * Generic classes can not infer the subtyping relationShip between classes
     *  */
  }
}

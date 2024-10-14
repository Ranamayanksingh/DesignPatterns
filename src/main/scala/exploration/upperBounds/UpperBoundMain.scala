package exploration.upperBounds

object UpperBoundMain {
  def main(args:Array[String]):Unit = {

   val dogContainer = new PetContainer[Dog](new Dog)
   val catContainer = new PetContainer[Cat](new Cat)

//   val lionContainer = new PetContainer[Lion](new Lion)
    /** This line would not compile,
     bcz Lion is not subType of Pet , instead it extends Animal
     */

  }
}

package exploration.extractorObject

object extractorMain {

  def main(args:Array[String])  ={
    val customer1 = CustomerID("Mayank")
    customer1 match {
      case CustomerID(name) => println(name)
      case _ => println("Could not extract a CustomerId")
    }

    val customer2ID = CustomerID("Nico")
    val CustomerID(name2) = "--asdfasdfasdf"
    val CustomerID(name) = customer2ID
    println(name)  // prints Nico
  }

}

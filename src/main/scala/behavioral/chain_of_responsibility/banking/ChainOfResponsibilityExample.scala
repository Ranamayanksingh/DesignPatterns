package behavioral.chain_of_responsibility.banking

// Main program
object ChainOfResponsibilityExample {
  def main(args: Array[String]): Unit = {
    val manager = new Manager()
    val director = new Director()
    val ceo = new CEO()

    // Set the chain of responsibility
    manager.setSuccessor(director)
    director.setSuccessor(ceo)

    // Send requests
    manager.handleRequest(Request(500))
    manager.handleRequest(Request(2500))
    manager.handleRequest(Request(7500))
    manager.handleRequest(Request(15000))
  }
}

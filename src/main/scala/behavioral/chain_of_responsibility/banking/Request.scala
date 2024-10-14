package behavioral.chain_of_responsibility.banking

// Define the request and handler classes
case class Request(amount: Double)

abstract class Handler {
  private var successor: Option[Handler] = None

  def setSuccessor(successor: Handler): Unit = {
    this.successor = Some(successor)
  }

  def handleRequest(request: Request): Unit = {
    if (successor.isDefined) {
      successor.get.handleRequest(request)
    } else {
      println("Request cannot be handled.")
    }
  }
}

// Concrete handler classes
class Manager extends Handler {
  override def handleRequest(request: Request): Unit = {
    if (request.amount <= 1000) {
      println(s"Manager handles the request: $request")
    } else {
      super.handleRequest(request)
    }
  }
}

class Director extends Handler {
  override def handleRequest(request: Request): Unit = {
    if (request.amount <= 5000) {
      println(s"Director handles the request: $request")
    } else {
      super.handleRequest(request)
    }
  }
}

class CEO extends Handler {
  override def handleRequest(request: Request): Unit = {
    if (request.amount <= 10000) {
      println(s"CEO handles the request: $request")
    } else {
      super.handleRequest(request)
    }
  }
}



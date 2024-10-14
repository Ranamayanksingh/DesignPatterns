package behavioral.chain_of_responsibility.fp

object RequestHandler {

  type Type = PartialFunction[Request, Response]

  val developer: RequestHandler.Type = {
    case req@FixBugRequest(desc) =>
      println(s"I am a developer.I can fix this bug: $desc")
      Response(req, handled = true)
  }

  val architect: RequestHandler.Type = {
    case req@FeatureRequest(desc) =>
      println(s"I am architect. I can implement this feature : $desc")
      Response(req, handled = true)
  }

  val CTO: RequestHandler.Type = {
    case req@ProductRequest(desc) =>
      println(s"I am CTO. I can make this product:$desc")
      Response(req, handled = true)
  }

  val noOne: RequestHandler.Type = {
    case req: Request =>
      println("No one is responsible fot this request!!")
      Response(req = req, handled = false)
  }

}

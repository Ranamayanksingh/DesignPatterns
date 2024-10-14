package behavioral.chain_of_responsibility.fp

class SoftwareCompany {

  val chain:RequestHandler.Type = {
    RequestHandler.developer orElse RequestHandler.architect orElse RequestHandler.CTO orElse RequestHandler.noOne
  }

  def handleRequest(req:Request):Response = {
    chain(req)
  }

}

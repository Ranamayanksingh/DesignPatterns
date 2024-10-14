package behavioral.chain_of_responsibility.fp

object Main extends App {

  val company = new SoftwareCompany()
  company.handleRequest(FixBugRequest("bug"))
  company.handleRequest(FeatureRequest("feature"))
  company.handleRequest(ProductRequest("product"))
  company.handleRequest(FakeRequest("fake"))
}

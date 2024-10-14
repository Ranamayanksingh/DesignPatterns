package structural.facade

object Main extends App {

  val computer = new ComputerFacade()
  computer.powerOn()
}

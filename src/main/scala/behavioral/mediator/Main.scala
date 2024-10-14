package behavioral.mediator

object Main extends App {
  val china = new China
  val usa = new USA
  val india = new India

  val united = new UnitedNations
  united.addMember(china)
  united.addMember(usa)
  united.addMember(india)

  china.declare("War War , No Peace!!")
}

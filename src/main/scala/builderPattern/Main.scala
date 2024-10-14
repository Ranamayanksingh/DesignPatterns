package builderPattern

object Main extends App {
  val car = new DIYCarBuilder().setEngine("V6").setWheels(4).setColor("Red").build()
  println(car)
}

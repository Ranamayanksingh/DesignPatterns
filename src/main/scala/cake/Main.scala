package cake

object Main extends App {
val audi_x1 = new Car with AudiCarComponentRegistry
audi_x1.drive()

  val bmw_k1 = new Car with BMWCarComponentRegisty
  bmw_k1.drive()
}

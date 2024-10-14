package abstractFactoryPattern

object Main extends App{
  val audi_x1 = new Car(AudiCarFactory)
  audi_x1.drive()

  val bmw_k1 = new Car(BMWCarFactory)
  bmw_k1.drive()

  val car_io = new Car(BMWCarFactory)
  car_io.drive()
}

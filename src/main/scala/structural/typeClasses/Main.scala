package structural.typeClasses

object Main extends App{
  val human = new Human()
  val monkey = new Monkey()
  val lion = new Lion()
  println(human.sayHelloTo(monkey))
  println(human.sayHelloTo(lion))

}

package simpleFactory

object Main extends App{
  val op = Operation("*")
  val result = op.getResult(1,2)
  println(result)
}

package prototype

object Main extends App {

  val v = new Virus("HIV","BAD")
  println(v == v.clone())


  val b = Bacteria("LAB","GOOD")
  println(b == b.copy())
}

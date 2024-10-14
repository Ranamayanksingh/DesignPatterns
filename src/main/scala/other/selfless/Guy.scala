package other.selfless

trait Human

class Guy extends Human with Friendly {
}

class KindGuy extends Human  {
  import Friendly.{greet => sayHi}
  def greet():String = sayHi() + " Have a nice day!"
}

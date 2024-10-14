package exploration.variance.invariance

abstract class Animal {
  def name:String
}

case class Cat(name:String) extends Animal
case class Dog(name:String) extends Animal

class Box[A](var content:A)


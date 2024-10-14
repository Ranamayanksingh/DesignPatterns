package exploration.variance.contravariance

abstract class Animal {
  def name:String
}

case class Dog(name:String) extends Animal
case class Cat(name:String) extends Animal

abstract class Serializer[-A]{
  def serialize(a:A):String
}


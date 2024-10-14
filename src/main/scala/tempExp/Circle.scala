package tempExp

import tempExp.Circle.area

case class Circle(radius:Double,name:String)


object Circle {
  def apply(diameter: Double): Circle = Circle(diameter / 2)

  def area(circle: Circle): Double = Math.PI * circle.radius * circle.radius
}


object LetsRun{
  def main(array: Array[String])  = {
    val c1 = Circle(10,"kbasd")
    area(c1)
  }
}

package exploration.curried

object CurriedMain {
  def main(args:Array[String]) = {
    // version with multiple parameter lists
    def addMultiple(n1: Int)(n2: Int) = n1 + n2
    // two different ways of arriving at a curried version instead
    def add(n1: Int, n2: Int) = n1 + n2
    val addCurried1 = (add _).curried
    val multiplyCurried2 = (n1: Int) => (n2: Int) => n1 * n2

    println(addMultiple(3)(4))  // 7
    println(addCurried1(3)(4))  // 7
    println(multiplyCurried2(3)(4))  // 7



    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberFunc = numbers.foldLeft(List[Int]()) _

    val squares = numberFunc((xs, x) => xs :+ x*x)
    println(squares) // List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

    val cubes = numberFunc((xs, x) => xs :+ x*x*x)
    println(cubes)



  }
}

package simpleFactory

trait Operation {
  def getResult(a:Double,b:Double):Double
}

class AddOperation extends Operation{
  override def getResult(a: Double, b: Double): Double = {
    a + b
  }
}

class SubOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    a-b
  }
}

class MulOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    a*b
  }
}

class DivOperation extends Operation {
  override def getResult(a: Double, b: Double): Double = {
    a/b
  }
}

object Operation {
  def apply(op:String) = op match {
    case "+" => new AddOperation()
    case "-" => new SubOperation()
    case "*" => new MulOperation()
    case "/" => new DivOperation()
  }
}
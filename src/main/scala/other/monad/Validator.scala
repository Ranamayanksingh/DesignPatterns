package other.monad

abstract class Validator[+A] {
  protected val isValid:Boolean

  def get:A

  def validate(p:A => Boolean):Validator[A] = {
    if(!isValid) Illegal
    else if (!p(this.get)) Illegal
    else this
  }

  def flatMap[B](f:A => Validator[B]):Validator[B] = {
    if(isValid) f(this.get) else Illegal
  }

}

case object Illegal extends Validator[Nothing]{

  override protected val isValid: Boolean = false

  override def get: Nothing = throw new IllegalStateException()

}

case class Valid[+A](testee:A) extends Validator[A] {
  override protected val isValid: Boolean = true
  override def get: A = testee
}

object Validator {
  def apply[A](testee:A):Validator[A] = new Valid[A](testee)
}

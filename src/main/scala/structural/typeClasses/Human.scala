package structural.typeClasses

class Human {
  def sayHelloTo[A](target:A)(implicit s:Speakable[A]):String = {
    s"Human say hello, get reply: ${s.say()}"
  }
}

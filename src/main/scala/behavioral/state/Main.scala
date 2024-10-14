package behavioral.state

object Main extends App {
  val keyboard = new Keyboard()
  keyboard.write("hello world")
  keyboard.pressCapsLock()

  keyboard.write("hello world")
  keyboard.pressCapsLock()
}

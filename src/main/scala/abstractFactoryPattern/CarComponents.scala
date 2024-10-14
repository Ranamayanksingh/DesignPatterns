package abstractFactoryPattern

trait Engine {
  def start():Unit
}

class V6Engine extends Engine {
  override def start(): Unit = println("Vroom Vroom Vroom ... V6 Engine Started.")
}

class V8Engine extends Engine {
  override def start(): Unit = println("Vroom Vroom Vroom .... V8 Engine Started..")
}

trait Wheel {
  def rotate():Unit
}

class MichelinWheel extends Wheel {
  override def rotate(): Unit = println("Michelin wheel rotated.")
}

class DunlopWheel extends Wheel {
  override def rotate(): Unit = println("Dunlop wheel rotated..")
}

trait Brand {
  def light():Unit
}

class AudiBrand extends Brand {
  override def light(): Unit = println("I am Audi..")
}

class BMWBrand extends Brand {
  override def light(): Unit = println("I am BMW...")
}
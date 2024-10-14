package cake

abstract class Car {
  self:EngineComponent with WheelComponent with BrandComponent =>
  def drive():Unit = {
    brand.light()
    engine.start()
    wheel.rotate()
  }
}

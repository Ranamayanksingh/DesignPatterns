package cake

trait AudiCarComponentRegistry extends EngineComponent with WheelComponent with BrandComponent {
  override val engine: Engine = new V6Engine()
  override val wheel: Wheel = new DunlopWheel()
  override val brand: Brand = new AudiBrand()
}

trait BMWCarComponentRegisty extends EngineComponent with WheelComponent with BrandComponent {
  override val engine: Engine = new V8Engine()
  override val wheel: Wheel = new MichelinWheel()
  override val brand: Brand = new BMWBrand()
}



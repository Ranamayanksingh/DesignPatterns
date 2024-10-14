package behavioral.observer

object Main extends App {
  val weather = new Weather()
  weather.addObserver(new Boy)
  weather.addObserver(new Girl)
  weather.changing(WeatherType.COLD)
  weather.changing(WeatherType.RAINY)

}

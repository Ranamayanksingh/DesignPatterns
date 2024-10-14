package behavioral.observer

trait WeatherObserver {
  def update(currentWeather:WeatherType)
}

class Boy extends WeatherObserver{
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. I can go to placy football.")
    case WeatherType.RAINY => println("It is rainy. I can play video games at home.")
    case WeatherType.COLD => println("It is cold. It is a nice for sleeping")
  }
}

class Girl extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. I can go shopping.")
    case WeatherType.RAINY => println("It is rainy. I should take an umbrella and go shopping.")
    case WeatherType.COLD => println("It is cold. I should go to buy some clothes.")
  }
}


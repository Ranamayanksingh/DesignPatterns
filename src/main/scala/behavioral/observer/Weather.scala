package behavioral.observer

import scala.collection.mutable

class Weather {
  val observer = mutable.ListBuffer[WeatherObserver]()
  var currentWeather:WeatherType = WeatherType.SUNNY

  def addObserver(ob:WeatherObserver):Unit = {
    observer.append(ob)
  }

  def removeObserver(ob:WeatherObserver):Unit = {
    val index = observer.indexOf(ob)
    if(index != -1){
      observer.remove(index)
    }
  }

  def changing(weather: WeatherType):Unit = {
    currentWeather = weather
    notifyObserver()
  }

  def notifyObserver():Unit = {
    observer.foreach{
      ob =>
        ob.update(currentWeather)
    }
  }
}

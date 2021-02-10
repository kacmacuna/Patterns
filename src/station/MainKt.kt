package station


fun main() {
    val weatherStation: WeatherStation = WeatherStationImpl()

    val observer = ObserverOnEnglish()
    weatherStation.register(observer)
    val observerOnGeorgian = ObserverOnGeorgian()
    weatherStation.register(observerOnGeorgian)

    weatherStation.notifyObservers(WeatherData(25))
    weatherStation.notifyObservers(WeatherData(11))

    weatherStation.unregister(observerOnGeorgian)

    weatherStation.notifyObservers(WeatherData(112))

}

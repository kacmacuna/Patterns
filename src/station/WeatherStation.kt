package station

interface WeatherStation {
    fun register(observer: Observer<WeatherData>)
    fun unregister(observer: Observer<WeatherData>)

    fun clearAll()
    fun notifyObservers(weatherData: WeatherData)
}
package station


class WeatherStationImpl : WeatherStation {

    private val list = mutableListOf<Observer<WeatherData>>()

    override fun register(observer: Observer<WeatherData>) {
        list.add(observer)
    }

    override fun unregister(observer: Observer<WeatherData>) {
        list.remove(observer)
    }

    override fun clearAll() {
        list.clear()
    }

    override fun notifyObservers(weatherData: WeatherData) {
        list.forEach { it.trigger(weatherData) }
    }

}
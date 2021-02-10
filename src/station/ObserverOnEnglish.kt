package station

class ObserverOnEnglish(
    private val weatherStation: WeatherStation
) : Observer<WeatherData> {

    init {
        Thread {
            while (true) {
                Thread.sleep(1000)
            }
        }.run()
    }

    override fun trigger(t: WeatherData) {
        println("Weather Data: $t")
    }
}

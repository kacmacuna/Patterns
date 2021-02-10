package station


class ObserverOnGeorgian : Observer<WeatherData> {
    override fun trigger(t: WeatherData) {
        println("Amindis Prognozia: $t")
    }
}

package station

interface Observer<T> {
    fun trigger(t: T)
}
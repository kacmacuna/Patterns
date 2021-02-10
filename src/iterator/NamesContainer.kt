package iterator

class NamesContainer : Container {

    private val list = listOf("Name1", "Name2", "Name3")
    private var index = 0

    override fun hasNext(): Boolean {
        return index < list.size
    }

    override fun next(): String {
        return if (hasNext()) {
            val newElement = list[index]
            index++
            newElement
        } else
            throw NoSuchElementException()
    }
}

package iterator

fun main() {
    iterate(NamesContainer())
}

fun iterate(container: Container) {
    for (element in container) {
        println(element)
    }
}

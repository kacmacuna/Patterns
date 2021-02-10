package hash

data class User(
    private val name: String
) {
    override fun hashCode(): Int {
        return (Int.MIN_VALUE..Int.MAX_VALUE).random()
    }
}

fun main() {
    val users = HashMap<User, Int>()
    listOf(1, 2, 3).associateWith { it * 4 }

    users[User("Name")] = 2
    users[User("Name")] = 222

    println(users[User("Name")])
    println(users)
}

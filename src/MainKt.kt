class User(
    var name: String,
    var lastName: String,
    private val age: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (lastName != other.lastName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}

fun main() {
    val map = HashMap<User, Int>()

    val user1 = User("Name", "LastName", 21)
    val user2 = User("Name", "LastName", 21)

    println(user1 == user2)

    map[user1] = 2
    map[user2] = 5

    println(map[User("Name", "LastName", 21)])
}
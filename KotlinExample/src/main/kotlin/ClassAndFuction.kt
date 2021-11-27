data class User(val id: Int, var name: String, var address: String)

fun getUser(id: Int): User {
    return User(id, "Matsuo", "Fukuoka")
}

fun updateUser(id: Int, newName: String, newAddress: String) {
    var name = ""
    val user = getUser(id).also {
        it.name = newName
        it.address = newAddress
    }
    println(user)
}
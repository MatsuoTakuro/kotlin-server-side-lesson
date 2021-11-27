fun main() {
    val user  = User7(1, "Matsuo")
    val same  = User7(1, "Matsuo")
    val other = User7(2, "Matsuo")

    println(user == same)
    println(user == other)

    println("user  = ${user.hashCode()}")
    println("same  = ${same.hashCode()}")
    println("other = ${other.hashCode()}")

    val set = hashSetOf(user)
    println(set.contains(same))
    println(set.contains(other))

    println(user.toString())

    println(user.component1())
    println(user.component2())

    val updated = user.copy(id = 1, name = "Kotlin")
    println(updated.toString())

    println(updated.isValidName)
}

fun main() {
    var oddNumbers = with(mutableListOf<Int>()) {
        for (i in 1 .. 10) {
            if (i % 2 == 1) add(i)
        }
        joinToString(separator = " ")
    }
    println(oddNumbers)

    oddNumbers = mutableListOf<Int>().run {
        for (i in 1 .. 10) {
            if (i % 2 == 1) add(i)
        }
        joinToString(separator = " ")
    }
    println(oddNumbers)

    val user = User("Matsuo")
    println(getUserString(user, "Kotlin"))
    println(getUserString(null, "Kotlin"))

    println(createUser("Java"))
    println(createUser(null))
}

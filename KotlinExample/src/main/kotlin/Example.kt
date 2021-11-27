fun main() {
    val user1 = User1()
    user1.name = "Matsuo"
    println(user1.name)

    val user2 = User2(1)
    println(user2.name)

    val user3 = User3()
    user3.name = "Matsuo"
    println(user3.name)

    val user4 = User4()
    user4.name = "Matsuo"
    println(user4.isValidName)

    val user5 = User5()
    user5.name = ""
    println(user5.name)
    user5.name = "Matsuo"
    println(user5.name)
}

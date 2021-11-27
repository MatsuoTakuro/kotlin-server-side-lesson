fun main() {
    val userA = User6()
    val userB = User6()

//    toString
    println(userA.toString())
    println(userB.toString())

//    hasCode
    println(userA.hashCode())
    println(userB.hashCode())

//    equals
    println(userA == userB)

//    hashCode and equals
    val set = hashSetOf(userA)
    println(set.contains(userB))
}


fun main() {
    val intList: List<Int> = listOf<Int>(1, 2, 3)
    println(intList)
    println(intList[1])

    val stringList: List<String> = listOf<String>("one", "two", "three")
    println(stringList)
    println(stringList[1])

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)

    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println(map[2])
    println(map.containsKey(3))
    println(map.containsKey(4))

    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    println(mutableMap)

    val set = setOf("one", "two", "three")
    println(set.contains("three"))
    println(set.contains("four"))

    val mutableSet = mutableSetOf("one", "two", "three")
    mutableSet.add("four")
    println(mutableSet)
}

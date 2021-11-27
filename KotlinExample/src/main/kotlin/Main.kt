import kotlin.system.exitProcess

fun main() {
    val list = listOf(1, 2, 3)
    println(list)
    list.forEach { println(it) }

    val idList = list.map { it * 10 }
    println(idList)
    idList.forEach { println(it) }

    val list2 = listOf( User(1, 100, "Matsuo"),
                        User(2, 200, "Kotlin"),
                        User(3, 300, "Java"),
                        User(4, 200, "Groovy")
                      )
    val filteredList = list2.filter { it.teamId  == 200 }
    println(filteredList)
    filteredList.forEach { println(it) }

    println(list2.first())
    println(list2.last())

    println(list2.firstOrNull { it.teamId == 200 })
    println(list2.firstOrNull { it.teamId == 1000 })
    println(list2.lastOrNull  { it.teamId == 100 })
    println(list2.lastOrNull  { it.teamId == 1000 })

    val list3 = listOf(1, 1, 2, 3, 4, 4, 5)
    val distinctList = list3.distinct()
    println(distinctList)
    distinctList.forEach { println(it) }

//  Map<Int, User>
    val map2 = list2.associateBy { it.id }
    println(map2)
    list2.forEach { println(map2[it.id]) }

    val list4 = listOf("Matsuo", "Kotlin", "Java")
//  Map<String, Int>
    val map4 = list4.associateWith { it.length }
    println(map4)
    list4.forEach { println(map4[it]) }
    list4.forEach { println(it) }

    val map22 = list2.groupBy { it.teamId }
    println(map22)
    println(map22[100])
    map22[100]?.forEach { println(it) }
    println(map22[200])
    map22[200]?.forEach { println(it.name) }

    val oddNumberCount = list.count { it % 2 == 1 }
    println(oddNumberCount)

    val chunkedList = list4.chunked(2)
    println(chunkedList)
    chunkedList.forEach { println(it) }
    chunkedList[0].forEach { println(it) }
    chunkedList[1].forEach { println(it) }

    val result = list.reduce { sum, value ->
        println("$sum + $value")
        sum + value
    }
    println(result)
}

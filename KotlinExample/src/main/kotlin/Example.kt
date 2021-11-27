fun main() {
    println(countLength("test"))
    whenExample(150)
    whileExample()
    forExample()
}

fun countLength(str: String): Int {
    return str.length
}

fun whenExample(num: Int) {
    if (num < 100) {
        println("less than 100")
    } else if (num == 100) {
        println("equal to 100")
    } else {
        println("greater than 100")
    }

    when (num) {
        100 -> {
            println("equal to 100")
        }
        200 -> {
            println("equal to 200")
        }
        else -> {
            println("undefined value")
        }
    }

    when {
        num < 100 -> {
            println("less than 100")
        }
        num == 100 -> {
            println("equal to 100")
        }
        else -> {
            println("greater than 100")
        }
    }
}

fun whileExample() {
    var i = 1
    while (i < 10) {
        println("i is $i")
        i++
    }
}

fun forExample() {
    val list = listOf(1, 2, 5, 6, 10)
    for (i in list) {
        println("i is $i")
    }
}

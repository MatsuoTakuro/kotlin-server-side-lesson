val calc: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }

val squared: (Int) -> Int = { it * it }

val squared2: (Int) -> Int = fun(num: Int): Int { return num * num }

fun printCalcResult(num1: Int, num2: Int, calc: Calc) {
    val result = calc(num1, num2)
    println(result)
}

fun printAdditionResult(x: Int, y: Int) {
    printCalcResult(x, y) { num1, num2 -> num1 + num2 }
}

fun printMultiplicationResult(x: Int, y: Int) {
    printCalcResult(x, y) { num1, num2 -> num1 * num2 }
}

typealias Calc = (Int, Int) -> Int

fun Int.square(): Int = this * this

fun main() {

    println(calc(10, 5))

    println(squared(2))

    println(squared2(2))

    printCalcResult(10, 20) { num1, num2 -> num1 + num2 }
    printCalcResult(10, 20) { num1, num2 -> num1 * num2 }

    printAdditionResult(10, 20)
    printMultiplicationResult(10, 20)

    println(2.square())
}

fun main() {
    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8, 11))

    val executorDelegate = AddCalculationExecutorDelegate(CommonCalculationExecutor())
    executorDelegate.printStartMessage()
    println(executorDelegate.calc(8, 11))

    val delegatePerson = DelegatePerson()
    delegatePerson.name = "Matsuo"
    delegatePerson.address = "Fukuoka"
    println(delegatePerson.name)
    println(delegatePerson.address)
}

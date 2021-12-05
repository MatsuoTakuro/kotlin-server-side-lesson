import java.time.LocalDateTime
import java.util.*

fun main(args: Array<String>) {
    val hello = HelloByJava()
    hello.printHello()

    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())

    val now = Time(LocalDateTime.now())
    println(now.time)

    val dog = DogKotlin()
    dog.cry()

    val greeter = GreeterImplKotlin()
    greeter.hello()

    val user = UserJava()
    user.id = 100
    user.name = "Matsuo"
    println(user.id)
    println(user.name)

    val function = CalcJava { num1, num2 -> num1 + num2 }
    println(function.calc(1, 3))

    val function2 = CalcJava { num1, num2 -> num1 + num2 }
    executeCalc(1, 3, function2)
}

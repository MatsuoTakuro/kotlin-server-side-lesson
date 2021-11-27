interface Greeter {
    fun hello()
}

class GreeterImpl : Greeter {
    override fun hello() {
        println("Hello")
    }
}

fun main() {
    val greeter = GreeterImpl()
    greeter.hello()
}
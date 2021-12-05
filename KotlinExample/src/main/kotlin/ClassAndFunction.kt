import java.time.LocalDateTime

class ClassAndFunction {
    fun printHello() {
        println("Hello Kotlin.")
    }
}

data class Time(val time: LocalDateTime)

class DogKotlin: AnimalJava() {
    override fun cry() {
        println("bowwow")
    }
}

class GreeterImplKotlin: GreeterJava {
    override fun hello() {
        println("Hello.")
    }
}

fun executeCalc(num1: Int, num2: Int, function: CalcJava) {
    println(function.calc(num1, num2))
}

class CompanyConstants {
    companion object {
        @JvmStatic
        val maxEmployeeCount = 100
    }
}


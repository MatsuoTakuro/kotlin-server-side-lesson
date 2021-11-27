import kotlinx.coroutines.*


fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Matsuo.")
    }
    println("My name is")
    Thread.sleep(2000L)

    runBlocking {
        launch {
            delay(1000L)
            println("Matsuo2.")
        }
        println("My name2 is")
    }

    runBlocking {
        launch { printName() }
        println("My name3 is")
    }

    runBlocking {
        val result = async {
            delay(2000L)
            var sum = 0
            for (i in 1 .. 10) {
                sum += i
            }
            sum
        }
        println("Calculating...")
        println("sum=${result.await()}")
    }

    runBlocking {
        val num1 = async {
            delay(2000L)
            1 + 2
        }
        val num2 = async {
            delay(1000L)
            3 + 4
        }
        println("Calculating again...")
        println("sum=${num1.await() + num2.await()}")
    }
}


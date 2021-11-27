sealed class Platform {
    abstract fun showName()
}

class AndroidPlatform : Platform() {
    override fun showName() {
        println("Android")
    }
}

class IosPlatform : Platform() {
    override fun showName() {
        println("iOS")
    }
}

fun main() {
    val android = AndroidPlatform()
    android.showName()
    val ios = IosPlatform()
    ios.showName()
}

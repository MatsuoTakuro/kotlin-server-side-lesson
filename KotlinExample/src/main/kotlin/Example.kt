open class Animal(val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("cries")
}

class Dog(name: String) : Animal(name) {
    override fun cries() = println("bowwow")
}


fun main() {
    val animal = Animal("cat")
    animal.showName()
    animal.cries()
    val dog = Dog("dog")
    dog.showName()
    dog.cries()
}

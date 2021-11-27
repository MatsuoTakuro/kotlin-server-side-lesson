class User1 {
    var name: String = ""
}

class User2(id: Int) {
    val id: Int = id
    val name: String = ""
}

class User3 {
    lateinit var name: String
}

class User4 {
    lateinit var name: String
    val isValidName: Boolean
        get() = name != ""
}

class User5 {
    var name: String = ""
        set(value) {
            field = if (value == "") {
                "Kotlin"
            } else {
                value
            }
        }
}
class properties {
}
class Person {
    private var _name: String = "Unknown"
    var name: String
        get() = _name
        set(value) {
            if (value.isNotEmpty()) {
                _name = value
            } else {
                println("Name cannot be empty.")
            }
        }

    var age: Int = 30
}

fun main() {
    val person = Person()
    println(person.name)
    person.name = "Alice"
    println(person.name)
    person.name = ""
}

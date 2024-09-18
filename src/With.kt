class With {
}
data class User(var name: String, var age: Int)

fun main1112() {
    val user = User("Alice", 25)
    val result = with(user) {
        name = "Bob"
        age += 1
        "User's name is $name and age is $age"}
    println(result)
    println(user)
}
class Car(var make: String, var model: String, var year: Int)

fun main() {
    val car = Car("Toyota", "Camry", 2020)
    val carInfo = with(car) {
        "Car Make: $make, Model: $model, Year: $year"
    }
    println(carInfo)
}

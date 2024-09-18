class Apply {
}
fun main() {
    val numbers = mutableListOf<Int>().apply{
        add(1)
        add(2)
        add(3)
        add(4)
        add(5)
    }
    println("The numbers list is: $numbers")  // Output: The numbers list is: [1, 2, 3, 4, 5]
}
